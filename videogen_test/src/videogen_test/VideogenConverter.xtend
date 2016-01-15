package videogen_test

import istic.m2miage.idm.VideoGenStandaloneSetupGenerated
import istic.m2miage.idm.videoGen.Alternatives
import istic.m2miage.idm.videoGen.Mandatory
import istic.m2miage.idm.videoGen.Optional
import istic.m2miage.idm.videoGen.VideoGen
import java.io.PrintWriter
import java.util.HashMap
import java.util.Random
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import playlist.PlaylistFactory
import playlist.Playlist
import playlist.Video
import org.omg.SendingContext.RunTime
import java.io.BufferedReader
import java.io.InputStreamReader

class VideogenConverter {
	def loadVideoGen(URI uri) {
		new VideoGenStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as VideoGen
	}
	
	def saveVideoGen(URI uri, VideoGen videos) {
		var Resource rs = new ResourceSetImpl().createResource(uri); 
		rs.getContents.add(videos); 
		rs.save(new HashMap());
	}
	
	//Q1
	def VideogenConvertToText() {
		var videos = loadVideoGen(URI.createURI("./ressources/foo1.videogen"))
		val writer = new PrintWriter(URI.createURI("./ressources/foo1.txt").toString, "UTF-8");
		videos.videotypes.forEach[v | 
			if (v instanceof Mandatory) {
				val mv = (v as Mandatory);
				writer.println("file '"+mv.video.get(0).path+"'");
			} else if (v instanceof Optional) {
				val ov = (v as Optional);
				val random = new Random();
				val num = random.nextInt(2)+1;
				if (num == 1) {
					writer.println("file '"+ov.video.get(0).path+"'");
				}
			} else if (v instanceof Alternatives) {
				val av = (v as Alternatives);
				val random = new Random();
				val num = random.nextInt(av.videos.length);
				writer.println("file '"+av.videos.get(num).path+"'");
			}
		]		
		writer.close();
	}
	
	//Q3a
	def VideogenConvertToPlaylist() {
		var videos = loadVideoGen(URI.createURI("./ressources/foo1.videogen")) 
		val factoryPlaylist = PlaylistFactory.eINSTANCE
		val mPLaylist = factoryPlaylist.createPlaylist as Playlist
		
		videos.videotypes.forEach[v | 
			if (v instanceof Mandatory) {
				val mv = (v as Mandatory);
				var video = factoryPlaylist.createVideo as Video
				video.path = mv.video.get(0).path
				video.name = v.video.get(0).name
				video.description = mv.video.get(0).description
				video.duree = mv.video.get(0).duree
				mPLaylist.video.add(video);
			} else if (v instanceof Optional) {
				var ov = (v as Optional);
				var random = new Random();
				var num = random.nextInt(2)+1;
				if (num == 1) {
					var video = factoryPlaylist.createVideo as Video
					video.path = v.video.get(0).path
					video.name = v.video.get(0).name
					video.description = v.video.get(0).description
					video.duree = v.video.get(0).duree
					mPLaylist.video.add(video);
				}
			} else if (v instanceof Alternatives) {
				var av = (v as Alternatives);
				var random = new Random();
				var num = random.nextInt(av.videos.length);
				var video = factoryPlaylist.createVideo as Video
				video.path = av.videos.get(num).path
				video.name = av.videos.get(num).name
				video.description = av.videos.get(num).description
				video.duree = av.videos.get(num).duree
				mPLaylist.video.add(video);
			}
		]	
		mPLaylist		
	}
	
	//Q3b
	def PlaylistConvertToM3U() {
		var mPlaylist = VideogenConvertToPlaylist()
		val writer = new PrintWriter(URI.createURI("./ressources/playlist1.m3u").toString, "UTF-8");
		mPlaylist.video.forEach[v |
			writer.println(URI.createURI(v.path).toString());
		]
		writer.close();
	}
	
	//Q4
	def PlaylistConvertToFfmpeg() {
		var mPlaylist = VideogenConvertToPlaylist()
		val writer = new PrintWriter(URI.createURI("./ressources/playlist1.txt").toString, "UTF-8");
		mPlaylist.video.forEach[v |
			writer.println("file '" + v.path + "'");
		]
		writer.close();
	}
	
	//Q5
	def PlaylistConvertToM3UEtendu() {
		var mPlaylist = VideogenConvertToPlaylist()
		val writer = new PrintWriter(URI.createURI("./ressources/playlist1.m3u").toString, "UTF-8");
		writer.println("#EXTM3U")
		mPlaylist.video.forEach[v |
			writer.println("#EXT-X-DISCONTINUITY")
			writer.println("#EXTINF:"+v.duree+ " - "+v.name)
			writer.println(v.path);
		]
		writer.println("#EXT-X-ENDLIST")		
		writer.close();
	}
	
	//Q7
	def VideogenConvertToVideogenEnhanced() {
		var videos = loadVideoGen(URI.createURI("./ressources/foo1.videogen"))
		val Runtime rt = Runtime.getRuntime();
		videos.videotypes.forEach[v | 
			if (v instanceof Mandatory) {
				val mv = (v as Mandatory);
				var Process proc = rt.exec("ffprobe -v error -select_streams v:0 
											-show_entries stream=duration 
											-of default=noprint_wrappers=1:nokey=1 "+ mv.video.get(0).path)
				var BufferedReader stdInput = new BufferedReader(new 
					InputStreamReader(proc.getInputStream())
				);
				var String dureeTotal = null;
				var double time = 0;
				while ((dureeTotal = stdInput.readLine()) != null) {
					time = Math.round(Double.parseDouble(dureeTotal) * 60);
				   
				}
			   	mv.video.get(0).duree = time.toString;
			   
			   	if(mv.video.get(0).name == null) {
			   		mv.video.get(0).name = "";
			   	}
			   	if(mv.video.get(0).description == null) {
			   		mv.video.get(0).description = "";
			   	}
			   	if(mv.video.get(0).path == null) {
			   		mv.video.get(0).path = "";
			   	} 
			   	 
			} else if (v instanceof Optional) {
				val ov = (v as Optional);
				val random = new Random();
				val num = random.nextInt(2)+1;
				if (num == 1) {
					var Process proc = rt.exec("ffprobe -v error -select_streams v:0 
											-show_entries stream=duration 
											-of default=noprint_wrappers=1:nokey=1 "+ ov.video.get(0).path)
					var BufferedReader stdInput = new BufferedReader(new 
					InputStreamReader(proc.getInputStream())
					);
					var String dureeTotal = null;
					var double time = 0;
					while ((dureeTotal = stdInput.readLine()) != null) {
						time = Math.round(Double.parseDouble(dureeTotal) * 60);
					   
					}
				   	ov.video.get(0).duree = time.toString;
				   	
				   	if(ov.video.get(0).name == null) {
				   		ov.video.get(0).name = "";
				   	}
				   	if(ov.video.get(0).description == null) {
				   		ov.video.get(0).description = "";
				   	}
				   	if(ov.video.get(0).path == null) {
				   		ov.video.get(0).path = "";
				   	} 
				}
			} else if (v instanceof Alternatives) {
				val av = (v as Alternatives);
				val random = new Random();
				val num = random.nextInt(av.videos.length);
				var Process proc = rt.exec("ffprobe -v error -select_streams v:0 
											-show_entries stream=duration 
											-of default=noprint_wrappers=1:nokey=1 "+ av.videos.get(num).path)
				var BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
				var String dureeTotal = null;
				var double time = 0;
				while ((dureeTotal = stdInput.readLine()) != null) {
					time = Math.round(Double.parseDouble(dureeTotal) * 60);
				   
				}
				av.videos.get(num).duree = time.toString;
			   	if(av.videos.get(num).name == null) {
			   		av.videos.get(num).name = "";
			   	}
			   	if(av.videos.get(num).description == null) {
			   		av.videos.get(num).description = "";
			   	}
			   	if(av.videos.get(num).path == null) {
			   		av.videos.get(num).path = "";
			   	} 
			}
		]		
		saveVideoGen(URI.createURI("./ressources/foo1.videogen"), videos)
	}
	
	//Q8
	def VideogenEnhancedConvertToM3UEtendu() {
		VideogenConvertToVideogenEnhanced()
		PlaylistConvertToM3UEtendu()	
		M3UEtenduConvertToHTML()
		
			
	}
	
	//Q8
	def M3UEtenduConvertToHTML() {
		val writer = new PrintWriter(URI.createURI("./ressources/index.html").toString, "UTF-8");
		var html = '<html>
			<head>
			    <!-- The "functional" skin, "functional.css", "minimalist.css" and "playful.css" are available -->
			    <link rel="stylesheet" href="//releases.flowplayer.org/6.0.4/skin/functional.css">
			    <!-- Flowplayer depends on jquery for video tag based setups -->
			    <script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
	   		    <!-- Flowplayer-->
	 			<script src="//releases.flowplayer.org/6.0.4/flowplayer.min.js"></script>
				<script>
					// install player manually after DOM is ready
					$(function() {
					    // install into all elements with class="player"
					    $(".player").flowplayer({
					        // reverse fraction of video aspect ratio
					        // video dimensions: 470px / 250px
					        ratio: 25/47,
					        rtmp: "rtmp://s3b78u0kbtx79q.cloudfront.net/cfx/st",
					        embed: {
					            // embed with minimalist skin
					            skin: "//releases.flowplayer.org/6.0.4/skin/minimalist.css"
					        }
					    });
					});
				</script>
			</head>
			<body>
				<div class="player">		
				</div>
				<!--/end content -->
			</body>
		</html>'
	writer.println(html)
	writer.close()
	}
	
	//Q9
	def VideogenConvertToTsFile() {
		val Runtime rt = Runtime.getRuntime()
		var videos = loadVideoGen(URI.createURI("./ressources/foo1.videogen"))
		videos.videotypes.forEach[v | 
			if (v instanceof Mandatory) {
				val mv = (v as Mandatory);
				var source = mv.video.get(0).path
				var target = URI.createURI("./ressources/ts/"+ mv.video.get(0).name +".ts").toString
				var Process proc = rt.exec("ffmpeg -i "+ source +" -c copy -bsf h264_mp4toannexb "+ target)
			} else if (v instanceof Optional) {
				val ov = (v as Optional);
				val random = new Random();
				val num = random.nextInt(2)+1;
				if (num == 1) {
					var source = ov.video.get(0).path
				var target = URI.createURI("./ressources/ts/"+ ov.video.get(0).name +".ts").toString
					var Process proc = rt.exec("ffmpeg -i "+ source +" -c copy -bsf h264_mp4toannexb "+ target)
				}
			} else if (v instanceof Alternatives) {
				val av = (v as Alternatives);
				val random = new Random();
				val num = random.nextInt(av.videos.length);
				var source = av.videos.get(num).path
				var target = URI.createURI("./ressources/ts/"+ av.videos.get(num).name +".ts").toString
				var Process proc = rt.exec("ffmpeg -i "+ source +" -c copy -bsf h264_mp4toannexb "+ target)
			}
		]		
	}
	
	//Q10
	def VideogenEnhancedGetThumbnails() {
		val Runtime rt = Runtime.getRuntime()
		var videos = loadVideoGen(URI.createURI("./ressources/foo1.videogen"))
		videos.videotypes.forEach[v | 
			if (v instanceof Mandatory) {
				val mv = (v as Mandatory);
				var source = mv.video.get(0).path
				var target = URI.createURI("./ressources/thumbnails/"+ mv.video.get(0).name +".png").toString
				var Process proc = rt.exec("ffmpeg -y -i "+ source +" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "+ target)
			} else if (v instanceof Optional) {
				val ov = (v as Optional);
				val random = new Random();
				val num = random.nextInt(2)+1;
				if (num == 1) {
					var source = ov.video.get(0).path
					var target = URI.createURI("./ressources/thumbnails/"+ ov.video.get(0).name +".png").toString
					var Process proc = rt.exec("ffmpeg -y -i "+ source +" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "+ target)
				}
			} else if (v instanceof Alternatives) {
				val av = (v as Alternatives);
				val random = new Random();
				val num = random.nextInt(av.videos.length);
				var source = av.videos.get(num).path
				var target = URI.createURI("./ressources/thumbnails/"+ av.videos.get(num).name +".png").toString
				var Process proc = rt.exec("ffmpeg -y -i "+ source +" -r 1 -t 00:00:01 -ss 00:00:02 -f image2 "+ target)
			}
		]		
	}
	
}
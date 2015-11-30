package videogen_test

import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import istic.m2miage.idm.VideoGenStandaloneSetupGenerated
import istic.m2miage.idm.videoGen.VideoGen
import istic.m2miage.idm.videoGen.Mandatory
import istic.m2miage.idm.videoGen.Optional
import istic.m2miage.idm.videoGen.Alternatives
import java.io.File
import java.io.PrintWriter
import java.util.Random

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
	
	def static void main(String[] args) {
  		var VideogenConverter vC = new VideogenConverter();
		var videos = vC.loadVideoGen(URI.createURI("file:///home/jeremy/runtime-EclipseApplication/videogen/src/foo1.videogen")) 
		//videos.videotypes.for
		
		val writer = new PrintWriter("/home/jeremy/Desktop/foo1.txt", "UTF-8");
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
}
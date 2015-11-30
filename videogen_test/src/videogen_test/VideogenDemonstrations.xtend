package videogen_test

import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test
import static org.junit.Assert.*
import java.util.Collections
import java.util.List
import java.io.FileWriter
import istic.m2miage.idm.VideoGenStandaloneSetupGenerated
import istic.m2miage.idm.videoGen.VideoGen
import istic.m2miage.idm.videoGen.Mandatory
import istic.m2miage.idm.videoGen.Optional

class VideogenDemonstrations {
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
	
	@Test
	def test1() {
		
		// loading
		var videos = loadVideoGen(URI.createURI("file:///home/jeremy/runtime-EclipseApplication/videogen/src/foo1.videogen")) 
		assertNotNull(videos)
		assertEquals(5, videos.videotypes.size)
		saveVideoGen(URI.createURI("foo1.xmi"), videos)
		
		// MODEL MANAGEMENT (ANALYSIS, TRANSFORMATION)
		videos.videotypes.forEach[v | 
//			if (v instanceof Mandatory) {
//				val desc = (v as Mandatory).
//			} else if (v instanceof Optional) {
//				
//			} else {
//				
//			}
		]

		// serializing
//		saveVideoGen(URI.createURI("foo2.q"), videos) 
		
		 
			
	}
}
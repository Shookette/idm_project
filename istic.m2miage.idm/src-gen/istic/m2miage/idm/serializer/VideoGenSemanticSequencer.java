/*
 * generated by Xtext
 */
package istic.m2miage.idm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import istic.m2miage.idm.services.VideoGenGrammarAccess;
import istic.m2miage.idm.videoGen.Alternatives;
import istic.m2miage.idm.videoGen.Mandatory;
import istic.m2miage.idm.videoGen.Optional;
import istic.m2miage.idm.videoGen.VideoGen;
import istic.m2miage.idm.videoGen.VideoGenPackage;
import istic.m2miage.idm.videoGen.VideoSeq;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class VideoGenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VideoGenGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VideoGenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VideoGenPackage.ALTERNATIVES:
				sequence_Alternatives(context, (Alternatives) semanticObject); 
				return; 
			case VideoGenPackage.MANDATORY:
				sequence_Mandatory(context, (Mandatory) semanticObject); 
				return; 
			case VideoGenPackage.OPTIONAL:
				sequence_Optional(context, (Optional) semanticObject); 
				return; 
			case VideoGenPackage.VIDEO_GEN:
				sequence_VideoGen(context, (VideoGen) semanticObject); 
				return; 
			case VideoGenPackage.VIDEO_SEQ:
				sequence_VideoSeq(context, (VideoSeq) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID videos+=VideoSeq+)
	 */
	protected void sequence_Alternatives(EObject context, Alternatives semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     video+=VideoSeq
	 */
	protected void sequence_Mandatory(EObject context, Mandatory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     video+=VideoSeq
	 */
	protected void sequence_Optional(EObject context, Optional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     videotypes+=VideoType*
	 */
	protected void sequence_VideoGen(EObject context, VideoGen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID path=STRING probabilite=Probability? description=STRING? duree=Duration?)
	 */
	protected void sequence_VideoSeq(EObject context, VideoSeq semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

/**
 */
package istic.m2miage.idm.videoGen.impl;

import istic.m2miage.idm.videoGen.Alternatives;
import istic.m2miage.idm.videoGen.Mandatory;
import istic.m2miage.idm.videoGen.Optional;
import istic.m2miage.idm.videoGen.VideoGen;
import istic.m2miage.idm.videoGen.VideoGenFactory;
import istic.m2miage.idm.videoGen.VideoGenPackage;
import istic.m2miage.idm.videoGen.VideoSeq;
import istic.m2miage.idm.videoGen.VideoType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenPackageImpl extends EPackageImpl implements VideoGenPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoGenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoSeqEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see istic.m2miage.idm.videoGen.VideoGenPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VideoGenPackageImpl()
  {
    super(eNS_URI, VideoGenFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VideoGenPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VideoGenPackage init()
  {
    if (isInited) return (VideoGenPackage)EPackage.Registry.INSTANCE.getEPackage(VideoGenPackage.eNS_URI);

    // Obtain or create and register package
    VideoGenPackageImpl theVideoGenPackage = (VideoGenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VideoGenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VideoGenPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVideoGenPackage.createPackageContents();

    // Initialize created meta-data
    theVideoGenPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVideoGenPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VideoGenPackage.eNS_URI, theVideoGenPackage);
    return theVideoGenPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideoGen()
  {
    return videoGenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVideoGen_Videotypes()
  {
    return (EReference)videoGenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideoType()
  {
    return videoTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatory()
  {
    return mandatoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMandatory_Video()
  {
    return (EReference)mandatoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptional()
  {
    return optionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptional_Video()
  {
    return (EReference)optionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternatives()
  {
    return alternativesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlternatives_Name()
  {
    return (EAttribute)alternativesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternatives_Videos()
  {
    return (EReference)alternativesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideoSeq()
  {
    return videoSeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoSeq_Name()
  {
    return (EAttribute)videoSeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoSeq_Path()
  {
    return (EAttribute)videoSeqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoSeq_Probabilite()
  {
    return (EAttribute)videoSeqEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoSeq_Description()
  {
    return (EAttribute)videoSeqEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoSeq_Duree()
  {
    return (EAttribute)videoSeqEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenFactory getVideoGenFactory()
  {
    return (VideoGenFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    videoGenEClass = createEClass(VIDEO_GEN);
    createEReference(videoGenEClass, VIDEO_GEN__VIDEOTYPES);

    videoTypeEClass = createEClass(VIDEO_TYPE);

    mandatoryEClass = createEClass(MANDATORY);
    createEReference(mandatoryEClass, MANDATORY__VIDEO);

    optionalEClass = createEClass(OPTIONAL);
    createEReference(optionalEClass, OPTIONAL__VIDEO);

    alternativesEClass = createEClass(ALTERNATIVES);
    createEAttribute(alternativesEClass, ALTERNATIVES__NAME);
    createEReference(alternativesEClass, ALTERNATIVES__VIDEOS);

    videoSeqEClass = createEClass(VIDEO_SEQ);
    createEAttribute(videoSeqEClass, VIDEO_SEQ__NAME);
    createEAttribute(videoSeqEClass, VIDEO_SEQ__PATH);
    createEAttribute(videoSeqEClass, VIDEO_SEQ__PROBABILITE);
    createEAttribute(videoSeqEClass, VIDEO_SEQ__DESCRIPTION);
    createEAttribute(videoSeqEClass, VIDEO_SEQ__DUREE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mandatoryEClass.getESuperTypes().add(this.getVideoType());
    optionalEClass.getESuperTypes().add(this.getVideoType());
    alternativesEClass.getESuperTypes().add(this.getVideoType());

    // Initialize classes and features; add operations and parameters
    initEClass(videoGenEClass, VideoGen.class, "VideoGen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVideoGen_Videotypes(), this.getVideoType(), null, "videotypes", null, 0, -1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(videoTypeEClass, VideoType.class, "VideoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mandatoryEClass, Mandatory.class, "Mandatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMandatory_Video(), this.getVideoSeq(), null, "video", null, 0, -1, Mandatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalEClass, Optional.class, "Optional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptional_Video(), this.getVideoSeq(), null, "video", null, 0, -1, Optional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alternativesEClass, Alternatives.class, "Alternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlternatives_Name(), ecorePackage.getEString(), "name", null, 0, 1, Alternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlternatives_Videos(), this.getVideoSeq(), null, "videos", null, 0, -1, Alternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(videoSeqEClass, VideoSeq.class, "VideoSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVideoSeq_Name(), ecorePackage.getEString(), "name", null, 0, 1, VideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideoSeq_Path(), ecorePackage.getEString(), "path", null, 0, 1, VideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideoSeq_Probabilite(), ecorePackage.getEString(), "probabilite", null, 0, 1, VideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideoSeq_Description(), ecorePackage.getEString(), "description", null, 0, 1, VideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideoSeq_Duree(), ecorePackage.getEString(), "duree", null, 0, 1, VideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VideoGenPackageImpl

/**
 */
package istic.m2miage.idm.videoGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see istic.m2miage.idm.videoGen.VideoGenFactory
 * @model kind="package"
 * @generated
 */
public interface VideoGenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "videoGen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.m2miage.istic/idm/VideoGen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "videoGen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoGenPackage eINSTANCE = istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl.init();

  /**
   * The meta object id for the '{@link istic.m2miage.idm.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.m2miage.idm.videoGen.impl.VideoGenImpl
   * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getVideoGen()
   * @generated
   */
  int VIDEO_GEN = 0;

  /**
   * The feature id for the '<em><b>Videotypes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN__VIDEOTYPES = 0;

  /**
   * The number of structural features of the '<em>Video Gen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link istic.m2miage.idm.videoGen.impl.VideoTypeImpl <em>Video Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.m2miage.idm.videoGen.impl.VideoTypeImpl
   * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getVideoType()
   * @generated
   */
  int VIDEO_TYPE = 1;

  /**
   * The number of structural features of the '<em>Video Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link istic.m2miage.idm.videoGen.impl.MandatoryImpl <em>Mandatory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.m2miage.idm.videoGen.impl.MandatoryImpl
   * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getMandatory()
   * @generated
   */
  int MANDATORY = 2;

  /**
   * The feature id for the '<em><b>Video</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY__VIDEO = VIDEO_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_FEATURE_COUNT = VIDEO_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link istic.m2miage.idm.videoGen.impl.OptionalImpl <em>Optional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.m2miage.idm.videoGen.impl.OptionalImpl
   * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getOptional()
   * @generated
   */
  int OPTIONAL = 3;

  /**
   * The feature id for the '<em><b>Video</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL__VIDEO = VIDEO_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE_COUNT = VIDEO_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link istic.m2miage.idm.videoGen.impl.AlternativesImpl <em>Alternatives</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.m2miage.idm.videoGen.impl.AlternativesImpl
   * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getAlternatives()
   * @generated
   */
  int ALTERNATIVES = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVES__NAME = VIDEO_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Videos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVES__VIDEOS = VIDEO_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Alternatives</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVES_FEATURE_COUNT = VIDEO_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link istic.m2miage.idm.videoGen.impl.VideoSeqImpl <em>Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.m2miage.idm.videoGen.impl.VideoSeqImpl
   * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getVideoSeq()
   * @generated
   */
  int VIDEO_SEQ = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__NAME = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__PATH = 1;

  /**
   * The feature id for the '<em><b>Probabilite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__PROBABILITE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Duree</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__DUREE = 4;

  /**
   * The number of structural features of the '<em>Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link istic.m2miage.idm.videoGen.VideoGen <em>Video Gen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Gen</em>'.
   * @see istic.m2miage.idm.videoGen.VideoGen
   * @generated
   */
  EClass getVideoGen();

  /**
   * Returns the meta object for the containment reference list '{@link istic.m2miage.idm.videoGen.VideoGen#getVideotypes <em>Videotypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Videotypes</em>'.
   * @see istic.m2miage.idm.videoGen.VideoGen#getVideotypes()
   * @see #getVideoGen()
   * @generated
   */
  EReference getVideoGen_Videotypes();

  /**
   * Returns the meta object for class '{@link istic.m2miage.idm.videoGen.VideoType <em>Video Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Type</em>'.
   * @see istic.m2miage.idm.videoGen.VideoType
   * @generated
   */
  EClass getVideoType();

  /**
   * Returns the meta object for class '{@link istic.m2miage.idm.videoGen.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory</em>'.
   * @see istic.m2miage.idm.videoGen.Mandatory
   * @generated
   */
  EClass getMandatory();

  /**
   * Returns the meta object for the containment reference list '{@link istic.m2miage.idm.videoGen.Mandatory#getVideo <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Video</em>'.
   * @see istic.m2miage.idm.videoGen.Mandatory#getVideo()
   * @see #getMandatory()
   * @generated
   */
  EReference getMandatory_Video();

  /**
   * Returns the meta object for class '{@link istic.m2miage.idm.videoGen.Optional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional</em>'.
   * @see istic.m2miage.idm.videoGen.Optional
   * @generated
   */
  EClass getOptional();

  /**
   * Returns the meta object for the containment reference list '{@link istic.m2miage.idm.videoGen.Optional#getVideo <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Video</em>'.
   * @see istic.m2miage.idm.videoGen.Optional#getVideo()
   * @see #getOptional()
   * @generated
   */
  EReference getOptional_Video();

  /**
   * Returns the meta object for class '{@link istic.m2miage.idm.videoGen.Alternatives <em>Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternatives</em>'.
   * @see istic.m2miage.idm.videoGen.Alternatives
   * @generated
   */
  EClass getAlternatives();

  /**
   * Returns the meta object for the attribute '{@link istic.m2miage.idm.videoGen.Alternatives#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see istic.m2miage.idm.videoGen.Alternatives#getName()
   * @see #getAlternatives()
   * @generated
   */
  EAttribute getAlternatives_Name();

  /**
   * Returns the meta object for the containment reference list '{@link istic.m2miage.idm.videoGen.Alternatives#getVideos <em>Videos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Videos</em>'.
   * @see istic.m2miage.idm.videoGen.Alternatives#getVideos()
   * @see #getAlternatives()
   * @generated
   */
  EReference getAlternatives_Videos();

  /**
   * Returns the meta object for class '{@link istic.m2miage.idm.videoGen.VideoSeq <em>Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Seq</em>'.
   * @see istic.m2miage.idm.videoGen.VideoSeq
   * @generated
   */
  EClass getVideoSeq();

  /**
   * Returns the meta object for the attribute '{@link istic.m2miage.idm.videoGen.VideoSeq#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see istic.m2miage.idm.videoGen.VideoSeq#getName()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Name();

  /**
   * Returns the meta object for the attribute '{@link istic.m2miage.idm.videoGen.VideoSeq#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see istic.m2miage.idm.videoGen.VideoSeq#getPath()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Path();

  /**
   * Returns the meta object for the attribute '{@link istic.m2miage.idm.videoGen.VideoSeq#getProbabilite <em>Probabilite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Probabilite</em>'.
   * @see istic.m2miage.idm.videoGen.VideoSeq#getProbabilite()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Probabilite();

  /**
   * Returns the meta object for the attribute '{@link istic.m2miage.idm.videoGen.VideoSeq#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see istic.m2miage.idm.videoGen.VideoSeq#getDescription()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Description();

  /**
   * Returns the meta object for the attribute '{@link istic.m2miage.idm.videoGen.VideoSeq#getDuree <em>Duree</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Duree</em>'.
   * @see istic.m2miage.idm.videoGen.VideoSeq#getDuree()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Duree();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VideoGenFactory getVideoGenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link istic.m2miage.idm.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.m2miage.idm.videoGen.impl.VideoGenImpl
     * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getVideoGen()
     * @generated
     */
    EClass VIDEO_GEN = eINSTANCE.getVideoGen();

    /**
     * The meta object literal for the '<em><b>Videotypes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIDEO_GEN__VIDEOTYPES = eINSTANCE.getVideoGen_Videotypes();

    /**
     * The meta object literal for the '{@link istic.m2miage.idm.videoGen.impl.VideoTypeImpl <em>Video Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.m2miage.idm.videoGen.impl.VideoTypeImpl
     * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getVideoType()
     * @generated
     */
    EClass VIDEO_TYPE = eINSTANCE.getVideoType();

    /**
     * The meta object literal for the '{@link istic.m2miage.idm.videoGen.impl.MandatoryImpl <em>Mandatory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.m2miage.idm.videoGen.impl.MandatoryImpl
     * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getMandatory()
     * @generated
     */
    EClass MANDATORY = eINSTANCE.getMandatory();

    /**
     * The meta object literal for the '<em><b>Video</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANDATORY__VIDEO = eINSTANCE.getMandatory_Video();

    /**
     * The meta object literal for the '{@link istic.m2miage.idm.videoGen.impl.OptionalImpl <em>Optional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.m2miage.idm.videoGen.impl.OptionalImpl
     * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getOptional()
     * @generated
     */
    EClass OPTIONAL = eINSTANCE.getOptional();

    /**
     * The meta object literal for the '<em><b>Video</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL__VIDEO = eINSTANCE.getOptional_Video();

    /**
     * The meta object literal for the '{@link istic.m2miage.idm.videoGen.impl.AlternativesImpl <em>Alternatives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.m2miage.idm.videoGen.impl.AlternativesImpl
     * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getAlternatives()
     * @generated
     */
    EClass ALTERNATIVES = eINSTANCE.getAlternatives();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERNATIVES__NAME = eINSTANCE.getAlternatives_Name();

    /**
     * The meta object literal for the '<em><b>Videos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVES__VIDEOS = eINSTANCE.getAlternatives_Videos();

    /**
     * The meta object literal for the '{@link istic.m2miage.idm.videoGen.impl.VideoSeqImpl <em>Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.m2miage.idm.videoGen.impl.VideoSeqImpl
     * @see istic.m2miage.idm.videoGen.impl.VideoGenPackageImpl#getVideoSeq()
     * @generated
     */
    EClass VIDEO_SEQ = eINSTANCE.getVideoSeq();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__NAME = eINSTANCE.getVideoSeq_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__PATH = eINSTANCE.getVideoSeq_Path();

    /**
     * The meta object literal for the '<em><b>Probabilite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__PROBABILITE = eINSTANCE.getVideoSeq_Probabilite();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__DESCRIPTION = eINSTANCE.getVideoSeq_Description();

    /**
     * The meta object literal for the '<em><b>Duree</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__DUREE = eINSTANCE.getVideoSeq_Duree();

  }

} //VideoGenPackage

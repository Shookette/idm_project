/**
 */
package istic.m2miage.idm.videoGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istic.m2miage.idm.videoGen.VideoGen#getVideotypes <em>Videotypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see istic.m2miage.idm.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends EObject
{
  /**
   * Returns the value of the '<em><b>Videotypes</b></em>' containment reference list.
   * The list contents are of type {@link istic.m2miage.idm.videoGen.VideoType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videotypes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videotypes</em>' containment reference list.
   * @see istic.m2miage.idm.videoGen.VideoGenPackage#getVideoGen_Videotypes()
   * @model containment="true"
   * @generated
   */
  EList<VideoType> getVideotypes();

} // VideoGen

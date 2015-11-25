/**
 */
package istic.m2miage.idm.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istic.m2miage.idm.videoGen.Optional#getVideo <em>Video</em>}</li>
 * </ul>
 * </p>
 *
 * @see istic.m2miage.idm.videoGen.VideoGenPackage#getOptional()
 * @model
 * @generated
 */
public interface Optional extends VideoType
{
  /**
   * Returns the value of the '<em><b>Video</b></em>' containment reference list.
   * The list contents are of type {@link istic.m2miage.idm.videoGen.VideoSeq}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Video</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Video</em>' containment reference list.
   * @see istic.m2miage.idm.videoGen.VideoGenPackage#getOptional_Video()
   * @model containment="true"
   * @generated
   */
  EList<VideoSeq> getVideo();

} // Optional

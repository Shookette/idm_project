/**
 */
package istic.m2miage.idm.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link istic.m2miage.idm.videoGen.Alternatives#getName <em>Name</em>}</li>
 *   <li>{@link istic.m2miage.idm.videoGen.Alternatives#getVideos <em>Videos</em>}</li>
 * </ul>
 * </p>
 *
 * @see istic.m2miage.idm.videoGen.VideoGenPackage#getAlternatives()
 * @model
 * @generated
 */
public interface Alternatives extends VideoType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see istic.m2miage.idm.videoGen.VideoGenPackage#getAlternatives_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link istic.m2miage.idm.videoGen.Alternatives#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
   * The list contents are of type {@link istic.m2miage.idm.videoGen.VideoSeq}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videos</em>' containment reference list.
   * @see istic.m2miage.idm.videoGen.VideoGenPackage#getAlternatives_Videos()
   * @model containment="true"
   * @generated
   */
  EList<VideoSeq> getVideos();

} // Alternatives

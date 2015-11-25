/**
 */
package istic.m2miage.idm.videoGen.impl;

import istic.m2miage.idm.videoGen.Mandatory;
import istic.m2miage.idm.videoGen.VideoGenPackage;
import istic.m2miage.idm.videoGen.VideoSeq;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istic.m2miage.idm.videoGen.impl.MandatoryImpl#getVideo <em>Video</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MandatoryImpl extends VideoTypeImpl implements Mandatory
{
  /**
   * The cached value of the '{@link #getVideo() <em>Video</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideo()
   * @generated
   * @ordered
   */
  protected EList<VideoSeq> video;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MandatoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VideoGenPackage.Literals.MANDATORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VideoSeq> getVideo()
  {
    if (video == null)
    {
      video = new EObjectContainmentEList<VideoSeq>(VideoSeq.class, this, VideoGenPackage.MANDATORY__VIDEO);
    }
    return video;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY__VIDEO:
        return ((InternalEList<?>)getVideo()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY__VIDEO:
        return getVideo();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY__VIDEO:
        getVideo().clear();
        getVideo().addAll((Collection<? extends VideoSeq>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY__VIDEO:
        getVideo().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VideoGenPackage.MANDATORY__VIDEO:
        return video != null && !video.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MandatoryImpl

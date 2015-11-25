/**
 */
package istic.m2miage.idm.videoGen.impl;

import istic.m2miage.idm.videoGen.VideoGen;
import istic.m2miage.idm.videoGen.VideoGenPackage;
import istic.m2miage.idm.videoGen.VideoType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link istic.m2miage.idm.videoGen.impl.VideoGenImpl#getVideotypes <em>Videotypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VideoGenImpl extends MinimalEObjectImpl.Container implements VideoGen
{
  /**
   * The cached value of the '{@link #getVideotypes() <em>Videotypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideotypes()
   * @generated
   * @ordered
   */
  protected EList<VideoType> videotypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideoGenImpl()
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
    return VideoGenPackage.Literals.VIDEO_GEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VideoType> getVideotypes()
  {
    if (videotypes == null)
    {
      videotypes = new EObjectContainmentEList<VideoType>(VideoType.class, this, VideoGenPackage.VIDEO_GEN__VIDEOTYPES);
    }
    return videotypes;
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
      case VideoGenPackage.VIDEO_GEN__VIDEOTYPES:
        return ((InternalEList<?>)getVideotypes()).basicRemove(otherEnd, msgs);
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
      case VideoGenPackage.VIDEO_GEN__VIDEOTYPES:
        return getVideotypes();
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
      case VideoGenPackage.VIDEO_GEN__VIDEOTYPES:
        getVideotypes().clear();
        getVideotypes().addAll((Collection<? extends VideoType>)newValue);
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
      case VideoGenPackage.VIDEO_GEN__VIDEOTYPES:
        getVideotypes().clear();
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
      case VideoGenPackage.VIDEO_GEN__VIDEOTYPES:
        return videotypes != null && !videotypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VideoGenImpl

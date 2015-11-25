/**
 */
package istic.m2miage.idm.videoGen.util;

import istic.m2miage.idm.videoGen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see istic.m2miage.idm.videoGen.VideoGenPackage
 * @generated
 */
public class VideoGenAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VideoGenPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VideoGenPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideoGenSwitch<Adapter> modelSwitch =
    new VideoGenSwitch<Adapter>()
    {
      @Override
      public Adapter caseVideoGen(VideoGen object)
      {
        return createVideoGenAdapter();
      }
      @Override
      public Adapter caseVideoType(VideoType object)
      {
        return createVideoTypeAdapter();
      }
      @Override
      public Adapter caseMandatory(Mandatory object)
      {
        return createMandatoryAdapter();
      }
      @Override
      public Adapter caseOptional(Optional object)
      {
        return createOptionalAdapter();
      }
      @Override
      public Adapter caseAlternatives(Alternatives object)
      {
        return createAlternativesAdapter();
      }
      @Override
      public Adapter caseVideoSeq(VideoSeq object)
      {
        return createVideoSeqAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link istic.m2miage.idm.videoGen.VideoGen <em>Video Gen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.m2miage.idm.videoGen.VideoGen
   * @generated
   */
  public Adapter createVideoGenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.m2miage.idm.videoGen.VideoType <em>Video Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.m2miage.idm.videoGen.VideoType
   * @generated
   */
  public Adapter createVideoTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.m2miage.idm.videoGen.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.m2miage.idm.videoGen.Mandatory
   * @generated
   */
  public Adapter createMandatoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.m2miage.idm.videoGen.Optional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.m2miage.idm.videoGen.Optional
   * @generated
   */
  public Adapter createOptionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.m2miage.idm.videoGen.Alternatives <em>Alternatives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.m2miage.idm.videoGen.Alternatives
   * @generated
   */
  public Adapter createAlternativesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.m2miage.idm.videoGen.VideoSeq <em>Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.m2miage.idm.videoGen.VideoSeq
   * @generated
   */
  public Adapter createVideoSeqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VideoGenAdapterFactory

/*
 * generated by Xtext
 */
package istic.m2miage.idm;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VideoGenUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return istic.m2miage.idm.ui.internal.VideoGenActivator.getInstance().getInjector("istic.m2miage.idm.VideoGen");
	}
	
}

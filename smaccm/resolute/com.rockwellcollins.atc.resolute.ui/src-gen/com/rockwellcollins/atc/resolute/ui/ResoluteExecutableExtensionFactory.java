/*
 * generated by Xtext
 */
package com.rockwellcollins.atc.resolute.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.rockwellcollins.atc.resolute.ui.internal.ResoluteActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ResoluteExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ResoluteActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ResoluteActivator.getInstance().getInjector(ResoluteActivator.COM_ROCKWELLCOLLINS_ATC_RESOLUTE_RESOLUTE);
	}
	
}

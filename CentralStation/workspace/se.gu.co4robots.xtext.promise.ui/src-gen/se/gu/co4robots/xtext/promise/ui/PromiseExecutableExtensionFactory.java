/*
 * generated by Xtext 2.18.0.M3
 */
package se.gu.co4robots.xtext.promise.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import se.gu.co4robots.xtext.promise.ui.internal.PromiseActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PromiseExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(PromiseActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		PromiseActivator activator = PromiseActivator.getInstance();
		return activator != null ? activator.getInjector(PromiseActivator.SE_GU_CO4ROBOTS_XTEXT_PROMISE_PROMISE) : null;
	}

}

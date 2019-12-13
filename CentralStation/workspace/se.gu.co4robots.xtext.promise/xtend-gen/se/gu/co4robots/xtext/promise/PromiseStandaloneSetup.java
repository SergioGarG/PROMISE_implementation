package se.gu.co4robots.xtext.promise;

import se.gu.co4robots.xtext.promise.PromiseStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PromiseStandaloneSetup extends PromiseStandaloneSetupGenerated {
  public static void doSetup() {
    new PromiseStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}

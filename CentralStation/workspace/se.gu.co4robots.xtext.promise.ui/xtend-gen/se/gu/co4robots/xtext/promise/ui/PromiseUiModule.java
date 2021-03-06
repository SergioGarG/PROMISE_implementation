package se.gu.co4robots.xtext.promise.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import se.gu.co4robots.xtext.promise.ui.AbstractPromiseUiModule;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class PromiseUiModule extends AbstractPromiseUiModule {
  public PromiseUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}

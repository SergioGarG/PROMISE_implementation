package se.gu.co4robots.xtext.promise.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class PromiseLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public PromiseLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}

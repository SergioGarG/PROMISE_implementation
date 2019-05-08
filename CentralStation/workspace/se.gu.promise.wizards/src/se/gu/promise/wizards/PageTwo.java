/*
 * Licensed Material - Property of IBM 
 * (C) Copyright IBM Corp. 2002 - All Rights Reserved. 
 */

package se.gu.promise.wizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;


import se.gu.promise.wizards.MissionModel;
import se.gu.promise.wizards.MissionWizard;

/**
 * Wizard page shown when the user has chosen plane as means of 
 * transport
 */

public class PageTwo extends WizardPage //implements Listener 
{
	public static final String copyright = "(c) Copyright IBM Corporation 2002.";
	
	// widgets on this page
	Text events;
	Text actions;
	Text resources;
	
	IStatus eventStatus;
	IStatus actionsStatus;
	IStatus resourcesStatus;
		
	/**
	 * Constructor for PageTwo.
	 */
	protected PageTwo(String arg0) {
		super(arg0);
		setTitle("Set conditions and resources");
		setDescription("Specify the events and actions or resources of the mission");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {

	    // create the composite to hold the widgets
		GridData gd;
		Composite composite = new Composite(parent, SWT.NONE);

	    // create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 2;
		gl.numColumns = ncol;
		composite.setLayout(gl);
		
	    // create the widgets. If the appearance of the widget is different from the default, 
	    // create a GridData for it to set the alignment and define how much space it will occupy
		
		// Events				
		new Label (composite, SWT.NONE).setText("Events:");				
		events = new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		events.setLayoutData(gd);
		//events.addListener(SWT.Selection, this);
		events.addKeyListener(new KeyListener() {
			 @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void keyReleased(KeyEvent e) {
            	setPageComplete(isPageComplete());
            }
		});

		// Actions				
		new Label (composite, SWT.NONE).setText("Actions:");				
		actions = new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		actions.setLayoutData(gd);
		//actions.addListener(SWT.Selection, this);
		actions.addKeyListener(new KeyListener() {
			 @Override
           public void keyPressed(KeyEvent e) {
               // TODO Auto-generated method stub
           }

           @Override
           public void keyReleased(KeyEvent e) {
           	setPageComplete(isPageComplete());
           }
		});
		
		// Resources				
		new Label (composite, SWT.NONE).setText("Resources:");				
		resources = new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		resources.setLayoutData(gd);
		//actions.addListener(SWT.Selection, this);
		resources.addKeyListener(new KeyListener() {
			 @Override
           public void keyPressed(KeyEvent e) {
               // TODO Auto-generated method stub
           }

           @Override
           public void keyReleased(KeyEvent e) {
           	setPageComplete(isPageComplete());
           }
		});


		
	    // set the composite as the control for this page
		setControl(composite);		
		setPageComplete(true);
	}

	public boolean canFlipToNextPage()
	{
		// no next page for this path through the wizard
		return false;
	}
	
    /*
     * Process the events: 
     * when the user has entered all information
     * the wizard can be finished
     */
//	public void handleEvent(Event e)
//	{
//		setPageComplete(isPageComplete());
//		getWizard().getContainer().updateButtons();
//	}
//	
//	public void keyReleased(KeyEvent e) {
//		setPageComplete(isPageComplete());
//    }
	
	/*
	 * Sets the completed field on the wizard class when all the information 
	 * is entered and the wizard can be completed
	 */	 
	public boolean isPageComplete()
	{
//		MissionWizard wizard = (MissionWizard)getWizard();
//		if (events.getText().length() == 0 || actions.getText().length() == 0) {
//			wizard.pageTwoCompleted = false;
//			return false;
//		}
		saveDataToModel();
		return true;
	}
	
	private void saveDataToModel()
	{
		MissionWizard wizard = (MissionWizard)getWizard();
		wizard.model.events = events.getText();
		wizard.model.actions = actions.getText();
		wizard.model.resources = resources.getText();
		wizard.pageTwoCompleted=true;
	}	
	

//	/**
//	 * Applies the status to the status line of a dialog page.
//	 */
//	private void applyToStatusLine(IStatus status) {
//		String message= status.getMessage();
//		if (message.length() == 0) message= null;
//		switch (status.getSeverity()) {
//			case IStatus.OK:
//				setErrorMessage(null);
//				setMessage(message);
//				break;
//			case IStatus.WARNING:
//				setErrorMessage(null);
//				setMessage(message, WizardPage.WARNING);
//				break;				
//			case IStatus.INFO:
//				setErrorMessage(null);
//				setMessage(message, WizardPage.INFORMATION);
//				break;			
//			default:
//				setErrorMessage(message);
//				setMessage(null);
//				break;		
//		}
//	}
	
	void onEnterPage()
	{
	    // Gets the model
	    MissionWizard wizard = (MissionWizard)getWizard();
		MissionModel model = wizard.model;
		if (model.resetMission) {
			wizard.pageTwoCompleted = false;	
		}
	}


}

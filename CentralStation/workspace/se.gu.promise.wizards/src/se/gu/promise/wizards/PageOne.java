/*
 * Licensed Material - Property of IBM 
 * (C) Copyright IBM Corp. 2002 - All Rights Reserved. 
 */
 
package se.gu.promise.wizards;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

/**
 * Class representing the first page of the wizard
 */

public class PageOne extends WizardPage implements Listener
{

	public static final String copyright = "(c) Copyright IBM Corporation 2002.";	
	
	IWorkbench workbench;
	IStructuredSelection selection;
	
	// widgets on this page 
	Text robots;
	Text locations;

	
	// status variable for the possible errors on this page
	// robotStatus and locationsStatus holds an error if the name of an item is repeated
	IStatus robotStatus;
	IStatus locationsStatus;
	
	/**
	 * Constructor for PageOne.
	 */
	public PageOne(IWorkbench workbench, IStructuredSelection selection) {
		super("Page1");
		setTitle("Your Mission");
		setDescription("Select the details of your mission");
		this.workbench = workbench;
		this.selection = selection;
		robotStatus = new Status(IStatus.OK, "not_used", 0, "", null);
		locationsStatus = new Status(IStatus.OK, "not_used", 0, "", null);		
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {

	    // create the composite to hold the widgets
		GridData gd;
		Composite composite =  new Composite(parent, SWT.NULL);

	    // create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 4;
		gl.numColumns = ncol;
		composite.setLayout(gl);
		
	    // create the widgets. If the appearance of the widget is different from the default, 
	    // create a GridData for it to set the alignment and define how much space it will occupy		
	    	    
		// Robots				
		new Label (composite, SWT.NONE).setText("Robots:");				
		robots = new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		robots.setLayoutData(gd);
		
		// Locations
		new Label (composite, SWT.NONE).setText("Locations:");				
		locations = new Text(composite, SWT.BORDER);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = ncol - 1;
		locations.setLayoutData(gd);

		createLine(composite, ncol);	
		
	    // set the composite as the control for this page
		setControl(composite);		
		addListeners();
	}
	
	private void addListeners()
	{
		robots.addListener(SWT.KeyUp, this);
		locations.addListener(SWT.KeyUp, this);
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
	    // Initialize a variable with the no error status
	    Status status = new Status(IStatus.OK, "not_used", 0, "", null);
	    // If the event is triggered by the robots or locations fields
	    // set the corresponding status variable to the right value
	    if ((event.widget == robots) || (event.widget == locations)) {
	        if (robots.getText().equals(robots.getText()) && robots.getText().equals(locations.getText()))
	            status = new Status(IStatus.ERROR, "not_used", 0, 
	                "There cannot be items with the same name", null);        
	        	robotStatus = status;
	    }
	    // Show the most serious error
	    applyToStatusLine(robotStatus);
		getWizard().getContainer().updateButtons();
	}

	/*
	 * Returns the next page.
	 * Saves the values from this page in the model associated 
	 * with the wizard. Initializes the widgets on the next page.
	 */
	
	public IWizardPage getNextPage()
	{    		
		saveDataToModel();		
		PageTwo page = ((MissionWizard)getWizard()).PageTwo;
		page.onEnterPage();
		return page;
	}

	/**
	 * @see IWizardPage#canFlipToNextPage()
	 */
	public boolean canFlipToNextPage()
	{
		if (getErrorMessage() != null) return false;
		if (isTextNonEmpty(robots)
			&& isTextNonEmpty(locations))
			return true;
		return false;
	}
	
	/*
	 * Saves the uses choices from this page to the model.
	 * Called on exit of the page
	 */
	private void saveDataToModel()
	{
	    // Gets the model
		MissionWizard wizard = (MissionWizard)getWizard();
		MissionModel model = wizard.model;

		model.resetMission = true;
		if ((model.robots != null) && (model.locations != null))
		    if (model.robots.equals(robots.getText()) &&
		    	model.locations.equals(locations.getText()))
	    		model.resetMission = false;
		
	    // Saves the user choices in the model
		model.robots = robots.getText();
		model.locations = locations.getText();
	}

	/**
	 * Applies the status to the status line of a dialog page.
	 */
	private void applyToStatusLine(IStatus status) {
		String message= status.getMessage();
		if (message.length() == 0) message= null;
		switch (status.getSeverity()) {
			case IStatus.OK:
				setErrorMessage(null);
				setMessage(message);
				break;
			case IStatus.WARNING:
				setErrorMessage(null);
				setMessage(message, WizardPage.WARNING);
				break;				
			case IStatus.INFO:
				setErrorMessage(null);
				setMessage(message, WizardPage.INFORMATION);
				break;			
			default:
				setErrorMessage(message);
				setMessage(null);
				break;		
		}
	}	

	
	private static boolean isTextNonEmpty(Text t)
	{
		String s = t.getText();
		if ((s!=null) && (s.trim().length() >0)) return true;
		return false;
	}	

	private void createLine(Composite parent, int ncol) 
	{
		Label line = new Label(parent, SWT.SEPARATOR|SWT.HORIZONTAL|SWT.BOLD);
		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		gridData.horizontalSpan = ncol;
		line.setLayoutData(gridData);
	}	

	

}


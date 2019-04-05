/*
 * Licensed Material - Property of IBM 
 * (C) Copyright IBM Corp. 2002 - All Rights Reserved. 
 */
 
package se.gu.promise.wizards;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * Wizard class
 */
public class MissionWizard extends Wizard implements INewWizard
{
	public static final String copyright = "(c) Copyright IBM Corporation 2002.";	
	// wizard pages
	PageOne PageOne;
	PageTwo PageTwo;
	
	// the model
	MissionModel model;
	
	// workbench selection when the wizard was started
	protected IStructuredSelection selection;
	
	// flag indicated whether the wizard can be completed or not 
	// if the user has selected plane as type of transport
	protected boolean pageOneCompleted = false;

	// flag indicated whether the wizard can be completed or not 
	// if the user has selected car as type of transport
	protected boolean pageTwoCompleted = false;
	
	// the workbench instance
	protected IWorkbench workbench;

	/**
	 * Constructor for MissionWizard.
	 */
	public MissionWizard() {
		super();
		model = new MissionModel();
	}
	
	public void addPages()
	{
		PageOne = new PageOne(workbench, selection);
		addPage(PageOne);
		PageTwo = new PageTwo("");
		addPage(PageTwo);
	}

	/**
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		this.workbench = workbench;
		this.selection = selection;
		if (selection != null && !selection.isEmpty()) {
			Object obj = selection.getFirstElement();
			if (obj  instanceof IFile) {
				IFile file = (IFile) obj;	
				model.path=file.getRawLocation().toString();
				model.fileName=file.getName();
			}
		}
	}

	public boolean canFinish()
	{
		// cannot complete the wizard from the first page
		if (this.getContainer().getCurrentPage() == PageOne) 
			return false;
		//return pageTwoCompleted;
		return true;
	}
	
	public boolean performFinish() 
	{
		String summary = model.toString();
		//MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(), "Mission info", summary);
		return true;
	}
}

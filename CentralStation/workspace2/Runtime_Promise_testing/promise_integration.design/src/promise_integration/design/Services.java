package promise_integration.design;
import promise.impl.*;
import promise.util.*;
import java.util.ArrayList;
import java.util.List;

//import promise.*;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import promise.CompositionOperator;
import promise.Event;
import promise.Operator;
import promise.PromisePackage;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {
	
	public int getOperatorsNumber(CompositionOperator operator) {
		List<Operator> subops=new ArrayList<Operator>();
		List<CompositionOperator> subops2=new ArrayList<CompositionOperator>();
		Operator parent;
		CompositionOperator parent2 = null;
		parent2.getInputOperators();
		//for (Operator )
		
		return subops.size();
	}
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }*/
}

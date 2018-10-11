/**
 */
package promise;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instant Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link promise.InstantReaction#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see promise.PromisePackage#getInstantReaction()
 * @model
 * @generated
 */
public interface InstantReaction extends TriggerPatterns {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see promise.PromisePackage#getInstantReaction_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link promise.InstantReaction#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // InstantReaction

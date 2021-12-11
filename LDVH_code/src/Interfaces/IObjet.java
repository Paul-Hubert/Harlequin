/**
 * 
 */
package Interfaces;

import Classes.Objet;
import Classes.TypeObjet;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author quentin
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IObjet {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param nom
	* @param type
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Objet creerObjet(String nom, TypeObjet type);
}
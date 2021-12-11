/**
 * 
 */
package Interfaces;

import Classes.Section;
import java.util.Set;
import Classes.Objet;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author quentin
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface ISection {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param nom
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Section creerSection(String nom);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param section
	* @param objets
	* @param texte
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean editerSection(Section section, Set<Objet> objets, String texte);
}
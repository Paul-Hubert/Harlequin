/**
 * 
 */
package Interfaces;

import Classes.Enchainement;
import Classes.Section;
import java.util.Set;
import Classes.Objet;
import Classes.TypeObjet;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IEnchainement {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param texte
	* @param secDepart
	* @param secArrivee
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Enchainement creerEnchainement(String texte, Section secDepart, Section secArrivee);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param texte
	* @param objets
	* @param enchainement
	* @param typeObjets
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Enchainement editerEnchainement(String texte, Set<Objet> objets, Enchainement enchainement,
			TypeObjet... typeObjets);
}
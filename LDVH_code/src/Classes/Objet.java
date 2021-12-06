/**
 * 
 */
package Classes;

import Interfaces.IObjet;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Objet implements IObjet {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Enchainement> enchainement;

	/** 
	* @return enchainement
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Enchainement> getEnchainement() {
		// begin-user-code
		return enchainement;
		// end-user-code
	}

	/** 
	* @param enchainement enchainement à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setEnchainement(Set<Enchainement> enchainement) {
		// begin-user-code
		this.enchainement = enchainement;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Section section;

	/** 
	* @return section
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Section getSection() {
		// begin-user-code
		return section;
		// end-user-code
	}

	/** 
	* @param section section à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setSection(Section section) {
		// begin-user-code
		this.section = section;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<TypeObjet> typeObjet;

	/** 
	* @return typeObjet
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<TypeObjet> getTypeObjet() {
		// begin-user-code
		return typeObjet;
		// end-user-code
	}

	/** 
	* @param typeObjet typeObjet à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTypeObjet(Set<TypeObjet> typeObjet) {
		// begin-user-code
		this.typeObjet = typeObjet;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String nom;

	/** 
	* @return nom
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getNom() {
		// begin-user-code
		return nom;
		// end-user-code
	}

	/** 
	* @param nom nom à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNom(String nom) {
		// begin-user-code
		this.nom = nom;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IObjet#creerObjet(String nom, TypeObjet type)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Objet creerObjet(String nom, TypeObjet type) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}
}
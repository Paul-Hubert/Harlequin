/**
 * 
 */
package Classes;

import Interfaces.IEnchainement;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Enchainement implements IEnchainement {
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
	private Section section2;

	/** 
	* @return section2
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Section getSection2() {
		// begin-user-code
		return section2;
		// end-user-code
	}

	/** 
	* @param section2 section2 à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setSection2(Section section2) {
		// begin-user-code
		this.section2 = section2;
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
	private Set<Objet> objet;

	/** 
	* @return objet
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Objet> getObjet() {
		// begin-user-code
		return objet;
		// end-user-code
	}

	/** 
	* @param objet objet à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setObjet(Set<Objet> objet) {
		// begin-user-code
		this.objet = objet;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String texte;

	/** 
	* @return texte
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getTexte() {
		// begin-user-code
		return texte;
		// end-user-code
	}

	/** 
	* @param texte texte à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTexte(String texte) {
		// begin-user-code
		this.texte = texte;
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
	* @see IEnchainement#creerEnchainement(String texte, Section secDepart, Section secArrivee)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Enchainement creerEnchainement(String texte, Section secDepart, Section secArrivee) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IEnchainement#editerEnchainement(String texte, Set<Objet> objets, Enchainement enchainement, TypeObjet... typeObjets)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Enchainement editerEnchainement(String texte, Set<Objet> objets, Enchainement enchainement,
			TypeObjet... typeObjets) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}
}
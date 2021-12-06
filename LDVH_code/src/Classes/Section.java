/**
 * 
 */
package Classes;

import Interfaces.ISection;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Section implements ISection {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Livre livre;

	/** 
	* @return livre
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Livre getLivre() {
		// begin-user-code
		return livre;
		// end-user-code
	}

	/** 
	* @param livre livre à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLivre(Livre livre) {
		// begin-user-code
		this.livre = livre;
		// end-user-code
	}

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
	private Set<Enchainement> enchainement2;

	/** 
	* @return enchainement2
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Enchainement> getEnchainement2() {
		// begin-user-code
		return enchainement2;
		// end-user-code
	}

	/** 
	* @param enchainement2 enchainement2 à définir
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setEnchainement2(Set<Enchainement> enchainement2) {
		// begin-user-code
		this.enchainement2 = enchainement2;
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
	* (non-Javadoc)
	* @see ISection#creerSection(String nom)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Section creerSection(String nom) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see ISection#editerSection(Section section, Objet objets, String texte)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean editerSection(Section section, Objet objets, String texte) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}
}
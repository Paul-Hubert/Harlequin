/**
 * 
 */
package Classes;

import Interfaces.IEnchainement;

import java.util.HashSet;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author quentin
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Enchainement implements IEnchainement {

	public Enchainement(String n, Section s1, Section s2, String t, Set<Objet> o, Set<TypeObjet> ty) {
		this.nom = n;
		this.objet = o;
		this.section = s1;
		this.section2 = s2;
		this.texte = t;
		this.typeObjet = ty;
	}

	public Enchainement(String n, Section s1, Section s2, Set<Objet> o, String t) {
		this.nom = n;
		this.objet = o;
		this.section = s1;
		this.section2 = s2;
		this.texte = t;
		this.typeObjet = new HashSet<TypeObjet>();
	}

	public Enchainement(String n, Section s1, Section s2, String t, Set<TypeObjet> ty) {
		this.nom = n;
		this.section = s1;
		this.section2 = s2;
		this.texte = t;
		this.typeObjet = ty;
		this.objet = new HashSet<Objet>();
	}

	public Enchainement(String n, Set<Objet> o, Section s1, Section s2, String t) {
		this.nom = n;
		this.objet = o;
		this.section = s1;
		this.section2 = s2;
		this.texte = t;
		this.typeObjet = new HashSet<TypeObjet>();
		this.objet = new HashSet<Objet>();
	}

	public Enchainement(String n, Section s1, Section s2, Set<TypeObjet> ty) {
		this.nom = n;
		this.section = s1;
		this.section2 = s2;
		this.typeObjet = ty;
		this.objet = new HashSet<Objet>();
	}

	public Enchainement(String n, Set<Objet> o, Section s1, Section s2) {
		this.nom = n;
		this.objet = o;
		this.section = s1;
		this.section2 = s2;
		this.typeObjet = new HashSet<TypeObjet>();
	}

	public Enchainement(String n, Section s1, Section s2) {
		this.nom = n;
		this.section = s1;
		this.section2 = s2;
		this.typeObjet = new HashSet<TypeObjet>();
		this.objet = new HashSet<Objet>();
	}

	public Enchainement(String n, Section s1, Section s2, String t) {
		this.nom = n;
		this.section = s1;
		this.section2 = s2;
		this.texte = t;
		this.typeObjet = new HashSet<TypeObjet>();
		this.objet = new HashSet<Objet>();
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
	* @param section section ?? d??finir
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
	* @param section2 section2 ?? d??finir
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
	* @param typeObjet typeObjet ?? d??finir
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
	* @param objet objet ?? d??finir
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
	* @param texte texte ?? d??finir
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
	* @param nom nom ?? d??finir
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
		// TODO Module de remplacement de m??thode auto-g??n??r??
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
		// TODO Module de remplacement de m??thode auto-g??n??r??
		return null;
		// end-user-code
	}
}
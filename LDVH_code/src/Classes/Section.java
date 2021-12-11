/**
 * 
 */
package Classes;

import Interfaces.ISection;

import java.util.HashSet;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Section implements ISection {

	public Section(Set<Enchainement> e1, Set<Enchainement> e2, String n, Set<Objet> o, String t) {
		this.enchainementDepart=e1;
		this.enchainementArrivee=e2;
		this.nom=n;
		this.objet=o;
		this.texte=t;
	}
	
	public Section(String n, Set<Objet> o, String t) {
		this.nom=n;
		this.objet=o;
		this.texte=t;
		this.enchainementDepart=new HashSet<Enchainement>();
		this.enchainementArrivee=new HashSet<Enchainement>();
	}
	
	public Section(String n, String t) {
		this.nom=n;
		this.texte=t;
		this.enchainementDepart=new HashSet<Enchainement>();
		this.enchainementArrivee=new HashSet<Enchainement>();
		this.objet=new HashSet<Objet>();
	}

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
	private Set<Enchainement> enchainementDepart;

	/** 
	 * @return enchainement
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Enchainement> getEnchainementDepart() {
		// begin-user-code
		return enchainementDepart;
		// end-user-code
	}

	/** 
	 * @param enchainement enchainement à définir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEnchainementDepart(Set<Enchainement> enchainement) {
		// begin-user-code
		this.enchainementDepart = enchainement;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Enchainement> enchainementArrivee;

	/** 
	 * @return enchainement2
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Enchainement> getEnchainementArrivee() {
		// begin-user-code
		return enchainementArrivee;
		// end-user-code
	}

	/** 
	 * @param enchainement2 enchainement2 à définir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setEnchainementArrivee(Set<Enchainement> enchainement2) {
		// begin-user-code
		this.enchainementArrivee = enchainement2;
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

	public void addObjet(Objet o) {
		this.objet.add(o);
		o.setSection(this);
	}

	@Override
	public Boolean editerSection(Section section, Set<Objet> objets, String texte) {
		// TODO Module de remplacement de méthode auto-généré
		return null;
	}
}
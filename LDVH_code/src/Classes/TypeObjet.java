/**
 * 
 */
package Classes;

import Interfaces.ITypeObjet;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class TypeObjet implements ITypeObjet {
	
	public TypeObjet(String n) {
		this.nom=n;
	}
	

	public boolean isIn(Set<TypeObjet>t) {
		for(TypeObjet ty : t) {
			if(ty==this)return true;
		}
		return false;
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
	* (non-Javadoc)
	* @see ITypeObjet#creerTypeObjet(String nom)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public TypeObjet creerTypeObjet(String nom) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}
}
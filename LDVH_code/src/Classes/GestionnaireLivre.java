/**
 * 
 */
package Classes;

import java.util.LinkedList;

import Interfaces.IGestionnaireLivre;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class GestionnaireLivre implements IGestionnaireLivre {
	/** 
	* (non-Javadoc)
	* @see IGestionnaireLivre#ajouterLivre(Livre livre)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	
	private Livre courant;
	private LinkedList<Livre> livres;
	
	public GestionnaireLivre() {
		this.livres = new LinkedList<Livre>();
	}
	
	public Boolean ajouterLivre(Livre livre) {
		this.livres.add(livre);
		return true;
	}
	
	public Livre getCourant() {
		return this.courant;
	}
	
	public LinkedList<Livre> getLivres(){
		return this.livres;
	}
	
	public Livre getLivre(String s) {
		for(Livre l : livres) {
			if(l.getNom().equals(s))return l;
		}
		return null;
	}

	/** 
	* (non-Javadoc)
	* @see IGestionnaireLivre#chargerLivre(String path)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Livre chargerLivre(Livre livre) {
		this.courant=livre;
		return this.courant;
	}

	/** 
	* (non-Javadoc)
	* @see IGestionnaireLivre#creerLivre(String path, String titre)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Livre creerLivre(String path, String titre) {
		courant = new Livre(titre);
		this.livres.add(courant);
		return courant;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGestionnaireLivre#sauvegarderLivre(Livre livre)
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean sauvegarderLivre(Livre livre) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGestionnaireLivre#creerPDF()
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void creerPDF() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	/** 
	* (non-Javadoc)
	* @see IGestionnaireLivre#creerHTML()
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void creerHTML() {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré

		// end-user-code
	}

	@Override
	public Livre chargerLivre(String path) {
		// TODO Module de remplacement de méthode auto-généré
		return null;
	}
}
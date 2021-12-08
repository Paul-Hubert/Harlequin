/**
 * 
 */
package Classes;

import Interfaces.ILivre;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Livre implements ILivre {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */

	public Livre(String titre, Section pPage) {
		this.nom=titre;
		this.premierePage=pPage;
		this.section=new HashSet<Section>();
		this.section.add(pPage);
	}

	public Livre(String titre) {
		this.nom=titre;
		this.section=new HashSet<Section>();
	}

	public void createSection(String texte, String nom) {
		Section s = new Section(nom, texte);

		section.add(s);
	}

	public void createEnchainement(String texte, String nom, Section s1, Section s2, Set<Objet> o, Set<TypeObjet> ty) {
		Enchainement e = new Enchainement(nom, s1, s2,texte, o, ty);
		s1.getEnchainementDepart().add(e);
		s2.getEnchainementArrivee().add(e);
	}

	public void createEnchainement(String texte, String nom, Section s1, Section s2, Set<Objet> o) {
		Enchainement e = new Enchainement(nom, s1, s2, o, texte);
		s1.getEnchainementDepart().add(e);
		s2.getEnchainementArrivee().add(e);
	}

	public void createEnchainement(String texte, String nom, Section s1, Section s2) {
		Enchainement e = new Enchainement(nom, s1, s2, texte);
		s1.getEnchainementDepart().add(e);
		s2.getEnchainementArrivee().add(e);
	}

	public Set<Objet> getObjets(){
		Set<Objet> objets=new HashSet<Objet>();
		for(Section s : this.section) {
			objets.addAll(s.getObjet());
		}
		return objets;
	}

	public Objet getObjet(String o) {
		Set<Objet> objets = getObjets();
		for(Objet obj : objets) {
			if(obj.getNom()==o)return obj;
		}
		return null;
	}

	public Set<Objet> getObjets(String[] o){
		Set<Objet> obj = new HashSet<Objet>();
		for(String s : o) {
			obj.add(getObjet(s));
		}
		return obj;
	}

	public Set<TypeObjet> getTypeObjets(){
		Set<Objet> objets=getObjets();
		Set<TypeObjet>typeObjets=new HashSet<TypeObjet>();
		for(Objet o : objets) {
			Set<TypeObjet>ty = o.getTypeObjet();
			if(ty!=null) {
				for(TypeObjet t : ty) {
					if(t!=null) {
						if(!t.isIn(typeObjets))typeObjets.add(t);
					}
				}
			}
		}
		return typeObjets;
	}

	public TypeObjet getTypeObjet(String t) {
		Set<TypeObjet> typeobjets = getTypeObjets();
		for(TypeObjet ty : typeobjets) {
			if(ty.getNom()==t)return ty;
		}
		return null;
	}

	public Set<TypeObjet> getTypeObjets(String[] t){
		Set<TypeObjet> ty = new HashSet<TypeObjet>();
		for(String s : t) {
			ty.add(getTypeObjet(s));
		}
		return ty;
	}

	public void setPremiere(Section s) {
		this.premierePage=s;
		if(!section.contains(s))section.add(s);
	}

	public Section getOneSection(String s) {
		for(Section sec : this.section) {
			if(sec.getNom().equals(s))return sec;
		}
		return null;
	}

	private Set<Section> section;

	/** 
	 * @return section
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Section> getSection() {
		// begin-user-code
		return section;
		// end-user-code
	}

	/** 
	 * @param section section à définir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setSection(Set<Section> section) {
		// begin-user-code
		this.section = section;
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
	private Section premierePage;

	/** 
	 * @return premierePage
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Section getPremierePage() {
		// begin-user-code
		return premierePage;
		// end-user-code
	}

	/** 
	 * @param premierePage premierePage à définir
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPremierePage(Section premierePage) {
		// begin-user-code
		this.premierePage = premierePage;
		// end-user-code
	}

	/** 
	 * (non-Javadoc)
	 * @see ILivre#setTitre(String titre)
	 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Boolean setTitre(String titre) {
		// begin-user-code
		// TODO Module de remplacement de méthode auto-généré
		return null;
		// end-user-code
	}
}
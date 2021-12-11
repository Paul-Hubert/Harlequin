/**
 * 
 */
package Interfaces;

import java.util.HashSet;
import java.util.Set;

import Classes.Enchainement;
import Classes.Objet;
import Classes.Section;
import Classes.TypeObjet;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author quentin
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface ILivre {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param titre
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean setTitre(String titre);
	
	public Section createSection(String texte, String nom);

	public Enchainement createEnchainement(String texte, String nom, Section s1, Section s2, Set<Objet> o, Set<TypeObjet> ty);

	public Enchainement createEnchainement(String texte, String nom, Section s1, Section s2, Set<Objet> o);

	public Enchainement createEnchainement(String texte, String nom, Section s1, Section s2);

	public Set<Objet> getObjets();

	public Objet getObjet(String o);

	public Set<Objet> getObjets(String[] o) ;

	public Set<TypeObjet> getTypeObjets();
	
	public TypeObjet getTypeObjet(String t);

	public Set<TypeObjet> getTypeObjets(String[] t);

	public void setPremiere(Section s);

	public Section getOneSection(String s);

	public Set<Section> getSection() ;

	public void setSection(Set<Section> section) ;

	public String getNom() ;

	public void setNom(String nom);

	public Section getPremierePage() ;
	
	public void setPremierePage(Section premierePage);
}
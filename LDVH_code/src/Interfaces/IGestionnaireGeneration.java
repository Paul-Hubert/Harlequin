/**
 * 
 */
package Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.text.DocumentException;

import Classes.Livre;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author quentin
 * @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface IGestionnaireGeneration {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param livre
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void creerHTML(ILivre livre) throws FileNotFoundException, IOException;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param livre
	* @return
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void creerPDF(ILivre livre) throws IOException, DocumentException;
}
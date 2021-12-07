/**
 * 
 */
package Interfaces;

import java.io.IOException;

import com.itextpdf.text.DocumentException;

import Classes.Livre;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author 21116461
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
	public Boolean creerHTML(Livre livre);

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @param livre
	* @return
	 * @throws DocumentException 
	 * @throws IOException 
	* @generated "UML vers Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Boolean creerPDF(Livre livre) throws IOException, DocumentException;
}
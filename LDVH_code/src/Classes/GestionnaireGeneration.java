/**
 * 
 */
package Classes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfWriter;

import Interfaces.IGestionnaireGeneration;

public class GestionnaireGeneration implements IGestionnaireGeneration {
	
	public GestionnaireGeneration() {
		
	}

	public Boolean creerHTML(Livre livre) {
		return true;
	}

	public Boolean creerPDF(Livre l) throws IOException, DocumentException {
		File file = new File("./LivrePDF");
		if (!file.exists()) file.mkdir();

		//creation du PDF
		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("./LivrePDF/"+l.getNom()+".pdf"));
		document.open();

		//creation de differente police de caractere
		Font f10 = new Font(FontFamily.TIMES_ROMAN, 10);
		Font f14 = new Font(FontFamily.TIMES_ROMAN, 14);
		Font f24 = new Font(FontFamily.TIMES_ROMAN, 24);

		//creation de la premier page
		Paragraph p = new Paragraph("page 1", f10);
		p.setAlignment(2);
		document.add(p);
		p=new Paragraph(l.getNom(), f24);
		p.setAlignment(1);
		document.add(p);
		p=new Paragraph("by Harlequin", f14);
		p.setAlignment(1);
		document.add(p);
		Image image1 = Image.getInstance("./harlequin.jpeg");
		image1.setAlignment(Element.ALIGN_CENTER);
		image1.scaleAbsolute(300, 300);
		document.add(new Paragraph(" ", f24));
		document.add(new Paragraph(" ", f24));
		document.add(new Paragraph(" ", f24));
		document.add(image1);
		document.add(new Paragraph(" ", f24));
		Set<Section> sections = l.getSection();
		HashMap<Section, Integer> pages = new HashMap();
		int i = 2;
		pages.put(l.getPremierePage(), i++);

		//map assignant une section a un numero de page
		for (Section entry : sections) {
			Section value = (Section) entry;
			if(value!=l.getPremierePage())pages.put(value, i++);
		}
		//On commence par la tete de section
		String str = "";
		document.newPage();
		p = new Paragraph("page "+pages.get(l.getPremierePage()), f10);
		p.setAlignment(2);
		document.add(p);
		p = new Paragraph(l.getPremierePage().getNom(), f24);
		p.setAlignment(1);
		document.add(p);
		p = new Paragraph(" ", f24);
		document.add(p);
		document.add(new Paragraph(l.getPremierePage().getTexte(), f14));
		document.add(new Paragraph(" ", f14));
		str = "Voici les objets que vous venez de récupérer : ";
		for(Objet o : l.getPremierePage().getObjet()) {
			str = str + o.getNom()+" / ";
		}
		if(l.getPremierePage().getObjet().size()!=0)str = str.substring(0, str.length()-2);
		document.add(new Paragraph(str, f14));
		document.add(new Paragraph(" ", f14));
		document.add(new Paragraph(" ", f14));
		document.add(new Paragraph("Où choisissez vous de vous rendre ?", f14));
		document.add(new Paragraph(" ", f14));
		for(Enchainement e : l.getPremierePage().getEnchainementDepart()) {
			str = "Liste des objets requis : ";
			document.add(new Paragraph(e.getNom()+" (en page "+pages.get(e.getSection2())+") : \n"+e.getTexte(), f14));
			for(Objet o : e.getObjet()) {
				str = str + o.getNom() +" / ";
			}
			if(e.getObjet().size()!=0)str = str.substring(0, str.length()-2);
			document.add(new Paragraph(str, f14));
			document.add(new Paragraph(" ", f14));
		}

		//On fait ensuite toute les autres sections
		for (Section entry : sections) {
			Section value = (Section) entry;
			if(value!=l.getPremierePage()) {
				document.newPage();
				p = new Paragraph("page "+pages.get(value), f10);
				p.setAlignment(2);
				document.add(p);
				p = new Paragraph(value.getNom(), f24);
				p.setAlignment(1);
				document.add(p);
				p = new Paragraph(" ", f24);
				document.add(p);
				document.add(new Paragraph(value.getTexte(), f14));
				document.add(new Paragraph(" ", f14));
				str = "Voici les objets que vous venez de récupérer : ";
				for(Objet o : value.getObjet()) {
					str = str + o.getNom()+" / ";
				}
				if(value.getObjet().size()!=0)str = str.substring(0, str.length()-2);
				document.add(new Paragraph(str, f14));
				document.add(new Paragraph(" ", f14));
				document.add(new Paragraph(" ", f14));
				document.add(new Paragraph("Où choisissez vous de vous rendre ?", f14));
				document.add(new Paragraph(" ", f14));
				for(Enchainement e : value.getEnchainementDepart()) {
					str = "Liste des objets requis : ";
					document.add(new Paragraph(e.getNom()+" (en page "+pages.get(e.getSection2())+") : "+e.getTexte(), f14));
					for(Objet o : e.getObjet()) {
						str = str + o.getNom() +" / ";
					}
					if(e.getObjet().size()!=0)str = str.substring(0, str.length()-2);
					document.add(new Paragraph(str, f14));
					document.add(new Paragraph(" ", f14));
				}
			}
		}

		document.close();
		writer.close();

		return true;
	}
}
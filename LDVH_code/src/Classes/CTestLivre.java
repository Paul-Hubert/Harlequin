package Classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.junit.Test;

import com.itextpdf.text.DocumentException;

import Interfaces.IGestionnaireGeneration;
import Interfaces.IGestionnaireLivre;
import Interfaces.ILivre;

public class CTestLivre {

	@Test
	public void testUC01CreerLivre() {
		CFactory factory = new CFactory();
		IGestionnaireLivre livres = factory.createCLivre();
		Livre l = livres.creerLivre("", "test");
		assertNotNull(l);
		assertEquals(livres.getCourant(), l);
		assertEquals(livres.getLivre(l.getNom()), l);
	}

	@Test
	public void testUC02ChargerLivre() {

	}

	@Test
	public void testUC03CreerSection() {
		CFactory factory = new CFactory();
		IGestionnaireLivre livres = factory.createCLivre();
		Livre l = livres.creerLivre("", "test");
		Section test = l.createSection("ceci est un texte de section", "section test");
		Set<Section> sections = l.getSection();
		Section sec=null;
		for(Section s : sections) {
			if(s.getNom().equals("section test")) sec = s;
		}
		assertNotNull(test);
		assertEquals(test, sec);
	}

	@Test
	public void testUC04EditerSection() {
		CFactory factory = new CFactory();
		IGestionnaireLivre livres = factory.createCLivre();
		Livre l = livres.creerLivre("", "test");
		Section test = l.createSection("ceci est un texte de section", "section test");
		test.setNom("test2");
		test.setTexte("texte modifier");
		Set<Section> sections = l.getSection();
		Section sec=null;
		for(Section s : sections) {
			if(s.getNom().equals("test2")) sec = s;
		}
		assertNotNull(test);
		assertEquals(test.getNom(), sec.getNom());
		assertEquals(test.getTexte(), sec.getTexte());
	}

	@Test
	public void testUC05CreerEnchainement() {

	}

	@Test
	public void testUC06EditerEnchainement() {

	}

	@Test
	public void testUC07CreerObjet() {

	}

	@Test
	public void testUC08CreerTypeObjet() {

	}

	@Test
	public void testUC09GenererHTML() {

	}

	@Test
	public void testUC10GenererPDF() throws IOException, DocumentException {
		CFactory factory = new CFactory();
		IGestionnaireGeneration generateur = factory.createCGeneration();
		ILivre l = factory.createLivre("test");
		Section s1 = l.createSection("texte1", "nom1");
		l.setPremiere(s1);
		Section s2 = l.createSection("texte2", "nom2");
		l.createEnchainement("enchainement texte", "enchainement", s1, s2);
		generateur.creerPDF(l);
		File f = new File("./LivrePDF/test.pdf");
		assertTrue(f.exists());
	}

}

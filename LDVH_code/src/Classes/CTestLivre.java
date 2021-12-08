package Classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CTestLivre {
	
	@Test
	public void testS1() {
		CFactory factory = new CFactory();
		GestionnaireLivre livres = (GestionnaireLivre) factory.createCLivre();
		Livre l = livres.creerLivre("", "test");
		assertNotNull(l);
		assertEquals(livres.getCourant(), l);
		assertEquals(livres.getLivre(l.getNom()), l);
	}

}

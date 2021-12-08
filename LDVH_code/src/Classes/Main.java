package Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		demoA();
	}
	
	public static void demoA() throws Exception {
		CFactory factory = new CFactory();
		GestionnaireLivre gestLivres=(GestionnaireLivre) factory.createCLivre();
		Livre livreDEMOA = (Livre) factory.createLivre("Robinson Crusoé");
		gestLivres.ajouterLivre(livreDEMOA);
		livreDEMOA.createSection("Dans cette histoire, vous incarnez Robinson Crusoé. Vous vous réveillez sur une ile perdu en mer alors que vous aviez perdu connaissance et chercher maintenant a vous en echapper.\nfaites attention ou vous mettez les pieds, le chemin vers la liberté est semé d'embuche !", "Ile principale");
		livreDEMOA.createSection("Vous vous trouvez maintenant au bord de la mer, vous pouvez appercevoir l'ile principale ainsi qu'une ile secondaire qui a l'air habitée.", "Mer");
		livreDEMOA.createSection("vous venez d'arriver dans la jungle, un endroit très humide avez beaucoup de bruit d'animaux étrange.", "Jungle");
		livreDEMOA.createSection("vous venez d'arriver sur l'epave d'un bateau a moitié sous l'eau, elle regorge de petit trésor.", "Epave");
		livreDEMOA.createSection("vous arrivez dans un temple très sombre en ruine avec de nombreuses galerie et beaucoup d'objet abandonnées.", "Temple");
		livreDEMOA.createSection("vous arrivez dans un camp de pécheur ou se trouve une cabanne encore intacte, les autres ont été ravager par une tempete.", "Cabanne du pecheur");
		livreDEMOA.createSection("ENFIN vous parvenez a retrouver la civilisation, BRAVO a vous pour cette aventure", "Village");
		livreDEMOA.setPremiere(livreDEMOA.getOneSection("Ile principale"));
		livreDEMOA.getOneSection("Ile principale").addObjet(new Objet("un radeau"));
		livreDEMOA.getOneSection("Ile principale").addObjet(new Objet("une allumette"));
		livreDEMOA.getOneSection("Ile principale").addObjet(new Objet("une bouteille de ruhm"));
		livreDEMOA.getOneSection("Epave").addObjet(new Objet("une planche de bois"));
		livreDEMOA.getOneSection("Epave").addObjet(new Objet("un collier en or"));
		livreDEMOA.getOneSection("Jungle").addObjet(new Objet("une lance"));
		livreDEMOA.getOneSection("Temple").addObjet(new Objet("un radeau"));
		livreDEMOA.getOneSection("Cabanne du pecheur").addObjet(new Objet("une torche"));
		String[] objets1 = {"un radeau"};
		String[] objets2 = {"une lance"};
		String[] objets3 = {"une torche", "une allumette"};
		String[] objets4 = {"une planche de bois"};
		livreDEMOA.createEnchainement("Vous decidez de prendre le chemin de la securité vers la jungle mais guard a ce que vous trouverez là-bas !","Ile principale --> Jungle",livreDEMOA.getOneSection("Ile principale"), livreDEMOA.getOneSection("Jungle"));
		livreDEMOA.createEnchainement("Vous voyez la mer et decider de vous y rendre, malheureusement il y a un requin vous ne pouvez donc pas nager...","Ile principale --> Mer", livreDEMOA.getOneSection("Ile principale"), livreDEMOA.getOneSection("Mer"), livreDEMOA.getObjets(objets1));
		livreDEMOA.createEnchainement("vous apercevez une epave aux loin au bord de l'eau mais il y a des etranges poissons carnivore qui rodent autours.","Ile principale --> Epave", livreDEMOA.getOneSection("Ile principale"), livreDEMOA.getOneSection("Epave"),livreDEMOA.getObjets(objets2));
		livreDEMOA.createEnchainement("vous decidez de revenir a l'ile principale où vous vous sentez plus en securité","Epave --> Ile principale", livreDEMOA.getOneSection("Epave"), livreDEMOA.getOneSection("Ile principale"));
		livreDEMOA.createEnchainement("vous apercevez une cabanne au loin mais attention, vous risquez de ne pas pouvoir reprendre ce chemin dans l'autre sens, la pente est très raide.","Jungle --> Cabanne du pecheur", livreDEMOA.getOneSection("Jungle"), livreDEMOA.getOneSection("Cabanne du pecheur"));
		livreDEMOA.createEnchainement("vous trouvez un chemin avec des lianes qui vous permet de revenir directement a l'ile principale","Cabanne du pecheur --> Ile principale", livreDEMOA.getOneSection("Cabanne du pecheur"), livreDEMOA.getOneSection("Ile principale"));
		livreDEMOA.createEnchainement("vous appercevez un temple mais celui ci est tres sombre et si j'étais vous je n'oserai pas m'y aventurer dans le noir","Jungle --> Temple", livreDEMOA.getOneSection("Jungle"), livreDEMOA.getOneSection("Temple"), livreDEMOA.getObjets(objets3));
		livreDEMOA.createEnchainement("ce temple vous fait trop peur et decider dans sortir afin de retourner dans la jungle","Temple --> Jungle", livreDEMOA.getOneSection("Temple"), livreDEMOA.getOneSection("Jungle"));
		livreDEMOA.createEnchainement("vous decidez de vous rendre sur l'ile principale","Mer --> Ile principale", livreDEMOA.getOneSection("Mer"), livreDEMOA.getOneSection("Ile principale"), livreDEMOA.getObjets(objets1));
		livreDEMOA.createEnchainement("vous decidez de vous rendre sur lile au village","Mer --> Village", livreDEMOA.getOneSection("Mer"), livreDEMOA.getOneSection("Village"),livreDEMOA.getObjets(objets4));
		livreDEMOA.createEnchainement("l'atmosphère de cette jungle pèse sur vous et choisissez de revenir à l'air libre sur l'ile principale","Jungle --> Ile principale", livreDEMOA.getOneSection("Jungle"), livreDEMOA.getOneSection("Ile principale"));
		GestionnaireAnalyse analyse=(GestionnaireAnalyse) factory.createCAnalyse();
		analyse.analyseGraphe(livreDEMOA);
		GestionnaireGeneration generateur=(GestionnaireGeneration) factory.createCGeneration();
		generateur.creerHTML(livreDEMOA);
		generateur.creerPDF(livreDEMOA);
	}
}

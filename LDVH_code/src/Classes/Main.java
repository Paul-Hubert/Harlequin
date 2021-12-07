package Classes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		demoB();
		
	}
	
	public static void demoB() throws Exception {
		CFactory factory = new CFactory();
		GestionnaireLivre gestLivres=(GestionnaireLivre) factory.createCLivre();
		Livre livreDEMOB = (Livre) factory.createLivre("Robinson Crusoé");
		gestLivres.ajouterLivre(livreDEMOB);
		livreDEMOB.createSection("Dans cette histoire, vous incarnez Robinson Crusoé. Vous vous réveillez sur une ile perdu en mer alors que vous aviez perdu connaissance et chercher maintenant a vous en echapper.\nfaites attention ou vous mettez les pieds, le chemin vers la liberté est semé d'embuche !", "Ile principale");
		livreDEMOB.createSection("Vous vous trouvez maintenant au bord de la mer, vous pouvez appercevoir l'ile principale ainsi qu'une ile secondaire qui a l'air habitée.", "Mer");
		livreDEMOB.createSection("vous venez d'arriver dans la jungle, un endroit très humide avez beaucoup de bruit d'animaux étrange.", "Jungle");
		livreDEMOB.createSection("vous venez d'arriver sur l'epave d'un bateau a moitié sous l'eau, elle regorge de petit trésor.", "Epave");
		livreDEMOB.createSection("vous arrivez dans un temple très sombre en ruine avec de nombreuses galerie et beaucoup d'objet abandonnées.", "Temple");
		livreDEMOB.createSection("vous arrivez dans un camp de pécheur ou se trouve une cabanne encore intacte, les autres ont été ravager par une tempete.", "Cabanne du pecheur");
		livreDEMOB.createSection("ENFIN vous parvenez a retrouver la civilisation, BRAVO a vous pour cette aventure", "Village");
		livreDEMOB.setPremiere(livreDEMOB.getOneSection("Ile principale"));
		livreDEMOB.getOneSection("Ile principale").addObjet(new Objet("un radeau"));
		livreDEMOB.getOneSection("Ile principale").addObjet(new Objet("une allumette"));
		livreDEMOB.getOneSection("Ile principale").addObjet(new Objet("une bouteille de ruhm"));
		livreDEMOB.getOneSection("Epave").addObjet(new Objet("une planche de bois"));
		livreDEMOB.getOneSection("Epave").addObjet(new Objet("un collier en or"));
		livreDEMOB.getOneSection("Jungle").addObjet(new Objet("une lance"));
		livreDEMOB.getOneSection("Temple").addObjet(new Objet("un radeau"));
		livreDEMOB.getOneSection("Cabanne du pecheur").addObjet(new Objet("une torche"));
		String[] objets1 = {"un radeau"};
		String[] objets2 = {"une lance"};
		String[] objets3 = {"une torche", "une allumette"};
		String[] objets4 = {"une planche de bois"};
		livreDEMOB.createEnchainement("Vous decidez de prendre le chemin de la securité vers la jungle mais guard a ce que vous trouverez là-bas !","Ile principale --> Jungle",livreDEMOB.getOneSection("Ile principale"), livreDEMOB.getOneSection("Jungle"));
		livreDEMOB.createEnchainement("Vous voyez la mer et decider de vous y rendre, malheureusement il y a un requin vous ne pouvez donc pas nager...","Ile principale --> Mer", livreDEMOB.getOneSection("Ile principale"), livreDEMOB.getOneSection("Mer"), livreDEMOB.getObjets(objets1));
		livreDEMOB.createEnchainement("vous apercevez une epave aux loin au bord de l'eau mais il y a des etranges poissons carnivore qui rodent autours.","Ile principale --> Epave", livreDEMOB.getOneSection("Ile principale"), livreDEMOB.getOneSection("Epave"),livreDEMOB.getObjets(objets2));
		livreDEMOB.createEnchainement("vous decidez de revenir a l'ile principale où vous vous sentez plus en securité","Epave --> Ile principale", livreDEMOB.getOneSection("Epave"), livreDEMOB.getOneSection("Ile principale"));
		livreDEMOB.createEnchainement("vous apercevez une cabanne au loin mais attention, vous risquez de ne pas pouvoir reprendre ce chemin dans l'autre sens, la pente est très raide.","Jungle --> Cabanne du pecheur", livreDEMOB.getOneSection("Jungle"), livreDEMOB.getOneSection("Cabanne du pecheur"));
		livreDEMOB.createEnchainement("vous trouvez un chemin avec des lianes qui vous permet de revenir directement a l'ile principale","Cabanne du pecheur --> Ile principale", livreDEMOB.getOneSection("Cabanne du pecheur"), livreDEMOB.getOneSection("Ile principale"));
		livreDEMOB.createEnchainement("vous appercevez un temple mais celui ci est tres sombre et si j'étais vous je n'oserai pas m'y aventurer dans le noir","Jungle --> Temple", livreDEMOB.getOneSection("Jungle"), livreDEMOB.getOneSection("Temple"), livreDEMOB.getObjets(objets3));
		livreDEMOB.createEnchainement("ce temple vous fait trop peur et decider dans sortir afin de retourner dans la jungle","Temple --> Jungle", livreDEMOB.getOneSection("Temple"), livreDEMOB.getOneSection("Jungle"));
		livreDEMOB.createEnchainement("vous decidez de vous rendre sur l'ile principale","Mer --> Ile principale", livreDEMOB.getOneSection("Mer"), livreDEMOB.getOneSection("Ile principale"), livreDEMOB.getObjets(objets1));
		livreDEMOB.createEnchainement("vous decidez de vous rendre sur lile au village","Mer --> Village", livreDEMOB.getOneSection("Mer"), livreDEMOB.getOneSection("Village"),livreDEMOB.getObjets(objets4));
		livreDEMOB.createEnchainement("l'atmosphère de cette jungle pèse sur vous et choisissez de revenir à l'air libre sur l'ile principale","Jungle --> Ile principale", livreDEMOB.getOneSection("Jungle"), livreDEMOB.getOneSection("Ile principale"));
		GestionnaireAnalyse analyse=(GestionnaireAnalyse) factory.createCAnalyse();
		analyse.analyseGraphe(livreDEMOB);
		GestionnaireGeneration generateur=(GestionnaireGeneration) factory.createCGeneration();
		generateur.creerHTML(livreDEMOB);
		generateur.creerPDF(livreDEMOB);
	}
}

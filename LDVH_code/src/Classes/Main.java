package Classes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		demoA();
	}
	
	public static void demoA() throws Exception {
		CFactory factory = new CFactory();
		GestionnaireLivre gestLivres=(GestionnaireLivre) factory.createCLivre();
		Livre livreDEMOA = (Livre) factory.createLivre("Robinson Crusoe");
		gestLivres.ajouterLivre(livreDEMOA);
		livreDEMOA.createSection("Dans cette histoire, vous incarnez Robinson Crusoé. Vous vous réveillez sur une île perdue en mer alors que vous aviez perdu "
				+ "connaissance et cherchez maintenant à vous en échapper.\nFaites attention où vous mettez les pieds, le chemin vers la liberté est semé "
				+ "d'embûches !", "Île principale");
		livreDEMOA.createSection("Vous vous trouvez maintenant au bord de la mer, vous pouvez apercevoir l'île principale ainsi qu'une île secondaire qui a"
				+ " l'air habitée.", "Mer");
		livreDEMOA.createSection("Vous venez d'arriver dans la jungle, un endroit très humide avez beaucoup de bruits d'animaux étranges.", "Jungle");
		livreDEMOA.createSection("Vous venez d'arriver sur l'épave d'un bateau a moitié sous l'eau, elle regorge de petits trésors.", "Epave");
		livreDEMOA.createSection("Vous arrivez dans un temple très sombre en ruine avec de nombreuses galeries et beaucoup d'objets abandonnés.", "Temple");
		livreDEMOA.createSection("Vous arrivez dans un camp de pécheurs où se trouve une cabane encore intacte, les autres ont été ravagées par une tempête.",
				"Cabane du pêcheur");
		livreDEMOA.createSection("ENFIN vous parvenez à retrouver la civilisation, BRAVO à vous pour cette aventure", "Village");
		livreDEMOA.setPremiere(livreDEMOA.getOneSection("Île principale"));
		Set<TypeObjet> ty1 =  new HashSet<TypeObjet>();
		ty1.add(new TypeObjet("or"));
		livreDEMOA.getOneSection("Île principale").addObjet(new Objet("un radeau"));
		livreDEMOA.getOneSection("Île principale").addObjet(new Objet("une allumette"));
		livreDEMOA.getOneSection("Île principale").addObjet(new Objet("une piece d'or", ty1));
		livreDEMOA.getOneSection("Epave").addObjet(new Objet("une planche de bois"));
		livreDEMOA.getOneSection("Epave").addObjet(new Objet("un collier en or", ty1));
		livreDEMOA.getOneSection("Jungle").addObjet(new Objet("une lance"));
		livreDEMOA.getOneSection("Temple").addObjet(new Objet("un radeau"));
		livreDEMOA.getOneSection("Cabane du pêcheur").addObjet(new Objet("une torche"));
		String[] objets1 = {"un radeau"};
		String[] objets2 = {"une lance"};
		String[] objets3 = {"une torche", "une allumette"};
		String[] objets4 = {"une planche de bois"};
		String[] typeobjet1 = {"or"};
		livreDEMOA.createEnchainement("Vous decidez de prendre le chemin de la securité vers la jungle mais gare à ce que vous trouverez là-bas !",
				"Île principale --> Jungle",livreDEMOA.getOneSection("Île principale"), livreDEMOA.getOneSection("Jungle"));
		livreDEMOA.createEnchainement("Vous voyez la mer et decidez de vous y rendre, malheureusement il y a un requin. Vous ne pouvez donc pas nager...",
				"Île principale --> Mer", livreDEMOA.getOneSection("Île principale"), livreDEMOA.getOneSection("Mer"), livreDEMOA.getObjets(objets1));
		livreDEMOA.createEnchainement("Vous apercevez une épave au loin au bord de l'eau mais il y a des étranges poissons carnivores qui rôdent autour.",
				"Île principale --> Epave", livreDEMOA.getOneSection("Île principale"), livreDEMOA.getOneSection("Epave"),livreDEMOA.getObjets(objets2));
		livreDEMOA.createEnchainement("Vous decidez de revenir à l'île principale où vous vous sentez plus en securité","Epave --> Île principale",
				livreDEMOA.getOneSection("Epave"), livreDEMOA.getOneSection("Île principale"));
		livreDEMOA.createEnchainement("Vous apercevez une cabane au loin mais attention, vous risquez de ne pas pouvoir reprendre ce chemin dans l'autre sens,"
				+ " la pente est très raide.","Jungle --> Cabane du pêcheur", livreDEMOA.getOneSection("Jungle"), livreDEMOA.getOneSection("Cabane du pêcheur"));
		livreDEMOA.createEnchainement("Vous trouvez un chemin avec des lianes qui vous permet de revenir directement a l'île principale",
				"Cabane du pêcheur --> Île principale", livreDEMOA.getOneSection("Cabane du pêcheur"), livreDEMOA.getOneSection("Île principale"));
		livreDEMOA.createEnchainement("Vous appercevez un temple mais celui-ci est très sombre et si j'étais vous je n'oserai pas m'y aventurer dans le noir",
				"Jungle --> Temple", livreDEMOA.getOneSection("Jungle"), livreDEMOA.getOneSection("Temple"), livreDEMOA.getObjets(objets3));
		livreDEMOA.createEnchainement("Ce temple vous fait trop peur et vous decidez d'en sortir afin de retourner dans la jungle","Temple --> Jungle",
				livreDEMOA.getOneSection("Temple"), livreDEMOA.getOneSection("Jungle"));
		livreDEMOA.createEnchainement("Vous decidez de vous rendre sur l'île principale","Mer --> Île principale", livreDEMOA.getOneSection("Mer"),
				livreDEMOA.getOneSection("Île principale"), livreDEMOA.getObjets(objets1));
		livreDEMOA.createEnchainement("Vous decidez de vous rendre sur l'île au village grâce à votre radeau et vous payez un homme avec de l'or à votre arrivée",
				"Mer --> Village", livreDEMOA.getOneSection("Mer"), livreDEMOA.getOneSection("Village"),livreDEMOA.getObjets(objets4),
				livreDEMOA.getTypeObjets(typeobjet1));
		livreDEMOA.createEnchainement("L'atmosphère de cette jungle pèse sur vous et vous choisissez de revenir à l'air libre sur l'île principale",
				"Jungle --> Île principale", livreDEMOA.getOneSection("Jungle"), livreDEMOA.getOneSection("Île principale"));
		GestionnaireAnalyse analyse=(GestionnaireAnalyse) factory.createCAnalyse();
		analyse.analyseGraphe(livreDEMOA);
		GestionnaireGeneration generateur=(GestionnaireGeneration) factory.createCGeneration();
		generateur.creerHTML(livreDEMOA);
		generateur.creerPDF(livreDEMOA);
	}
}

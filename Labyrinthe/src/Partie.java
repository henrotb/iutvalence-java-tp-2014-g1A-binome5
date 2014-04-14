/* TODO Package. */

import java.util.Scanner;

/** Générarateur de parties
 * 
 * @author HENROT REYNAUD
 * @version 1.0.3 */
public class Partie {
    /** Nombre de colonnes, définit par défaut. */
    private static final int NB_COLONNES = 10;
    /** Nombre de lignes, définit par défaut. */
    private static final int NB_LIGNES = 10;
    /** Le plateau. */
    private final boolean[][] plateau;
    /** La position de départ du joueur. */
    private final Position depart;
    /** La position d'arrivée du joueur. */
    private final Position arrivee;
    /** La position actuelle du joueur */
    private Position joueur;
    /** Appel du mapping des touches. */
    private MappingClavier mappingClavier;
   
    /** TODO. */ 
    public Partie() {
	this.mappingClavier = new MappingClavier();
	GenerateurPlateau generateur = new GenerateurPlateauFixe(NB_LIGNES, NB_COLONNES);
	generateur.generer();
	this.plateau = generateur.plateau();
	this.depart = generateur.depart();
	this.arrivee = generateur.arrivee();
	this.joueur = this.depart;
    }

    /** Méthode affichant le plateau et testant la prochaine position du joueur. */
    public void jouer() {
	// Afficher le labyrinthe
	System.out.println(this);
	// Saisir le mouvement.
	
	  while (true) {
	      	    Position temporaire = joueur.translater(this.getDirection());
	      	    if (estPositionValide(temporaire)) {
	      		joueur = temporaire;
	      	    }
		    System.out.println(this);
		    if (arrivee.comparer(joueur)) {
			System.out.println("Win !");
			break;
		    }
	  }
    }
    
    /** Methode retournant si la position du joueur est possible. */
    private boolean estPositionValide(Position position) {
	return !plateau[position.getX()][position.getY()];
    }
    
    /** Méthode permettant de récupérer la direction à la touche associée. */
    private Direction getDirection() {
	Scanner scan = new Scanner(System.in);
	return this.mappingClavier.parseDirection(scan.nextLine());
}

    /** Affichage console du labyrinthe. */
    public String toString() {
	StringBuilder plateauLettre = new StringBuilder(130);
	for (int x = 0; x < 10; x++) {
	    for (int y = 0; y < 10; y++) {
		if (this.plateau[x][y]) {
		    plateauLettre.append('█');
		    }
			else {
		    if ((depart.getX() == x) && (depart.getY() == y)) {
			plateauLettre.append('D');
		    }
		    else {
			if ((arrivee.getX() == x) && (arrivee.getY() == y)) {
			    plateauLettre.append('A');
			}
			else {
			    if ((joueur.getX() == x)
				    && (joueur.getY() == y)) {
				plateauLettre.append('J');
			    } 
			    else {
				plateauLettre.append(' ');
			    }
			}
		    }

		}
	    }
	    plateauLettre.append('\n');
	}

	return plateauLettre.toString();
    }
}

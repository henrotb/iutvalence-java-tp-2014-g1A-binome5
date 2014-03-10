/** Générarateur de parties
 * 
 * @author henrotb
 * @version 1.0.3 */
public class Partie {
    /**
 * 
 */
    private final boolean plateau[][];
    /**
 * 
 */
    private final Coordonnee depart;
    /**
 * 
 */
    private final Coordonnee arrivee;

    /**
 * 
 */
    private Coordonnee joueur;

    /**
 * 
 */
    public Partie() {

	this.plateau = new boolean[10][10];
	
	plateau[0][0] = plateau[0][1] = plateau[0][2] = plateau[0][3] = plateau[0][4] = plateau[0][5] = plateau[0][6] = plateau[0][7] = plateau[0][8] = plateau[0][9] = true;
	
	plateau[1][0] = plateau[1][2] = plateau[1][3] = plateau[1][9] = true;
	plateau[1][1] = plateau[1][4] = plateau[1][5] = plateau[1][6] = plateau[1][7] = plateau[1][8] = false;
	
	plateau[2][0] = plateau[2][2] = plateau[2][3] = plateau[2][5] = plateau[2][6] = plateau[2][7] = true;
	plateau[2][1] = plateau[2][4] = plateau[2][8] = plateau[2][9] = false;
	
	plateau[3][0] = plateau[3][2] = plateau[3][3] = plateau[3][5] = plateau[3][6] = plateau[3][7] = plateau[3][8] = plateau[3][9] = true;
	plateau[3][1] = plateau[3][4] = false;
	
	plateau[4][0] = plateau[4][2] = plateau[4][8] = plateau[4][9] = true;
	plateau[4][1] = plateau[4][3] = plateau[4][4] = plateau[4][5] = plateau[4][6] = plateau[4][7] = false;
	
	plateau[5][0] = plateau[5][4] = plateau[5][5] = plateau[5][6] = plateau[5][8] = plateau[5][9] = true;
	plateau[5][1] = plateau[5][2] = plateau[5][3] = plateau[5][7] = false;
	
	plateau[6][0] = plateau[6][1] = plateau[6][2] = plateau[6][4] = plateau[6][6] = plateau[6][8] = plateau[6][9] = true;
	plateau[6][3] = plateau[6][5] = plateau[6][7] = false;
	
	plateau[7][0] = plateau[7][1] = plateau[7][2] = plateau[7][4] = plateau[7][6] = plateau[7][8] = plateau[7][9] = true;
	plateau[7][3] = plateau[7][5] = plateau[7][7] = false;
	
	plateau[8][0] = plateau[8][1] = plateau[8][2] = plateau[8][6] = plateau[8][9] = true;
	plateau[8][3] = plateau[8][4] = plateau[8][5] = plateau[8][7] = plateau[8][8] = false;
	
	plateau[9][0] = plateau[9][1] = plateau[9][2] = plateau[9][3] = plateau[9][4] = plateau[9][5] = plateau[9][6] = plateau[9][7] = plateau[9][8] = plateau[9][9] = true;

	this.depart = new Coordonnee(1, 1);
	this.arrivee = new Coordonnee(2, 9);
	this.joueur = this.depart;

	/*
	 * Initialiser tout 
	 * 
	 * Initialiser le plateau 
	 * -> Mettre tout à vide 
	 * -> Générer les mur (au début constant)
	 *  
	 * Placer le départ et l'arrivée 
	 * -> Choisir 2 coordonnées 
	 * 
	 * Mettre le joueur sur le départ 
	 * -> Joueur = Depart
	 */
    }

    /**
 * 
 */
    public void jouer() {
	System.out.println(toString());
    }

    public String toString() {
	
	StringBuilder plateauLettre = new StringBuilder(130);

	for (int x = 0; x < 10; x++) {
	    for (int y = 0; y < 10; y++) {
		if (this.plateau[x][y])
		    plateauLettre.append("M");
		else {
		    if (depart.getX() == x && depart.getY() == y) {
			plateauLettre.append("D");
		    } 
		    else 
			if (arrivee.getX() == x && arrivee.getY() == y) {
			plateauLettre.append("A");
		    } 
			else 
			plateauLettre.append("O");
		}
		
	    }
	    plateauLettre.append('\n');
	   
	}
		
	return plateauLettre.toString();
	
    }
}

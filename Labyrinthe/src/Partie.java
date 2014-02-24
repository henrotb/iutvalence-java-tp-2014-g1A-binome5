
public class Partie { 
   private final boolean plateau [][];
   private final Coordonnee depart;
   private final Coordonnee arrivee;
   
   private Coordonnee joueur;

   public Partie() {
       
       this.plateau= new boolean [10][10];
       plateau[0][0]=plateau[0][1]=plateau[0][2]=plateau[0][3]=plateau[0][4]=plateau[0][5]=plateau[0][5]=plateau[0][6]=plateau[0][7]=plateau[0][8]=plateau[0][9]= true;
       
       this.depart = new Coordonnee(2,5);
       this.arrivee = new Coordonnee(10,3);
       this.joueur = new Coordonnee(2,5);
       
       
       /* Initialiser tout 
          Initialiser le plateau
          -> Mettre tout à vide
          -> Générer les mur (au début constant)
          Placer le départ et l'arrivée
          -> Choisir 2 coordonnées
          Mettre le joueur sur le départ
          -> Joueur = Depart
        */
   }
   
   public void jouer() {
       
   }
}

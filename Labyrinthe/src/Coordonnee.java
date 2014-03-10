
/**
 * Classe de définition de coordonnée
 * @author henrotb
 *@version 1.0.3
 */
public class Coordonnee 
{
    /** La coordonnée x */

    private int x;
    
    /** La coordonnée y */
    
    private int y;
    
    /**
     * Constructeur donnant un couple de coordonnées
     * @param x
     * @param y
     */
    public Coordonnee(int x, int y )
    {
	this.x=x;
	this.y=y;
    }
    
    /**
     * @return Renvoie la coordonnée x
     */
    public int getX()
    {
	return this.x;
    }
    
    /**
     * @return Renvoie la coordonnée y
     */
    public int getY()
    {
	return this.y;
    }
}

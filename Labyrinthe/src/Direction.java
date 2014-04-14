/**
 * Définition des directions.
 * 
 *
 * @author HENROT REYNAUD
 * @version 1.0.3
 */
public enum Direction {
    HAUT(-1,0),BAS(1,0),GAUCHE(0,-1), DROITE(0,1), FIXE(0,0);
    
    /** Nouvelle position X. */
    private final int deltaX;
    /** Nouvelle position Y. */
    private final int deltaY;
    /** Définition d'une direction. */
    private Direction(int dx, int dy)
    {
	this.deltaX = dx;
	this.deltaY = dy;
    }
    

    /** @return Renvoie la position de X. */
    public int getDeltaX()
    {
		return this.deltaX;
    }

    /** @return  Renvoie la position de Y. */
    public int getDeltaY()
    {
		return this.deltaY;
    }

}

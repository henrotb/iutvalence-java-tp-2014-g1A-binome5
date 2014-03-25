/* TODO Package. */

/**
 * Définition d'une position.
 * 
 * @author TODO (utilisez de vrais noms)
 * @version 1.0.3
 */
public class Position {
    /** La coordonnée x. */
    private int x;

    /** La coordonnée y. */
    private int y;

    /** Constructeur donnant un couple de coordonnées. */
    public Position(int x, int y) {
	this.x = x;
	this.y = y;
    }

    /** @return Renvoie la coordonnée x */
    public int getX() {
	return this.x;
    }

    /** @return Renvoie la coordonnée y */
    public int getY() {
	return this.y;
    }

    public Position translater(Direction direction) 
    {
	return new Position(this.x+direction.getDeltaX(), this.y+direction.getDeltaY());
    }
}

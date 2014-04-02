
public enum Direction {
    HAUT(-1,0),BAS(1,0),GAUCHE(0,-1), DROITE(0,1), FIXE(0,0);
    
    private final int deltaX;
    private final int deltaY;
    
    private Direction(int dx, int dy)
    {
	this.deltaX = dx;
	this.deltaY = dy;
    }
    

    public int getDeltaX()
    {
		return this.deltaX;
    }

    public int getDeltaY()
    {
		return this.deltaY;
    }

}


public enum Direction {
    HAUT(0,-1),BAS(0,1),GAUCHE(-1,0), DROITE(1,0);
    
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

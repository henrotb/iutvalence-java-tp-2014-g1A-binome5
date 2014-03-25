
public class MappingClavier 
{
    private final String[] mappings;

    public MappingClavier(String[] mappings) {
	super();
	this.mappings = mappings;
    }

    public Direction parseDirection(String nextLine) {
	if (nextLine.equals(this.mappings[0])) 
	    return Direction.HAUT;
	if (nextLine.equals(this.mappings[1])) 
	    return Direction.BAS;
	if (nextLine.equals(this.mappings[2])) 
	    return Direction.GAUCHE;
	if (nextLine.equals(this.mappings[3])) 
	    return Direction.DROITE;
	return null;
    }
    
    
    
}

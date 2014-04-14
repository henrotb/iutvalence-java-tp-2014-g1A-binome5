import java.util.HashMap;
import java.util.Map;

/**
 * Définition des touches directionnelles.
 * 
 *
 * @author HENROT REYNAUD
 * @version 1.0.3
 */

public class MappingClavier 
{
    /** Mapping d'une touche */
    private final Map<String, Direction> mappings;

    /** Définition du mapping des touches. */
    public MappingClavier() {
	this.mappings = new HashMap<String, Direction>(4);
	mappings.put("z", Direction.HAUT);
	mappings.put("q", Direction.GAUCHE);
	mappings.put("s", Direction.BAS);
	mappings.put("d", Direction.DROITE);

	
    }
    
    /** @return Permet de vérifier si la touche taper est valide pour un déplacement. */
    public Direction parseDirection(String nextLine) {
	Direction dir = mappings.get(nextLine);
	return dir == null ? Direction.FIXE : dir;
    }
}

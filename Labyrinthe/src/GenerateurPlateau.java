
/**
 * Interface de génération de plateaux.
 *
 * @author HENROT REYNAUD
 * @version 1.0.3
 */
public interface GenerateurPlateau {

    void generer();

    boolean[][] plateau();

    Position depart();

    Position arrivee();

    /** TODO. */

    
}

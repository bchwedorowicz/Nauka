package pl.java.shapes;

/**
 * Represents collection of shape`s sides
 * 
 * @author beata
 *
 */
public interface SideCollection {

	/**
	 * 
	 * @return Number of sides
	 */
	int getNumSides();

	/**
	 * 
	 * @param index
	 *            0 based index of a side
	 * @return Length of side at given index
	 */
	double getSide(int index);

}

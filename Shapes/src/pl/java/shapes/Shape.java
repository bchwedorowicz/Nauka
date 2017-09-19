package pl.java.shapes;

/**
 * Class represents 2D shape
 * 
 * @author beata
 *
 */
public abstract class Shape implements SideCollection {

	private static int numSides;

	public Shape(int numSides) {
		this.numSides = numSides;
	}

	@Override
	public int getNumSides() {
		return numSides;
	}

	/**
	 * Calculates area of this shape
	 * 
	 * @return area of this shape
	 */
	public abstract double getArea();

	public double getPerimeter() {
		double sum = 0;
		for (int i = 0; i < numSides; i++) {
			sum += getSide(i);
		}
		return sum;
		
	}

}

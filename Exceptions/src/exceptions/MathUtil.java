package exceptions;

public class MathUtil {

	/**
	 * 
	 * @param factorial
	 * @return
	 * @throws NumberTooBigException 
	 * @throws InvalidArgumentException
	 */
	public static int getFactorial(int factorial) throws NumberTooBigException {
		if (factorial == 0) {
			return 1;
		}
		if (factorial < 0) {
			throw new InvalidArgumentException("Give number greater than 0.");
		}
		if (factorial > 20) {
			throw new NumberTooBigException(factorial);
		} else {
			return factorial * getFactorial(factorial - 1);
		}

	}

}

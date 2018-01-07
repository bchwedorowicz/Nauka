
public class Apple extends Fruit {

	private String fruitType;

	public Apple(String fruitType) {
		super();
		this.fruitType = fruitType;
	}

	public String getFruitType() {
		return fruitType;
	}

	public void setFruitType(String fruitType) {
		this.fruitType = fruitType;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		printInfoApple();
	}

	public void printInfoApple() {
		System.out.print("Apple " + fruitType);
	}

}

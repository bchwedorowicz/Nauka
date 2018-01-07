
public class Pizzeria {

	public static void main(String[] args) {

		System.out.println("Menu. Pizze:");
		for (Pizza p : Pizza.values()) {
			System.out.println(p);
		}

		System.out.println("Wybrana pizza:");
		
		switch () {
		case MARGHERITA:
			System.out.println(Pizza.MARGHERITA.getDescription());
		case CAPRICIOSA:
			System.out.println(Pizza.CAPRICIOSA.getDescription());
		case PROSCIUTTO:
			System.out.println(Pizza.PROSCIUTTO.getDescription());
		default:
			System.out.println("Nie mamy innej pizzy");
		}

	}

}

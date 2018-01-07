import java.util.Scanner;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class PropertiesDataBinding {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	IntegerProperty first = new SimpleIntegerProperty();
	IntegerProperty second = new SimpleIntegerProperty();

	second.bind(first);

	System.out.println("Give number");
	int number = sc.nextInt();
	first.set(number);
	System.out.println("Second = " + second.getValue());

    }

}

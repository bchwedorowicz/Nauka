package pl.java.datyiczas;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class DatyCzas {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Press ENTER to start");
	sc.nextLine();
	Instant i1 = Instant.now();
	System.out.println("Press ENTER to stop");
	sc.nextLine();
	Instant i2 = Instant.now();
	Duration duration = Duration.between(i1, i2);
	System.out.println("Your time: " + duration.getSeconds() + " second");
	sc.close();

    }

}

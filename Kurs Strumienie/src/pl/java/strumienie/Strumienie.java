package pl.java.strumienie;

import java.util.stream.Stream;

//Utw�rz strumie� kolejnych liczb ca�kowitych zaczynaj�c od 0. 
//Nast�pnie korzystaj�c z metody filter() wybierz tylko te z nich, 
//kt�re s� wi�ksze od 100, mniejsze od 1000 i podzielne przez 5. 
//Wy�wietl na ekranie pierwszych 10 liczb tego strumienia pomno�onych przez 3
//
//Nie wykorzystuj w programie ani jednej p�tli.

public class Strumienie {

    public static void main(String[] args) {

	Stream<Integer> numbers = Stream.iterate(0, x -> x + 1);
	numbers.filter(x -> x > 100 && x < 1000 && x % 5 == 0)
		.limit(10)
		.map(x -> x * 3)
		.forEach(System.out::println);
    }

}

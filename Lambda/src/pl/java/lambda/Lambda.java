package pl.java.lambda;

import java.util.function.Consumer;

public class Lambda {
	
	// tworzenie klasy wewnêtrznej
	private static class SysOutPrinter implements Printer {

		@Override
		public void print(String s) {
		System.out.println(s);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Printer obj = new SysOutPrinter();
		
		obj.print("hello world");
		obj.print("word");
		
		//tworzenie klasy anonimowej
		Printer obj1 = new Printer() {
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		
		obj1.print("blabla");
		
		//tworzenie wyrazenia lambda z wykorzystaniem w³asnego interfejsu funkcyjego
		Printer obj2 = s -> System.out.println(s);
		obj2.print("xxx");
		
		//tworzenie wyra¿enia lambda z wykorzystaniem gotowego interfejsu Consumer
		Consumer<String> obj3 = s -> System.out.println(s);
		obj3.accept("zzz");
		
		
	}
	
	@FunctionalInterface
	public interface Printer {
		void print(String s);
	}

}

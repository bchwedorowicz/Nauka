import java.util.Arrays;

public class BubbleSortMain {

	public static void main(String[] args) {

		int[] ar = { 8, 1, 10, 12, 5, 3 };
		Sortable sor = new Sortable() {

			@Override
			public int[] sort(int[] array) {
				for (int i = 0; i < array.length - 1; i++) {
					for (int j = 0; j < array.length - 1 - i; j++) {
						if (array[j] > array[j + 1]) {
							int firstIndex = array[j];
							array[j] = array[j + 1];
							array[j + 1] = firstIndex;
						}
					}
				}
				return array;
			}
		};
		System.out.println(Arrays.toString(sor.sort(ar)));
	}
}

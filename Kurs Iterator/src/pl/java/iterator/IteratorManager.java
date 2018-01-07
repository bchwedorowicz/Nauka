package pl.java.iterator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class IteratorManager {

	Comparator<String> nameComparator = new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	};

	private Map<String, IteratorData> list = new TreeMap<>(nameComparator);

	public void addData(IteratorData data) {
		list.put(data.getLastName(), data);
	}

	public Map<String, IteratorData> getList() {
		return list;
	}

	public void printIterator() {
		Iterator<String> nameIterator = list.keySet().iterator();
		while (nameIterator.hasNext()) {
			String name = nameIterator.next();
			System.out.println(name);
		}
	}
}

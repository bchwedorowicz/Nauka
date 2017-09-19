package pl.beatka.acronyms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AcronymMapImpl extends AbstractAcronymCollection {

	private final Map<String, List<String>> map = new HashMap<String, List<String>>();

	@Override
	public int getAcronymsCount() {
		return map.size();
	}

	@Override
	public Collection<String> getAcronymDescriptions(String givenAcronym) {
		givenAcronym = givenAcronym.toUpperCase();
		return map.getOrDefault(givenAcronym, null);
	}

	@Override
	public int getUniqueWordsCount() {
		Set<String> count = new HashSet<>();
		for (List<String> entry : map.values()) {
			for (String s : entry) {
				for (String splited : s.split(" ")) {
					count.add(splited);
				}
			}
		}
		return count.size();
	}

	@Override
	protected void clear() {
		map.clear();
	}

	@Override
	protected void add(Acronym ac) {
		List<String> listOfDescriptions = new ArrayList<>();
		String acronym = ac.getAcronym();
		String description = ac.getDescription();
		if (map.containsKey(acronym)) {
			List<String> value = map.get(acronym);
			value.add(description);
		} else {
			listOfDescriptions.add(description);
			map.put(acronym, listOfDescriptions);
		}
	}

}

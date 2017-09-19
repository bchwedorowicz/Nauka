package pl.beatka.acronyms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AcronymsListImpl extends AbstractAcronymCollection {

	private final List<Acronym> acronyms = new ArrayList<>();

	@Override
	public int getAcronymsCount() {
		Set<String> count = new HashSet<>();
		for (Acronym acronym : acronyms) {
			String a = acronym.getAcronym();
			count.add(a);
		}
		return count.size();
	}

	@Override
	public Collection<String> getAcronymDescriptions(String givenAcronym) {
		Collection<String> description = new ArrayList<>();

		givenAcronym = givenAcronym.toUpperCase();
		for (Acronym acronym : acronyms) {
			if (givenAcronym.equals(acronym.getAcronym())) {
				String dc = acronym.getDescription();
				description.add(dc);
			}
		}
		if (description.isEmpty()) {
			return null;
		}
		return description;
	}

	@Override
	public int getUniqueWordsCount() {
		Set<String> count = new HashSet<>();
		for (Acronym acronym : acronyms) {
			String a = acronym.getDescription();
			for (String splited : a.split(" ")) {
				count.add(splited);
			}
		}
		return count.size();
	}

	@Override
	protected void clear() {
		acronyms.clear();
	}

	@Override
	protected void add(Acronym acronym) {
		acronyms.add(acronym);
	}

}

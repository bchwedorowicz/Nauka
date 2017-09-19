package pl.beatka.acronyms;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public abstract class AbstractAcronymsTest {

	private Acronyms acronyms;

	@Before
	public void prepare() throws IOException {
		acronyms = createInstance();
		File f = new File(getClass().getResource("testacronyms.txt").getFile());
		acronyms.loadAcronymsFromFile(f);
	}

	protected abstract Acronyms createInstance();

	@Test
	public void shouldGetCount() {
		int count = acronyms.getAcronymsCount();
		Assert.assertEquals(4, count);
	}

	@Test
	public void shouldGetDescriptions() {

		Collection<String> abc = acronyms.getAcronymDescriptions("abc");
		Collection<String> lol = acronyms.getAcronymDescriptions("LOL");
		Collection<String> zomg = acronyms.getAcronymDescriptions("zomg");

		Assert.assertEquals(1, abc.size());
		Assert.assertTrue(abc.contains("abecadlo z pieca spadlo"));

		Assert.assertEquals(2, lol.size());
		Assert.assertTrue(lol.contains("kupa smiechu"));
		Assert.assertTrue(lol.contains("laugh of loud"));

		Assert.assertNull(zomg);

	}

	@Test
	public void shouldGetWordsCount() {

		int uniqueWordsCount = acronyms.getUniqueWordsCount();
		Assert.assertEquals(12, uniqueWordsCount);
	}

	@Test
	public void shouldNotAppendObjects() throws IOException {
		File file = new File(getClass().getResource("testacronyms2.txt").getFile());

		acronyms.loadAcronymsFromFile(file);

		Assert.assertEquals(1, acronyms.getAcronymsCount());
	}

}

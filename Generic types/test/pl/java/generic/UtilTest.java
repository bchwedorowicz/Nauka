package pl.java.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class UtilTest {
	
	@Test
	public void shouldAddList() {
		//given
		List<String> listStrings1 = new ArrayList<>();
		List<String> listStrings2 = new ArrayList<>();
		//when
		listStrings1.add("ania");
		listStrings2.add("kasia");		
		List<String> list = Util.addList(listStrings1, listStrings2);
		//then
		List<String> listStrings3 = Arrays.asList("ania", "kasia");
		Assert.assertEquals(listStrings3, list);
	}
	
	@Test
	public void shouldJoinStrings() {
		//given
		String a = "abc";
		String b = "def";
		String c = "ghi";
		//when
		String actual = Util.joinStrings(a, b, c);
		//then
		Assert.assertEquals("abc def ghi", actual);
	}

}

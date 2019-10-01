package _07_tea_party;

import static org.junit.Assert.*;

import org.junit.Test;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String title = "";
		if (isWoman == true) {
			if (isKnighted) {
				title = "Lady";
			} else {
				title = "Ms.";
			}
		} else {
			if (isKnighted) {
				title = "Sir";
			} else {
				title = "Mr.";
			}
		}
		return "Hello "+title+ " "+name;
	}

	@Test
	public void test() {
		TeaParty teaParty = new TeaParty();
		String greeting = teaParty.welcome(null, false, false);
		assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
		assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
		assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
	}
}

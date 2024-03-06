package telran.utils.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestStrMethods {



	@Test
	@DisplayName("test method compare to")
	void testCompareTo() {
		
		assertEquals(0, "telran".compareTo("telran"));
		assertEquals(6,  "7".compareTo("123456"));
		assertEquals(-1, "12345".compareTo("2"));
		assertEquals(-1, "a".compareTo("b"));
		assertEquals(0, "".compareTo(""));
		assertEquals(2, " 5".compareTo(""));
		assertEquals('C' - 'k', "Cdkdlk".compareTo("kfjf"));
	}
	
	
	@Test
	@DisplayName("test method compare to ignore case")
	void testCompareToIgnoreCase() {
		assertEquals(0, "TeLrAn".compareToIgnoreCase("tElRan"));
		assertEquals(0, "T".compareToIgnoreCase("t"));
		assertEquals('b' - 'd', "birb".compareToIgnoreCase("birD"));
		
		
	}
	
	@Test
	@DisplayName("test method concat")
	void testConcat() {
		assertEquals("ripp", "rip".concat("p"));
		assertEquals("telRan", "tel".concat("Ran"));
		assertEquals("Hello World!", "Hello".concat(" ").concat("World!"));
		assertEquals(" ", "".concat(" "));
		assertEquals("", "".concat(""));
		assertEquals("  ", " ".concat(" "));
		
	}
	
	@Test
	@DisplayName("test method starts with")
	void testStartsWith() {
		assertTrue("hello".startsWith("h"));
		assertTrue("hello".startsWith("he"));
		assertTrue("hello".startsWith("hell"));
		assertTrue("hello".startsWith("hello"));
		
		assertTrue("hello".startsWith("ello", 1));
		assertTrue("hello".startsWith(""));
		
		assertFalse("hello".startsWith("el"));
		assertFalse("hello".startsWith("He"));
		assertFalse("hello".startsWith(" "));
	}
	
	@Test
	@DisplayName("test method ends with")
	void testEndsWith() {
		assertTrue("hello World".endsWith("hello World"));
		assertTrue("hello World".endsWith(" World"));
		assertTrue("hello World".endsWith("d"));
		assertTrue("hello World ".endsWith(" "));
		assertTrue("hello WorlD".endsWith(""));
		
		assertFalse("hello WorlD".endsWith("d"));
	}
	
	@Test
	@DisplayName("test method equals ignore case")
	void testEqualsIgnoreCase() {
		assertTrue("hEllO".equalsIgnoreCase("hEllo"));
		assertTrue("hEllO worlD".equalsIgnoreCase("hEllo world"));
		assertTrue("1".equalsIgnoreCase("1"));
		assertTrue("   ".equalsIgnoreCase("   "));
		assertTrue("".equalsIgnoreCase(""));

		
		assertFalse("heLLO".equalsIgnoreCase("heLL"));
		assertFalse("  ".equalsIgnoreCase("   "));
		assertFalse("1".equalsIgnoreCase("a"));
		

	}
	
	@Test
	@DisplayName("test method index of -> String string")
	void testIndexOf() {
		assertEquals(5, "Hello world".indexOf(" world"));
		assertEquals(0, "Hello world".indexOf("Hello world")); 
		assertEquals(0, "Hello world".indexOf(""));
		assertEquals(0,"Hello world".indexOf("H")); 
		assertEquals(5, "Hello world".indexOf(" "));
		assertEquals(-1, "Hello world".indexOf("m"));
		assertEquals(-1, "Hello world".indexOf("h"));
	}
	
	@Test
	@DisplayName("test method last index of -> int ch")
	void testLastIndex() {
		assertEquals(5, "uuuuuu".lastIndexOf('u'));
		assertEquals(0, "12345".lastIndexOf('1'));
		assertEquals(-1, "uuuuuu".lastIndexOf('U'));
		assertEquals(3, "123123".lastIndexOf('1'));
		assertEquals(-1, "".lastIndexOf(' '));
		assertEquals(0, " ".lastIndexOf(' '));
	}

}

package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.strings.RegularExprecions;

class RegularExprecionsTests {

	@Test
	void javaVariableTrueTest() {
		
		String regex = RegularExprecions.javaVariable();
		assertTrue("abc".matches(regex));
		assertTrue("Abc".matches(regex));
		assertTrue("abc_".matches(regex));
		assertTrue("a".matches(regex));
		assertTrue("$".matches(regex));
		assertTrue("$123".matches(regex));
		assertTrue("$1_23".matches(regex));
		assertTrue("__".matches(regex));
		
	}
	
	@Test
	void javaVariableFalseTest() {
		
		String regex = RegularExprecions.javaVariable();
		assertFalse("1abc".matches(regex));
		assertFalse("_".matches(regex));
		assertFalse("a-2".matches(regex));
		assertFalse("a 2".matches(regex));
		assertFalse("a?2".matches(regex));
		assertFalse("1abc".matches(regex));
		
	}
	
	@Test 
	void zero_300TestTrue() {
		
		String regex = RegularExprecions.zero_300();
		assertTrue("0".matches(regex));
		assertTrue("1".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("300".matches(regex));
		assertTrue("198".matches(regex));

	
	}
	
	@Test 
	void zero_300TestFalse() {
		
		String regex = RegularExprecions.zero_300();
		assertFalse("00".matches(regex));
		assertFalse("01".matches(regex));
		assertFalse("19s".matches(regex));
		assertFalse("300 ".matches(regex));
		assertFalse("-300".matches(regex));
		assertFalse("398".matches(regex));
		assertFalse("301".matches(regex));


	}
	
	@Test
	void ipOctetTest() {
		
		String regex = RegularExprecions.ipOptet();

		assertTrue("0".matches(regex));
		assertTrue("00".matches(regex));
		assertTrue("000".matches(regex));
		assertTrue("10".matches(regex));
		assertTrue("19".matches(regex));
		assertTrue("199".matches(regex));
		assertTrue("009".matches(regex));
		assertTrue("249".matches(regex));
		assertTrue("250".matches(regex));
		assertTrue("255".matches(regex));
		
	}
	
	@Test
	void ipOctetFalse() {
		
		String regex = RegularExprecions.ipOptet();

		assertFalse("-0".matches(regex));
		assertFalse("00 ".matches(regex));
		assertFalse("0000".matches(regex));
		assertFalse("10?".matches(regex));
		assertFalse("1900".matches(regex));
		assertFalse("299".matches(regex));
		assertFalse("00a".matches(regex));
		assertFalse("-249".matches(regex));
		assertFalse("260".matches(regex));
		assertFalse("256".matches(regex));
		
	}

}

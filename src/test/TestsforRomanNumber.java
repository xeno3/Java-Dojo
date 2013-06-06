package test;

import static org.junit.Assert.*;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import Model.RomanNumber;

public class TestsforRomanNumber {
	//For Roman Numbers
	@Test
	public void WhenAninteger1isConvertedToRomanNumberThenItShouldBeconvertedToI() {
	   	RomanNumber roman=new RomanNumber();
	   	String number=roman.convert(1);
	   	assertEquals("I", number);
		
	}
	@Test
	public void whenAnInteger2isConvertedToRomanNumberThenItShouldBeConvertedToII(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(2);
		assertEquals("II", convertedNumber);
	}
	@Test	
	public void whenAnInteger4isConvertedToRomanNumberThenItShouldReturnIV()
	{
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(4);
		assertEquals("IV", convertedNumber);
	}
	@Test
	public void whenAnInteger5isConvertedToRomanNumberThenItShouldReturnV(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(5);
		assertEquals("V", convertedNumber);		
	}
	@Test
	public void whenAnInteger6IsConvertedToRomanNumberThenItShouldReturnVI(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(6);
		assertEquals("VI", convertedNumber);
	}
	@Test
	public void whenAnInteger9IsConvertedToRomanNumberThenItShouldReturnIX()
	{
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(9);
		assertEquals("IX", convertedNumber);
	}	
	@Test
	public void whenAnInteger10IsConvertedToRomanNumberThenItShouldReturnX()
	{
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(10);
		assertEquals("X", convertedNumber);
	}
	@Test
	public void whenAnInteger23IsConvertedToRomanNumberThenItShouldReturnXXIII(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(23);
		assertEquals("XXIII", convertedNumber);		
	}
	@Test
	public void whenAnInteger45IsConvertedToRomanNumberThenItShouldReturnXLV(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(45);
		assertEquals("XLV", convertedNumber);		
	}
	@Test
	public void whenAnInteger49IsConvertedToRomanNumberThenItShouldReturnXLIX(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(49);
		assertEquals("XLIX", convertedNumber);		
	}
	
	@Test
	public void whenAnInteger56IsConvertedToRomanNumberThenItShouldReturnLVI(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(56);
		assertEquals("LVI", convertedNumber);		
	}	
	@Test
	public void whenAnInteger90IsConvertedToRomanNumberThenItShouldReturnXC(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(90);
		assertEquals("XC", convertedNumber);		
	}
	@Test
	public void whenAnInteger99IsConvertedToRomanNumberThenItShouldReturnXCIX(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(99);
		assertEquals("XCIX", convertedNumber);		
	}
	@Test
	public void whenAnInteger100IsConvertedToRomanNumberThenItShouldReturnC(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(100);
		assertEquals("C", convertedNumber);		
	}
	@Test
	public void whenAnInteger102IsConvertedToRomanNumberThenItShouldReturnCII(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(102);
		assertEquals("CII", convertedNumber);		
	}
	@Test
	public void whenAnInteger149IsConvertedToRomanNumberThenItShouldReturnCXLIX(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(149);
		assertEquals("CXLIX", convertedNumber);		
	}
	@Test
	public void whenAnInteger449IsConvertedToRomanNumberThenItShouldReturnCDXLIX(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(449);
		assertEquals("CDXLIX", convertedNumber);		
	}
	@Test
	public void whenAnInteger500IsConvertedToRomanNumberThenItShouldReturnD(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(500);
		assertEquals("D", convertedNumber);		
	}	
	@Test
	public void whenAnInteger1999IsConvertedToRomanNumberThenItShouldReturnMCMXCIX(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(1999);
		assertEquals("MCMXCIX", convertedNumber);		
	}
	@Test
	public void whenARomanNumberIIsConvertedToIntegerThenItShouldReturnII(){
		
		RomanNumber roman=new RomanNumber();
	    int integerResult=roman.convert("II");
		assertEquals(2, integerResult);
		
	}
	@Test
	public void whenAnEmptyStringIsConvertedToIntegerItShouldReturn0(){
		
		RomanNumber roman=new RomanNumber();
	    int integerResult=roman.convert("");
		assertEquals(0, integerResult);		
	}
	@Test
	public void whenAStringVIsConvertedToIntegerItShouldReturn5(){
		
		RomanNumber roman=new RomanNumber();
	    int integerResult=roman.convert("V");
		assertEquals(5, integerResult);		
	}
	@Test
	public void whenAStringIVsConvertedToIntegerItShouldReturn4(){
		
		RomanNumber roman=new RomanNumber();
	    int integerResult=roman.convert("IV");
		assertEquals(4, integerResult);		
	}
	
	@Test
	public void whenARomanNumberIXIsConvertedToIntegerThenItShouldReturn9()
	{
		RomanNumber roman=new RomanNumber();
		int convertedNumber =roman.convert("IX");
		assertEquals(9, convertedNumber);
	}	
	@Test
	public void whenARomanNumberXIsConvertedToIntegerThenItShouldReturn10()
	{
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("X");
		assertEquals(10, convertedNumber);
	}
	@Test
	public void whenARomanNumberXXIIIIsConvertedToIntegerThenItShouldReturn23(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("XXIII");
		assertEquals(23, convertedNumber);		
	}
	@Test
	public void whenARomanNumberXLV45IsConvertedToIntegerThenItShouldReturnXLV(){
		
		RomanNumber roman=new RomanNumber();
		String convertedNumber=roman.convert(45);
		assertEquals("XLV", convertedNumber);		
	}
	@Test
	public void whenARomanNumberXLIXIsConvertedToIntegerThenItShouldReturn49(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("XLIX");
		assertEquals(49, convertedNumber);		
	}
	
	@Test
	public void whenARomanNumberLVIIsConvertedToIntegerThenItShouldReturn56(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("LVI");
		assertEquals(56, convertedNumber);		
	}	
	@Test
	public void whenAnRomanNumberXCIsConvertedToIntegerThenItShouldReturn90(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("XC");
		assertEquals(90, convertedNumber);		
	}
	@Test
	public void whenARomanNumberXCIXIsConvertedToIntegerThenItShouldReturn99(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("XCIX");
		assertEquals(99, convertedNumber);		
	}
	@Test
	public void whenARomanNumberCIsConvertedToIntegerThenItShouldReturn100(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("C");
		assertEquals(100, convertedNumber);		
	}
	@Test
	public void whenARomanNumberCIIIsConvertedToRomanNumberThenItShouldReturn102(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("CII");
		assertEquals(102, convertedNumber);		
	}
	@Test
	public void whenARomanNumber149IsConvertedToIntegerThenItShouldReturn149(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("C X L IX");
		assertEquals(149, convertedNumber);		
	}
	@Test
	public void whenARomanNumberCDXLIXIsConvertedToIntegerThenItShouldReturn449(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("CDXLIX");
		assertEquals(449, convertedNumber);		
	}
	@Test
	public void whenAnRomanNumber500IsConvertedToIntegerThenItShouldReturn500(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("D");
		assertEquals(500, convertedNumber);		
	}	
	@Test
	public void whenAnRomanNumberMCMXCIXIsConvertedToRomanNumberThenItShouldReturn1999(){
		
		RomanNumber roman=new RomanNumber();
		int convertedNumber=roman.convert("MCMXCIX");
		assertEquals(1999, convertedNumber);		
	}
	
	
	
	
	
}
//Kata 1- Convert integers upto 3000 to roman numerals

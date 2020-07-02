package ru.almaz.jpoint2020.day3.raif;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * @author Евгений Занько
 * @since 01.07.2020
 */
class MainTest{

	@Test
	public void transformTest(){
		Main.Transformer transformer = new Main.Transformer();
		assertNull(transformer.transform( (String)null ) );
		assertEquals( "",transformer.transform( "" ) );
		assertEquals( "5A",transformer.transform( "AAAAA" ) );
		assertEquals( "5A3BC",transformer.transform( "AAAAABBBC" ) );
		assertEquals( "ABC",transformer.transform( "ABC" ) );
		assertEquals( "A5BC",transformer.transform( "ABBBBBC" ) );
	}

}
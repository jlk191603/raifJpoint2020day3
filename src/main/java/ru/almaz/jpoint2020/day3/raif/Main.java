package ru.almaz.jpoint2020.day3.raif;


import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Евгений Занько
 * @since 02.07.2020
 */
public class Main{

	public static void main( String[] args ){
		Transformer transformer = new Transformer();
		List<String> listText = transformer.transform( new String[]{null,"","AAAAA","AAAAABBBC","ABC","ABBBBBC"} );
		System.out.println( String.join( ",", listText ) );
	}



	public static class Transformer{

		public List<String> transform( String[] arrText ){
			List<String> result = new ArrayList<>();
			for( String text : arrText ){
				result.add( transform( text ) );
			}
			return result;
		}


		public String transform( String text ){
			if( text == null ){
				return null;
			}
			if( text.isEmpty() ){
				return "";
			}
			char[] arrChars = text.toCharArray();
			StringBuilder sb = new StringBuilder();
			int num = 1;
			for( int i = 0; i < arrChars.length; i++, num++ ){
				if( i + 1 == arrChars.length || arrChars[i + 1] != arrChars[i] ){
					sb.append( num > 1 ? String.valueOf( num ) : "" ).append( arrChars[i] );
					num = 0;
				}
			}
			return sb.toString();
		}

	}

}

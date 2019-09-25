package tdd_devmedia;

import org.junit.Assert;
import org.junit.Test;

import br.devmedia.bo.ManipulaString;

/**
 	CASOS DE TESTES

	  "" 		=> ""
	  "bcd" 	=> "bcd"
	  "a" 		=> "9"
	  "bbes" 	=> "bb9s"
	  "bbE" 	=> "bb9"

 */
public class StringVogaisTest {
	
	@Test
	public void lidaComStringVazia() {
		String string = "";
		
		ManipulaString manipulaString = new ManipulaString();
		String validado = manipulaString.manipular(string);
		
		Assert.assertEquals("", validado);
	}
	
	@Test
	public void lidaComStringSemVogais() {
		String string = "bcd";
		
		ManipulaString manipulaString = new ManipulaString();
		String validado = manipulaString.manipular(string);
		
		Assert.assertEquals("bcd", validado);
	}
	
	@Test
	public void lidaComStringComUmaVogal() {
		String string = "a";
		
		ManipulaString manipulaString = new ManipulaString();
		String validado = manipulaString.manipular(string);
		
		Assert.assertEquals("9", validado);
	}

	@Test
	public void lidaComStringComUmaVogalMinuscula() {
		String string = "bbes";
		
		ManipulaString manipulaString = new ManipulaString();
		String validado = manipulaString.manipular(string);
		
		Assert.assertEquals("bb9s", validado);
		
	}

	@Test
	public void lidaComStringComUmaVogalMaiuscula() {
		String string = "bbE";

		ManipulaString manipulaString = new ManipulaString();
		String validado = manipulaString.manipular(string);

		Assert.assertEquals("bb9", validado);

	}

	
	
	

}

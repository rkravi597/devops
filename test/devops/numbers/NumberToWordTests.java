/**
 * 
 */
package devops.numbers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import devops.numbers.NumberWords;

/**
 * @author RBegum
 *
 */
public class NumberToWordTests {
	
	private NumberWords numberWords ;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		numberWords = new NumberWords();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		char [] expectresult =  {'n','i','n','e'};
		Assert.assertArrayEquals("result passed",expectresult, stringtoChars(numberWords.toWords(9)));;
	}
	
	private  char[] stringtoChars (String result){
		char[] c_arr = result.toCharArray();
		return c_arr; 
		
	}

}

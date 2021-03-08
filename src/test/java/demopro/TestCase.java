package demopro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCase {
	
	@Test
	public void testFindMax(){
		assertEquals(4, Democlass.findMax(new int[] {3,2,4,1}));
		assertEquals(-12, Democlass.findMax(new int[] {-12,-21,-31}));
		
	}

}

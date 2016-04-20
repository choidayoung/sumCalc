package sumcal;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {
	private Hello h;
	
	@Test
	public void testSum() {
		h.sum(3);
		assertEquals(3,h.getResult());
		fail("Not yet implemented");
	}

}

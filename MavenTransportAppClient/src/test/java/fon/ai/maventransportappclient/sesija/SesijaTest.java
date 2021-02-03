package fon.ai.maventransportappclient.sesija;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SesijaTest {
	private static Sesija instance;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	@Test
	public void test() {
		assertEquals(null, instance);
	}

}

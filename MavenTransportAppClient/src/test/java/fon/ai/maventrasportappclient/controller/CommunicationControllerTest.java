package fon.ai.maventrasportappclient.controller;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fon.ai.maventransportappclient.controller.CommunicationController;

public class CommunicationControllerTest {

	private static CommunicationController instance;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
		instance = null;
	}

	// pokazuje da je instanca null sve dok se ne pozove preko staticke metode
	// getInstance
	@Test
	public void insertTruck() throws Exception {
		assertEquals(null, instance);
	}

}

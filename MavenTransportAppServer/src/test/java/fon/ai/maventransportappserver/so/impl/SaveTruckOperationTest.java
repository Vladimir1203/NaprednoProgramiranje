/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.ai.maventransportappserver.so.impl;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fon.ai.maventransportappcommon.domain.IGeneralEntity;
import fon.ai.maventransportappcommon.domain.Truck;
import fon.ai.maventransportappcommon.domain.User;
import fon.ai.maventransportappserver.so.AbstractGenericOperation;

/**
 *
 * @author stackOverflow
 */
public class SaveTruckOperationTest {
	protected IGeneralEntity entity;
	protected AbstractGenericOperation so;

	public SaveTruckOperationTest() {
	}

	@Before
	public void setUp() throws SQLException {
		entity = new Truck("AUTOMATIC", "daf", 1995, "RA013CG", 8800, "K");
		so = new SaveTruckOperation();
		so.db.openConnection();
	}

	@After
	public void tearDown() {

	}

	/**
	 * Test of validate method, of class SaveTruckOperation.
	 */
	@Test
	public void testValidate() throws Exception {
		System.out.println("validate");
		so.validate(entity);
	}

	@Test(expected = java.lang.Exception.class)
	public void testValidate1() throws Exception {
		System.out.println("validate1");
		so.validate(new User());
	}

	/**
	 * Test of execute method, of class SaveTruckOperation.
	 */
	@Test(expected = java.lang.Exception.class)
	public void testExecute() throws Exception {
		System.out.println("execute");
		so.execute(entity);
		Truck expected = (Truck) so.db.vratiPoId((IGeneralEntity) entity);
		Truck compare = (Truck) entity;
		assertEquals(expected.getRegistrationMark(), compare.getRegistrationMark());
	}

}

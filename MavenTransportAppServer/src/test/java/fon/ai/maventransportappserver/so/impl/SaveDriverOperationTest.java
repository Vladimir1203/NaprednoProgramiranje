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

import fon.ai.maventransportappcommon.domain.Driver;
import fon.ai.maventransportappcommon.domain.IGeneralEntity;
import fon.ai.maventransportappcommon.domain.User;
import fon.ai.maventransportappserver.so.AbstractGenericOperation;

/**
 *
 * @author stackOverflow
 */
public class SaveDriverOperationTest {
	protected IGeneralEntity entity;
	protected AbstractGenericOperation so;

	public SaveDriverOperationTest() {
	}

	@Before
	public void setUp() throws SQLException {
		entity = new Driver(12345678, "Vlada", "Vladic");
		so = new SaveDriverOperation();
		so.db.openConnection();
	}

	@After
	public void tearDown() {

	}

	/**
	 * Test of validate method, of class SaveDriverOperation.
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
	 * Test of execute method, of class SaveDriverOperation.
	 */
	@Test(expected = java.lang.Exception.class)
	public void testExecute() throws Exception {
		System.out.println("execute");
		so.execute(entity);
		Driver compare = (Driver) so.db.vratiPoId((IGeneralEntity) entity);
		Driver expected = (Driver) entity;
		assertEquals(expected.getIDCard(), compare.getIDCard());
	}

}

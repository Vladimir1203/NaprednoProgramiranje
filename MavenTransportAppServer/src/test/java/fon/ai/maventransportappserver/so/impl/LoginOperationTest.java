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

import fon.ai.maventransportappcommon.domain.Drive;
import fon.ai.maventransportappcommon.domain.IGeneralEntity;
import fon.ai.maventransportappcommon.domain.User;
import fon.ai.maventransportappserver.so.AbstractGenericOperation;

/**
 *
 * @author stackOverflow
 */
public class LoginOperationTest {
	private IGeneralEntity entity;
	private AbstractGenericOperation so;

	public LoginOperationTest() {
	}

	@Before
	public void setUp() throws SQLException {
		entity = new User();
		((User) entity).setUsername("test");
		((User) entity).setPassword("test");
		so = new LoginOperation();
		so.db.openConnection();
	}

	@After
	public void tearDown() throws SQLException {
		so.db.closeConnection();
		entity = null;
		so = null;
	}

	/**
	 * Test of validate method, of class LoginOperation.
	 */
	@Test
	public void testValidate() throws Exception {
		System.out.println("validate");
		so.validate(entity);
	}

	@Test(expected = java.lang.Exception.class)
	public void testValidate1() throws Exception {
		System.out.println("validate1");
		Drive test = new Drive();
		so.validate(test);
	}

	/**
	 * Test of getObject method, of class LoginOperation.
	 */
	@Test
	public void testGetObject() throws Exception {
		LoginOperation instance = new LoginOperation();
		IGeneralEntity expResult = entity;
		instance.setObject(entity);
		IGeneralEntity result = instance.getObject();
		assertEquals(expResult, result);
	}

	@Test(expected = java.lang.Exception.class)
	public void execute() throws Exception {
		User u = (User) so.db.vratiPoId((IGeneralEntity) entity);
		User exc = (User) ((LoginOperation) so).getObject();
		assertEquals(exc, u);
	}

	@Test
	public void execute1() throws Exception {
		System.out.println("VADIM KORISNIKA IZ BAZE EXEC2");
		User u = (User) so.db.vratiPoId(new User(-1, "vlado1203", "bane1203", null, null, null));
		User exc = new User(1, "vlado1203", "bane1203", "Vladimir", "Lazic", "vladimir12934@gmail.com");
		assertEquals(exc, u);
	}

}

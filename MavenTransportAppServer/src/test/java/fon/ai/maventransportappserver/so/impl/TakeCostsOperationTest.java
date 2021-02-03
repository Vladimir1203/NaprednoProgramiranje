package fon.ai.maventransportappserver.so.impl;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fon.ai.maventransportappcommon.domain.Cost;
import fon.ai.maventransportappcommon.domain.IGeneralEntity;
import fon.ai.maventransportappcommon.domain.User;
import fon.ai.maventransportappserver.so.AbstractGenericOperation;

public class TakeCostsOperationTest {
	protected IGeneralEntity entity;
	protected AbstractGenericOperation so;

	@Before
	public void setUp() throws Exception {
		entity = new Cost();
		so = new TakeCostsOperation();
		so.db.openConnection();
	}

	@After
	public void tearDown() throws Exception {
		so.db.closeConnection();
	}

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

	@Test
	public void testExecute() throws Exception {
		System.out.println("executing");
		List<Cost> expected = new ArrayList<>();
		List<IGeneralEntity> lista = so.db.vratiSve(entity);
		for (IGeneralEntity ent : lista)
			expected.add((Cost) ent);
		so.execute(entity);
		List<IGeneralEntity> rezultat = ((TakeCostsOperation) so).getLista();
		assertEquals(expected.size(), rezultat.size());
	}

	@Test
	public void testGetLista() throws Exception {
		System.out.println("getLista");
		so.execute(entity);
		List<IGeneralEntity> expResult = ((TakeCostsOperation) so).getLista();
		List<IGeneralEntity> result = so.db.vratiSve(entity);

		assertEquals(expResult.size(), result.size());
	}

}

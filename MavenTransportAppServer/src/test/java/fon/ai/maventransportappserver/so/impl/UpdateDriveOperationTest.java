package fon.ai.maventransportappserver.so.impl;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fon.ai.maventransportappcommon.domain.Drive;
import fon.ai.maventransportappcommon.domain.Driver;
import fon.ai.maventransportappcommon.domain.IGeneralEntity;
import fon.ai.maventransportappcommon.domain.Trailer;
import fon.ai.maventransportappcommon.domain.Truck;
import fon.ai.maventransportappcommon.domain.User;
import fon.ai.maventransportappcommon.domain.VehicleType;
import fon.ai.maventransportappserver.so.AbstractGenericOperation;

public class UpdateDriveOperationTest {
	protected IGeneralEntity entity;
	protected AbstractGenericOperation so;

	@Before
	public void setUp() throws Exception {
		Truck truck = new Truck("AUTOMATIC", "daf", 1995, "RA013CD", 8800, "K");
		Trailer trailer = new Trailer(VehicleType.CIRADA, 22000, "SMITZ", 1995, "AA447RA", 7500, "P");
		Driver driver = new Driver(12345678, "Vlada", "Vladic");
		entity = new Drive(12, new Date(), 500, trailer, truck, driver);
		so = new SaveDriveOperation();
		so.db.openConnection();
	}

	@After
	public void tearDown() throws Exception {
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

	@Test(expected = java.lang.Exception.class)
	public void testExecute() throws Exception {
		System.out.println("execute");
		so.execute(entity);
		Drive expected = (Drive) so.db.vratiPoId((IGeneralEntity) entity);
		Drive compare = (Drive) entity;
		assertEquals(expected, compare);
	}

}

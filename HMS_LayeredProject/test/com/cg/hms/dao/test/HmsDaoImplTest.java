package com.cg.hms.dao.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.hms.dao.HmsDao;
import com.cg.hms.dao.HmsDaoImpl;
import com.cg.hms.exception.HMSException;
import com.cg.hms.model.Patient;

public class HmsDaoImplTest {

	HmsDao dao = null;

	@Before
	public void setUp() throws Exception {
		dao = new HmsDaoImpl();
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	@Test
	public void testAddPatientDetails() {

		Patient patient = new Patient();
		patient.setGender("male");
		patient.setName("Raviraj");
		patient.setPhoneNumber(7894561233l);
		patient.setProblem("cold");

		int id=0;
		try {
			id = dao.addPatientDetails(patient);
		} catch (HMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertNotNull(id);
	}

}

package com.day23;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
	public static final String EXPECTED_FIRST_NAME = "Thomas";
	public static final String EXPECTED_LAST_NAME = "jones";
	public static final String EXPECTED_EMAIL_ID = "thomas12@gmail.com";
	public static final String EXPECTED_PASSWORD = "Jones@123";
	public static final String EXPECTED_CONTACT_NUMBER = "9162365367";
	private User user;

	@Before
	public void setUp() throws Exception {
		user = new User("Satyendra", "Mishra", "satyam12@gmail.com", "Mishra@123", "9162345367");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Test Completed");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testUserDetails() throws Exception {
		Assert.assertEquals(EXPECTED_FIRST_NAME, user.getFirstName());
		Assert.assertEquals(EXPECTED_LAST_NAME, user.getLastName());
		Assert.assertEquals(EXPECTED_EMAIL_ID, user.getEmailId());
		Assert.assertEquals(EXPECTED_PASSWORD, user.getPassword());
		Assert.assertEquals(EXPECTED_CONTACT_NUMBER, user.getContactNumber());
	}

}

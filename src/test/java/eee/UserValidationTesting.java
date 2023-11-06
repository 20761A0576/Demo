package eee;

import org.testng.Assert;

import org.testng.annotations.Test;

public class UserValidationTesting {
	
	@Test
	public void testcase1()
	{
		UserValidation uv = new UserValidation();
		Assert.assertEquals(false, uv.check("Ramb", "Ramjj"));
	}
	
	@Test
	public void testcase2()
	{
		UserValidation uv = new UserValidation();
		Assert.assertEquals(false, uv.check("Ram", "Ram123jj"));
	}
	
	@Test
	public void testcase3()
	{
		UserValidation uv = new UserValidation();
		Assert.assertEquals(false, uv.check("Rambj", "Ramkljj"));
	}
	
	@Test
	public void testcase4()
	{
		UserValidation uv = new UserValidation();
		Assert.assertEquals(true, uv.check("Ram", "Ram123"));
	}
	

}

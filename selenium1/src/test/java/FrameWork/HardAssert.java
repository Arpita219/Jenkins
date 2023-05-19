package FrameWork;



import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {
	@Test
	public void createContact()
	{
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals(false, true);
		System.out.println("step3");
		System.out.println("step4");
		
	}
	@Test
	
	public void m1() {
		String expName="shobha";
		String actuName="shobhaRani";
		Assert.assertEquals(expName, actuName);
	}

}

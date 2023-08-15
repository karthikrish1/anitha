package testngdepdency;

import org.testng.annotations.Test;

public class d1 {

	
	//dependsonmethods: create conn btwn test cases
	
	@Test(priority=0)
	public void vstng()
	{
		System.out.println("visiting");
	}
	
	@Test(priority=1,dependsOnMethods="vstng")
	public void lgg()
	{
		System.out.println("login");
	}
	
	//vstng: pass    lgg: run
	//vstng: fail    lgg: skipped
}

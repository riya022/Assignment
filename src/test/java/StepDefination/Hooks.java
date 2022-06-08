package StepDefination;

import Base_Pkg.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks extends BaseClass{

	@Before
	public void StartServer()
	{
		setUp();
	}
	@After
	public void StopServer()
	{
		DriverClose();
		
	}
}

package ServiceNow.COVIDDash.Steps;


import com.nci.automation.web.EnvUtils;
import com.nci.automation.xceptions.TestingException;

public class TestEnv {

	public static void main(String[] args) throws TestingException {

		System.out.println();
		System.out.println(EnvUtils.getApplicationUrl());
		System.out.println();
		System.out.println(EnvUtils.getNativeViewUrl());


		
		
		
	}

}

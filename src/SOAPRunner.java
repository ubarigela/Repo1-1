import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.model.testsuite.TestSuiteRunner;
import com.eviware.soapui.support.SoapUIException;

public class SOAPRunner {
	
	public static void main(String args[]) throws XmlException, IOException, SoapUIException{
	
	WsdlProject project = new WsdlProject("D:\\TEST\\Sprint Automation Tests-soapui-project.xml");
	
	TestSuite suite = project.getTestSuiteByName("Sprint 8 Test Suite");
	
	TestSuiteRunner sr  = suite.run(null, false);
	
	//System.out.println(sr.getStatus());
	//System.out.println(sr.getReason());
	System.out.println(sr.getResults());
	
	
	
	//TestCase tc = suite.getTestCaseByName("EI-706 Get Participant with Valid Headers");
	
	//TestCaseRunner runner = tc.run(null, false);
	
	//System.out.println(runner.getStatus());
		
	}
}

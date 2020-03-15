package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile DemoSiteEnv1 : URL to the environment
Profile DemoSiteEnv2 : URL to the environment
Profile DemoSiteEnv3 : URL to the environment
Profile DemoSiteEnv4 : URL to the environment
Profile DemoSiteEnv5 : URL to the environment
Profile DemoSiteEnv6 : URL to the environment</p>
     */
    public static Object URL
     
    /**
     * <p>Profile DemoSiteEnv1 : Login for the user
Profile DemoSiteEnv2 : Login for the user
Profile DemoSiteEnv3 : Login for the user
Profile DemoSiteEnv4 : Login for the user
Profile DemoSiteEnv5 : Login for the user
Profile DemoSiteEnv6 : Login for the user</p>
     */
    public static Object userName
     
    /**
     * <p>Profile DemoSiteEnv1 : password for the user</p>
     */
    public static Object password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            userName = selectedVariables['userName']
            password = selectedVariables['password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}

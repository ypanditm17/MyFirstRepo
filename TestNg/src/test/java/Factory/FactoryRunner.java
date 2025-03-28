package Factory;

import org.testng.annotations.Factory;

public class FactoryRunner {
	  @Factory
	    public Object[] createInstances() {
	        return new Object[]{
	            new FactoryClass(30, 40),
	            new FactoryClass(50, 30)
	        };
	    }

}


package exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author Cristian
 */
public class ValidationExceptionIT {
    public ValidationExceptionIT() {
    }
    /**
     * Test of parseAge method, of class ValidationException.
     */
    @Test
    public void testParseAge() throws Exception {
        System.out.println("parseAge");
        String age = "";
        int expResult = 0;
        int result = ValidationException.parseAge(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ValidationException.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ValidationException.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}

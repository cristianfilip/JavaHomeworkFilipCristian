
package exceptions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian
 */
public class ThrowsSyntaxIT {
    public ThrowsSyntaxIT() {
    }
    /**
     * Test of main method, of class ThrowsSyntax.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ThrowsSyntax.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of circleArea method, of class ThrowsSyntax.
     */
    @Test
    public void testCircleArea() throws Exception {
        System.out.println("circleArea");
        double radius = 0.0;
        double expResult = 0.0;
        double result = ThrowsSyntax.circleArea(radius);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}

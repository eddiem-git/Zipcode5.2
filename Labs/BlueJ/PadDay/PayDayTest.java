

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PayDayTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PayDayTest
{
    /**
     * Default constructor for test class PayDayTest
     */
    public PayDayTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testPayDay(){
        PayDay payday1 = new PayDay();
        String string1 = PayDay.pay("Eddie", .20, 20, 40);
        assertEquals("Eddie 800.00 160.00 640.00", string1);
    }
}

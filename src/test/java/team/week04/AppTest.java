package team.week04;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Calc t_calc = new Calc();
        Output output = new Output(300,3,"Silver");
        t_calc.setUser(new User(300, 3, "Silver"));
        
        assertEquals(t_calc.calcCharge(), output.calcCharge());
    }
}

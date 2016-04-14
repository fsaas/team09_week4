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
        Calc tcalc = new Calc();
        Output output = new Output();
        
        tcalc.setUser(new User(300, 3, "Silver"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(300, 3, "Silver")));
        tcalc.setUser(new User(300, 3, "Gold"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(300, 3, "Gold")));
        tcalc.setUser(new User(4000, 3, "Silver"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(4000, 3, "Silver")));
    }
}

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
    public void testApp1()
    {
        Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(30, 2, "Silver"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(30, 2, "Silver")));
    }
    public void testApp2()
    {
    	Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(30, 2, "Gold"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(30, 2, "Gold")));
    }
    public void testApp3()
    {
    	Calc tcalc = new Calc();
        Output output = new Output();
    	tcalc.setUser(new User(30, 6, "Silver"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(30, 6, "Silver")));
    }
    public void testApp4()
    {
    	
    	Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(30, 6, "Gold"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(30, 6, "Gold")));
    }
    public void testApp5()
    {
    	Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(1500, 3, "Silver"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(1500, 3, "Silver")));
    	
    }
    public void testApp6()
    {
    	Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(1500, 3, "Gold"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(1500, 3, "Gold")));
    }
    public void testApp7()
    {
    	Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(1500, 6, "Silver"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(1500, 6, "Silver")));
    }
    public void testApp8()
    {
    	Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(1500, 6, "Gold"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(1500, 6, "Gold")));
    }
    
    public void testApp9()
    {
    	Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(300, 3, "Gold"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(300, 3, "Gold")));
    }
    public void testApp10()
    {
    	Calc tcalc = new Calc();
        Output output = new Output();
        tcalc.setUser(new User(4000, 3, "Silver"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(4000, 3, "Silver")));       
    }
    
    
    public void testApp11()
    {
    	Calc tcalc = new Calc();
    	Output output = new Output();
    	tcalc.setUser(new User(300, 0, "Gold"));
        assertEquals(tcalc.calcCharge(), output.calcCharge(new User(300, 0, "Gold")));
    }
}

package reyabreulearn.helloworld;

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
     * Test of getter and setter methods for value, of class App.
     */
    public void testGetSetValue() {
        System.out.println("getValue & setValue");
        App instance = new App();
        int value = 10;
        instance.setValue(value);
        int expResult = 10;
        int result = instance.getValue();
        assertEquals("getValue & setValue", expResult, result);
    }

}


import static edu.princeton.cs.algs4.StdRandom.uniform;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andreea teodor
 */
public class PercolationTest {

    public PercolationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of contructor exception method, of class Percolation.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorException() {
        Percolation instance = new Percolation(-8);
    }

    /**
     * Test of isOpen method, of class Percolation.
     */
    @Test
    public void testIsOpen() {
        System.out.println("isOpen");
        Percolation instance = new Percolation(3);
        instance.open(1, 2);
        boolean expResult = true;
        boolean result = instance.isOpen(1, 2);
        assertEquals(expResult, result);
    }

    /**
     * Test of isFull method, of class Percolation.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Percolation instance = new Percolation(3);
        instance.open(1, 3);
        instance.open(2, 3);
        instance.open(3, 3);
        boolean expTrueResult = true;
        boolean trueResult = instance.isFull(1, 3);
        assertEquals(expTrueResult, trueResult);
        
        boolean expFalseResult = false;
        boolean falseResult = instance.isFull(1, 1);
        assertEquals(expFalseResult, falseResult);
    }

    /**
     * Test of numberOfOpenSites method, of class Percolation.
     */
    @Test
    public void testNumberOfOpenSites() {
        System.out.println("numberOfOpenSites");
        Percolation instance = new Percolation(3);
        instance.open(1, 3);
        instance.open(2, 3);
        instance.open(3, 3);
        int expResult = 3;
        int result = instance.numberOfOpenSites();
        assertEquals(expResult, result);
    }

    /**
     * Test of percolates method, of class Percolation.
     */
    @Test
    public void testPercolates() {
        System.out.println("percolates");
        Percolation instance = new Percolation(3);
        instance.open(1, 3);
        instance.open(2, 3);
        instance.open(3, 3);
        boolean expResult = true;
        boolean result = instance.percolates();
        assertEquals(expResult, result);
    }
}

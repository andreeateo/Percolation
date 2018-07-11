
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
public class PercolationStatsTest {
    
    public PercolationStatsTest() {
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
     * Test of mean method, of class PercolationStats.
     */
    @Test
    public void testMean() {
        System.out.println("mean");
        PercolationStats instance = new PercolationStats(10, 20);
        double result = instance.mean();
        System.out.println(result);
        assertTrue((0 < result) && (result < 1));
    }

    /**
     * Test of stddev method, of class PercolationStats.
     */
    @Test
    public void testStddev() {
        System.out.println("stddev");
        PercolationStats instance = new PercolationStats(10, 20);
        double result = instance.stddev();
        System.out.println(result);
    }

    /**
     * Test of confidenceLo and confidenceHi methods, of class PercolationStats.
     */
    @Test
    public void confidenceLimit() {
        System.out.println("confidence limit");
        PercolationStats instance = new PercolationStats(10, 20);
        double low = instance.confidenceLo();
        double hi = instance.confidenceHi();
        System.out.println("[" + low + ", " + hi + "]");
    }
    
}

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Teardownmethod {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @Test
    public void testAddition() {
        assertEquals(15, calculator.add(10, 5));
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed");
    }
}
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionTest {

    @Test
    public void testAssertions() {
        assertEquals(10, 5 + 5);
        assertTrue(10 > 5);
        assertFalse(5 > 10);
        assertNull(null);
        assertNotNull(new Object());
    }
}
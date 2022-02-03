import static org.junit.Assert.*;
import org.junit.*;

public class TrialTest {
    @Test
    public void modulo() {
	// failing test
        assertEquals(2, Trial.mod(10, 5));
    }
}
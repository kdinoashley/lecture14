import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void stackIsInitiallyEmpty() {
        Stack stack = new Stack();

        assertTrue(
            "The stack is not initially empty!",
            stack.isEmpty()
        );
    }
}

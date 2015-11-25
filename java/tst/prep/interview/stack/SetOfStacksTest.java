package prep.interview.stack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Confirmation that set of stacks will push and pop correctly
 */
public class SetOfStacksTest {

    @Test
    public void evaluateStack() {
        SetOfStacks stacks = new SetOfStacks();
        stacks.push(1);
        stacks.push(1);
        stacks.push(1);
        stacks.push(1);
        stacks.push(1);
        stacks.push(1);
        stacks.push(1);
        stacks.push(2);
        assertEquals(2, stacks.pop());
        assertEquals(1, stacks.pop());
    }
}

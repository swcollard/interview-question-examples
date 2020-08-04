package prep.interview.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Confirmation that stack will push and pop correctly
 */
public class StackTest {

  @Test
  public void evaluateStack() {
    Stack stack = new Stack();
    stack.push("1");
    assertEquals("1", (String) stack.pop());
  }
}

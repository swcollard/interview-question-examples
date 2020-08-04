package prep.interview.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * SetOfStacks question 3.3 from Cracking the Coding Interview
 */
public class SetOfStacks {

  // Arbitrary maximum value a single stack can contain
  private static final int SINGLE_STACK_MAX = 5;

  private List<Stack> stacks;

  public SetOfStacks() {
    stacks = new ArrayList<Stack>();
    stacks.add(new Stack());
  }


  public void push(Object value) {
    if (value == null) {
      return; // Null values are not allowed
    }
    Stack current = stacks.get(stacks.size() - 1);
    if (current.getSize() >= SINGLE_STACK_MAX) {
      current = new Stack();
      stacks.add(current);
    }
    current.push(value);
  }


  public Object pop() {
    Stack current = stacks.get(stacks.size() - 1);
    if (current.getSize() <= 0) {
      return null; // All stacks are empty
    }

    Object val = current.pop();
    if (current.getSize() == 0) {
      stacks.remove(current); // Last element was taken
    }

    return val;
  }
}

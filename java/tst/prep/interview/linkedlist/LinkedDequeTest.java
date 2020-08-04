package prep.interview.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 */
public class LinkedDequeTest {

  @Test
  public void evaluateDeque() {
    LinkedDeque deque = new LinkedDeque();
    deque.insertFirst(1);
    deque.insertFirst(2);
    deque.insertFirst(3);
    deque.insertLast(4);
    assertEquals("3 2 1 4 ", deque.toString());
  }

}

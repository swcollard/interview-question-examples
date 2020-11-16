package prep.interview.tree;

import org.junit.Assert;
import org.junit.Test;

public class DiameterBinaryTreeTest {

  private final DiameterBinaryTree uat = new DiameterBinaryTree();

  @Test
  public void test_null_returns_zero() {
    Assert.assertEquals(0, uat.diameter(null));
  }

  @Test
  public void test_single_node_returns_one() {
    Node root = new Node();
    Assert.assertEquals(1, uat.diameter(root));
  }
}

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

  @Test
  public void test_simple_height() {
    Node root = new Node();
    Node left = new Node();
    Node right = new Node();
    root.left = left;
    root.right = right;
    Assert.assertEquals(3, uat.diameter(root));
  }

  @Test
  public void test_width_8_not_through_root() {
    Node root = new Node();
    Node n1 = new Node();
    Node n2 = new Node();
    Node n3 = new Node();
    Node n4 = new Node();
    Node n5 = new Node();
    Node n6 = new Node();
    Node n7 = new Node();
    Node n8 = new Node();
    Node n9 = new Node();

    root.left = n1;
    root.right = n2;
    n1.left = n3;
    n1.right = n4;
    n3.left = n5;
    n5.left = n6;
    n4.right = n7;
    n7.left = n8;
    n8.right = n9;

    Assert.assertEquals(8, uat.diameter(root));
  }

  @Test
  public void test_performance_depth_10() {
    long time = performance(10);
    System.out.println("Tree Depth 10: Time: " + time);
  }

  @Test
  public void test_performance_depth_25() {
    long time = performance(25);
    System.out.println("Tree Depth 25: Time: " + time);
  }

  @Test
  public void test_performance_depth_50() {
    long time = performance(50);
    System.out.println("Tree Depth 50: Time: " + time);
  }

  private long performance(int depth) {
    Node root = new Node();
    buildTree(depth, root);
    long start = System.currentTimeMillis();
    uat.diameter(root);
    long end = System.currentTimeMillis();
    return end - start;
  }

  private void buildTree(int depth, Node node) {
    if (depth <= 0 || node == null) {
      return;
    }
    double rand = Math.random();
    if (rand <= 0.33) {
      node.left = new Node();
    } else if (rand <= 0.67) {
      node.right = new Node();
    } else {
      node.left = new Node();
      node.right = new Node();
    }
    buildTree(depth - 1, node.left);
    buildTree(depth - 1, node.right);
  }

}

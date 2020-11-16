package prep.interview.tree;

public class DiameterBinaryTree {

  public int diameter(Node root) {
    if (root == null) {
      return 0;
    }
    int selfDiameter = height(root.left) + height(root.right) + 1;
    int leftDiameter = diameter(root.left);
    int rightDiameter = diameter(root.right);
    return Math.max(Math.max(leftDiameter, rightDiameter), selfDiameter);
  }

  private int height(Node node) {
    if (node == null) {
      return 0;
    }
    return Math.max(height(node.left), height(node.right)) + 1;
  }
}

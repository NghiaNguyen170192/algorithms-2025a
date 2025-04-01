package test1_real;

public class IntegerBST {
  static class IntegerNode {
    Integer data;
    IntegerNode left, right;

    public IntegerNode(Integer data) {
      this.data = data;
    }
  }

  IntegerNode root;
  int size;

  public IntegerBST() {
    root = null;
    size = 0;
  }

  // O(logN)
  public int add(int value) {
    if (root == null) {
      root = new IntegerNode(value);
      size++;
      return 0;  // level of root is zero
    }
    // two pointers to traverse the tree
    // and add the new node at the correct position
    int level = 0;
    IntegerNode current = root;
    IntegerNode parent = null;
    while (current != null) {
      level++;
      parent = current;
      if (value < current.data) {
        current = current.left;
      } else {
        // no need to check for duplication, as assumed
        current = current.right;
      }
    }
    // create and add the new node
    IntegerNode newNode = new IntegerNode(value);
    // if this node is the left child of its parent
    if (value < parent.data) {
      parent.left = newNode;
    } else {
      parent.right = newNode;
    }
    size++;
    return level;
  }

  // we can use one traversal technique to visit all nodes
  // for each node, check if it is a leaf node
  // during that process, update min and max levels
  // complexity = O(N)
  public int[] minMax() {
    int[] levels = new int[2];
    levels[0] = Integer.MAX_VALUE;  // min level
    levels[1] = Integer.MIN_VALUE;  // max level

    preOrder(root, 0, levels);

    return levels;
  }

  private void preOrder(IntegerNode node, int currentLevel,  int[] levels) {
    if (node == null) {
      return;
    }
    // this is the "visit" operation
    // check this is a leaf node, update the min and max levels
    if (node.left == null && node.right == null) {      
      if (levels[0] > currentLevel) {
        levels[0] = currentLevel;
      }
      if (levels[1] < currentLevel) {
        levels[1] = currentLevel;
      }
    }
    // traverse left and right sub-trees
    preOrder(node.left, currentLevel + 1, levels);
    preOrder(node.right, currentLevel + 1, levels);
  }

  public static void main(String[] args) {
    IntegerBST tree = new IntegerBST();
    System.out.println(tree.add(15));  // 0
    int[] levels = tree.minMax();
    System.out.println(levels[0] + ", " + levels[1]);   // [0, 0]
    System.out.println(tree.add(10));  // 1
    levels = tree.minMax();
    System.out.println(levels[0] + ", " + levels[1]);   // [1, 1]
    System.out.println(tree.add(8));  // 2
    System.out.println(tree.add(20));  // 1
    levels = tree.minMax();
    System.out.println(levels[0] + ", " + levels[1]);   // [1, 2]
  }
}

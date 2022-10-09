/*
    October 8
    653. Two Sum IV - Input is a BST
    Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target. 
*/

import java.util.HashSet;
class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

public class twoSumIVInputIsABstOctober9 {

  public HashSet<Integer> set = new HashSet<>();

  public boolean findTarget(TreeNode root, int k) {
    inOrder(root);
    for (int key : set) {
      int toSearch = k - key;
      if (set.contains(toSearch) && toSearch != key) return true;
    }
    return false;
  }

  public void inOrder(TreeNode root) {
    if (root == null) return;
    inOrder(root.left);
    set.add(root.val);
    inOrder(root.right);
  }
}

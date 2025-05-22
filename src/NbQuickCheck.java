
import java.util.List;
import java.util.Map;

public class NbQuickCheck {

  /**
   * Performs a pre-order traversal of the tree, printing each node on a separate line.
   * Does nothing if the root is not present in the tree.
   *
   * @param tree the tree represented as a map of parent nodes to child lists
   * @param root the root node to start traversal from
   */
  public static void preOrder(Map<Integer, List<Integer>> tree, int root) { //<- Need to review how to work with Maps
    if(tree == null || root == -1) return; //Assuming it positive number

    System.out.println(root);

    if(!tree.containsKey(root)) {
      for(int item : tree.get(root)){
        preOrder(tree, item);
      }
    }
  }

  /**
   * Returns the minimum value in the tree.
   * Returns Integer.MAX_VALUE if the root is null.
   *
   * @param root the root node of the tree
   * @return the minimum value in the tree or Integer.MAX_VALUE if root is null
   */
  public static int minVal(Node<Integer> root) {
    //DFS

    return -1;
  }
  
}

import DataStructure.Tree;
import DataStructure.TreeNode;
import java.util.List;
import java.util.Arrays;


public class TestCase {
    public static void main(String[] arg) {
        Integer[] array = new Integer[] {5, 3, 7, 2, 4, 6, 8};
        TreeNode root = Tree.construct(array);
        int min = 3;
        int max = 7;
        Integer[] treeArray = Tree.deConstruct(root);
        System.out.println(Arrays.toString(treeArray));
        Tree.print(root);
        /**
        List<Integer> ans = new ArrayList<Integer>();
        getKeys(root, min, max, ans);
        System.out.println(ans);
        */

    }

    public static void getKeys(TreeNode root, int min, int max, List<Integer> ans) {

        if (root == null) {
            return;
        }

        if (root.key > min) {
            getKeys(root.left, min, max, ans);
        }

        if (root.key >= min && root.key <= max) {
            ans.add(root.key);
        }

        if(root.key < max) {
            getKeys(root.right, min, max, ans);
        }

    }



}





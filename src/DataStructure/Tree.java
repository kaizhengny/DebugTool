package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Tree {

    public static TreeNode construct(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return construct(array, 0);
    }

    private static TreeNode construct(Integer[] array, int index) {
        if (index >= array.length) {
            return null;
        }
        if (array[index] == null) {
            return null;
        }
        TreeNode root = new TreeNode(array[index]);
        root.left = construct(array, index * 2 + 1);
        root.right = construct(array, index * 2 + 2);
        return root;
    }

    public static Integer[] deConstruct(TreeNode root) {
        if (root == null) {
            return new Integer[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        deConstruct(root, map, 0);
        int max = 0;
        for (Integer index : map.keySet()) {
            if (index > max) {
                max = index;
            }
        }
        Integer[] array = new Integer[max + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            array[entry.getKey()] = entry.getValue();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = null;
            }
        }
        return array;
    }

    private static void deConstruct(TreeNode root, Map<Integer, Integer> map, int index) {
        if (root == null) {
            return;
        }
        map.put(index, root.key);
        deConstruct(root.left, map, index * 2 + 1);
        deConstruct(root.right, map, index * 2 + 2);
    }

    public static void print(TreeNode root) {
        if (root ==  null) {
            System.out.println("The root is null. No tree printed");
        }
        print("", root, false);

    }

    public static void print(String prefix, TreeNode n, boolean isLeft) {
        if (n != null) {
            print(prefix + "     ", n.right, false);
            System.out.println (prefix + ("|-- ") + n.key);
            print(prefix + "     ", n.left, true);
        }
    }
}

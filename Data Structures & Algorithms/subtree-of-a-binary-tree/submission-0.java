/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) return false;

        // nếu giống hệt
        if (isSameTree(root, subRoot)) {
            return true;
        }

        // kiểm tra bên trái hoặc bên phải
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // cả hai đều null
        if (p == null && q == null) {
            return true;
        }

        // một trong hai null
        if (p == null || q == null) {
            return false;
        }

        // value khác nhau
        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
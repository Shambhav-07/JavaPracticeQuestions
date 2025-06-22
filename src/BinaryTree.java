import java.util.*;

 class Tree {
    int val;
    Tree left;
    Tree right;

    Tree(int value) {
        this.val = value;
        this.left = null;
        this.right = null;
    }

    public class BT {
        public void inorder(Tree node) {
            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.println(node.val);
            inorder(node.right);
        }

        public void preorder(Tree node){
            if (node == null){
                return;
            }
            System.out.println(node.val);
            preorder(node.left);
            preorder(node.right);
        }

        public void postorder(Tree node){
            if (node == null){
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.val);
        }
    }

     public static void main(String[] args) {
         BT Tree = root.new Tree();
         Tree.root(1);
         Tree.root.left(2);

     }
}

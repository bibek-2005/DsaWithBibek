package BinaryTree;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}


public class Tree {
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);
        Node g= new Node(7);
        //Node h= new Node(1);

        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;

        //System.out.print(a.val+" ");
        display(a);
        System.out.println();
        System.out.print(size(a));
        System.out.println();
        System.out.print(sum(a));
        System.out.println();
        System.out.print(product(a));
        System.out.println();
        System.out.print(maxi(a));
        System.out.println();
        System.out.print(mini(a));


    }
    public static void display(Node root){
        if(root == null)return;
        display(root.left);
        System.out.print(root.val+" ");
        display(root.right);
    }
    public static int size(Node root){
        return (root==null) ? 0 : 1+size(root.left)+size(root.right);
    }
    public static int sum(Node root){

        return root ==null ? 0 : root.val+sum(root.left)+sum(root.right);
    }
    public static int product(Node root){
        return root ==null ? 1: root.val*product(root.left)*product(root.right);
    }
    public static int maxi(Node root){

        return root ==null ? Integer.MIN_VALUE: Math.max(root.val,Math.max(maxi(root.left),maxi(root.right)));
    }
    public static int mini(Node root){
        return root ==null? Integer.MAX_VALUE :Math.min(root.val,Math.min(mini(root.left),mini(root.right)));
    }
}

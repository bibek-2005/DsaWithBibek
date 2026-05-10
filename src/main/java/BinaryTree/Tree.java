package BinaryTree;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
class Pair{
    int level;
    Node node;

    Pair(Node node,int level){
        this.level=level;
        this.node=node;
    }
}
class Quad{
    int max;
    int min;
    int size;
    int sum;
    Quad(int max, int min, int size,int sum){
        this.max = max;
        this.min = min;
        this.size = size;
        this.sum = sum;
    }
    void display(){
        System.out.print(max +" "+ min +" "+ size +" "+ sum);
    }

}


public class Tree {
    public static Quad maxminsizesum(Node root){
        if(root == null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
        Quad lst= maxminsizesum(root.left);
        Quad rst = maxminsizesum(root.right);
        int max = Math.max(root.val,Math.max(lst.max,rst.max));
        int min = Math.min(root.val,Math.min(lst.min, rst.min));
        int size =1+lst.size+rst.size;
        int sum=root.val+lst.sum+rst.sum;
        return new Quad(max,min,size,sum);
    }
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
        //display(a);
//        System.out.println();
//        System.out.print(size(a));
//        System.out.println();
//        System.out.print(sum(a));
//        System.out.println();
//        System.out.print(product(a));
//        System.out.println();
//        System.out.print(maxi(a));
//        System.out.println();
//        System.out.print(mini(a));
//        System.out.println();
//        System.out.print(level(a));
//        preorder(a);
//        System.out.println();
//        postorder(a);
//        System.out.println();
//        inorder(a);
        //levelOrder(a);
        //System.out.println(levelOrder(a););
        //levelrderWise(a);
       maxminsizesum(a).display();
        System.out.println(maxminsizesum(a).sum);
    }

    public static void levelrderWise(Node root) {
        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(root,0));
        int Currlevel=0;
        while(q.size()>0){
            Pair front = q.remove();
            if(front.level != Currlevel){
                Currlevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left != null) q.add(new Pair(front.node.left,front.level+1));
            if(front.node.left != null) q.add(new Pair(front.node.right,front.level+1));
        }

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
    public static int level(Node root){
        return root == null ? 0: 1+Math.max(level(root.left),level(root.right));
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.val);
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return;

        postorder(root.left);
        System.out.print(root.val);
        postorder(root.right);

    }




    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
    }



}

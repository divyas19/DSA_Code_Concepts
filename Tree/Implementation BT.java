import java.io.*;
import java.util.*;

class Main
{
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    static class BinaryTree
    {
       static int ind=-1;
        public static Node buildTree(int a[]) {
           ind++;
           if(a[ind] == -1)
           return null;
           Node add = new Node(a[ind]);
           add.left = buildTree(a);
           add.right = buildTree(a);
           return add;
       }

    }
public static void main(String args[])
{
    int a[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree obj = new BinaryTree();
    Node root = obj.buildTree(a);
    System.out.println(root.data);
}
}

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
    
    public static void preorder(Node root)
    {
        if(root == null)
        {
        System.out.print(-1+" ");
        return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void postorder(Node root)
    {
        if(root == null)
        {
        System.out.print(-1+" ");
        return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    
    public static void inorder(Node root)
    {
        if(root == null)
        {
        System.out.print(-1+" ");
        return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void levelorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                System.out.println();
                if(q.isEmpty())
                break;
                q.add(null);
                
            }
            else
            {
                System.out.print(curr.data+" ");
                
                if(curr.left != null)
                q.add(curr.left);
                
                if(curr.right != null)
                q.add(curr.right);
            }
        }
    }
public static void main(String args[])
{
    int a[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
    BinaryTree obj = new BinaryTree();
    Node root = obj.buildTree(a);
    // System.out.println(root.data);
    // preorder(root);
    // postorder(root);
    // inorder(root);
    levelorder(root);
}
}

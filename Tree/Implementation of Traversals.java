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

///////////////////////////////////////////////////////////////////////////////////////////////////////

//Sum of Nodes at Kth Level
import java.io.*;
import java.util.*;

class Solution{
    
    public static int level = 0;
    public static  int sum = 0;
    
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }
    
    public static class Bst{
       
        static int ind = -1;
        public static Node buildTree(int a[])
        {
            ind++;
            if(a[ind] == -1)
            return null;
            
           
            Node newNode = new Node(a[ind]);
            newNode.left = buildTree(a);
            newNode.right =    buildTree(a);
            return newNode;
        }
        
    public static void preorder(Node root)
    {
        if(root== null)
        {
            System.out.println("null");
            return;
        }
        
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void postorder(Node root)
    {
        if(root== null)
        {
            // System.out.println("null");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    
    public static void inorder(Node root)
    {
        if(root== null)
        {
            System.out.println("null");
            return;
        }

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    public static int countNodes(Node root)
    {
        if(root== null)
        {
            return 0;
        }
        
       int l = countNodes(root.left);
       int r = countNodes(root.right);
       return l + r +1;
    }
    
    public static int heightTree(Node root)
    {
        if(root== null)
        {
            return 0;
        }
        
       int l = heightTree(root.left);
       int r = heightTree(root.right);
       return Math.max(l , r) +1;
    }
    
    public static int sumTree(Node root)
    {
       if(root== null)
       {
           return 0;
       }
        
      int l = sumTree(root.left);
      int r = sumTree(root.right);
      return l + r +root.data;
    }
    
     public static int diaTree(Node root)
    {
        if(root== null)
        {
            return 0;
        }
        
      int l = diaTree(root.left);
      int r = diaTree(root.right);
      int f = heightTree(root.left) + heightTree(root.right)+1;
      return Math.max(f , Math.max(l,r)) ;
    }
    
    public static void levelorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        System.out.println();
        
        while(!q.isEmpty())
        {
            Node cur = q.remove();
            if(cur == null)
            {
                 System.out.println();
                 
                 if(!q.isEmpty())
                 q.add(null);
                 else
                 break;
                
            }
            else{
                System.out.print(cur.data+" ");
                
                if(cur.left != null)
                q.add(cur.left);
                
                  if(cur.right != null)
                q.add(cur.right);
            }
        }
        
    }
    
    public static int sum(Node root, int k )
    {
        if(root == null)
        {
            return 0;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty())
        {
            Node cur = q.remove();

            if(cur == null)
            {
                //  System.out.println();
                level = level+1;
                if(k==level)
                return sum;
                sum =0;
                
                 if(!q.isEmpty())
                 q.add(null);
                 else
                 break;
            }
            else
            {
                // System.out.print(cur.data+" ");
                sum = sum+cur.data;
                if(cur.left != null)
                q.add(cur.left);
                
                if(cur.right != null)
                q.add(cur.right);
            }
        }
        return -1;
        }
    }
    
    
    
    
    public static void main(String args[])
    {
        Bst obj = new Bst();
        int a[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = obj.buildTree(a);
        // System.out.println(root.data);
        // obj.preorder(root);
        //  obj.postorder(root);
        // obj.inorder(root);
        obj.levelorder(root);
        // System.out.println(obj.countNodes(root));
        // System.out.println(obj.heightTree(root));
        // System.out.println(obj.sumTree(root));
        // System.out.println(obj.diaTree(root));

    int v = obj.sum(root,-7);
    if(v == -1)
    System.out.println("Please Enter valid level to find sum at that level:");
    else
    System.out.println(v);
    
    }
}

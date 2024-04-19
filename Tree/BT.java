Inorder traversal

public static void inorder(Node root) {
       if(root == null) {
           System.out.print(-1+" ");
           return;
       }
       inorder(root.left);
       System.out.print(root.data+" ");
       inorder(root.right);
   }





Level Order

public static void levelOrder(Node root) {
       if(root == null) {
           return;
       }
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       q.add(null);
       while(!q.isEmpty()) {
           Node curr = q.remove();
           if(curr == null) {
               System.out.println();
               //queue empty
               if(q.isEmpty()) {
                   break;
               } else {
                   q.add(null);
               }
           } else {
               System.out.print(curr.data+" ");
               if(curr.left != null) {
                   q.add(curr.left);
               }
               if(curr.right != null) {
                   q.add(curr.right);
               }
           }
       }
   }






Height of Tree

public static int height(Node root) {
       if(root == null) {
           return 0;
       }


       int leftHeight = height(root.left);
       int rightHeight = height(root.right);
       return Math.max(leftHeight, rightHeight) + 1;
   }
   






Count of Nodes of Tree

public static int countOfNodes(Node root) {
       if(root == null) {
           return 0;
       }


       int leftNodes = countOfNodes(root.left);
       int rightNodes = countOfNodes(root.right);
       return leftNodes + rightNodes + 1;
   }






Diameter of Tree - Approach1 O(N^2)

public static int diameter(Node root) {
       if(root == null) {
           return 0;
       }


       int diam1 = height(root.left) + height(root.right) + 1;
       int diam2 = diameter(root.left);
       int diam3 = diameter(root.right);


       return Math.max(diam1, Math.max(diam2, diam3));
   }

Diameter of Tree - Approach2 O(N)
 public static class TreeInfo
 {
       int ht;
       int d;
       
       TreeInfo(int ht, int d)
       {
           this.ht = ht;
           this.d = d;
       }
 }

 public static TreeInfo dia2(Node root)
 {
           
           if(root == null)
           return new TreeInfo(0,0);
           
           TreeInfo l = dia2(root.left);
           TreeInfo r = dia2(root.right);
           
           int d1= l.d;
           int d2= r.d;
           int d3= l.ht+r.ht+1;
           
           int myD= Math.max(d1,Math.max(d2,d3));
           int myH= Math.max(l.ht,r.ht)+1;
         
           return new TreeInfo(myH,myD);
 }
       
//In main method
//System.out.println(tree.dia2(root).d);







Subtree of another tree

public boolean isIdentical(TreeNode root,TreeNode subRoot){
       if(subRoot == null && root == null){
           return true;
       }
       if(root == null || subRoot == null){
           return false;
       }
       if(root.val == subRoot.val){
           return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
       }
       return false;
   }
  
   public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(subRoot == null){
           return true;
       }
       if(root == null){
           return false;
       }
       if(isIdentical(root, subRoot)){
           return true;
       }
       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
   }


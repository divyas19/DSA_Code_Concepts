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




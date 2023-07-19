class Solution{
    static int f = -1;
    static int l = -1;
    public static void sol(String s, int ind,int n, char find) {
       
        if(ind==n)
        {
            if(f==-1)
            {
                System.out.println("Element not present.");
            }
            else
            {
                System.out.println("First occurence :"+f);
                System.out.println("Last occurence :"+l);
            }
        return;
        }
        
        if(s.charAt(ind)== find)
        {
            if(f==-1)
            {
            f=ind;
            l=ind;
            }
            else
            l=ind;
        }
        
        sol(s,ind+1,n,find);
    }
    
     public static void main(String[] args) 
     {
         String s="bbdbbebbwdf";
         int n = s.length();
         char find = 'a';
         sol(s,0,n,find);
     }
}

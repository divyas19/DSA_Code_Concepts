class Solution {

    public static int LinearSearch(int a[] , int k, int l, int h)
    {
        for(int i=l; i <= h ;i++)
        {
            if(a[i] == k)
            return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int a[] = {-1,4,5,-6,8};
        int k = -10;
        int v = LinearSearch(a,k,0,a.length-1);
        if(v== -1)
            System.out.println("Element not found : ");
        else
            System.out.println(k+" found at position : "+(v+1));
    }
}

////////Recursive

class Solution {

    public static int LinearSearch(int a[] , int k, int l, int h)
    {
        if (l <= h) {
            if (a[l] == k)
                return l;
            else
                return LinearSearch(a, k, l + 1, h);
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int a[] = {-1,4,5,-6,8};
        int k = -10;
        int v = LinearSearch(a,k,0,a.length-1);
        if(v== -1)
            System.out.println("Element not found : ");
        else
            System.out.println(k+" found at position : "+(v+1));
    }
}

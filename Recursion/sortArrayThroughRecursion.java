import java.util.*;

class Solution {
   
    public static void insert(ArrayList<Integer> al, int temp)
    {
        if(al.size()==0 || al.get(al.size()-1) < temp)
        {
        al.add(temp);
        return;
        }
        
        int temp2 = al.get(al.size()-1);
        al.remove(al.size()-1);
        insert(al,temp);
        al.add(temp2);
        return ;
    }
    
    public static void sortRec(ArrayList<Integer> al)
    {
       
        if(al.size()==1)
        return;
        int temp = al.get(al.size()-1);
        al.remove(al.size()-1);
        sortRec( al);
        insert(al,temp);    
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(9);
        al.add(0);
        al.add(-4);
        al.add(7);
        al.add(5);
        sortRec(al);
        System.out.print(al);
    }
}

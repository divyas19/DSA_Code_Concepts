class Solution
{ 
    static void insert(Stack<Integer> s, int temp)
    {
        if(s.size()==0){
        s.push(temp);
        return;
        }
        int temp1 = s.peek();
        s.pop();
        insert(s,temp);
        s.push(temp1);
        
    }
    
    static void reverse(Stack<Integer> s)
    {
        if(s.size()==0)
        return;
        int temp = s.peek();
        s.pop();
        reverse(s);
        insert(s,temp);
    }
}

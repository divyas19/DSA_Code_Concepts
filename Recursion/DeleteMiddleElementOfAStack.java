class Solution
{
    public static void removeMiddle(Stack<Integer>s,int k)
    {
        if(k==1)
        {
        s.pop();
        return;
        }
        int temp = s.peek();
        s.pop();
        removeMiddle(s,k-1);
        s.push(temp);
    }
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int k = sizeOfStack/2+1;
        removeMiddle(s,k);
    } 
}

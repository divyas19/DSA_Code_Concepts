class Solution{
    static int trailingZeros(int N){
        int ct =0;
        for(int i = 5;N/i>0;i*=5)
        {
            ct+=N/i;
        }
        return ct;
    }
}

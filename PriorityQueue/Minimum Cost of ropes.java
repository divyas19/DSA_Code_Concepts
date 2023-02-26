There are given N ropes of different lengths, we need to connect these ropes into one rope. The cost to connect two ropes is equal to sum of their lengths. 
The task is to connect the ropes with minimum cost. Given N size array arr[] contains the lengths of the ropes.
  
class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for(int i = 0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        long ans = 0;
        long temp =0;
        while(pq.size()>1)
        {
            long a = pq.poll();
            long b = pq.poll();
            temp = a+b;
            ans = ans+temp;
            pq.add(temp);
            
        }
        return ans;
    }
}

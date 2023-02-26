Given an array Arr of N positive integers and an integer K, find K largest elements from the array.  The output elements should be printed in decreasing order.

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        int ans[] = new int[k];
        int i=0;
        while(i<n)
        {
            pq.add(arr[i]);
            i++;
        }
     
        int j=0;
        while(j<k)
        {
            int v = pq.remove();
            ans[j] = v;
            j++;
        }
    
       return ans;
    }
}

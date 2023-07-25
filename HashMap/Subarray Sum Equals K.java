class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        hm.put(0,1);
        int ans=0;
        int sum=0;
        int j=0;
        while(j < nums.length)
        {
            sum+=nums[j];
            
            if(hm.containsKey(sum-k))
                ans+=hm.get(sum-k);
            
            if(!hm.containsKey(sum))
            {
                hm.put(sum,1);
            }
            else
            {
                hm.put(sum,hm.get(sum)+1);
            }
            
            j++;
        }
        
        return ans;
    }
}

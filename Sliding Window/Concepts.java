Max Sum Subarray of size K

//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        //User function Template for Java

        int  i =0,j=0;
        long max = Integer.MIN_VALUE;
        long sum =0;
        while(j<N)
        {
           sum += Arr.get(j);
            if(j-i+1 < K)
            {
                
            j++;
            }
            else if(j-i+1 == K)
            {
                max = Math.max(max,sum);
                sum -= Arr.get(i);
                i++;
                j++;
            }
        }
        return max;
    }
}



//Maximum Sum of Distinct Subarrays With Length K

class Solution { 
        
    public long maximumSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int  i=0,j=0;
        long max = 0;
        long sum = 0;
        
        while( j<nums.length )
        {
            if(hm.containsKey(nums[j]))
            {
                hm.put(nums[j],hm.get(nums[j])+1);
            }
            else
            {
                hm.put(nums[j],1);
            }
            
            sum += nums[j];
            
            if(j-i+1 < k)
            {      
            j++;
            }
            else if(j-i+1 == k)
            {
                if(hm.size()==k)
                max = Math.max(max,sum);
                
                if(hm.containsKey(nums[i]) && hm.get(nums[i])==1)
                    hm.remove(nums[i]);
                else
                {
                    hm.put(nums[i], hm.get(nums[i])-1);
                }
                
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
}


___________________________________________________________________________________________________________________________________________________________________________________



First negative integer in every window of size k

class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> al = new ArrayList<Long>();
        int i=0, j=0;
        long a[]=new long[A.length - K+1];
        int l=0;
        while(j<N)
        {
            if(A[j]<0)
            al.add(A[j]);
            
            if(j-i+1 != K)
            {
                j++;
            }
            else if(j-i+1 == K)
            { 
                if(al.size()==0)
                a[l] = (long)0;
                else
                {
                a[l]   = al.get(0);
                if(al.contains(A[i]))
                al.remove(0);
                }
                j++;
                i++;
                l++;
            }
        } 
        return a;
    }
}


___________________________________________________________________________________________________________________________________________________________________________________



 Find All Anagrams in a String

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<Integer>();
        int k = p.length();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i =0; i < p.length();i++)
        {
            if(hm.containsKey(p.charAt(i)))
            {
               hm.put(p.charAt(i), hm.get(p.charAt(i))+1);
            }
            else
            {
                hm.put(p.charAt(i), 1);
            }
        }
        
        int ct = hm.size();
        int i=0, j=0;
       while(j< s.length()) 
       {
           if(hm.containsKey(s.charAt(j)))
           {
              hm.put(s.charAt(j), hm.get(s.charAt(j))-1);
              if((hm.get(s.charAt(j)) == 0))
               ct--;
           }
           
           if(j-i+1 <k)
               j++;
           else if(j-i+1 ==k)
           {
                if(ct==0) 
                    l.add(i);
                    char ci=s.charAt(i);
                    if(hm.containsKey(ci))
                    {
                        hm.put(ci,hm.get(ci)+1);
                        if(hm.get(ci)==1)
                        ct++;
                    }
                    
               j++;
               i++;
           }

       }
        
        return l;
    }
}

_
___________________________________________________________________________________________________________________________________________________________________________________



Maximum of all subarrays of size k

class Solution
{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        Deque<Integer> d = new LinkedList<Integer>();
        ArrayList <Integer> al = new ArrayList <Integer>();
        int i=0;
        int j=0;
        while(j<arr.length)
        {
            
            while(d.size() >0 && d.peekLast() < arr[j])
            d.removeLast();
            d.add(arr[j]);
            if(j-i+1 <k)
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                int v = d.peek();
                al.add(v);
                if(arr[i]==d.peek())
                {
                    d.removeFirst();
                }
                i++;
                j++;
            }
        }
        return al;
    }
}


___________________________________________________________________________________________________________________________________________________________________________________



//VARIABLE SIZED WINDOW

Longest K unique characters substring

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> hm  = new HashMap<Character,Integer>();
        int mx = -1;
        int i=0; 
        int j =0;
        while(j< s.length())
        {
            char ch = s.charAt(j);
           if(hm.containsKey(ch))
               hm.put(ch,hm.get(ch)+1);
           else
               hm.put(ch,1);
               
              
               if( hm.size() <k)
               {
                   j++;
               }
               else if( hm.size() ==k)
               {
                   mx = Math.max(mx,j-i+1);
                   j++;
               }
               else if( hm.size()>k)
               {
                   while( hm.size()>k)
                   {
                       if(hm.containsKey(s.charAt(i)))
                       {
                           hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                       }
                       if(hm.get(s.charAt(i)) ==0)
                       hm.remove(s.charAt(i));
                       i++;
                   }
                   j++;
               }
            
        }
      
        return mx;
    }
}


___________________________________________________________________________________________________________________________________________________________________________________



//Longest Substring Without Repeating Characters 
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int i=0;
        int j=0;
        int ans = 0;
        
        while(j<s.length())
        {
           char chr = s.charAt(j);
           if(hm.containsKey(chr))
               hm.put(chr,hm.get(chr)+1);
           else
               hm.put(chr,1);
               
           if(hm.size()==j-i+1)
           {
               ans = Math.max(ans,hm.size());
               j++;
           }
            else if(hm.size() < j-i+1)
            {
                while(hm.size() < j-i+1)
                {
                    char ch = s.charAt(i);
                      hm.put(ch,hm.get(ch)-1);
                    
                    if(hm.get(ch)==0)
                        hm.remove(ch);
                    
                    i++;
                }
                j++;
            }
        }
        return ans;
    }
}


___________________________________________________________________________________________________________________________________________________________________________________



//Minimum Window Substring

import java.io.*;
import java.util.*;


class Main
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int k=0;k<p.length();k++)
        {
            map.put(p.charAt(k),map.getOrDefault(p.charAt(k),0)+1);
        }

        int min=Integer.MAX_VALUE;
        String minS="-1";
        
        int count=0;
        count=map.size();
        

        int i=0,j=0;
        while(j<s.length())
        {
            if(map.get(s.charAt(j))!=null)
            {
              map.put(s.charAt(j),map.get(s.charAt(j))-1);
              if(map.get(s.charAt(j))==0)
                count--;
            }
             if(count>0)
             {
                 j++;
             }       
             else
             {
                    if(count==0)
                    {
                           while(count==0)
                           {
                                    if(min>j-i+1)
                                    {
                                           minS=s.substring(i,j+1);
                                           min=Math.min(min,j-i+1);
                                    }
                     
                                    if(map.get(s.charAt(i))!=null)
                                    {
                                           map.put(s.charAt(i),map.get(s.charAt(i))+1);
                                           if(map.get(s.charAt(i))==1)
                                           count++;
                                    }
                     
                                    i++;
                          } 

                          j++;
                    }    
            } 

        } 
      
        return minS;
    }
    
    public static void main(String args[])
    {
        System.out.println(smallestWindow("tmnocptpbnttobdsc","toc"));
    }
}

// o/p - ocpt



___________________________________________________________________________________________________________________________________________________________________________________

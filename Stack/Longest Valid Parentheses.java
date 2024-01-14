class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> st = new Stack<Character>();
        Stack<Integer> ind = new Stack<Integer>();
        int max = 0;
        for(int i =0; i < s.length(); i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push('(');
                ind.push(i);
            }
            else{
                if(!st.isEmpty()&& st.peek()=='(')
                {
                    st.pop();
                    ind.pop();
                    max = Math.max(max,i-ind.peek());
                }
                else{
                    ind.push(i);
                }
            }
        }
        return max;
    }
}

/*
In case String s is "()", index is 0 and we add it to ind stack, next we have ), 
so we pop() from st this '(' and it is empty also we pop() from ind stack and it is also empty, when we find length i(1) - ind.peek() gives error, 
so add -1 , len = 1 - (-1) 
*/

//LeetCode - 32

class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<Character>();
        char s[] = new char[x.length()];
        s = x.toCharArray();
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='(' || s[i]=='[' || s[i]=='{')
            {
                st.push(s[i]);
            }
            else
            {
                if(st.size() < 1)
                {
                   return false;
                }
                else if(s[i]==')' && st.peek()!='(')
                {
                    return false;
                }
                else if(s[i]==']' && st.peek()!='[')
                {
                    return false;
                }
                else if(s[i]=='}' && st.peek()!='{')
                {
                    return false;
                }
                else
                st.pop();
            }
        }
        if(st.size() < 1)
            return true;
        return false;
        
        
    }
}

//GFG

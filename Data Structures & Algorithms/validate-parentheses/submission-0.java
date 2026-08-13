class Solution {
    public boolean isValid(String s) {
        Deque <Character> stack = new ArrayDeque<>();
        
        if(s.length() % 2 != 0)
            return false;

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            
            if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty())
                    return false;
                if(c == ')'){
                    if(stack.peek() == '('){
                        stack.pop();
                    }
                    else
                        return false;

                }
                if(c == '}'){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }
                    else
                        return false;
                }
                if(c == ']'){
                    if(stack.peek() == '['){
                        stack.pop();
                    }
                    else
                        return false;
                }

            }
            
            
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}
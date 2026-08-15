class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> num = new ArrayDeque<>();
    
        for(String tok : tokens){
            
            if(tok.equals("+") || tok.equals("-") || tok.equals("/") || tok.equals("*")){
                if(tok.equals("+")){
                    num.push(num.pop() + num.pop());
                }
                if(tok.equals("-")){
                    int num1 = num.pop();
                    int num2 = num.pop();
                    num.push(num2 - num1);
                }
                if(tok.equals("/")){
                    int num1 = num.pop();
                    int num2 = num.pop();
                    if(num1 == 0 || num2 == 0)
                        num.push(0);
                    else
                        num.push(num2 / num1);
                }
                if(tok.equals("*")){
                    num.push(num.pop() * num.pop());
                }
            }
            else
                num.push(Integer.parseInt(tok));

        }
        return num.pop();
    }
}
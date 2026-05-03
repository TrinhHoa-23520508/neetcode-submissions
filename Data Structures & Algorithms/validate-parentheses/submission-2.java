class Solution {

    public boolean isSameTypeBracket(char open, char close){

        switch(open){
            case '(': 
                return close == ')';
            case '{':
                return close == '}';
            case '[': 
                return close == ']';
        }

        return false;

        
        
    }
    public boolean isValid(String s) {

        char[] array = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char c:array){

            if(c=='('||c=='{'||c=='[') stack.push(c);
            else{

                if(stack.isEmpty()) return false;
                else if(!isSameTypeBracket(stack.pop(), c)) return false;
               
            }


        }

        if(!stack.isEmpty()) return false;

        return true;

        
        
    }
}

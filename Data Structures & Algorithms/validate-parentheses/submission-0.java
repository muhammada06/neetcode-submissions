class Solution {
    public boolean isValid(String s) {
        Deque<Character> opening_stack = new ArrayDeque<>();

        for (char c : s.toCharArray()){

            if ((c=='(') || (c=='{') || (c=='[')){
                opening_stack.push(c);
            }

            else{

                //CASE THAT IT'S EMPTY
                if (opening_stack.isEmpty()){
                    return false;
                }

                else{
                    char k=opening_stack.pop();
                    if ((c==')'&&k!='(') || (c=='}'&&k!='{') ||  (c==']'&&k!='[')){
                        return false;
                    }
                }
            }

        }

        if (opening_stack.isEmpty()){
            return true;
        }

        else{
            return false;
        }
        
    }
}

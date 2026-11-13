class Solution {
    public int evalRPN(String[] tokens) {

        Stack <Integer> numbers = new Stack<>();

        for (String s: tokens){
            if (s.equals("+")){
                numbers.push(numbers.pop()+numbers.pop());
            }

            else if (s.equals("*")){
                numbers.push(numbers.pop()*numbers.pop());
            }

            else if (s.equals("-")){
                int temp=numbers.pop();
                numbers.push(numbers.pop()-temp);
            }

            else if (s.equals("/")){
                int temp=numbers.pop();
                numbers.push(numbers.pop()/temp);
            }

            else{
                numbers.push(Integer.parseInt(s));
            }
        }

        return numbers.peek();







        
    }
}

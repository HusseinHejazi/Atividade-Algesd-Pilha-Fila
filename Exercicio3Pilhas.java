import java.util.Stack;

public class Exercicio3Pilhas {
    public static void main(String[] args) {
        String expression = "1 2 3 4 5 6 7";
        Stack<Double> values = new Stack<Double>();
        int firstValue = 0;
        double secondValue = 0;
        String item;
        for(int i = 0; i < expression.length(); ++i){
            if(expression.charAt(i) == ' '){
                item = expression.substring(firstValue, i);
                item = item.replaceAll("\\s+", "");
                if(item.equals("+")){
                    values.push(values.pop() + values.pop());
                }else if(item.equals("-")){
                    secondValue = values.pop();
                    values.push(values.pop() - secondValue);
                }else if(item.equals("*")){
                    values.push(values.pop() * values.pop());
                }else if(item.equals("/")){
                    secondValue = values.pop();
                    values.push(values.pop() / secondValue);
                }else if(item.equals("sqrt")){
                    values.push(Math.sqrt(values.pop()));
                }else{
                    values.push(Double.parseDouble(item));
                }
                firstValue = i;
            }
        }
        System.out.println(values.peek());
    }
}
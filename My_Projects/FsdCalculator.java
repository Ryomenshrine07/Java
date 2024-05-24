package My_Projects;
import java.util.*;

public class FsdCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Calculator!");

        while (true) {
            System.out.print("\nEnter an expression or type 'calculate' to display the result: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("calculate")) {
                break;
            }

            double result = evaluateExpression(input);
            if (!Double.isNaN(result)) {
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
    }

    private static double evaluateExpression(String expression) {
        try {
            String postfix = infixToPostfix(expression);
            return evaluatePostfix(postfix);
        } catch (Exception e) {
            System.out.println("Invalid expression!");
            return Double.NaN;
        }
    }

    private static String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Discard the '('
            } else { // Operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    private static double evaluatePostfix(String postfix) {
        Deque<Double> stack = new ArrayDeque<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (Character.isDigit(c) || c == '.') {
                stack.push(Double.parseDouble(String.valueOf(c)));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        if (operand2 == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}


package Calculadora;

import java.util.Stack;

 
public class Logica {
    public Logica() {
    } 

    public static Float calcularConta(String conta)   {
    	
	    	if (conta.charAt(0) == '-') {
	    		conta="0" + conta;
	        }
	    	
	    	conta=conta.replaceAll("/-(\\d+\\.?\\d*)", "/(0-$1)");
	    	
	        Stack<Float> valores = new Stack<>();
	        Stack<Character> operadores = new Stack<>();
	
	        for (int i = 0; i < conta.length(); i++) {
	            char c = conta.charAt(i);
	            if (Character.isDigit(c) || c == '.') {
	                StringBuilder sb = new StringBuilder();
	                sb.append(c);
	                while (i + 1 < conta.length() && (Character.isDigit(conta.charAt(i + 1)) || conta.charAt(i + 1) == '.')) {
	                    sb.append(conta.charAt(i + 1));
	                    i++;
	                }
	                float valor = Float.parseFloat(sb.toString());
	                valores.push(valor);
	            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
	                while (!operadores.isEmpty() && prioridade(operadores.peek()) >= prioridade(c)) {
	                    float b = valores.pop();
	                    float a = valores.pop();
	                    char op = operadores.pop();
	                    if (op == '/' && b == 0) {
	                        throw new ArithmeticException("Division by zero");
	                    }
	                    float resultado = executarOperacao(a, b, op);
	                    valores.push(resultado);
	                }
	                operadores.push(c); 
	            } else if (c == '(') {
	                operadores.push(c);
	            } else if (c == ')') {
	                while (operadores.peek() != '(') {
	                    float b = valores.pop();
	                    float a = valores.pop();
	                    char op = operadores.pop(); 
	                    if (op == '/' && b == 0) {
	                        throw new ArithmeticException("Division by zero");
	                    }
	                    float resultado = executarOperacao(a, b, op);
	                    valores.push(resultado);
	                }
	                operadores.pop();
	            }
	        }
	
	        while (!operadores.isEmpty()) {
	            float b = valores.pop();
	            float a = valores.pop();
	            char op = operadores.pop();
	            if (op == '/' && b == 0) {
	                throw new ArithmeticException("Division by zero");
	            }
	            float resultado = executarOperacao(a, b, op);
	            valores.push(resultado);
	        }
	
	        return valores.pop();
    	}
    	
    

    private static int prioridade(char operador) {
        switch (operador) {
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

    private static float executarOperacao(float a, float b, char operador) {
        switch (operador) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/': 
                return a / b;
            default:
                return 0; 
        }
    } 

    public static String calcularLog(String numero) {
        float valor;
        valor = Float.parseFloat(numero);
        float resultado = (float) Math.log(valor);
        return Float.toString(resultado);
    }
    public static void main(String[] args) {
    	try {
            Float resultado = calcularConta("2.5*6.8/(9.7-1.5)+5-7/(6-8)");
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
    }
}

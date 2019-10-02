
public class ProgramSoma {
	static void soma(int a, int b){
		int resultado = a+b;
		System.out.println("O resultado da soma é: "+resultado);
	}
	
	
	static void subtracao(int a, int b){
		int resultado = a-b;
		System.out.println("O resultado da subtração é: "+resultado);
	}
	
	
	static void multiplicacao(int a, int b){
		int resultado = a*b;
		System.out.println("O resultado da multipicação é: "+resultado);
	}
	
	
	static void divisao(int a, int b){
		int resultado = a/b;
		System.out.println("O resultado da divisão é: "+resultado);
	}
	
	public static void main(String [] args){
		soma(5,3);
		subtracao(5,3);
		multiplicacao(5,3);
		divisao(5,3);
	}
	
}

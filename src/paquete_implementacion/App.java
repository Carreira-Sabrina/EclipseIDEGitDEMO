package paquete_implementacion;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadoSuma = sumar(10,59);
		String mensajeResultado = "El resultado de la suma es " + resultadoSuma;
		System.out.println(mensajeResultado);

	}
	
	public static int sumar(int a, int b) {
		return a + b;
	}
	
	public static int restar(int a, int b) {
		return a - b;
	}

}

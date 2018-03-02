import java.util.ArrayList;

/**
 * @author ik012982i9
 *
 */
public class Matematica {

	private int numero1;
	private int numero2;
	private static ArrayList ejercicios;
	
	public ArrayList getEjercicios() {
		return ejercicios;
	}
	public void setEjercicios(ArrayList ejercicios) {
		ejercicios = ejercicios;
	}
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	
	
	
	
	
	
	/**
	 * Metodo para calcular la suma de los numeros  1 y 2 que el usuario le dara manualmente
	 * @param numero2
	 * @param numero2
	 */
	 	
	public int Suma(Integer numero1, Integer numero2) {  
		ArrayList ejercicios = new ArrayList();
	
		int Suma = (numero1 + numero2);
	
		ejercicios.add(Suma);
		return Suma;
	}
	
	
	
	
	/**
	 * Metodo para saber si el numero 1 es mayor que el numero 2 
	 * @param numero1
	 * @param numero2
	 */
	
	
	public static void Mayor(Integer numero1, Integer numero2){
		
		boolean esMayor = numero1 > numero2;
		
		if (esMayor == true) {
			System.out.println("True");
		}else{
			System.out.println("False");
		}
		
	}
	
	
	
	
	/**
	 * Devolver el arraylist de ejercicios con las sumas anteriormente hechas
	 * @param ejercicios
	 */
	
	public static void devolverArrayList() {
		// TODO Auto-generated method stub
		System.out.println(ejercicios);
	}
	
	
	
	
}

public class Cachorro {
	

	static float peso = (float)12.45;
	static int idade = 5;
	static String nome = "Rafale";
	
	
	/*  criando um método */

		public static void latido() {
			
			
			System.out.println("O nome do cachorro é: "+nome);
			System.out.println("A idade do cachorro é:"+idade);
			System.out.printf("O peso do cachorro é de: %.2f",peso);
			
		}
	
	
				
      /*chamando método */
			
			public static void main(String[] args) {
				
				latido();
			
			

				}
	
	
}


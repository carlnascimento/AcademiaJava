package praticas;


import java.util.Scanner;

public class Credito {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int tel;
		int  cartao = 0, cvv, cpf=0;
		int option;
		int recarga;
		int recargavalor = 0;
		String pix ;
		
		for(recarga=0;recarga<3;recarga++) {
			System.out.println("  ");
		System.out.println("Este programa será executado para até 3 recargas");
		System.out.println("Informe o telefone desejado nessa execução: ");
		tel = sc.nextInt();
		sc.nextLine(); // tentar limpar o pix

		
		
		System.out.println("---------Menu---------");
		System.out.println("1 para crédito por cartão de crédito");
		System.out.println("2 para crédito por cartão de débito");
		System.out.println("3 para crédito via PIX");
		option = sc.nextInt();
			
			switch(option) {
			
			case 1:
				
				
				System.out.println("Cŕedito por cartão de crédito");
				System.out.println("Telefone: "+tel);
				System.out.println("++++++ RECARGAS ++++++");
				System.out.println("Informe 15 para R$ 15,00 ");
				System.out.println("Informe 25 para R$ 25,00");
				System.out.println("Informe 30 para  R$ 30,00");
				recargavalor = sc.nextInt();
				System.out.println("Informe o seu CPF: ");
				cpf = sc.nextInt();
				System.out.println("Informe os dados do cartão! ");
				System.out.println("Número do cartão: ");
				cartao = sc.nextInt();
				System.out.println("Informe o  código de segurança do cartão: ");
				cvv = sc.nextInt();
				
					if(recargavalor == 15) {
						
						System.out.println("Recarga selecionada: R$ 15,00");
						System.out.println("Confira se o número do  telefone está correto: s/n");
						System.out.println("Telefone: "+tel);
						char correto = sc.next().charAt(0);
						
						if(correto=='s') {
							
							System.out.println("Vamos continuar! ");
							System.out.println("Recarga de R$ 15,00  inserida com sucesso!");
							
						}else {
							System.out.println("Pressione CTRL+C para interromper este terminal");
						    System.out.println("E execute o programa novamente");
						}
						
					}else if(recargavalor== 25) {
						
						System.out.println("Recarga selecionada: R$ 25,00");
						System.out.println("Confira se o número do  telefone está correto: s/n");
						System.out.println("Telefone: "+tel);
						char correto = sc.next().charAt(0);
						
						if(correto=='s') {
							
							System.out.println("Vamos continuar! ");
							System.out.println("Recarga de R$ 25,00  inserida com sucesso!");
							
						}else {
							System.out.println("Pressione CTRL+C para interromper este terminal");
						    System.out.println("E execute o programa novamente");
					}
						
						}
						else if(recargavalor== 30) {
						
						System.out.println("Recarga selecionada: R$ 30,00");
						System.out.println("Confira se o número do  telefone está correto: s/n");
						System.out.println("Telefone: "+tel);
						char correto = sc.next().charAt(0);
						
						if(correto=='s') {
							
							System.out.println("Vamos continuar! ");
							System.out.println("Recarga de R$ 30,00  inserida com sucesso!");
							
						}else {
							System.out.println("Pressione CTRL+C para interromper este terminal");
						    System.out.println("E execute o programa novamente");
					}
						
						}
					
					System.out.println("########## RELATÓRIO ########## ");
					System.out.println("Recarga escolhida: crédito por cartão de crédito");
					System.out.println("Valor escolhido: "+recargavalor+",00");
					System.out.println("CPF do  usuário: "+cpf);
					System.out.println("Número  do cartão: "+cartao);
				
				
				break;
				
			case 2: 
				
				System.out.println("Crédito por cartão de débito");
				System.out.println("Telefone: "+tel);
				System.out.println("++++++ RECARGAS ++++++");
				System.out.println("Informe 15 para R$ 15,00 ");
				System.out.println("Informe 25 para R$ 25,00");
				System.out.println("Informe 30 para  R$ 30,00");
				recargavalor = sc.nextInt();
				
				System.out.println("Informe o seu CPF: ");
				cpf = sc.nextInt();
				System.out.println("Informe os dados do cartão! ");
				System.out.println("Número do cartão: ");
				cartao = sc.nextInt();
				System.out.println("Informe o  código de segurança do cartão: ");
				cvv = sc.nextInt();

				if(recargavalor == 15) {
					
					System.out.println("Recarga selecionada: R$ 15,00");
					System.out.println("Confira se o número do  telefone está correto: s/n");
					System.out.println("Telefone: "+tel);
					char correto = sc.next().charAt(0);
					
					if(correto=='s') {
						
						System.out.println("Vamos continuar! ");
						System.out.println("Recarga de R$ 15,00  inserida com sucesso!");
						
					}else {
						System.out.println("Pressione CTRL+C para interromper este terminal");
					    System.out.println("E execute o programa novamente");
					}
					
				}else if(recargavalor== 25) {
					
					System.out.println("Recarga selecionada: R$ 25,00");
					System.out.println("Confira se o número do  telefone está correto: s/n");
					System.out.println("Telefone: "+tel);
					char correto = sc.next().charAt(0);
					
					if(correto=='s') {
						
						System.out.println("Vamos continuar! ");
						System.out.println("Recarga de R$ 25,00  inserida com sucesso!");
						
					}else {
						System.out.println("Pressione CTRL+C para interromper este terminal");
					    System.out.println("E execute o programa novamente");
				}
					
					}
					else if(recargavalor== 30) {
					
					System.out.println("Recarga selecionada: R$ 30,00");
					System.out.println("Confira se o número do  telefone está correto: s/n");
					System.out.println("Telefone: "+tel);
					char correto = sc.next().charAt(0);
					
					if(correto=='s') {
						
						System.out.println("Vamos continuar! ");
						System.out.println("Recarga de R$ 30,00  inserida com sucesso!");
						
					}else {
						System.out.println("Pressione CTRL+C para interromper este terminal");
					    System.out.println("E execute o programa novamente");
				}
					
					
					}
				
				System.out.println("########## RELATÓRIO ########## ");
			    System.out.println("Recarga escolhida: crédito por cartão de débito");
				System.out.println("Valor escolhido: "+recargavalor+",00");
				System.out.println("CPF do  usuário: "+cpf);
				System.out.println("Número  do cartão: "+cartao);
				break;
			
			case 3:
				System.out.println("Recarga por pix");
				System.out.println("Telefone: "+tel);
				System.out.println("++++++ RECARGAS ++++++");
				System.out.println("Informe 15 para R$ 15,00 ");
				System.out.println("Informe 25 para R$ 25,00");
				System.out.println("Informe 30 para  R$ 30,00");
				recargavalor = sc.nextInt();
				
				System.out.println("Informe o seu CPF: ");
				cpf = sc.nextInt();
				
				System.out.println("Informe a chave pix");
				sc.nextLine();
			     pix = sc.nextLine();

				if(recargavalor == 15) {
					
					System.out.println("Recarga selecionada: R$ 15,00");
					System.out.println("Confira se o número do  telefone está correto: s/n");
					System.out.println("Telefone: "+tel);
					char correto = sc.next().charAt(0);
					
					if(correto=='s') {
						
						System.out.println("Vamos continuar! ");
						System.out.println("Recarga de R$ 15,00  inserida com sucesso!");
						
					}else {
						System.out.println("Pressione CTRL+C para interromper este terminal");
					    System.out.println("E execute o programa novamente");
					}
					
				}else if(recargavalor== 25) {
					
					System.out.println("Recarga selecionada: R$ 25,00");
					System.out.println("Confira se o número do  telefone está correto: s/n");
					System.out.println("Telefone: "+tel);
					char correto = sc.next().charAt(0);
					
					if(correto=='s') {
						
						System.out.println("Vamos continuar! ");
						System.out.println("Recarga de R$ 25,00  inserida com sucesso!");
						
					}else {
						System.out.println("Pressione CTRL+C para interromper este terminal");
					    System.out.println("E execute o programa novamente");
				}
					
					}
					else if(recargavalor== 30) {
					
					System.out.println("Recarga selecionada: R$ 30,00");
					System.out.println("Confira se o número do  telefone está correto: s/n");
					System.out.println("Telefone: "+tel);
					char correto = sc.next().charAt(0);
					
					if(correto=='s') {
						
						System.out.println("Vamos continuar! ");
						System.out.println("Recarga de R$ 30,00  inserida com sucesso!");
						
					}else {
						System.out.println("Pressione CTRL+C para interromper este terminal");
					    System.out.println("E execute o programa novamente");
				}
					
					
					
					}
				
				System.out.println("########## RELATÓRIO ########## ");
				System.out.println("Recarga escolhida: crédito via PIX" );
				System.out.println("Valor escolhido: "+recargavalor+",00");
				System.out.println("CPF do  usuário: "+cpf);
				System.out.println("Chave pix: "+pix);
				break;
				
				default:
					System.out.println("Falha Catastrófica!!!");
					
				
			}
			
			
		
			
			
		}
		
		
		}
		
	}




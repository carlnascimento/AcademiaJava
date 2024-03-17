import java.util.Scanner;

import java.util.ArrayList;

public class Carro {
	
	
	public static void main(String[] args) {
		
		System.out.println("O códido está funcionando"); 
		
	}
	
	
	private String  placa;
	private String marca;
	private String modelo;
	private int ano;
	private float valorAproximado;
	private Cliente dono;
	
	public  Carro pesquisarCarroPorPlaca(String placa, ArrayList<Carro> carrosCadastrados) {
		
		for (Carro carro : carrosCadastrados){
			
			if (carro.getPlaca().equals(placa)) {
				
				return carro;
			}
		}
		
		
		return null;
	
		
	}

	private Object getPlaca() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
	class Cliente{
		
		private String cpf;
		private String endereco;
		private int idade;
		private String telefone;
		private String nome;
		
		
		
		
	public Cliente pesquisarClientePorCPF(String cpf) {
		
	
		
		Cliente[] clientesCadastrados = null;
		for (Cliente cliente : clientesCadastrados) {
			
			if (cliente.getCpf().equals(cpf)) {
				
				return cliente;
			}
		}
		
		return null;
	}
		
		
	
	
		private Object getCpf() {
		// TODO Auto-generated method stub
		return null;
	}




		class loja{
			
			private ArrayList<Carro> carrosCadastrados;
			private ArrayList<Cliente> clientesCadastrados;
			private int quantidade;
			
			
		
		
		
		
		public void cadastrarCarro(Carro carro) {
			
			
			carrosCadastrados.add(carro);
		}
		
				public void cadastrarCliente(Cliente cliente) {
							
							
							clientesCadastrados.add(cliente);
				}
		
		
		
		
		
			
			
		
		}
		
		
		
	}


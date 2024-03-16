package concessiox;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Concessionaria {
    private ArrayList<Carro> carrosCadastrados;
    private ArrayList<Cliente> clientesCadastrados;

    public Concessionaria() {
        this.carrosCadastrados = new ArrayList<>();
        this.clientesCadastrados = new ArrayList<>();
    }

    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Pesquisar Carro por Placa");
            System.out.println("4. Pesquisar Cliente por CPF");
            System.out.println("5. Remover Carro por Placa");
            System.out.println("6. Listar Todos os Clientes");
            System.out.println("7. Listar Todos os Carros");
            System.out.println("8. Atualizar Carro por Placa");
            System.out.println("9. Associar Cliente a um Modelo de Carro");
            System.out.println("10. Consultar Carros por CPF do Cliente");
            System.out.println("11. Listar Carros Ordenados por Ano (Decrescente)");
            System.out.println("12. Buscar Cliente Mais Velho Cadastrado");
            System.out.println("13. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    concessionaria.cadastrarCarro(scanner);
                    break;
                case 2:
                    concessionaria.cadastrarCliente(scanner);
                    break;
                case 3:
                    concessionaria.pesquisarCarroPorPlaca(scanner);
                    break;
                case 4:
                    concessionaria.pesquisarClientePorCPF(scanner);
                    break;
                case 5:
                    concessionaria.removerCarroPorPlaca(scanner);
                    break;
                case 6:
                    concessionaria.listarTodosClientes();
                    break;
                case 7:
                    concessionaria.listarTodosCarros();
                    break;
                case 8:
                    concessionaria.atualizarCarroPorPlaca(scanner);
                    break;
                case 9:
                    concessionaria.associarClienteAModelo(scanner);
                    break;
                case 10:
                    concessionaria.consultarCarrosPorCPF(scanner);
                    break;
                case 11:
                    concessionaria.listarCarrosOrdenadosPorAnoDecrescente();
                    break;
                case 12:
                    concessionaria.buscarClienteMaisVelhoCadastrado();
                    break;
                case 13:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }

    public void cadastrarCarro(Scanner scanner) {
        System.out.println("=== Cadastrar Novo Carro ===");
        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();
        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner
        System.out.print("Digite o valor aproximado do carro: ");
        float valorAproximado = scanner.nextFloat();

        Carro novoCarro = new Carro(placa, marca, modelo, ano, valorAproximado);
        carrosCadastrados.add(novoCarro);
        System.out.println("Carro cadastrado com sucesso!");
    }

    public void cadastrarCliente(Scanner scanner) {
        System.out.println("=== Cadastrar Novo Cliente ===");
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        Cliente novoCliente = new Cliente(nome, cpf, telefone);
        clientesCadastrados.add(novoCliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void pesquisarCarroPorPlaca(Scanner scanner) {
        System.out.print("Digite a placa do carro a ser pesquisado: ");
        String placa = scanner.nextLine();
        for (Carro carro : carrosCadastrados) {
            if (carro.getPlaca().equals(placa)) {
                System.out.println("Carro encontrado:");
                System.out.println(carro);
                return;
            }
        }
        System.out.println("Carro não encontrado com a placa informada.");
    }

    public void pesquisarClientePorCPF(Scanner scanner) {
        System.out.print("Digite o CPF do cliente a ser pesquisado: ");
        String cpf = scanner.nextLine();
        for (Cliente cliente : clientesCadastrados) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente encontrado:");
                System.out.println(cliente);
                return;
            }
        }
        System.out.println("Cliente não encontrado com o CPF informado.");
    }

    public void removerCarroPorPlaca(Scanner scanner) {
        System.out.print("Digite a placa do carro a ser removido: ");
        String placa = scanner.nextLine();
        for (int i = 0; i < carrosCadastrados.size(); i++) {
            Carro carro = carrosCadastrados.get(i);
            if (carro.getPlaca().equals(placa)) {
                carrosCadastrados.remove(i);
                System.out.println("Carro removido com sucesso!");
                return;
            }
        }
        System.out.println("Carro não encontrado com a placa informada.");
    }

    public void listarTodosClientes() {
        if (clientesCadastrados.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado ainda.");
        } else {
            System.out.println("\n=== Todos os Clientes ===");
            for (Cliente cliente : clientesCadastrados) {
                System.out.println(cliente);
            }
        }
    }

    public void listarTodosCarros() {
        if (carrosCadastrados.isEmpty()) {
            System.out.println("Nenhum carro cadastrado ainda.");
        } else {
            System.out.println("\n=== Todos os Carros ===");
            for (Carro carro : carrosCadastrados) {
                System.out.println(carro);
            }
        }
    }

    public void atualizarCarroPorPlaca(Scanner scanner) {
        System.out.print("Digite a placa do carro a ser atualizado: ");
        String placa = scanner.nextLine();
        for (Carro carro : carrosCadastrados) {
            if (carro.getPlaca().equals(placa)) {
                System.out.println("Carro encontrado. Informe os novos dados:");
                System.out.print("Nova marca: ");
                carro.setMarca(scanner.nextLine());
                System.out.print("Novo modelo: ");
                carro.setModelo(scanner.nextLine());
                System.out.print("Novo ano: ");
                carro.setAno(scanner.nextInt());
                scanner.nextLine();  // Limpar o buffer do scanner
                System.out.print("Novo valor aproximado: ");
                carro.setValorAproximado(scanner.nextFloat());
                System.out.println("Carro atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Carro não encontrado com a placa informada.");
    }

    public void associarClienteAModelo(Scanner scanner) {
        if (clientesCadastrados.isEmpty() || carrosCadastrados.isEmpty()) {
            System.out.println("Não há clientes ou carros cadastrados para associar.");
            return;
        }

        System.out.println("\n=== Associar Cliente a um Modelo de Carro ===");
        System.out.println("Clientes disponíveis:");
        for (int i = 0; i < clientesCadastrados.size(); i++) {
            System.out.println((i + 1) + ". " + clientesCadastrados.get(i).getNome());
        }
        System.out.print("Escolha o número do cliente: ");
        int clienteIndex = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        if (clienteIndex <= 0 || clienteIndex > clientesCadastrados.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Cliente clienteSelecionado = clientesCadastrados.get(clienteIndex - 1);

        System.out.println("\nCarros disponíveis:");
        for (int i = 0; i < carrosCadastrados.size(); i++) {
            System.out.println((i + 1) + ". " + carrosCadastrados.get(i).getPlaca() + " " + carrosCadastrados.get(i).getModelo());
        }
        System.out.print("Escolha o número do carro: ");
        int carroIndex = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        if (carroIndex <= 0 || carroIndex > carrosCadastrados.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        Carro carroSelecionado = carrosCadastrados.get(carroIndex - 1);

        clienteSelecionado.setCarro(carroSelecionado);
        System.out.println("Cliente associado ao carro com sucesso!");
    }

    public void consultarCarrosPorCPF(Scanner scanner) {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        boolean encontrado = false;
        for (Cliente cliente : clientesCadastrados) {
            if (cliente.getCpf().equals(cpf)) {
                if (cliente.getCarro() != null) {
                    encontrado = true;
                    System.out.println("Cliente: " + cliente.getNome() + ", Carro: " + cliente.getCarro().getPlaca() + " " + cliente.getCarro().getModelo());
                }
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum carro associado a esse CPF.");
        }
    }

    public void listarCarrosOrdenadosPorAnoDecrescente() {
        carrosCadastrados.sort(Comparator.comparing(Carro::getAno).reversed());
        System.out.println("\n=== Carros Ordenados por Ano (Decrescente) ===");
        for (Carro carro : carrosCadastrados) {
            System.out.println(carro);
        }
    }

    public void buscarClienteMaisVelhoCadastrado() {
        if (clientesCadastrados.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado ainda.");
            return;
        }
        Cliente maisVelho = clientesCadastrados.get(0);
        for (Cliente cliente : clientesCadastrados) {
            if (cliente.getIdade() > maisVelho.getIdade()) {
                maisVelho = cliente;
            }
        }
        System.out.println("Cliente mais velho cadastrado:");
        System.out.println(maisVelho);
    }
}

class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private float valorAproximado;
    private Cliente dono;

    public Carro(String placa, String marca, String modelo, int ano, float valorAproximado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorAproximado = valorAproximado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getValorAproximado() {
        return valorAproximado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setValorAproximado(float valorAproximado) {
        this.valorAproximado = valorAproximado;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", valorAproximado=" + valorAproximado +
                '}';
    }
}

class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private Carro carro;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getIdade() {
        // Simulação da idade do cliente
        // Supondo que o CPF contenha a data de nascimento
        // e os últimos dois dígitos do ano
        int anoNascimento = Integer.parseInt(cpf.substring(4, 6));
        int anoAtual = 22; // Supondo que o ano atual seja 2022
        return anoAtual - anoNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", carro=" + (carro != null ? carro.getPlaca() + " " + carro.getModelo() : "Sem carro associado") +
                '}';
    }
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bem vindo ao banco digital!");
		System.out.println("[Criação de Conta]:");
		System.out.println("Digite seu nome, iremos criar contas corrente e poupança com esse nome. ");
		String nomeCliente = in.next();

		Cliente cliente = new Cliente();
		cliente.setNome(nomeCliente);
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		int opc = 0;

		while (opc != 6) {
			System.out.println(" Sistema Banco Digital");
			System.out.println("=========================");
			System.out.println("1 - Exibir extrato da Conta Corrente");
			System.out.println("2 - Exibir extrato da Conta Poupança");
			System.out.println("3 - Deposito");
			System.out.println("4 - Saque");
			System.out.println("5 - Transferência");
			System.out.println("6 - Sair");
			System.out.println("Escolha uma opção por favor:");
			opc = in.nextInt();

			switch (opc) {
				case 1:
					cc.imprimirExtrato();
					break;
				case 2:
					poupanca.imprimirExtrato();
					break;
				case 3:
					System.out.println("Qual o valor do depósito? ");
					double valor = in.nextDouble();

					System.out.println("Deseja depositar em qual conta? (1 - Corrente | 2 - Poupança)");
					opc = in.nextInt();
					if (opc == 1) {
						cc.depositar(valor);
					} else if (opc == 2) {
						poupanca.depositar(valor);
					} else {
						System.out.println("Digite uma opção válida.");
					}
					break;

				case 4:
					System.out.println("Qual o valor do saque? ");
					valor = in.nextDouble();

					System.out.println("Deseja sacar em qual conta? (1-C.Corrente | 2-C.Poupança)");
					opc = in.nextInt();
					if (opc == 1) {
						cc.sacar(valor);
					} else if (opc == 2) {
						poupanca.sacar(valor);
					} else {
						System.out.println("Digite uma opção válida.");
					}
					break;

				case 5:
					System.out.println("Qual o valor da transferência? ");
					valor = in.nextDouble();

					System.out.println("Deseja transferir para qual conta? (1-C.Corrente | 2-C.Poupança)");
					opc = in.nextInt();
					if (opc == 1) {
						poupanca.transferir(valor, cc);
					} else if (opc == 2) {
						cc.transferir(valor, poupanca);
					} else {
						System.out.println("Digite uma opção válida.");
					}
					break;
				case 6:
					System.out.println("Saindo...");
					break;
				default:
					break;
			}
		}

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

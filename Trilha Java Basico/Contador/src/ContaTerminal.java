import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o número da Conta:");
		int numero = in.nextInt();
		in.nextLine();

		System.out.println("Digite o número da Agência:");
		String agencia = in.nextLine();

		System.out.println("Digite o seu Nome:");
		String nome = in.nextLine();

		System.out.println("Digite o seu Saldo:");
		double saldo = in.nextDouble();

		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
				+ ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

		in.close();
	}
}

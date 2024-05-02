import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        conta.exibirConta();

        scanner.close();

    }

    public void exibirConta() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
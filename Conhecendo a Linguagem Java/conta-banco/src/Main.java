import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da conta:");
        contaTerminal.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite a agência:");
        contaTerminal.setAgencia(scanner.nextLine());

        System.out.println("Digite o seu nome:");
        contaTerminal.setNomeCliente(scanner.nextLine());

        System.out.println("Digite o saldo disponível para saque");
        contaTerminal.setSaldo(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Olá " + contaTerminal.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + contaTerminal.getAgencia() + ", conta " + contaTerminal.getNumero() + " e " +
                "seu " + "saldo " + contaTerminal.getSaldo() + " já está disponível para saque.");

    }
}
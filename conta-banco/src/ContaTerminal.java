import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: R$ ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        ContaBancaria conta = new ContaBancaria(nomeTitular, saldoInicial);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Exibir Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    conta.exibirSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 0:
                    System.out.println("Encerrando a aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

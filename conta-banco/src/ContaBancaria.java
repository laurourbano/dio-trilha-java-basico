public class ContaBancaria {
    private String nomeTitular;
    private double saldo = 25;

    public ContaBancaria(String nomeTitular, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }

    public void exibirSaldo() {
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }
}

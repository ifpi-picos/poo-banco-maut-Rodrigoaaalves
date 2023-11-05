import java.util.ArrayList;
import java.util.List;

// faltou implementar as classes de heranças e notificação
public class Conta {
    private String agencia;
    private String numeroConta;
    private double saldo;
    private List<String> transacoes;

    public Conta(String agencia, String numeroConta, double saldo, Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
    }

    public void depositar(double valor) {
        saldo += valor;
        transacoes.add("Depósito: +" + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add("Saque: -" + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add("Transferência: -" + valor + " para conta " + contaDestino.numeroConta);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public List<String> extrato() {
        return transacoes;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Agência: " + agencia + ", Número da Conta: " + numeroConta + ", Saldo: " + saldo;
    }
}

package banco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

	private Cliente cliente;
	private int numeroConta;
	private double saldo;
	private LocalDate data;
	private List<String> historico;

	public ContaCorrente(Cliente cliente, int numeroConta, double saldo, LocalDate data) {
		super();
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.data = data;
		this.historico = new ArrayList<>();
		registrarOperacao("Conta criada - Saldo inicial: R$" + saldo);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void Depositar(double valor) {
		saldo += valor;
		System.out.printf("Depósito de R$ %.2f realizado com sucesso na conta %d %n", valor, numeroConta);
		System.out.printf("O saldo atual é de R$ %.2f %n%n", saldo);
        registrarOperacao("Depósito de R$" + valor + " realizado com sucesso na conta " + numeroConta);

	}

	public void Sacar(double valor) {
		if (valor < saldo) {
			saldo -= valor;
			System.out.printf("Saque de R$ %.2f realizado com sucesso na conta %d %n", valor, numeroConta);
			System.out.printf("O saldo atual é de R$ %.2f %n%n", saldo);
	        registrarOperacao("Saque de R$" + valor + " realizado com sucesso da conta " + numeroConta);
		} else {
            System.out.println("Saldo insuficiente para realizar o saque.");

		}
	}

	public void Transferir(ContaCorrente destinatario, double valor) {
		if (valor <= saldo) {
            saldo -= valor;
            destinatario.saldo += valor;
            System.out.printf("Transferência de R$ %.2f realizada da Conta %d para a Conta %d.%n%n", valor, numeroConta, destinatario.getNumeroConta() );
            registrarOperacao("Transferência de R$" + valor + " para Conta " + destinatario.getNumeroConta());
            destinatario.registrarOperacao("Transferência de R$" + valor + " recebida da conta " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
		
	}
	
	private void registrarOperacao(String operacao) {
        historico.add(operacao);
    }

	public void ExibirExtrato() {
		System.out.println("--------------------------------------------------");
		System.out.printf("Extrato da Conta %d - Cliente: %s %s %n", numeroConta, cliente.getNome(), cliente.getSobrenome());
        System.out.printf("Saldo atual: R$ %.2f %n", saldo);
        System.out.println("Histórico de operações:");
        for (String operacao : historico) {
            System.out.printf("- %s%n%n", operacao);
        }	
        System.out.println("--------------------------------------------------");
        }

}

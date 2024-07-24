package banco;

import java.time.LocalDate;

public class PrincipalContaCorrente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("José", "Garcia", "123.456.789-00");
		Cliente cliente2 = new Cliente("Maria", "Socorro", "123.456.789-00");
		
		ContaCorrente conta1 = new ContaCorrente(cliente1, 1111, 0.00, LocalDate.of(2012, 6, 14) );
		ContaCorrente conta2 = new ContaCorrente(cliente2, 2222, 100.00, LocalDate.of(2019, 3, 21) );

		conta1.Depositar(1200);
		
		conta1.Sacar(200);
		
		conta1.Transferir(conta2, 200);
		
		conta1.ExibirExtrato();
		
		conta2.ExibirExtrato();
		
		conta2.Transferir(conta1, 450);
		
		conta2.Transferir(conta1, 150);
		
		conta2.ExibirExtrato();
		
	}

}

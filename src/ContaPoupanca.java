
public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {

		System.out.println("=== Extrato da Conta Pouoan�a ===");
		super.imprimirInfosCommuns();

	}

}

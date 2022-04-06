
public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {

		System.out.println("=== Extrato da Conta Pouoança ===");
		super.imprimirInfosCommuns();

	}

}

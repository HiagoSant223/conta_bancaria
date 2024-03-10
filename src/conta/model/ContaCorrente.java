package conta.model;


// Conta Corrente herda de Conta
public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		
		//Super Classe: representa o construtor da Classe principal(Conta)
		super(numero, agencia, tipo, titular, saldo);
		
		this.limite = limite;
		
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) {
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insulficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
	
	public void teste() {
		int idade1 = 22;
		double idade2 = idade1;
	}
	
}

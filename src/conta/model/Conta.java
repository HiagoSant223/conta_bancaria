package conta.model;

public abstract class Conta {
	
		// Atributos = caracteristicas
	
		//Encapsulamento: Encapsular/Proteger algo
		// Private / Protected / Public / Friendly
	
		 private int numero;
		 private int agencia;
		 private int tipo;
		 private String titular;
		 private float saldo;
	
		 
		// Métodos Construtor
		 // this. (está): representa o nome da propria Classe onde foi contruido (Conta) 
		public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
			this.agencia = agencia;
			this.numero = numero;
			this.saldo = saldo;
			this.tipo = tipo;
			this.titular = titular;
		}
		
		// Métodos de acesso (Método Get - Método Set)
		public int getNumero() {
			return numero;
		}
		
		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
		
		public boolean sacar(float valor) {
			if(this.getSaldo() < valor) {
				System.out.println("Saldo Insuficiente!");
				return false;
			}
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		
		public void depositar(float valor) {
			this.setSaldo(this.getSaldo() + valor);
		}
		
		public void visualizar() {
			
			String tipo = "";
			
			switch(this.tipo) {
			case 1:
				tipo = "Conta Corrente";
				break;
			case 2:
				tipo = "Conta Poupança";
				break;
			}
			
			System.out.println("\n\n***********************************************************");
			System.out.println("Dados da Conta:");
			System.out.println("***********************************************************");
			System.out.println("Numero da Conta: " + this.numero);
			System.out.println("Agência: " + this.agencia);
			System.out.println("Tipo da Conta: " + tipo);
			System.out.println("Titular: " + this.titular);
			System.out.println("Saldo: " + this.saldo);
		}
}

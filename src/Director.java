public class Director extends CompositeEmployee {

	private int codigo;
	private String nome, cargo;
	
	public Director(int codigo, String nome, String cargo) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
	}
	
	@Override
	public void showEmployeeDetails() {
		System.out.println("Codigo: " + codigo + " Nome: " + nome + " Cargo: " + cargo);
		super.showEmployeeDetails();
	}
}
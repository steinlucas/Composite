public class Intern extends CompositeEmployee{
	
	private int codigo;
	private String nome, cargo;
	
	public Intern(int codigo, String nome, String cargo) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
	}
	
	@Override
	public void showEmployeeDetails() {
		System.out.println("Codigo: " + codigo + " Nome: " + nome + " Cargo: " + cargo);
	}
}
public class Company {
	public static void main(String[] args) {
		
		/*
		 * Implementar classe CompositeEmployee que implementa Employee
		 * contendo os metodos addEmployee, removeEmployee e os atributos
		 * necessarios (listas, strings e afins).
		 * 
		 * Criar as classes Developer, Intern, Manager e Director
		 * conforme os comentarios de Composite e Leaf Abaixo.
		 * 
		 * A interface Employee já está implementada
		 */
		
		// Composite
		Developer dev1 = new Developer(200/*Codigo*/, "Joao da Silva"/*Nome*/, "Senior Developer"/*Cargo*/);
		// Composite
		Developer dev2 = new Developer(201, "Maria Santos", "Entry Level Developer");
		// Leaf
		Intern int1 = new Intern(300, "Pedro Martins", "Development Intern");
		// Composite
		Manager man1 = new Manager(400, "Ricardo Pereira", "Development Manager");
		// Composite
		Director dir1 = new Director(500, "Marcos Oliveira", "Development Director");
		
		dir1.addEmployee(man1);
		man1.addEmployee(dev1);
		man1.addEmployee(dev2);
		dev2.addEmployee(int1);
		
		// Esta chamada devara apresentar a hierarquia completa
		// da empresa
		dir1.showEmployeeDetails();
	}
}
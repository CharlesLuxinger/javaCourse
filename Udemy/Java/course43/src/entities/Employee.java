package entities;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	
	/*Method compareTo: 
	 	Parameters: o - the object to be compared. 
	 
	 	Returns: a negative integer, zero, or a positive integer as this object is less than, equal to
	 		or greater than the specified object
	 */
	@Override
	public int compareTo(Employee other) {
		return this.name.compareTo(other.getName());
	}
	
	
}

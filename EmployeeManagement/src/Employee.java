
public class Employee {
	int id;
	String Name;
	String Dept;

	public Employee(int id, String name, String dept) {
		this.id = id;
		Name = name;
		Dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Dept=" + Dept + "]";
	}

}

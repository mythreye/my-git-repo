import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManaagementSystem {

	public static void main(String args[]) {
		int id;
		String name, dept;
		char opt;
		ArrayList<Employee> employees = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		int choice;
		int flag;
		try {
			do {
				flag = 0;
				System.out.println(
						"Enter 1 for Adding Employee \nEnter 2 for Updating Employee \nEnter 3 for Deleteing Employee \nEnter 4 for View All Employee \nEnter 5 for View  One Employee \n");

				choice = s.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the Employee Details");
					System.out.println("Enter the Employee Id");
					id = s.nextInt();
					System.out.println("Enter the Employee Name");
					name = s.next();
					System.out.println("Enter the Employee Department");
					dept = s.next();
					employees.add(new Employee(id, name, dept));
					break;
				case 2:
					System.out.println("Enter the Employee Id to be updated ");
					id = s.nextInt();
					for (Employee e : employees) {
						if (e.getId() == id) {
							int index = employees.indexOf(e);
							System.out.println("Enter the Employee Name");
							name = s.next();
							System.out.println("Enter the Employee Department");
							dept = s.next();
							e.setName(name);
							e.setDept(dept);
							employees.set(index, e);
							flag = 1;
							break;
						}
					}

					if (flag == 1) {
						System.out.println("Employee found and data updated");
					} else {

						System.out.println("Employee not found");
					}

					break;
				case 3:
					System.out.println("Enter the Employee Id to be deleted ");
					id = s.nextInt();
					for (Employee e : employees) {
						if (e.getId() == id) {
							employees.remove(e);
							flag=1;
							break;
						}
					}

					if (flag == 1) {
						System.out.println("Employee found and data deleted");
					} else {

						System.out.println("Employee not found");
					}

					break;
				case 4:
					for (Employee e : employees)
						System.out.println(e);
					break;
				case 5:
					System.out.println("Enter the Employee Id to be viewed ");
					id = s.nextInt();
					for (Employee e : employees) {
						if (e.getId() == id) {
							System.out.println(e);
							flag=1;
							break;
						}
					}

					if (flag == 0) {
						System.out.println("Employee not found");
					}

					break;

				default:
					break;
				}
				System.out.print("Enter Y to continue N to stop");
				opt = s.next().toLowerCase().charAt(0);
			} while (opt == 'y');
		} catch (

		Exception err) {
			System.out.println(err);
		}
	}

}

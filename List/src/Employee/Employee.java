package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	List<Integer> listId = new ArrayList<Integer>();
	List<String> listName = new ArrayList<String>();
	List<Double> listSalary = new ArrayList<Double>();

	public Employee() {

	}

	public void increaseSalary(Double percentage) {

		this.salary = listSalary.get(id);

		this.salary += salary * ((double) percentage / 100);

		listSalary.add(id, salary);

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void notnullList() {
		List<Integer> resultId = listId.stream().filter(id -> id != null).collect(Collectors.toList());
		List<String> resultName = listName.stream().filter(id -> id != null).collect(Collectors.toList());
		List<Double> resultSalary = listSalary.stream().filter(id -> id != null).collect(Collectors.toList());

		listId = resultId;
		listName = resultName;
		listSalary = resultSalary;

	}

}

package structural.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria criteriaMale = new CriteriaMale();
		Criteria criteriaFemale = new CriteriaFemale();
		Criteria criteriaSingle = new CriteriaSingle();

		Criteria singleMale = new AndCriteria(criteriaMale, criteriaSingle);
		Criteria singleOrFemale = new OrCriteria(criteriaFemale, criteriaSingle);

		System.out.println("Males: ");
		printPersons(criteriaMale.meetCriteria(persons));

		System.out.println("\nFemales: ");
		printPersons(criteriaFemale.meetCriteria(persons));

		System.out.println("\nSingle Males: ");
		printPersons(singleMale.meetCriteria(persons));

		System.out.println("\nSingle Or Females: ");
		printPersons(singleOrFemale.meetCriteria(persons));

	}

	public static void printPersons(List<Person> persons) {

		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender()
					+ ", Marital Status : " + person.getMaritalStatus() + " ]");
		}
	}

}

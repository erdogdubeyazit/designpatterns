package structural.filter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);

		Set<Person> allPersons = new HashSet<Person>();
		for (Person person : firstCriteriaPersons)
			allPersons.add(person);
		for (Person person : otherCriteriaPersons)
			allPersons.add(person);

		return allPersons.stream().collect(Collectors.toList());
	}

}

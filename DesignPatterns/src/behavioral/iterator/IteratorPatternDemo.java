package behavioral.iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();

		Iterator iterator = nameRepository.getIterator();

		while (iterator.hasNext()) {
			String next = (String) iterator.next();
			System.out.println("Name : " + next);
		}
	}

}

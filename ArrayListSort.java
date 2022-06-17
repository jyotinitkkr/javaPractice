package predictOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListSort {

	public static void main(String[] args) {
		arrayListMethod1();
		arrayListMethod2();
		arrayListMethod3();
		arrayListMethod4();
	}

	public static void arrayListMethod1() {
		String s1 = "zee";
		String s2 = "apple";
		List<String> names = new ArrayList<String>();
		names.add(s1);
		names.add(s2);
		/* names.sort(Comparator.comparing(String::toString)); */
		System.out.println(names);

		/*
		 * This will not compile because the method comparing in the type comparator is
		 * not applicable for the arguments(String::toString)
		 */

	}

	public static void arrayListMethod2() {
		String s1 = "Tesla";
		String s2 = "Kevin";
		List<String> names = new ArrayList<String>();
		names.add(s1);
		names.add(s2);
		Collections.sort(names);
		System.out.println(names);
	}

	public static void arrayListMethod3() {
		String s1 = "Tesla";
		String s2 = "Kevin";
		List<String> names = new ArrayList<String>();
		names.add(s1);
		names.add(s2);
//		names.sort(List.DESCENDING);
		System.out.println(names);
	/*
	 * This will not compile because the method DESCENDING cannot be resolved or it
	 * is not a variable.
	 */
	}
	public static void arrayListMethod4() {
		String s1 = "Tesla";
		String s2 = "Kevin";
		List<String> names = new ArrayList<String>();
		names.add(s1);
		names.add(s2);
//		names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(names);
		/*
		 * Lambda expression's parameter s1 cannot redeclare another local variable
		 * defined in an enclosing scope.
		 */

	}

}

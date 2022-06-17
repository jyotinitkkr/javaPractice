package predictOutput;

/* Predict the output*/

public class StringIsImmutable {

	public static void main(String[] args) {

		String str = "abcde";
		str.trim();
		str.toUpperCase();
		str.substring(3, 4);
		System.out.println(str);
	}

}

/* The output will remain the value of str, because String is immutable */
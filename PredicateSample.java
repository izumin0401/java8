import java.io.IOException;
import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) throws IOException {
		String str = "a";

		Predicate<String> isNull = Predicate.isEqual(null);

		//Predicate<String> judge = s -> "a".equals(s);
		Predicate<String> judge = "a"::equals;

		Predicate<String> judge2 =
		    s -> {
			    if(str.equals("a")) {
					return true;
				} else {
					return false;
				}
			};

		if(isNull.test(str)) {
			System.out.println(str);
		} else if(judge.test(str)) {
			System.out.println(str);
		}
	}
}

import java.util.ArrayList;
import java.util.List;

public class ForeachSample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
	    list.add("a");
	    list.add("b");
	    list.add("c");

	    //拡張for文
	    for (String s : list) {
	        System.out.println(s);
	    }

	    //ラムダ式
	    list.forEach(s -> System.out.println(s));
	}
}

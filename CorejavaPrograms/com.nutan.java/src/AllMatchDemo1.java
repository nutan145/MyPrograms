import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AllMatchDemo1 
{

	public static void main(String[] args) 
	{
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		boolean allMatch = stream.allMatch(n->n>0);
		System.out.println(allMatch);
		
		System.out.println("=========================");
		
		List<Integer> list = Arrays.asList(2,4,6,8,10);
		boolean allEven = list.stream().allMatch(n->n%2==0);
		System.out.println(allEven);
		
		
	}

}

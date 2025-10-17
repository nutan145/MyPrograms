import java.util.Set;
import java.util.TreeSet;

record Product(String productName,Integer ProductId)
{
	
}
public class Practice 
{

	public static void main(String[] args)
	{
		Set<Product> ts=new TreeSet<Product>((p1,p2)->p1.productName().compareTo(p2.productName()));
		ts.add(new Product("Iphone",666));
		ts.add(new Product("samsung",111));
		ts.add(new Product("vivo",222));
		System.out.println(ts);

	}

}

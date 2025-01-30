package inheritence;

public class multilevel_child extends multilevel_intermediate{
 public void print()
 {
	 System.out.println("Multilevel child class");
 
 }
	public static void main(String[] args) {
		multilevel_child obj = new multilevel_child();
		obj.display();
		obj.accept();
		obj.print();

	}

}

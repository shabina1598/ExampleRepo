package inheritence;

public class heirarchial_child1 extends heirarchial_parent {
public void display()
{
	System.out.println("Child class A");
}
	public static void main(String[] args) {
		
		heirarchial_child1 obj = new heirarchial_child1();
		obj.accept();
		obj.display();
	}

}

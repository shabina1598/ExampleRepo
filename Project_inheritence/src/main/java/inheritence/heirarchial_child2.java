package inheritence;

public class heirarchial_child2 extends heirarchial_parent{
public void print()
{
System.out.println("Child class B");
}
	public static void main(String[] args) {
		heirarchial_child2 obj =new heirarchial_child2();
		obj.accept();
		obj.print();
	}

}

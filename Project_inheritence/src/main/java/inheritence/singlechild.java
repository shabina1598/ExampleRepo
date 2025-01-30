package inheritence;

public class singlechild extends parentclass {

	public static void main(String[] args) {
		singlechild obj =new singlechild();
		obj.show();
		obj.display();

	}
	public void show()
	{
		System.out.println("Child class");
	}
}

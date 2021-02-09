package packa;

public class NonSubClass {
	public void accessMyClass()
	{
		MyClass obj = new MyClass();
		obj.publicMethod();
		obj.protectedMethod();
		obj.privateMethod();
	}
}

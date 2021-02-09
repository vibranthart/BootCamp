package packa; //package declaration

import java.lang.System;

public class MyClass {
		public void publicMethod()
		{
			System.out.println("publicMethod() of myClass");
		}
		
		protected void protectedMethod()
		{
			System.out.println("protectedMethod of MyClass");
		}
		
		void defaultMethod()
		{
			System.out.println("defaultMethod of MyClass");
		}
		
		private void privateMethod()
		{
			System.out.println("privateMethod of MyClass");
		}
}

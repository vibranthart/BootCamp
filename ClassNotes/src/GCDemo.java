
class X{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() calling");
	}
}

public class GCDemo {

	public static void main(String[] args) {
		System.out.println("GC is executing...");
		for(int i=0; i<1000000;i++) {
			new X();
			System.gc(); //suggestion to JVM
		}
	}

}

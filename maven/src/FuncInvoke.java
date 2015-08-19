public class FuncInvoke {
	private static final long len = 2500;

	public static void func() {
	}

	public static final void func2() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		FuncInvoke fi = new FuncInvoke();
//		Sdsd sd = new Sdsd();
//		Sdsd.func();
		long start = System.currentTimeMillis();
		for (long i = 0; i < len; i++) {
		}
		System.out.println(System.currentTimeMillis()-start);
		start = System.currentTimeMillis();
		StringBuilder strBuilder = new StringBuilder();
		for (long i = 0; i < len; i++) {
//			FuncInvoke.func2();
			strBuilder.append("Hello");
		}
		System.out.println(System.currentTimeMillis()-start);
		start = System.currentTimeMillis();
		StringBuffer strBuffer = new StringBuffer();
		for (long i = 0; i < len; i++) {
//			FuncInvoke.func();
			strBuffer.append("Hello");
		}
		System.out.println(System.currentTimeMillis()-start);
		start = System.currentTimeMillis();
		String str = "";
		for (long i = 0; i < len; i++) {
			str += "Hello";
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}

class Sdsd extends FuncInvoke{
	
}

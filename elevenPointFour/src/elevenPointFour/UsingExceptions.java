package elevenPointFour;

public class UsingExceptions {
	public static void throwException() throws Exception{
		try {
			System.out.println("Method throwException");
			throw new Exception()	;
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Exception handled in method throwException");
			throw e;
		} finally {
			System.err.println("finally executed in throwException");
		}
	}
	
	public static void doesNoThrow() {
		try {
			System.out.println("Method doesNotThrowException");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		} finally {
			System.err.println("finally executed in doesNotThrowException");
		}
		System.out.println("End od method doesNotTHrowException");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throwException();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Expression handled in main");
		}
		doesNoThrow();
	}

}

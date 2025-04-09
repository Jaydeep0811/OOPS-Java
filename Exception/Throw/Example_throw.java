package Exception.Throw;

/**
 * throw is keyword which is throw exception expicitly 
 */
public class Example_throw {

	public static void main(String[] args) throws Exception {

		int age = 10;

		try {

			if (age < 1) {
				throw new Exception("Age is invalid ");
			} else {
				throw new Exception("Age is valid ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("hiii");
	}

}

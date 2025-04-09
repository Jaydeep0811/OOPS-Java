package Exception.TryCatch;

public class Multi_Catch {

	public static void main(String[] args)  {
		
		try    {
			
			
			int a=1/0;
			System.out.println(a);
			
			Class.forName("java.lang.Object");
			
			String b= "Aboli";
			
			Object obj= b;
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (ClassCastException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

	
class BeginTest {

	public static void main(String[] args)
	{
		Test t = new Test();
		
		System.out.println("Description:"+t.getDescription());
		t.nextQuestion();
		System.out.println("Description:"+t.getDescription());
	}

}

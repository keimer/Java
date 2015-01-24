public class Test {
	private Question[] questions = new Question[2];
	private short active;
	
	
	public Test(){
		int i;
		
		active = 0;
		for (i=0; i < questions.length; i++){
			questions[i] = new Question(active,'a',"What is a Java package and how is it used?");
			active++;
		}
		active = 0;
	}
	
	public short getActive()
	{
		return active;
	}

	public String getDescription()
	{
		return questions[active].getDescription();	
	}

	public short getId()
	{
		return questions[active].getId();
	}

	public char getKey()
	{
		return questions[active].getKey();

	}
	
}

public class Test {
	private Question[] questions = new Question[2];
	private short active;
	
	
	public Test(){
		int i;
		String description;
		String[] op = String[3];

		description = "Which of the following are valid Java comments?";
		op[0] = "A. \\ This is a comment.";
		op[1] = "B. /* This is a comment. */";
		op[2] = "C. /** This is a comment. */";
		op[3] = "D. \* This is a comment *\";

		active = 0;
		for (i=0; i < questions.length; i++){
			questions[i] = new Question(active,'a',description, op);
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

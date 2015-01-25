public class Test {
	private Question[] questions = new Question[2];
	private short active;
	
	
	public Test(){
		int i;
		String description;
		String[] op = new String[5];

		//load data questions
		description = "Which of the following are valid Java comments?";
		op[0] = "A. \\ This is a comment.";
		op[1] = "B. /* This is a comment. */";
		op[2] = "C. /** This is a comment. */";
		op[3] = "D. \\* This is a comment *\\";
		questions[0] = new Question(active,'a',description, op);


		description = "Which declares an abstract method in an abstract Java class?";
		op[0] = "A. public abstract method();";
		op[1] = "B. public abstract void method();";
		op[2] = "C. public void abstract Method();";
		op[3] = "D. public void method() {abstract;}";
		op[4] = "E. public abstract void method() {}";
		questions[1] = new Question(active,'a',description, op);


		/*
		for (i=0; i < questions.length; i++){
			questions[i] = new Question(active,'a',description, op);
			active++;
		}*/
		
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

	public void nextQuestion()
	{
		if (active != questions.length - 1)		
			active++;
	}

	public void backQuestion()
	{
		if (active != 0)
			active--;
	}
	
}

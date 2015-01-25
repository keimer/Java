/*
	Programming to a program that certified Java
	
*/
public class Question {
	
	private short id;	
	private char key;
	private String description;
	private String[] options = new String[4];
	

	public Question(short i, char k, String d, String[] o){
		id = i;
		key = k;
		description = d;

		for (int j=0; j < 4; j++)
		{
			options[j] = o[j];
		}
	} 

	public void setDescription(String d){
		description = d;
	}
	
	public String getDescription(){
		return description;
	}

	public void setKey(char k){
		key = k;
	}

	public char getKey(){
		return key;
	}

	public void setId(short i){
		id = i;
	}

	public short getId(){
		return id;
	}

	
}

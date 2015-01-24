/*
	Programming to a program that certified Java
	
*/
public class Question {
	
	private short id;	
	private char key;
	private String description;
	private String[] options = new String[3];
	

	public Question(short i, char k, String d, String[] o){
		id = i;
		key = k;
		description = d;
		for (i=0; i < o.length; i++)
		{
			options[i] = o[i];
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

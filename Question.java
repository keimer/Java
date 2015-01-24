/*
	Programming to a program that certified Java
	
*/
public class Question {
	
	private short id;	
	private char key;
	private String description;

	public Question(short i, char k, String d){
		id = i;
		key = k;
		description = d;
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

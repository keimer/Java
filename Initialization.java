/*
	Listing 2.2: The Initialization Program

*/
class Initialization {
	boolean bo; //true or false
	byte by;      // 8 bit
	char c;       // 16 bit
	short s;      // 16 bit
	int i;           // 32 bit
	long l;        // 64 bit
	float f;         // 32 bit
	double d;    // 64 bit 
	
	Object o;
	
	public static void main(String[] args) {
		Initialization app=new Initialization();
		app.run();
	}
	
	void run() {
		int[] intArray = new int[2];
		
		Object[] objectArray = new Object[2];
		System.out.println("boolean: "+bo);
		System.out.println("byte: "+by);
		System.out.println("char:"+c);
		System.out.println("short:"+s);
		System.out.println("int:"+i);
		System.out.println("long:"+l);
		System.out.println("float:"+f);
		System.out.println("double:"+d);
		
		System.out.println("Object: "+o);
		System.out.println("int[2]: "+intArray[0]+" "+intArray[1]);
		
		System.out.println("Object[2]: "+objectArray[0]+" "+objectArray[1]);
		
		
		
	
	}
	
}
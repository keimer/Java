/*
* Listing 2.1 The Argstest program
*/
class ArgsTest {
	public static void main(String args[]){
		for(int i=0; i < args.length;++i){
			System.out.println("args["+i+"] = "+args[i]);
		}
	}
}
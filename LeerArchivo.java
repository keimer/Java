import java.io.*;

class LeerArchivo{
	
	public static void main(String[] args)
	{
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String delimiter=""; 

		if (args.length == 0){
			System.out.println("Especifique un archivo por favor!");
			return;
		}  		
		try {		
			archivo = new File(args[0]);
		
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea;
			String delimeter = "\t";
			String[] fields;

			
			while ((linea = br.readLine()) != null)
			{
				System.out.println(linea);
				fields = linea.split(delimeter);
				for (int i = 0;i < fields.length;i++)
				{
					System.out.println(fields[i]);					
				}
				System.out.println("\n");
			} 
		
			} //end try			
			catch (Exception e) {
				e.printStackTrace();
			
			} //end catch			
			finally{
				try{
					if(fr != null){
						fr.close();
					} //end if
				} //end try
				catch (Exception e2)
				{
					e2.printStackTrace();
				} //end catch
			} //end finally
	} //end method main
} //end class 

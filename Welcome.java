//import java.applet.Applet;
import java.awt.Graphics;

/* Clase para una Applet - WEB
public class Welcome extends Applet{
	public void mostrar (Graphics g){
		g.drawString("Bienvenidos a Java", 25, 25);
	}

}*/

/* Clase para una aplicación */
class Welcome {
	public static void main (String[] args){
			/*Graphics Obj = new Graphics();
			Mostrar(Obj);*/
			int Result = 0;
			int i = 5;
			Result = Multiplicar(i);
			System.out.println("Resultado: " + i);
			System.out.println("Otra linea");
	}
	//metodo "mostrar"
	/*public static int Mostrar (Graphics g){
		g.drawString("Teste muestra en pantalla", 25, 25);
	}*/
	public static int Multiplicar (int g){
		g = g * 2;
		return g;
	}
}

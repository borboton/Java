package local.vista;


public class Test3 {

	public static void main(String[] args) {

		int i = 0 ;
		String saludos [] = {
				"hola mundo!", 
				"hola planetas", 
				"hola otra galaxia",
				
		};

		while (i <4 ); { 
			try
			{	
				System.out.println(saludos[i]);
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("Algo salio mal: "+e.toString());
			}
			finally 
			{
				System.out.println("Esto siempre se ejutaras");
			}
			i++;
		}




	}

}

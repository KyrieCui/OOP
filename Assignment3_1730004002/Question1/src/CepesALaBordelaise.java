
public class CepesALaBordelaise extends BoletusEdulis {
	public CepesALaBordelaise() {
		super("brown",500);
	}	//the constructor with brown color and 500 price
	public static void testCepesALaBordelaise() {
		 CepesALaBordelaise c=new  CepesALaBordelaise();	//create a  CepesALaBordelaise object to test
		 System.out.println(c.getColor()=="brown");
		 System.out.println(c.getPrice()==500);
		 System.out.println(c.isEdible()==true);
	}
}

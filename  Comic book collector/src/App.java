import javax.swing.text.html.parser.ParserDelegator;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //Instacia de la clase Comic, con tres objetos
        Comic comic1 = new Comic();
        Comic comic2= new Comic();
        Comic comic3=new Comic();

        //Instancia de la clase cliente con tres objetos
        Cliente cliente=new Cliente();
        Cliente cliente2=new Cliente();
        Cliente cliente3=new Cliente();
        cliente.nombre="Uayeb";
        cliente2.nombre="Scarlett Johansson";
        cliente3.nombre="Sarody Castillo";


        //Informacion objeto 1
        comic1.nombre = "Amazing Fantasy";
        comic1.ano = "1962";
        comic1.edicion = "1era Edicion";
        comic1.editorial = "Marvel";

        //Informacion objeto 2
        comic2.nombre = "Batman";
        comic2.ano = "1939";
        comic2.edicion = "1era Edicion";
        comic2.editorial = "DC Comic";

        //Informacion objeto 3
        comic3.nombre = "Flash";
        comic3.ano = "1940";
        comic3.edicion = "1era Edicion";
        comic3.editorial = "DC Comic";

        Comic[] mis_libros=new Comic[3];
        mis_libros[0]=comic1;
        mis_libros[1]=comic2;
        mis_libros[2]=comic3;

        //cliente.libros.add(comic1);

        System.out.println("Nombre: "+comic1.nombre+"\n"
                +"Año de lansamiento: "+comic1.ano+"\n"
                +"Numero de Edicion: "+comic1.edicion+"\n"
                + "Editorial: "+comic1.editorial+"\n"+"CLiente: "+cliente.nombre);

        System.out.println("******************************************************");

        System.out.println("Nombre: "+comic2.nombre+"\n"
                +"Año de lansamiento: "+comic2.ano+"\n"
                +"Numero de Edicion: "+comic2.edicion+"\n"
                + "Editorial: "+comic2.editorial+"\n"+"CLiente: "+cliente2.nombre);

        System.out.println("******************************************************");

        System.out.println("Nombre: "+comic3.nombre+"\n"
                +"Año de lansamiento: "+comic3.ano+"\n"
                +"Numero de Edicion: "+comic3.edicion+"\n"
                + "Editorial: "+comic3.editorial+"\n"+"CLiente: "+cliente3.nombre);
    }

}

class Comic{
    String nombre;
    String edicion;
    String editorial;
    String ano;


 }

class Cliente
{
    String nombre;
    List<Comic>libros;
    public Cliente()
    {
        this.libros=new ArrayList<Comic>();
    }
}

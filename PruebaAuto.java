import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaAuto {
    public static void main(String[] args) throws IOException {
        //Crea un espacio en la memoria para el constructor con un objeto, esto es instanciar, los objetos se declaran
        //con minuscula
        Automovil auto = new Automovil("BMW");
        //otra forma de mandar datos es usando constructores con parametros, ya no se necesitaria el setMarca
        //auto.setMarca("BMW");
        auto.setModelo("i320");
        auto.setColor("Blanco"); //polimorfismo
        auto.setCilindraje(3.2);


        System.out.println(auto.detalleauto());

        System.out.println(auto.acelerar());
        System.out.println(auto.frenar(80));
        System.out.println(auto.capacidadTanque(40, 0.7f)); // el f es para que sepa que es flotante
        System.out.println(auto.capacidadTanque(40, 70f));



        //auto.detalleauto();
        //si no instancio no aparece el metodo

        Automovil mb = new Automovil("MB", "C250");
        //mb.setMarca("Mercedes Benz");
        //mb.setModelo("C200");
        mb.setColor("Gris");//polimorfismo
        mb.setCilindraje(2.5);
        //mb.detalleauto();
        System.out.println(mb.detalleauto());
        //solo instanciando aparecen los atributos

        System.out.println(auto.equals(mb));




        Automovil toyota = new Automovil("Toyota", "Fortuner", "Negro", 3);
        //este constructor llama a los que tienen los valores como parametros
        System.out.println(toyota.detalleauto());
        System.out.println("toyota.getMarca() = " + toyota.getMarca());




        Automovil coro = new Automovil();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        JOptionPane.showInputDialog("Marca: ");

        String var1;
        System.out.println("Modelo: ");
        var1 = br.readLine(); //br.readLine() captura el texto que el usuario introduce en la consola y lo guarda en var1.
        System.out.println("");
        coro.setModelo(var1);
        System.out.println("El modelo es: " + var1);


        int var2;
        System.out.println("Cilindraje: ");
        var2 = Integer.parseInt(br.readLine());
        System.out.println("");
        coro.setModelo(String.valueOf(var2));
        System.out.println("Cilindraje es: " + var2);


        String var3;
        System.out.println("Color: ");
        var3 = br.readLine();
        coro.setColor(var3);
        JOptionPane.showMessageDialog(null, "El color es: " + coro.getColor());
    }
}
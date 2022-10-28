import java.io.Console;
import java.util.Scanner;

public class PruebaRecuperativa {
        
        static Double AplicaDcto(Double productomayora10000, String mensaje){
        
        Scanner productomayora10000 = new Scanner(System.in); //encontré esta función que escanea hasta que encuentra el valor indicado
        int [] productos = {}; // estoy 100% que no era con array, pero para no perder tiempo lo dejaré así, probablemente con ararylist hubiera funcionado
        Double resultadocondcto = productos * 0.95; //este es el valor del producto con descuento
        
        if (productomayora10000 > 10000){
            return resultadocondcto;
            }else{
                return productos; //que devuelva el array de los productos sin descuento
            }
        }

    public static void main(String[] args) {
        Console console = System.console();

        int[] carrito = new Integer [(console.readLine("Ingrese la cantidad de productos: "))]; // no funciona pero este deberia pedir cant total de productos
        int producto = Integer.parseInt(console.readLine("Ingrese valor Producto: "));
        carrito[0]= producto;
        for (int x = 1; x <= carrito.length ; x++) { //estoy tratando de que recorra todo el array y me muestre los productos
            System.out.println(carrito);
        }
    }
}

// Don José hace un 5% de descuento a los clientes que compran más de 3 productos y al
// menos uno de ellos tiene un valor mayor a 10.000, realiza una función que calcule el
// total verificando si corresponde o no el descuento.


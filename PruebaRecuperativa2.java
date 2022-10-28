

public class PruebaRecuperativa2 {
    static int arr[] = {200, 5500, 900, 7000, 500,300}; //esta opción permite indicar los valores al comienzo
    static int numeromasgrande() //creamos un entero que corresponda al n° mas grande
    {
        int x; //creamos el entero x para definirlo antes de iterarlo
        int inicio = arr[0]; //n° de la posición inicial del array
        for (x = 1; x < arr.length; x++) //iteramos en el array según el parámetro x
            if (arr[x] > inicio)// si el parámetro x es mayor al n° de la posición inicial se procede iterar hasta la sgte posicion del array
            inicio = arr[x]; // aquí definimos que inicio corresponde a donde la posición x pare en la iteración más grande
        return inicio; // ante encontrar el n° mas grande devuelve el array
    }

    public static void main(String[] args) {
        
        System.out.println("El número mas grande del array es: " + numeromasgrande());
        }
}


// //Dado el siguiente arreglo [200,5500,900,7000,500,300] con los valores de cada
// producto
// ○ Crea una función que retorne el valor del producto más costoso.
// ○ Crea una función que retorne el valor del producto menos costoso.




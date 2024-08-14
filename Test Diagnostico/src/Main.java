import java.util.*;
public class Main {

    public static void main(String[] args) {
        boolean salir = true;
        while(salir) {
            int seleccionada = menu();
            //Unos amigos de Ing. Inf me explicaron como utilizar el switch, debido a que en java no existe el "elif" como en python.
            // La flecha "->" que va despues del valor es para que se cierre el switch una vez termine lo que esta al interior, se puede lograr lo mismo simplemente poniendo break luego del llamado al metodo.
            //Algo a mencionar que si me lo puede dejar como comentario en la entrega lo agradeceria, es sobre si son necesarias las llaves en cada caso, me mencionaron que son para que quede mas ordenado y facil de leer donde inicia y termina un caso, pero me quede con la duda de si son obligatorias.
            switch (seleccionada){
                case 1 ->
                        invertirfrase();
                case 2 ->
                        calcular();
                case 3,4 ->
                        wip();
                /*case 4 ->
                  wip();*/
                case 5 ->
                        salir = false;
            }
        }
    }
    //Menu
    public static int menu() {
        int seleccion;
        Scanner input = new Scanner(System.in);
        System.out.println("---Menu de seleccion---");
        System.out.println("1) Invertir una frase");
        System.out.println("2) Calcular la suma de todos los numeros pares de un arreglo de enteros");
        System.out.println("3) Calcular promedio de una asignatura");
        System.out.println("4) Simulacro de creditos de consumo");
        System.out.println("5) Salir");
        System.out.println();
        System.out.print("Selecciona una opcion: ");
        seleccion = input.nextInt();
        return seleccion;
    }
    //Metodos para lograr invertir los caracteres de una frase
    public static void invertirfrase() {
        String frase = leerfrase();
        String fraseinv = invertir(frase);
        System.out.println("La frase introducida ha sido: " + frase);
        System.out.println("La frase con orden inverso es: " + fraseinv);
    }
    public static String invertir(String frase) {
        int letras = frase.length();
        StringBuilder fraseinv = new StringBuilder();
        for (int i = letras - 1; i >= 0; i--) {
            fraseinv.append(frase.charAt(i));
        }
        return fraseinv.toString();
    }
    public static String leerfrase() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        leer.close();
        return leer.nextLine();
    }

    //Aca Inician los metodos para calcular la suma de los pares
    public static void calcular() {
        int numero = leernumero();
        int suma = calcsuma(numero);
        System.out.println("El numero introducido ha sido: " + numero);
        System.out.println("La suma de los pares es igual a: " + suma);
    }
    public static int leernumero() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        return leer.nextInt();
    }
    public  static int calcsuma(int numero) {
        int suma = 0;
        for (int i = 0; i <= numero; i += 2) {
            suma += i;
        }
        return suma;
    }
    //Aca inician los metodos para el calculo del promedio
    //No fui capaz de ejecutar correctamente las listas, asi que considerando que esto es un test diagnostico lo dejare hasta aqui.
    //Seguire investigando para hacer funcionar esto.
    /*
    public static void calcular_promedio() {
        List<Float> cantidad_notas = leernotas();
    }
    public static float leernotas() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Cuantas notas vas a introducir: ");
        int cantidad = leer.nextInt();
        int i = 0;
        List<Float> notas = new ArrayList<Float>();
        while(i < cantidad) {
            System.out.print("Introduce una nota: ");
            notas.add(leer.nextFloat());
            i++;
        }
        return notas;
    }
    */
    public static void wip() {
        System.out.println("Este codigo no esta listo, o no lo he hecho.");
        System.out.println("Este mensaje es porque queria tener el menu completo y probar como funcionaba la funcion switch");
    }
}

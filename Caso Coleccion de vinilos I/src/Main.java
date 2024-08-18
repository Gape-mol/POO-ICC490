import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        String vinilos[][] = new String[100][3];

        agregarVinilo(vinilos, "Iron Maiden", "Iron Maiden", "1980");
        agregarVinilo(vinilos, "Iron Maiden", "Killers", "1981");
        agregarVinilo(vinilos, "Iron Maiden", "The number of the beast", "1982");
        agregarVinilo(vinilos, "AC-DC", "Back in black", "1980");
        agregarVinilo(vinilos, "AC-DC", "Highway to Hell", "1986");
        agregarVinilo(vinilos, "AC-DC", "Who made who", "1980");
        agregarVinilo(vinilos, "Judas Priest", "British steel", "1980");
        agregarVinilo(vinilos, "Judas Priest", "Painkiller", "1990");
        agregarVinilo(vinilos, "Judas Priest", "Defenders of the faith", "1990");
        agregarVinilo(vinilos, "Kiss", "Destroyer", "1976");

        System.out.println("Espacio maximo coleccion: " + vinilos.length);

        mostrarTotal(vinilos);
        mostrarDisponibles(vinilos);

        String artista = "AC-DC";
        System.out.println("Buscar artista: " + artista);
        mostrarBusquedaArtista(vinilos, artista);

        buscarArtista(vinilos,artista);
        mostrarColeccion(vinilos);

    }


    public static int totalVinilos(String m[][]){
            int total = 0; //Establezco el total en 0
            for(int i = 0; i < m.length; i++) //Utilizo un for que comienza desde 0, hasta el largo de la matriz "m"
                if(m[i] != null) //Si el valor en la matriz es diferente de "null", es decir un espacio vacio suma 1 al total
                    total++;
        return total;
    }

    public static String[][] agregarVinilo(String m[][], String gru, String lp, String agno){
        for (int i = 0; i < m.length; i++) { //Al igual que en el metodo anterior se utiliza un for que comienza desde 0, hasta el largo de la matriz "m"
            if (m[i][0] == null){ //Se comprueba si la fila es vacia y en caso de que sea verdad, se rellena con el artista, nombre y año.
                    m[i][0] = gru; //Estoy casi seguro de que esto se puede resumir con otro for en en j desde 0 a 2, pero me daba errores cuando lo hice, asi que despues con el codigo mas listo lo volvere a intentar
                    m[i][1] = lp;
                    m[i][2] = agno;
                    break;
            }
        }
        return m;
    }

    public static boolean buscarArtista(String m[][], String artista){
        for (int i = 0; i < m.length; i++) { //Lo mismo que en las anteriores
            if (m[i][0] != null && m[i][0].equals(artista)){ // Aca en este if, hago dos comprobaciones, que el espacio donde va el artista no este vacio, y luego que ese espacio sea igual al nombre del artista dado.
                return true;
            }
        }
        return false;
    }
    public static void mostrarColeccion(String m[][]){
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] != null) {
                System.out.println("Artista:" + m[i][0]);
                System.out.println("lp:" + m[i][1]);
                System.out.println("Año:" + m[i][2]);
            }
        }
    }

    public static void  mostrarTotal(String m[][]){
        System.out.println("El total en tu coleccion es: " + totalVinilos(m));
    }

    public static void mostrarDisponibles(String m[][]) {
        int disponibles = disponibles(m);
        System.out.println("Cantidad disponible: " + disponibles); //Se llama a la funcion disponibles y se imprime la cantidad
    }

    public  static int disponibles(String m[][]){
        int cantidad = 0;
        for (int i = 0; i < m.length; i++){
            if(m[i][0] == null){ //Se busca por toda la lista las filas cuyo nombre de artista este vacio, esto se considerara un espacio libre y se sumara a la cuenta.
                cantidad++;
            }
        }
        return cantidad;
    }
    public static void mostrarBusquedaArtista(String m[][], String artista){
        for (int i = 0; i < m.length; i++) { //Lo mismo que en las anteriores
            if (m[i][0] != null && m[i][0].equals(artista)){ // Este if es igual al de buscar artista
                System.out.println("lp:" + m[i][1]);
                System.out.println("Año:" + m[i][2]);
            }
        }
    }
}
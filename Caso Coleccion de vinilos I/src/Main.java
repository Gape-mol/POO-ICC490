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
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] == null){
                    m[i][0] = gru;
                    m[i][1] = lp;
                    m[i][2] = agno;
            }
        }
        return m;
    }

    public static boolean buscarArtista(String m[][], String artista){
        boolean existe = false;
        for (int i = 0; i < m.length; i++) {
            if (m[i][0] != null && m[i][0].equals(artista)){
                existe = true;
                break;
            }
        }
        return existe;
    }
    public static void mostrarColeccion(String m[][]){

    }

    public static void  mostrarTotal(String m[][]){

    }

    public static void mostrarDisponibles(String m[][]) {
        int disponibles = disponibles(m);
        System.out.println("Cantidad disponible: " + disponibles);
    }
    public  static int disponibles(String m[][]){
        int cantidad = 0;
        for (int i = 0; i < m.length; i++){
            if(m[i][0] == null){
                cantidad++;
            }
        }
        return cantidad;
    }
    public static void mostrarBusquedaArtista(String m[][], String artista){

    }
}
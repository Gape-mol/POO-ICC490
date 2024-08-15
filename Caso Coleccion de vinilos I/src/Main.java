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
            int total = 0;
            for(int i = 0; i < m.length; i++)
                if(m[i] != null)
                    total++;
        return total;
    }

    public static String[][] agregarVinilo(String m[][], String gru, String lp, String agno){
        if (m.length < 100) {
            for (int i = 0; i < 100; i++) {
                m[i][0] = gru;
                m[i][1] = lp;
                m[i][2] = agno;
            }
        }
        return m;
    }

    public static boolean buscarArtista(String m[][], String artista){
        int rows = m.length;
        for(i < )
    }
    public static void mostrarColeccion(String m[][]){

    }

    public static void  mostrarTotal(String m[][]){

    }

    public static void mostrarDisponibles(String m[][]) {

    }
    public  static int disponibles(String m[][]){

    }
    public static void mostrarBusquedaArtista(String m[][], String artista){

    }
}
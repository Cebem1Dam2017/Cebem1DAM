public class NombreBee {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String nombre = "Bee Ctown";
        int longitud;
        int reves;


        System.out.println("Mi nombre es " + nombre);

        longitud = nombre.length();
        System.out.println(longitud + " es el número de caracteres que tiene mi nombre");

        System.out.println(nombre.toUpperCase()+" es mi nombre en mayúsculas");

        for (reves = longitud; reves > 0; reves--) {
            sb.append(nombre.charAt(reves - 1));

        }
        System.out.println(sb.toString()+" es mi nombre al revés");

    }
}

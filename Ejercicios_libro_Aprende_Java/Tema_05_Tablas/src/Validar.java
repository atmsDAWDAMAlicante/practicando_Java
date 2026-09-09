public class Validar {

    public static int validar (String entrada){
        int valor = 0;
        try{
            valor = Integer.parseInt(entrada);
            return valor;
        }
        catch(NumberFormatException e){
            return -1;
        }
    }


}

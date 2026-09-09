import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class View {

    ArrayList<String> menu = new ArrayList<>("Uno","Dos");
    List<String>menu2 = new List<>();
    menu2.List.of("Uno","Dos");

    public static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    public static String entrada(){
        Scanner sc = new Scanner(System.in);
        //String texto = sc.nextLine();
        //sc.close();
        return sc.nextLine();
    }


}

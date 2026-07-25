
import java.util.Scanner;

/* Enunciado:
7.1. Diseñar la clase CuentaCorriente, sabiendo que los datos necesarios son: saldo, límite de descubierto, nombre y DNI del titular.
Las operaciones típicas con una cuenta corriente son:
a) Crear la cuenta: se necesita el nombre y DNI del titular. El saldo inicial será O y el límite de descubierto será de -50 euros.
b) Sacar dinero: solo se podrá sacar dinero hasta el límite de descubierto.
El método debe indicar si ha sido posible llevar a cabo la operación.
c) Ingresar dinero: se incrementa el saldo.
d) Mostrar información: muestra la información disponible de la cuenta corriente.
*/


public class Ejercicio01Clases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaCorriente cc = new CuentaCorriente("Pepe", "21222121S");
        double cantidad = -1;
        do {
            try {
                System.out.println("Introduzca una cantidad a sacar:");
                cantidad = sc.nextDouble();
                cc.sacarDinero(cantidad);
            } catch (Exception e) {
                System.out.println(e);
                cantidad = 0;
                System.out.println("Fin del programa");
            }
        } while (cantidad != 0);
    }
}

class CuentaCorriente{
    private double saldo = 0;
    private double limiteDeDescubierto = -50;
    private String nombre;
    private String DNI;

    public CuentaCorriente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public CuentaCorriente(double saldo, double limiteDeDescubierto, String nombre, String DNI) {
        this.saldo = saldo;
        this.limiteDeDescubierto = limiteDeDescubierto;
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double cantidad) {
        double saldoProvisional = this.saldo - cantidad;
        if (saldoProvisional < this.limiteDeDescubierto){
            System.out.println("No ha sido posible realizar la operación");
        }
        else {
            this.saldo -= cantidad;
            System.out.println("Su saldo es: " + this.saldo);
        }
    }

    public double getLimiteDeDescubierto() {
        return limiteDeDescubierto;
    }

    public void setLimiteDeDescubierto(double limiteDeDescubierto) {
        this.limiteDeDescubierto = limiteDeDescubierto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void sacarDinero(double cantidad){
        setSaldo(cantidad);
    }




}

import java.util.Scanner;
public class PrinicpalBicho{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Desea iniciar el juego?");
        String respuesta = scan.next();
        if(respuesta.equalsIgnoreCase("no")){
            System.out.println("Fin del juego");
        }else if(respuesta.equalsIgnoreCase("si")){
           Bicho.instanciarBichos(Bicho.arreglo);
           while(Bicho.vivos() == true){
               Bicho.mostrarTablero();
               System.out.println("¿A que posición desea disparar?");
               System.out.println("ingrese dos numeros (Columna y fila) presionando enter entre ellos");
               int columna = scan.nextInt();
               int fila = scan.nextInt();
               Bicho.disparo(columna,fila);
               System.out.println("Su disparo ha sido un exito.");
           }
           System.out.println("Felicitaciones!!!");
           System.out.println("Usted ha asesinado a todos los bichos.");
           System.out.println("Fin del juego");
        }
    }
}

package paquete1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean banderError1;
        do {
            try {
                Interfaz.menu_principal();
                int opcion_1 = entrada.nextInt();
                if (opcion_1 < 1 || opcion_1 > 4){
                    Interfaz.manejoErrores(2);
                    entrada.nextLine();
                }else{
                    entrada.nextLine();
                    banderError1 = false;
                }
            } catch (InputMismatchException e) {
                Interfaz.manejoErrores(1);
                entrada.nextLine();
            }
            banderError1 = false;
        } while (banderError1 == true);
    }
}

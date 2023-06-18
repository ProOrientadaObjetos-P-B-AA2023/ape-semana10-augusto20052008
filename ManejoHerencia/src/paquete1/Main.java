package paquete1;

import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.InstitucionEducativa;
import paquete4.PrestamoEducativo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Prestamo> ListaPrestamos = new ArrayList<>();
        boolean bandera_1 = true;
        boolean banderError1 = true;
        boolean banderError2 = true;
        int opcion_1 = -1;

        do {
            /*Inicio del programa*/
            do {
                try {
                    Interfaz.menu_principal();
                    opcion_1 = entrada.nextInt();
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
            } while (banderError1);

            switch (opcion_1) {
                case 1 -> {
                    Interfaz.ingreso1();
                    //Se crea el ub Objeto Persona para el beneficiario
                    String nombre;
                    String apellido;
                    String userName;
                    System.out.println("DATOS BENEFICIARIO (Persona que desea realizar el prestamo)");
                    System.out.print("Nombres: ");
                    nombre = entrada.nextLine();
                    System.out.print("Apellidos: ");
                    apellido = entrada.nextLine();
                    System.out.print("Username: ");
                    userName = entrada.nextLine();
                    Persona beneficiario = new Persona(nombre, apellido, userName);
                    int meses = 0;
                    String ciudad;
                    do {
                        try {
                            System.out.print("Ingrese el Tiempo de prestamo en meses: ");
                            meses = entrada.nextInt();
                            entrada.nextLine();
                            if (meses < 0) {
                                Interfaz.manejoErrores(3);
                            } else {
                                banderError2 = false;
                            }
                        } catch (InputMismatchException e) {
                            Interfaz.manejoErrores(1);
                            entrada.nextLine();
                        }
                    } while (banderError2);
                    banderError2 = true;
                    System.out.print("Ingrese la Ciudad del prestamo: ");
                    ciudad = entrada.nextLine();
                    String nombreG;
                    String apellidoG;
                    String userNameG;
                    //Se crea el ub Objeto Persona para el Garante
                    System.out.println("DATOS DEL GARANTE");
                    System.out.print("Nombres: ");
                    nombreG = entrada.nextLine();
                    System.out.print("Apellidos: ");
                    apellidoG = entrada.nextLine();
                    System.out.print("Username: ");
                    userNameG = entrada.nextLine();
                    Persona garante = new Persona(nombreG, apellidoG, userNameG);
                    String tipoAutomovil;
                    String marcaAutomovil;
                    double valorAutomovil;
                    System.out.println("DATOS DEL AUTOMOVIL");
                    System.out.print("Tipo: ");
                    tipoAutomovil = entrada.nextLine();
                    System.out.print("Marca :");
                    marcaAutomovil = entrada.nextLine();
                    do {
                        try {
                            System.out.print("Valor del Automovil: ");
                            valorAutomovil = entrada.nextDouble();
                            if (valorAutomovil < 0) {
                                Interfaz.manejoErrores(3);
                            } else {
                                banderError2 = false;
                                //Por ultimo el tipo de letra para ciudad
                                //Y aqui creamos el objeto de la subclase PrestamoAutomovil
                                PrestamoAutomovil prestamoAutomovil1 =
                                        new PrestamoAutomovil(beneficiario, meses, ciudad, 1, tipoAutomovil
                                                , marcaAutomovil, garante, valorAutomovil);
                                //por ultimo añadimos el objeto a la lista
                                prestamoAutomovil1.calcularValorMensualAuto();
                                ListaPrestamos.add(prestamoAutomovil1);
                            }
                        } catch (InputMismatchException e) {
                            Interfaz.manejoErrores(3);
                            entrada.nextLine();
                        }
                    } while (banderError2);
                }
                case 2 -> {
                    Interfaz.ingreso2();
                    String nombre1;
                    String apellido1;
                    String userName1;
                    System.out.println("DATOS BENEFICIARIO (Persona que desea realizar el prestamo)");
                    System.out.print("Nombres: ");
                    nombre1 = entrada.nextLine();
                    System.out.print("Apellidos: ");
                    apellido1 = entrada.nextLine();
                    System.out.print("Username: ");
                    userName1 = entrada.nextLine();
                    Persona beneficiario1 = new Persona(nombre1, apellido1, userName1);
                    String nivelEstudio;
                    double valorCarrera = 0;
                    System.out.print("Nivel de Estudio: ");
                    nivelEstudio = entrada.nextLine();
                    banderError2 = true;
                    do {
                        try {
                            System.out.print("Valor de la carrera: ");
                            valorCarrera = entrada.nextDouble();
                            entrada.nextLine();
                            if(valorCarrera < 0){
                                Interfaz.manejoErrores(3);
                            }else{
                                banderError2 = false;
                            }
                        } catch (InputMismatchException e) {
                            Interfaz.manejoErrores(1);
                            entrada.nextLine();
                        }
                    } while (banderError2);
                    int meses1 = 0;
                    String ciudad1;
                    banderError2 = true;
                    do {
                        try {
                            System.out.print("Ingrese el Tiempo de prestamo en meses: ");
                            meses1 = entrada.nextInt();
                            entrada.nextLine();
                            if(meses1 < 0){
                                Interfaz.manejoErrores(4);
                            }else{
                                banderError2 = false;
                            }
                        } catch (InputMismatchException e) {
                            Interfaz.manejoErrores(1);
                            entrada.nextLine();
                        }
                    } while (banderError2);
                            
                    System.out.print("Ingrese la Ciudad del prestamo: ");
                    ciudad1 = entrada.nextLine();
                    String nombre2;
                    String siglas;
                    System.out.println("DATOS CENTRO EDUCATIVO");
                    System.out.print("Nombre:");
                    nombre2 = entrada.nextLine();
                    System.out.print("Siglas:");
                    siglas = entrada.nextLine();
                    InstitucionEducativa centroEducativo = new InstitucionEducativa(nombre2, siglas);
                    PrestamoEducativo prestamoEducativo1 = new PrestamoEducativo(beneficiario1,
                            meses1, ciudad1, 2, nivelEstudio, centroEducativo, valorCarrera);
                    prestamoEducativo1.calcularValorMensualCarrera();
                    ListaPrestamos.add(prestamoEducativo1);
                }
                case 3 -> Interfaz.PresentarLista((ArrayList<Prestamo>) ListaPrestamos);
                case 4 -> bandera_1 = false;
            }
        }while(bandera_1);
    }
}

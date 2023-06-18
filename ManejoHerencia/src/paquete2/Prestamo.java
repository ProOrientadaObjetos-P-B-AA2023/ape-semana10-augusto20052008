/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

public class Prestamo {
    public Persona beneficiario;
    public int timePrestamoMeses;
    public String cuidadPrestamo;
    public int tipo;

    public Prestamo() {
    }
    public Prestamo(Persona beneficiario, int timePrestamoMeses, String cuidadPrestamo, int tipo) {
        this.beneficiario = beneficiario;
        this.timePrestamoMeses = timePrestamoMeses;
        this.cuidadPrestamo = cuidadPrestamo;
        this.tipo = tipo;
    }
    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }
    public void setTimePrestamoMeses(int timePrestamoMeses) {
        this.timePrestamoMeses = timePrestamoMeses;
    }
    public void setCuidadPrestamo(String cuidadPrestamo, int tipo) {
        this.cuidadPrestamo = cuidadPrestamo;
    }
    public double getTimePrestamoMeses() {
        return timePrestamoMeses;
    }

    public String getCuidadPrestamo() {
        if(this.tipo == 1) {
            return cuidadPrestamo.toLowerCase();
        }else{
            return cuidadPrestamo.toUpperCase();
        }
    }

    public String toString(){
        String msj = String.format("""
                                    ====BENEFICIARIO====
                                    %s
                                    ====================
                                    Tiempo de prestamo en meses: %s 
                                    Ciudad del prestamo: %s 
                                   """
                ,beneficiario.toString()
                ,this.getTimePrestamoMeses()
                ,this.getCuidadPrestamo());
        return msj;
    }

}

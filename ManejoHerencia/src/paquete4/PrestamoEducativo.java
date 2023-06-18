/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    public String nivelEstudio;
    public InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualCarrera;
    public PrestamoEducativo() {
    }
    public PrestamoEducativo(Persona beneficiario, int timePrestamoMeses, String cuidadPrestamo,int tipo, String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, timePrestamoMeses, cuidadPrestamo, tipo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
    }
    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }
    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }
    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }
    public void calcularValorMensualCarrera(){
        this.valorMensualCarrera = (this.valorCarrera/this.timePrestamoMeses) - (0.1*(this.valorCarrera/this.timePrestamoMeses));
    }
    public String getNivelEstudio() {
        return nivelEstudio;
    }
    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }
    public double getValorCarrera() {
        return valorCarrera;
    }
    public double getValorMensualCarrera() {
        return valorMensualCarrera;
    }

    @Override
    public String toString(){
        String msj = String.format("""

                                   ┌──────────────────────────┐
                                   │    Prestamo Educativo    │
                                   └──────────────────────────┘
                                    %s
                                    Nivel de Estudio: %s 
                                    ====Centro Educativo====
                                    %s
                                    ========================
                                    Valor de la Carrera: %.2f
                                    Valor Mensual de la carrera: %.2f
                                   """
                ,super.toString()
                ,this.getNivelEstudio()
                ,centroEducativo.toString()
                ,this.getValorCarrera()
                ,this.getValorMensualCarrera());
        return msj;
    }

}

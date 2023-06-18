
package paquete3;
import paquete2.Persona;
import paquete2.Prestamo;
public class PrestamoAutomovil extends Prestamo {
    public String tipoAutomovil;
    public String marcaAutomovil;
    public Persona garante;
    private double valorAutomovil;
    private double valorMensualAuto;
    public PrestamoAutomovil() {
    }
    public PrestamoAutomovil(Persona beneficiario, int timePrestamoMeses, String cuidadPrestamo, int tipo, String tipoAutomovil, String marcaAutomovil, Persona garante, double valorAutomovil) {
        super(beneficiario, timePrestamoMeses, cuidadPrestamo, tipo);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante = garante;
        this.valorAutomovil = valorAutomovil;
    }
    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }
    public void setGarante(Persona garante) {
        this.garante = garante;
    }
    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
    }
    public void calcularValorMensualAuto(){
        this.valorMensualAuto = this.valorAutomovil/getTimePrestamoMeses();
    }
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }
    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }
    public Persona getGarante() {
        return garante;
    }
    public double getValorAutomovil() {
        return valorAutomovil;
    }
    public double getValorMensualAuto() {
        return valorMensualAuto;
    }

    @Override
    public String toString(){
        String msj = String.format("""
                               
                                   ┌──────────────────────────┐
                                   │    Prestamo Automovil    │
                                   └──────────────────────────┘
                                    %s
                                    Tipo de automovil: %s 
                                    Marca de automovil: %s 
                                    ====Garante====
                                    %s
                                    ===============
                                    Valor de automovil: %.2f
                                    Valor mensual de pago del prestamo del automovil: %.2f
                                   """
                ,super.toString()
                ,this.getTipoAutomovil()
                ,this.getMarcaAutomovil()
                ,garante.toString()
                ,this.getValorAutomovil()
                ,this.getValorMensualAuto());
        return msj;
    }
}

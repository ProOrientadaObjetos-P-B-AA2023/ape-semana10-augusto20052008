package paquete4;

public class InstitucionEducativa {
    public String nombreIns;
    public String siglas;
    public InstitucionEducativa() {
    }
    public InstitucionEducativa(String nombreIns, String siglas) {
        this.nombreIns = nombreIns;
        this.siglas = siglas;
    }
    public void setNombreIns(String nombreIns) {
        this.nombreIns = nombreIns;
    }
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
    public String getNombreIns() {
        return nombreIns;
    }
    public String getSiglas() {
        return siglas;
    }

    @Override
    public String toString(){
        String msj = String.format(""" 
                                    
                                    Nombres: %s 
                                    Siglas: %s 
                                   """
                ,this.getNombreIns()
                ,this.getSiglas());
        return msj;
    }
}

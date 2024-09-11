package ongSistema;

public class Localidad {
    public String cp;
    public String estado;
    public String municipio;

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    Localidad(String cp, String estado, String municipio){
        this.cp = cp;
        this.municipio = municipio;
        this.estado = estado;
    }
    @Override
    public String toString() {
        return "Localidad [Código Postal=" + cp + ", Municipio=" + municipio + ", Estado=" + estado + "]";
    }
}

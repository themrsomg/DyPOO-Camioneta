package ongSistema;

public class Camioneta {
    public String c;
    public int anio;
    public String marca;
    public String placa;

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Camioneta(String marca, String placa, int anio) {
        this.anio = anio;
        this.marca = marca;
        this.placa = placa;
    }
    @Override
    public String toString() {
        return "Datos del auto: [Marca=" + marca + ", Placa=" + placa + ", Año=" + anio + "]";
    }
}

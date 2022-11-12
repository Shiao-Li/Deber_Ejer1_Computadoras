package Computadoras;

public class laptop {
    String marca, modelo, sistemaOperativo, color;
    int capMemRAM, capAlmacenamiento;

    public laptop(){
        marca = "Lenovo";
        modelo = "IdeaPad";
        sistemaOperativo = "Windows";
        color =  "Negro";

        capMemRAM = 32;
        capAlmacenamiento = 500;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapMemRAM() {
        return capMemRAM;
    }

    public void setCapMemRAM(int capMemRAM) {
        this.capMemRAM = capMemRAM;
    }

    public int getCapAlmacenamiento() {
        return capAlmacenamiento;
    }

    public void setCapAlmacenamiento(int capAlmacenamiento) {
        this.capAlmacenamiento = capAlmacenamiento;
    }

}

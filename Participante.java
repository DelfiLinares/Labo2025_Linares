package masterchef;

import java.time.LocalDate;

public class Participante extends Persona {
    private String localidad;
    private Colores color;

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Colores getColores() {
        return color;
    }

    public void setColores(Colores color) {
        this.color = color;
    }

    public Participante(String localidad, Colores color, String nombre, String apellido, int dni, LocalDate nacimiento){
        super(nombre, apellido, dni, nacimiento);
        this.localidad=localidad;
        this.color=color;
    }

}
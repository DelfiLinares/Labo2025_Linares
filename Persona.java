package masterchef;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate nacimiento;
    private LocalDate antiguedad;

    public Persona(String nombre, String apellido, int dni, LocalDate nacimiento, LocalDate antiguedad) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.nacimiento=nacimiento;
        this.antiguedad=antiguedad;
    }

    public Persona(String nombre, String apellido, int dni, LocalDate nacimiento) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.nacimiento=nacimiento;
        this.antiguedad= LocalDate.now();
    }

    public Persona(){
        this.nombre = "Timbini";
        this.apellido="Lanzini";
        this.dni=9122018;
        this.nacimiento=LocalDate.now();
        this.antiguedad=LocalDate.now();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public LocalDate getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }


    public Period antiguedad() {
        Period calculoAntiguedad = Period.between(antiguedad, LocalDate.now());
        return calculoAntiguedad;
    }
}
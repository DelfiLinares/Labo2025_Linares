package masterchef;

import java.util.HashSet;
import java.time.LocalTime;

public class Plato {
    private String nombre;
    private Tipo tipo;
    private HashSet<Ingrediente> ingredientes;
    private LocalTime tiempoPrep;

    public Plato(String nombre, Tipo tipo, HashSet<Ingrediente> ingredientes, LocalTime tiempoPrep) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
        this.tiempoPrep = tiempoPrep;
    }

    public LocalTime getTiempoPrep() {
    	return tiempoPrep;
    }

    public String getNombre() {
        return nombre;
    } 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    public HashSet<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }


    public boolean esEntrada() {
        return this.tipo == Tipo.ENTRADA;
    }

    public boolean esPrincipal() {
        return this.tipo == Tipo.PRINCIPAL;
    }
}
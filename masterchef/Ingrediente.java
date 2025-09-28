package masterchef;

public class Ingrediente {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ingrediente(String nombre){
        this.nombre=nombre;
    }
}
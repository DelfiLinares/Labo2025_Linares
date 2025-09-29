package MasterChef;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante {
	private HashSet<Ingrediente> ingredProhibidos;

	public Principiante(HashSet<Ingrediente> ingredProhibidos, String localidad, Colores color, String nombre,
			String apellido, int dni, LocalDate nacimiento) {
		super(localidad, color, nombre, apellido, dni, nacimiento);
		this.ingredProhibidos = ingredProhibidos;
	}

	public HashSet<Ingrediente> getIngredProhibidos() {
		return ingredProhibidos;
	}

	public void setIngredProhibidos(HashSet<Ingrediente> ingredProhibidos) {
		this.ingredProhibidos = ingredProhibidos;
	}

    @Override
    public void mensaje(){
        for (Ingrediente aux : ingredProhibidos)
            System.out.println("Ya guarde todos los elementos prohibidos y no voy a usar: " + aux.getNombre());
    }

	public void cocinarPlatoPrincipiante(Plato p1) {
        try {
            if (p1.getTipo() == Tipo.PRINCIPAL) {
                throw new PlatoNoPermitidoException("Los principiantes solamente pueden cocinar entradas.");
        }

        for (Ingrediente ing : p1.getIngredientes()) {
            if (ingredProhibidos.contains(ing)) {
                throw new IngredienteProhibidoException("El ingrediente: " + ing.getNombre() + " está prohibido.");
            }
        }

        System.out.println("Cocinando: " + p1.getNombre());
        System.out.println("Principiante sirve entrada: " + p1.getNombre());
        
	    } catch (IngredienteProhibidoException e) {
	        System.out.println("Error: " + e.getMessage());
	    } catch (PlatoNoPermitidoException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
}

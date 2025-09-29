package MasterChef;

import java.time.LocalDate;

public class Intermedios extends Participante {
	private int stockIngred;

	public Intermedios(int stockIngred, String localidad, Colores color, String nombre, String apellido, int dni,
			LocalDate nacimiento) {
		super(localidad, color, nombre, apellido, dni, nacimiento);
		this.stockIngred = stockIngred;
	}

	public int getStockIngred() {
		return stockIngred;
	}

	public void setStockIngred(int stockIngred) {
		this.stockIngred = stockIngred;
	}

    @Override
    public void mensaje() {
		if (stockIngred > 1) {
			System.out.println("Mi stock a utilizar es de " + stockIngred);
		}
	}

	public void cocinarPlatoIntermedio(Plato p2, Intermedios i1) {
		try {
			if (p2.getTipo() == Tipo.ENTRADA) {
				throw new PlatoNoPermitidoException("Los principiantes solamente pueden cocinar platos principales.");
			}

			if (p2.getIngredientes().size() > i1.stockIngred) {
				throw new IngredientesNoAlcanzanException("El stock es insuficiente para cocinar el plato.");
			}
			
			stockIngred -= p2.getIngredientes().size();
			
			System.out.println("Cocinando: " + p2.getNombre());
			System.out.println("Intermedio sirve plato principal");

		} catch (IngredientesNoAlcanzanException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (PlatoNoPermitidoException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}

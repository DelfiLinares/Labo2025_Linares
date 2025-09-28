package masterchef;

import java.time.LocalDate;
import java.time.LocalTime;

public class Expertos extends Participante {
	private static LocalTime tiempoDePreparacion = LocalTime.of(1, 20);
	private LocalTime tiempoActual = LocalTime.of(1, 20);
	
	public Expertos(String localidad, Colores color, String nombre, String apellido, int dni,
			LocalDate nacimiento) {
		super(localidad, color, nombre, apellido, dni, nacimiento);
	}

	public static LocalTime getTiempoDePreparacion() {
		return tiempoDePreparacion;
	}

	public static void setTiempoDePreparacion(LocalTime tiempoDePreparacion) {
		Expertos.tiempoDePreparacion = tiempoDePreparacion;
	}

	public LocalTime getTiempoActual() {
		return tiempoActual;
	}

	public void setTiempoActual(LocalTime tiempoActual) {
		this.tiempoActual = tiempoActual;
	}

	public void mensajeExperto(Expertos e1) {
		System.out.println(
				"Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + tiempoActual.minusMinutes(5));
		tiempoActual = tiempoActual.minusMinutes(5);
	}

	public void cocinarPlatoExperto(Plato p3, Expertos e1) {
		try {

			if (e1.tiempoActual.compareTo(p3.getTiempoPrep()) > 0) {
				throw new TiempoSuperadoException("El tiempo de preparación no alcanza para cocinar este plato.");
			}
			tiempoActual.minusMinutes(p3.getTiempoPrep().getMinute());
			tiempoActual.minusHours(p3.getTiempoPrep().getHour());
			System.out.println("Cocinando: " + p3.getNombre());
			System.out.println("El experto sirve entrada o plato principal");
		} catch (TiempoSuperadoException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
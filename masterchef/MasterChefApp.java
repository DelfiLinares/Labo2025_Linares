package MasterChef;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class MasterChefApp{
    public static void main(String[] args){
        Ingrediente papa = new Ingrediente("papa");
        Ingrediente zanahoria = new Ingrediente("zanahoria");
        Ingrediente arvejas = new Ingrediente("arvejas");
        Ingrediente mayonesa = new Ingrediente("mayonesa");
        Ingrediente salsa = new Ingrediente("salsa");
        Ingrediente fideos = new Ingrediente("fideos");
        Ingrediente carne = new Ingrediente("carne");
        Ingrediente cebolla = new Ingrediente("cebolla");
        Ingrediente huevo = new Ingrediente("huevo");
        Ingrediente salmon = new Ingrediente("salmon");
        Ingrediente palta = new Ingrediente("palta");

        HashSet<Ingrediente> ingredientes = new HashSet<>();
        ingredientes.add(papa);
        ingredientes.add(zanahoria);
        ingredientes.add(arvejas);
        ingredientes.add(mayonesa);
        HashSet<Ingrediente> ingredientes1 = new HashSet<>();
        ingredientes1.add(salsa);
        ingredientes1.add(fideos);
        HashSet<Ingrediente> ingredientes2 = new HashSet<>();
        ingredientes2.add(carne);
        ingredientes2.add(cebolla);
        ingredientes2.add(huevo);
        HashSet<Ingrediente> ingredProhibidos = new HashSet<>();
        ingredProhibidos.add(salmon);
        ingredProhibidos.add(palta);
        ingredProhibidos.add(papa);

        Plato p1 = new Plato("ensalada rusa", Tipo.ENTRADA, ingredientes, LocalTime.of(0, 30));
        Plato p2 = new Plato("fideos con salsa", Tipo.PRINCIPAL, ingredientes1, LocalTime.of(0, 30));
        Plato p3 = new Plato("empandas de carne", Tipo.ENTRADA, ingredientes2, LocalTime.of(0, 30));

        //LocalTime tiempoActual, String localidad, Colores color, String nombre, String apellido, int dni,
		//LocalDate nacimiento
        
        Intermedios i1 = new Intermedios(20, "Bsas", Colores.AZUL, "Ricardo", "Fort", 56789789, LocalDate.now());
        Expertos e1 = new Expertos("Bsas",Colores.VERDE,"Delfi","Linaresss",47234234,LocalDate.of(2008,6,2));
        Principiante pr1 = new Principiante(ingredProhibidos,"Bsas",Colores.ROJO,"Tobias","Flores",46234987,LocalDate.now());

          pr1.mensaje();
          e1.mensaje();
          i1.mensaje();

          pr1.cocinarPlatoPrincipiante(p1);
          e1.cocinarPlatoExperto(p3, e1);
          i1.cocinarPlatoIntermedio(p2, i1);
    }
}

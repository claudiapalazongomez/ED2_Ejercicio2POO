package es.studium.ejercicio2poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal
{

	public static void main(String[] args)
	{
		Director director1 = new Director("Pedro Almodóvar", LocalDate.of(1949, 9, 25), "español");
		System.out.println(director1.getFechaNacimiento());
		
		//Indicamos el formato que le queremos dar a la fecha
		DateTimeFormatter formatoEuropeo = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		System.out.println(formatoEuropeo.format(LocalDate.of(1949, 9, 25)));
		
		Pelicula pelicula1 = new Pelicula("Madre paralelas", 2021, 130.2f, director1);
		System.out.println("La película de título: " + pelicula1.getTitulo() + " fue dirigida por " + pelicula1.getDirector().getNombre() 
				+ " de nacionalidad " + pelicula1.getDirector().getNacionalidad() + " y fecha de nacimiento " + formatoEuropeo.format(LocalDate.of(1949, 9, 25)) 
				+ ". La fecha y duración es: " + pelicula1.getAnio() + " y " + pelicula1.getDuracion() + " minutos.");
	}

}

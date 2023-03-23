package es.studium.ejercicio2poo;

public class Pelicula
{
	private String titulo;
	private int anio;
	private float duracion;
	private Director director;
	
	public Pelicula()
	{
		titulo = "";
		anio = 0;
		duracion = 0.0f;
		director = new Director();
	}

	public Pelicula(String titulo, int anio, float duracion, Director director)
	{
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
		this.director = director;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public int getAnio()
	{
		return anio;
	}

	public void setAnio(int anio)
	{
		this.anio = anio;
	}

	public float getDuracion()
	{
		return duracion;
	}

	public void setDuracion(float duracion)
	{
		this.duracion = duracion;
	}

	public Director getDirector()
	{
		return director;
	}

	public void setDirector(Director director)
	{
		this.director = director;
	}
	
	
}

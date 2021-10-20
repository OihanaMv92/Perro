package es.studium.perro;

public class Perro
{
	/* atributos  */
	private String raza;
	private String tamanio;
	private int edad;
	private String color;

	/* constructores */

	//constructores por defecto
	public Perro() {
		raza = "";
		tamanio = "";
		edad = 0;
		color = "";
	}


	//constructor con parametros

	public Perro (String r, String t, int e, String c) {
		raza = r;
		tamanio = t;
		edad = e;
		color = c;

	}


	/**
	 * @return the raza
	 */
	public String getRaza()
	{
		return raza;
	}


	/**
	 * @return the tamanio
	 */
	public String getTamanio()
	{
		return tamanio;
	}


	/**
	 * @return the edad
	 */
	public int getEdad()
	{
		return edad;
	}


	/**
	 * @return the color
	 */
	public String getColor()
	{
		return color;
	}


	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza)
	{
		this.raza = raza;
	}


	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(String tamanio)
	{
		this.tamanio = tamanio;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad)
	{
		this.edad = edad;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}
}


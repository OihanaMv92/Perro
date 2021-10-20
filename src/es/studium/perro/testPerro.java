package es.studium.perro;

public class testPerro
{

	public static void main(String[] args)
	{
		Perro p1= new Perro();
		p1.setRaza("Pitbull");
		p1.setTamanio("Grande");
		p1.setEdad(3);
		p1.setColor("Marron");
		
		System.out.println(p1.getRaza());
		System.out.println(p1.getTamanio());
		System.out.println(p1.getEdad());
		System.out.println(p1.getColor());
		
		Perro p2 = new Perro ("Gran danés", "grande", 4, "negro"); // Este no imprime por consola.
		

	}

}

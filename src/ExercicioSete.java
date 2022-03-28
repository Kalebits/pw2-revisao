
public class ExercicioSete {
public static void main(String[] args) {
	double l1 = 5;
	double l2 = 5;
	double l3 = 3;
	
	if(l1 == l2 && l1 == l3)
	{
		System.out.println("Equilátero");
	}else if(l1 == l2 || l2 == l3 || l1 == l3)
	{
		System.out.println("Isósceles");
	}else if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1)
	{
		System.out.println("Escaleno");
	}
		
	
}
}

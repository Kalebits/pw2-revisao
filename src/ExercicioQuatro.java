
public class ExercicioQuatro {
	public static void main(String[] args) {
		int num = 21;
		if (num > 0) {
			if (num % 2 == 0 || num % 3 == 0) {
				if (num != 15) {
					System.out.println("� um n�mero da sorte!");
				}else {
					System.out.println("N�o � da sorte");
				}
			}else {
				System.out.println("N�o � da sorte");
			}
		}
		else {
			System.out.println("N�o � da sorte");
		}
	}
}

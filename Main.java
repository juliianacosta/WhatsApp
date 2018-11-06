import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhatsappService wp = new WhatsappService();
		User user = new User();
		Scanner leitor = new Scanner(System.in);
		String comando;
		
		
		while(true) {
			comando = leitor.nextLine();
			wp.executeQuery(comando);
		}
	}
}

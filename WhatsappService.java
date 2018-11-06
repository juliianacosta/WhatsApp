import java.util.ArrayList;

import javax.swing.JOptionPane;

public class WhatsappService {

	ArrayList<User> listaUser  = new ArrayList<User>();
	ArrayList<Chat> listaChat  = new ArrayList<Chat>();
	User user = new User();
	Chat chat = new Chat();

	public void executeQuery(String line) {

		String comandos[] = line.split(" ");

		switch(comandos[0]) {
		case "addUser":
			this.addUser(comandos[1]);
			System.out.println("Done");
			break;
		case "allUsers":
			this.listUser();
			break;
		case "newChat":
			this.createChat(comandos[1], comandos[2]);
			System.out.println("Done");
			break;
		case "chats":
			user.getListaChat(comandos[1]);
			System.out.println("Done");
			break;
		case "invite":
			this.addByInvite(comandos[1], comandos[2], comandos[3]);
			System.out.println("Done");
			break;
		case "usesr":
			chat.qtdUsers(comandos[1]);
			break;
		case "leave":
			chat.rmUserChat(comandos[1], comandos[2]);
			System.out.println("Done");
			break;
		}	

	}
	public void createChat(String userId, String chatId) {
		boolean ver = true;
		for(Chat chat: listaChat) {
			if(chat.getId().equals(chatId)) {
				System.out.println("Chat ja existente!");
				ver = false;
			}
		}
		if(ver){
			for (User user: listaUser) {
				if(user.getId().equals(userId)) {
					Chat chat = new Chat(chatId, user);
					chat.addUserChat(user);
					user.addChat(chat);
					listaChat.add(chat);
				}
			}
		}
	}	 

	public void addUser(String idUser) {
		boolean ver = false;
		for(User user: listaUser) {
			if(user.getId().equals(idUser)) {
				ver = true;
			}
		}
		if(ver == false) {
			User user = new User(idUser);
			listaUser.add(user);
		}else {
			System.out.println("Usuario ja existente!");
		}
	}

	public void listUser() {
		for(User user : listaUser) {
			System.out.println(user.getId());
		}
	}

	public void addByInvite(String guessUserId,String invitedUserId,String chatId) {
		for(User user: listaUser) {
			if(user.getId().equals(guessUserId)) {
				for(Chat chat : user.listaChat) {
					if(chat.getId().equals(chatId)) {
						User newUser = new User(invitedUserId);
						chat.addUserChat(newUser);						
					}else {
						System.out.println("Usuario não petence ao grupo!");
					}
				}

			}else {
				System.out.println("Usuário nao cadastrado");
			}
		}
	}
}

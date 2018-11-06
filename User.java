import java.util.ArrayList;

public class User {

	public String id;
	public Chat chat;

	ArrayList<Chat> listaChat = new ArrayList<Chat>();

	public User(String id) {
		super();
		this.id = id;
	}
	public User() {	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void getListaChat(String idUser) {
		for(Chat ichat : listaChat) {
			for(User user : chat.listaUser){
				if(user.getId().equals(idUser)) {
					System.out.println(ichat.getId());
				}
			}
		}
	}
	public void addChat(Chat chat){
		this.listaChat.add(chat);
	}

	public String getNotificao(){
		return id;
	}
	public void sendMsg(String idChat, String text) {

	}
}

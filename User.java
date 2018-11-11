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

	public ArrayList<Chat> getListaChat() {
		return listaChat;
	}
	public void setListaChat(ArrayList<Chat> listaChat) {
		this.listaChat = listaChat;
	}
	public void addChat(Chat chat){
		this.listaChat.add(chat);
	}

	public String getNotificao(){
		return id;
	}
	public void sendMsg(String idChat, String text) {
		Msg msg = new Msg(idChat, text);
		chat.deliverZap(msg);
	}
}

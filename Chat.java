import java.util.ArrayList;

public class Chat {

	private String id;
	private User user;
	ArrayList<User> listaUser  = new ArrayList<User>();
	ArrayList<Inbox> listaInbox  = new ArrayList<Inbox>();

	public Chat(String id, User user) {
		super();
		this.id = id;
		this.user = user;
	}
	
	public Chat() {
		
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Inbox> getListaInbox() {
		return listaInbox;
	}

	public void setListaInbox(ArrayList<Inbox> listaInbox) {
		this.listaInbox = listaInbox;
	}
	
	public void qtdUsers(String chatId){
		
		for(User user : listaUser) {
			for(Chat iChat : user.listaChat) {
				if(iChat.getId().equals(chatId)) {
					System.out.println(user.getId());
				}
			}
		}
	}
	
	public String getMsgs(String userId) {

		return userId;
	}
	public Msg deliverZap(Msg msg) {
		return msg;

	}
	public int unreadCount(String userId) {
		return 0;
	}
	public void addUserChat(User newUser) {
		boolean ver = false;

		for (User user : listaUser) {
			if(user.getId().equals(newUser.getId())) {
				System.out.println("Usuario ja esta no grupo");
				ver = true;
			}
		}
		if(ver == false) {
			this.listaUser.add(newUser);
		}
	}

	public void rmUserChat(String userId, String chatId) {
		for(User user : listaUser) {
			for(Chat chat : user.listaChat) {
				if(chat.getId().equals(chatId) && user.getId().equals(userId)) {
					this.user.listaChat.remove(user);
				}
			}
		}
	}
}

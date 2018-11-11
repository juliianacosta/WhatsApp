import java.util.ArrayList;

public class Inbox {

	User user;
	Msg msg;
	ArrayList<Msg> msgs = new ArrayList<Msg>();
	
	public Inbox(User user, Msg msg) {
		super();
		this.user = user;
		this.msg = msg;
	}
	
	public void mtdInbox(Msg msg){
		msgs.add(msg);
	}
}

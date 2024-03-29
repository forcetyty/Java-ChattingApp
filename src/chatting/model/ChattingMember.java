package chatting.model;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChattingMember {

	private String name;
	private String id;
	private String password;
	private String nickName;

	public ChattingMember() {
		super();
	}
	
	public ChattingMember(String name, String id, String password, String nickName) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "ChattingMember [name=" + name + ", id=" + id + ", password=" + password + ", nickName=" + nickName
				+ "]";
	}

}

package musclerecoverywebserver.model;

import java.io.Serializable;
import java.text.MessageFormat;

public class Tbluser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String emailaddress;
	private String name;
	private String firstname;
	private String nickname;
	private String imei;
	private String password;

	public Tbluser() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return MessageFormat
				.format("{0}: id={1}, emailadress={2}, name={3}, firstname={4}, nickname={5}, imei={6}, password={7}",
						new Object[] { getClass().getSimpleName(), id,
								emailaddress, name, firstname, nickname, imei,
								password });
	}
}

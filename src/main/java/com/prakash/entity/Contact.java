package com.prakash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT_DTLS")
public class Contact {
	
	@Id
	@GeneratedValue()
	private int cid;
	private String name;
	private String email;
	private long phno;
	private String activeSW;

	
	public Contact() {
		super();
	}

	public Contact(int cid, String name, String email, long phno, String activeSW) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.activeSW = activeSW;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getActiveSW() {
		return activeSW;
	}

	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", name=" + name + ", email=" + email + ", phno=" + phno + ", activeSW="
				+ activeSW + "]";
	}

}

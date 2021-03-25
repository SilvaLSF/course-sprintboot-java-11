package com.educandoweb.course.entities;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long d;
	private String name;
	private String email;
	private String phone;
	private String password;

	public User() {
	}

	public User(Long d, String name, String email, String phone, String password) {
		super();
		this.d = d;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Long getD() {
		return d;
	}

	public void setD(Long d) {
		this.d = d;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (d == null) {
			if (other.d != null)
				return false;
		} else if (!d.equals(other.d))
			return false;
		return true;
	}
	
	
}

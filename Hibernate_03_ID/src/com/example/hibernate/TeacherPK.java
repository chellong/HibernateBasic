package com.example.hibernate;

public class TeacherPK implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9183818441424517286L;

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof TeacherPK) {
			TeacherPK pk = (TeacherPK) o;
			if (this.id == pk.getId() && this.name.equals(pk.getName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}

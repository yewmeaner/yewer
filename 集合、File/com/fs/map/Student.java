package com.fs.map;

public class Student implements Comparable<Student>{

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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
	public String toString() {
		return id + ":" + name;
	}

	@Override
	public int compareTo(Student o) {
		int r = this.name.compareTo(o.name);
		
		if(r > 0) {
			return 1;//升序排列
		} else if(r < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}
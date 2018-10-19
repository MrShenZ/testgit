package com.woaixuexi9f;

public class User1 {
	 private Integer id;
	    private String name;

	    public User1(Integer id) {
	        super();
	        this.id = id;
	    }
	    public Integer getId() {
	        return id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    @Override
	    public String toString() {
	        return "User [id=" + id + ", name=" + name + "]";
	    }
}

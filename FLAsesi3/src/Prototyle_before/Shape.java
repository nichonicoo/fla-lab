package Prototyle_before;

public abstract class Shape {
	
	private Integer id; 
	private String type;
	
	
	public Shape(Integer id, String type) {
		super();
		this.id = id;
		this.type = type;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	} 
	
	public abstract void createShape();
	
}

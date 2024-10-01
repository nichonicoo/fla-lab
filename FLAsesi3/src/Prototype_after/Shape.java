package Prototype_after;

// cloning, harus ada interface yg di implementasi 

public abstract class Shape implements Cloneable{
	
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
	
	public Object Clone() {
		
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone; 
	}
	
}


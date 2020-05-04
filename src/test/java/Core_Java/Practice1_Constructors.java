package Core_Java;

public class Practice1_Constructors {
	
	

	private String name;
	private int Id;
	private int num;
	
	public Practice1_Constructors() {
		this("Gayathri",245775,1000);
		
	}
	
	public Practice1_Constructors(String name,int Id, int num) {
		this.name= name;
		this.Id= Id;
		this.num= num;
		
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return Id;
	}

	public int getNum() {
		return num;
	}

}

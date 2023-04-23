package 사월23일;

public class Hiding {

	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Hiding(String id, String pw, String name, int age) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	 
	public Hiding() {
		// TODO Auto-generated constructor stub
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
	
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이는 음수가 될 수 없습니다.");
			return;
		}
		this.age = age;
	}
	
}

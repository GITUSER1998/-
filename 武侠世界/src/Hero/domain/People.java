package Hero.domain;

public class People {

	private String name;
	private String level;
	private String sex;
	private String age;

	public People() {
	}

	public People(String name, String sex, String age, String level) {
		super();
		this.name = name;
		this.sex = sex;
		this.level = level ;
		this.age = age;
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}
	
	public void setLevel( String level) {
		this.level = level;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}




}

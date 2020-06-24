package coding.interview.entity;

public class Account {

	private int id;
	private int age;
	private String myStr;
	
	public Account(int id){
		this.id=id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the myStr
	 */
	public String getMyStr() {
		return myStr;
	}

	/**
	 * @param myStr the myStr to set
	 */
	public void setMyStr(String myStr) {
		this.myStr = myStr;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
}

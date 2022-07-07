package lab0707;

public class BeanClass_student {

	private String name;
	private int std;
	private String div;
	private int roll_no;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	
	
	public BeanClass_student(String name, int std, String div, int roll_no) {
		this.setName(name);
		this.setStd(std);
		this.setDiv(div);
		this.setRoll_no(roll_no);
	}
	
	//@Override
//	public int hashCode() {
//		return Objects.hash(div);
//	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		return this.div.equals(((BeanClass_student)obj).div);
	}
	@Override
	public String toString() {
		return "BeanClass_Student [name=" + name + ", std=" + std + ", div=" + div + ", roll_no=" + roll_no + "]";
	}
	
	
	 
}

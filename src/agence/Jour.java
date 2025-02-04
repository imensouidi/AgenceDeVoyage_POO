package agence;

public class Jour {
	 private int num;
	 private String description;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Jour [num=" + num + ", description=" + description + "]";
	}
	public Jour(int num, String des) {
		this.num=num;
		this.description=des;
	}
}

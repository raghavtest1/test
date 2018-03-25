
public class Customer {
private String name;
public Customer (String name, String hobby, long telephone) {
	this .name=name;
	this.hobby=hobby;
	this.num=telephone;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", hobby=" + hobby + ", num=" + num + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
public long getNum() {
	return num;
}
public void setNum(long num) {
	this.num = num;
}
private String hobby;
private long num;
}

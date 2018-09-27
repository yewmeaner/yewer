package 类与方法;

public class Statice {
	private String name;
	private double value;
	private  static String clan;
	public Statice(String name, double value) {
		super();
		this.name = name;
		this.value = value;
		
	}
	public Statice() {
		super();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getClan() {
		return clan;
	}
	public void setClan(String clan) {
		this.clan = clan;
	}
	@Override
	public String toString() {
		return "英雄:" + name + " ，属性:" + value + "，来自" + clan + "。";
	}
	

}

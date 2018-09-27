package 类与方法;

public class Test_Statice {
	public static void main(String[] args) {
		
		Statice i = new Statice("艾希", 88);
		i.setClan("黑色玫瑰");
		System.out.println(i);
		
		Statice j = new Statice("卡莎", 92);
		j.setClan("艾欧尼亚");
		System.out.println(j);

		Statice k = new Statice("维嘉", 96);
		k.setClan("战争学院");
		System.out.println(k);
		Statice l = new Statice("亚索", 95);
		System.out.println(l);//打印，结果是static的一个特点

	}

}

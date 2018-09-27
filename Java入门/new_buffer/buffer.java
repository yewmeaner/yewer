package new_buffer;

public class buffer {
	public static void m1() {
		StringBuffer sBffer = new StringBuffer("英雄联盟官网:");
		sBffer.append("www");
		sBffer.append(".runoob");
		sBffer.append(".com");
		sBffer.reverse();
		sBffer.delete(1, 3);
		sBffer.insert(1, "ake");
		System.out.println(sBffer);
	}

	public static void main(String[] args) {
		m1();
	}

}

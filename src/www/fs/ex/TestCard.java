package www.fs.ex;

import java.util.Random;

public class TestCard {
	public static void main(String[] args) {
		DeskOfCard cc = new DeskOfCard();
		cc.initcard();
		cc.shufflecard();
		cc.dealcard();

	}

}

class DeskOfCard {
	Card card[];

	public void initcard() {// 初始化
		String[] num = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] suit = { "黑桃", "红桃", "梅花", "方块" };
		card = new Card[52];
		for (int i = 0; i < 52; i++) {
			card[i] = new Card(num[i % 13], suit[i / 13]);
		}
	}

	public void shufflecard() {// 洗牌
		Random rd = new Random();
		for (int i = 0; i < 52; i++) {
			int j = rd.nextInt(52);// 生成随机数
			Card temp = card[i];// 交换
			card[i] = card[j];
			card[j] = temp;
		}
	}

	public void dealcard() {// 发牌
		for (int i = 0; i < 52; i++) {
			if (i % 4 == 0) {
				System.out.println("\n");
				System.out.println(card[i]);
			}
		}
	}

}

class Card {
	public String num;
	public String suit;

	Card(String n, String s) {
		this.num = n;
		this.suit = s;
	}

	public String toString() {
		String ss = suit + ":" + num;
		return ss;
	}

}
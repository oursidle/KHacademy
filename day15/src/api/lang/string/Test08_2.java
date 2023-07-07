package api.lang.string;

import java.util.Scanner;

public class Test08_2 {
	public static void main(String[] args) {
		
		String[] filter = new String[] {
				"수박씨", "신발끈", "개나리", "십장생", " 시베리아", "주옥", "조카", "게불"
		};
		
		String line = "조카 수박씨 신발끈 개나리같은 시베리아!!";
		String[] star = new String[]	{
				"",
				"*",
				"**",
				"***",
				"****",
				"*****",
				"******"
		};

		for(int i=0; i < filter.length; i++) {
			int count = filter[i].length();
			if(count > 6) {
				count = 6;
			}
			line = line.replace(filter[i], star[count]);
		}
		System.out.println(line);
	}
}

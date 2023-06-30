package oop.test3;

public class Player {
	public static void main(String[] args) {
		
		//생성
		PlayerData player1 = new PlayerData();
		PlayerData player2 = new PlayerData();
		PlayerData player3 = new PlayerData();
		PlayerData player4 = new PlayerData();
		
		
		//초기화
		player1.rank = 1;
		player1.name = "킬리안 음바페";
		player1.nation = "프랑스";
		player1.socre = 8;
		
		player2.rank = 2;
		player2.name = "리오넬 메시";
		player2.nation = "아르헨티나";
		player2.socre = 7;
		
		player3.rank = 3;
		player3.name = "올리비에 지루";
		player3.nation = "프랑스";
		player3.socre = 4;
		
		player4.rank = 4;
		player4.name = "홀리안 알바레스";
		player4.nation = "아르헨티나";
		player4.socre = 4;
		
		
		//출력
		System.out.println("순위: " + player1.rank);
		System.out.println("이름: " + player1.name);
		System.out.println("국가: " + player1.nation);
		System.out.println("골: " + player1.socre);
		System.out.println("------------------");
		
		System.out.println("순위: " + player2.rank);
		System.out.println("이름: " + player2.name);
		System.out.println("국가: " + player2.nation);
		System.out.println("골: " + player2.socre);
		System.out.println("------------------");
		
		System.out.println("순위: " + player3.rank);
		System.out.println("이름: " + player3.name);
		System.out.println("국가: " + player3.nation);
		System.out.println("골: " + player3.socre);
		System.out.println("------------------");
		
		System.out.println("순위: " + player4.rank);
		System.out.println("이름: " + player4.name);
		System.out.println("국가: " + player4.nation);
		System.out.println("골: " + player4.socre);
	}
}

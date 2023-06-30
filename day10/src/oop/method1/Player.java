package oop.method1;

public class Player {
	public static void main(String[] args) {
		
		//생성
		PlayerData player1 = new PlayerData();
		PlayerData player2 = new PlayerData();
		PlayerData player3 = new PlayerData();
		PlayerData player4 = new PlayerData();
		
		
		//초기화
		player1.setup(1, "킬리안 음바페", "프랑스", 8);
		player2.setup(2, "리오넬 메시", "아르헨티나", 7);
		player3.setup(3, "올리비에 지루", "아르헨티나", 4);
		player4.setup(4, "훌리엔 알바레스", "아르헨티나", 4);
		
		
		//출력
		player1.show();//player을 주인공으로 해서 show에 있는 코드를 실행해라
		player2.show();
		player3.show();
		player4.show();
	}
}

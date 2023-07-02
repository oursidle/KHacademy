package oop.method3;

public class Carrier {
	public static void main(String[] args) {
		
		//객체 생성
		CarrierData carrier1 = new CarrierData();
		CarrierData carrier2 = new CarrierData();
		CarrierData carrier3 = new CarrierData();
		
		//데이터 초기화
		carrier1.setup("SKT", "5G언택트 52", 52000, 200, 1000, 2000);
		carrier2.setup("KT", "5G세이브", 45000, 100, 900, 1500);
		carrier3.setup("LG", "5G시그니처", 130000, 500, 2000, 2500);
		
		//출력
		carrier1.show();
		carrier2.show();
		carrier3.show();
	
	}
}

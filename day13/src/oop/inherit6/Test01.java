package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
	Galaxy23s galaxy23s = new Galaxy23s("010-1234-5678", "블랙");
	galaxy23s.show();
	galaxy23s.call();
	galaxy23s.sms();
	galaxy23s.samsungPay();
	galaxy23s.bixby();
	
	System.out.println();
	
	GalaxyFold4 galaxyFold4 = new GalaxyFold4("010-2345-6789", "그린");
	galaxyFold4.show();
	galaxyFold4.call();
	galaxyFold4.sms();
	galaxyFold4.samsungPay();
	galaxyFold4.iris();
	
	System.out.println();
	
	IPhone13 iPhone13 = new IPhone13("010-3456-7890", "골드");
	iPhone13.show();
	iPhone13.call();
	iPhone13.sms();
	iPhone13.itunes();
	iPhone13.siri();
	
	System.out.println();
	
	IPhone14 iPhone14 = new IPhone14("010-4567-8901", "핑크");
	iPhone14.show();
	iPhone14.call();
	iPhone14.sms();
	iPhone14.faceTime();
	iPhone14.siri();
	}
}	

package oop.multi2;

public class Test01 {
	public static void main(String[] args) {
		Drone drone = new Drone();
//		Flyable drone = new Drone();//업캐스팅
//		Electronic drone = new Drone();//업캐스팅
//		Transportation drone = new Drone();//업캐스팅
//		Reserve drone = new Done();//상속 관계가 아니므로 업캐스팅 불가
		drone.on();
		drone.off();
		drone.move();
		drone.fly();
		System.out.println();
		
		Airplane airplane = new Airplane();
		airplane.move();
		airplane.fly();
		airplane.reservation();
		System.out.println();
		
		Train train = new Train();
		train.move();
		train.reservation();
		System.out.println();
		
		Bus bus = new Bus();
		bus.move();
		System.out.println();
		
		Kickboard kickboard = new Kickboard();
		kickboard.on();
		kickboard.off();
		kickboard.move();
		
		Transportation t = drone;//업캐스팅
		if(t instanceof Drone) {
			Drone dd = (Drone) t;//다운 캐스팅
		}
	}
}

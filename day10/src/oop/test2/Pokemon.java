package oop.test2;

public class Pokemon {
	public static void main(String[] args) {
		//Pokemon의 객체(인스턴스)를 생성
		
		//생성
		PokemonData strange = new PokemonData();
		PokemonData fire = new PokemonData();
		PokemonData water = new PokemonData();
		PokemonData light = new PokemonData();
		
		//초기화
		strange.num = 1;
		strange.name = "이상해씨";
		strange.property = "풀";
		
		fire.num = 4;
		fire.name = "파이리";
		fire.property = "불꽃";
		
		water.num = 7;
		water.name = "꼬부기";
		water.property = "물";
		
		light.num = 25;
		light.name = "피카츄";
		light.property = "전기";
		
		System.out.println("번호: " + strange.num);
		System.out.println("이름: " + strange.name);
		System.out.println("속성: " + strange.property);
		System.out.println("----------------");
		
		System.out.println("번호: " + fire.num);
		System.out.println("이름: " + fire.name);
		System.out.println("속성: " + fire.property);
		System.out.println("----------------");
		
		System.out.println("번호: " + water.num);
		System.out.println("이름: " + water.name);
		System.out.println("속성: " + water.property);
		System.out.println("----------------");		
		
		System.out.println("번호: " + light.num);
		System.out.println("이름: " + light.name);
		System.out.println("속성: " + light.property);
	}
}

package array;

public class Test02 {
	public static void main(String[] args) {
		//배열(array)
		//- 여러 개의 같은 종류의 데이터를 저장할 수 있는 공간
		
		//생성
		//a(리모콘) ----------> [ 0 ][ 0 ][ 0 ]
		int[] a = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
	//	a[3] = 40; //실행하면 error(런타임 에러)
		
		System.out.println(a);//리모콘 정보 출력(정보를 출력할 필요 X)
		System.out.println(a[0]);//a가 보는 +0 지점의 데이터
		System.out.println(a[1]);//a가 보는 +1 지점의 데이터
		System.out.println(a[2]);//a가 보는 +2 지점의 데이터
	//System.out.println(a[3]); //없는 배열이므로 에러가 남
	}
}

package array2;

public class Test01 {
	public static void main(String[] args) {
		//정렬(sort)
		//- 여러 개의 데이터를 원하는 목적에 맞게 나열하는 것
		//- 번호순, 이름순, 가격순, 랭킹순, 성적순, 최신순, ...
		//- 번호순: 번호가 낮은 것부터 나열(오름차순)
		//- 성적순: 성적이 높은 것부터 나열(내림차순)
		//- 정렬방법은 여러가지가 있으며 상황에 따라 성능이 다르게 적용됨
		//- 사용자에게 데이터를 효과적으로 보여줄 수 있는 수단이므로 중요한 작업임
		
		//데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//0위치부터 4위치까지의 최소값을 찾아 0위치와 교체
		for(int k=0; k < data.length-1; k++) {
			int minIndex = k;//k번 위치의 값이 가장 작다고 가정
			for(int i = k+1; i < data.length; i++) {//뒤에 있는 데이터와 비교
				if(data[minIndex] > data[i]) {//더 작은 값이 있다면
					minIndex = i;//교체
				}
			}
			int backup = data[minIndex];
			data[minIndex] = data[k];
			data[k] = backup;
		}
		
		
		for(int i=0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}

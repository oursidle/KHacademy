package oop.constructor2;

public class Music {
	public static void main(String[] args) {
		
		MusicData Music1 = new MusicData("그때 그 순간 그대로(그그그)", "WSG워너비",
																				"WSG워너비 1집" , 104250, 91835);
		MusicData Music2 = new MusicData("보고싶었어", "WSG워너비", "WSG워너비 1집",
																												83127, 90805);
		MusicData Music3 = new MusicData("LOVE DIVE", "IVE(아이브)", "LOVE DIVE",
																												64590, 174519);
		MusicData Music4 = new MusicData("POP!", "나연(TWICE)", "IM NAYEON",
																												58826, 70313);
		
		Music1.show();
		Music2.show();
		Music3.show();
		Music4.show();
		
	}
}

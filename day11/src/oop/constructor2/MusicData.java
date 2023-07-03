package oop.constructor2;

public class MusicData {
	
	//멤버 필드 - 데이터
	String title;
	String singer;
	String soundtrack;
	Long play;
	int like;
	
	
	//멤버 메소드 - 코드
	void setTitle(String title) {
		this.title = title;
	}
	void setSinger(String singer) {
		this.singer = singer;
	}
	void setSoundtrack(String soundtrack) {
		this.soundtrack = soundtrack;
	}
	void setPlay(long play) {
		if(play < 0L) return;
		this.play = play;
	}
	void setLike(int like) {
		if(like < 0) return;
		this.like = like;
	}
	
	String getTitle() {
		if(this.singer == null) {
			return "Various Artist";
		}else {
			return this.title;
		}
	}
	String getSinger() {
		return this.singer;
	}
	String getSoundtrack() {
		return this.soundtrack;
	}
	long getPlay() {
		return this.play;
	}
	int getLike() {
		return this.like;
	}
	
	String getBest() {
		if(this.play > 100000L) {
			return "(베스트)";
		}else {
			return "";
		}
	}
	String getHot() {
		if(this.like > 100000L) {
			return "(인기곡)";
		}else {
			return "";
		}
	}
	long getRankPoint() {
		return (this.play * 2) + (this.like / 2);
	}
	
	//생성자 - 초기화
	MusicData(String title, String singer, String soundtrack){
		this(title, singer, soundtrack, 0L, 0);//아래 생성자로 데이터 전달
	}
	MusicData(String title, String singer, String soundtrack, long play, int like){
		this.setTitle(title);
		this.setSinger(singer);
		this.setSoundtrack(soundtrack);
		this.setPlay(play);
		this.setLike(like);
	}
	
	
	void show() {
		System.out.println("< 음원 차트 >");
		System.out.println("제목: " + this.getTitle() + this.getBest() + this.getHot());
		System.out.println("가수: " + this.getSinger());
		System.out.println("앨범: " + this.getSoundtrack());
		System.out.println("재생 수: " + this.getPlay());
		System.out.println("좋아요 수: " + this.getLike());
		System.out.println("랭킹 포인트: " + this.getRankPoint());
		System.out.println();
	}
}
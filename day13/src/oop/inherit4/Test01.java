package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		
		Mp4 mp4 = new Mp4();
		mp4.setFilename("상속. mp4");
		mp4.setFilesize(100000L);
		mp4.setSpeed(1.2f);
		mp4.execute();
		mp4.forward();
		mp4.rewind();
		System.out.println();
		
		Mp3 mp3 = new Mp3();
		mp3.setFilename("자바의정석.mp3");
		mp3.setFilesize(10000L);
		mp3.setDuration(180);
		mp3.execute();
		mp3.forward();
		mp3.rewind();
		System.out.println();
	
		Hwp hwp = new Hwp();
		hwp.setFilename("시험필기.hwp");
		hwp.setFilesize(999L);
		hwp.setPagesize(20);
		hwp.execute();
		hwp.preview();
		System.out.println();
	
		Ppt ppt = new Ppt();
		ppt.setFilename("발표자료.ppt");
		ppt.setFilesize(12345L);
		ppt.setPagesize(150);
		ppt.execute();
		ppt.slideShow();
	}
}

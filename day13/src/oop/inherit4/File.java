package oop.inherit4;

public class File {

	//공통 필드
	private String filename;
	private long filesize;
	
	//setter, getter 메소드
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		if(filesize < 0L) return;
		this.filename = filename;
	}
	public long getFilesize() {
		return filesize;
	}
	public void setFilesize(long filesize) {
		this.filesize = filesize;
	}
	
	public void execute() {
		System.out.println("파일 실행");
	}
	
}

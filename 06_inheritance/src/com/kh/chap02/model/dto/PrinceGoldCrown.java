package com.kh.chap02.model.dto;

public class PrinceGoldCrown extends Treasure {
	private String source;

	public PrinceGoldCrown() {
		super();
		System.out.println("나는 자식");
	}

	public PrinceGoldCrown(String source) {
		super();
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	public String info() {
		return super.info() + ", 출처 : " + source + "]";
	}
	
	
}

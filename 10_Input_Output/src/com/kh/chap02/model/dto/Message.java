package com.kh.chap02.model.dto;

import java.io.Serializable;

public class Message implements Serializable{
	private String messag;
	
	public Message(String messag) {
		super();
		this.messag = messag;
	}

	@Override
	public String toString() {
		return "Message [messag=" + messag + "]";
	}
}


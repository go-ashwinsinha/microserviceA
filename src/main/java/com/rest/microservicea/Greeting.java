package com.rest.microservicea;

public class Greeting {

	private final long requestCount;
	private final String content;

	public Greeting(long counter, String content) {
		this.requestCount = counter;
		this.content = content;
	}



	public long getRequestCount() {
		return requestCount;
	}







	public String getContent() {
		return content;
	}
}

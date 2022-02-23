package com.sparta.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Guardian{

	@JsonProperty("response")
	private TopStories response;

	public TopStories getResponse(){
		return response;
	}
}
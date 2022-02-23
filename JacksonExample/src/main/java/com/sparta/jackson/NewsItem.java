package com.sparta.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewsItem {

	@JsonProperty("sectionName")
	private String sectionName;

	@JsonProperty("pillarName")
	private String pillarName;

	@JsonProperty("webPublicationDate")
	private String webPublicationDate;

	@JsonProperty("apiUrl")
	private String apiUrl;

	@JsonProperty("webUrl")
	private String webUrl;

	@JsonProperty("isHosted")
	private boolean isHosted;

	@JsonProperty("pillarId")
	private String pillarId;

	@JsonProperty("webTitle")
	private String webTitle;

	@JsonProperty("id")
	private String id;

	@JsonProperty("sectionId")
	private String sectionId;

	@JsonProperty("type")
	private String type;

	public String getSectionName(){
		return sectionName;
	}

	public String getPillarName(){
		return pillarName;
	}

	public String getWebPublicationDate(){
		return webPublicationDate;
	}

	public String getApiUrl(){
		return apiUrl;
	}

	public String getWebUrl(){
		return webUrl;
	}

	public boolean isIsHosted(){
		return isHosted;
	}

	public String getPillarId(){
		return pillarId;
	}

	public String getWebTitle(){
		return webTitle;
	}

	public String getId(){
		return id;
	}

	public String getSectionId(){
		return sectionId;
	}

	public String getType(){
		return type;
	}
}
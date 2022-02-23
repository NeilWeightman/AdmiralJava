package com.sparta.jackson;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TopStories {

	@JsonProperty("userTier")
	private String userTier;

	@JsonProperty("total")
	private int total;

	@JsonProperty("startIndex")
	private int startIndex;

	@JsonProperty("pages")
	private int pages;

	@JsonProperty("pageSize")
	private int pageSize;

	@JsonProperty("orderBy")
	private String orderBy;

	@JsonProperty("currentPage")
	private int currentPage;

	@JsonProperty("results")
	private List<NewsItem> results;

	@JsonProperty("status")
	private String status;

	public String getUserTier(){
		return userTier;
	}

	public int getTotal(){
		return total;
	}

	public int getStartIndex(){
		return startIndex;
	}

	public int getPages(){
		return pages;
	}

	public int getPageSize(){
		return pageSize;
	}

	public String getOrderBy(){
		return orderBy;
	}

	public int getCurrentPage(){
		return currentPage;
	}

	public List<NewsItem> getResults(){
		return results;
	}

	public String getStatus(){
		return status;
	}
}
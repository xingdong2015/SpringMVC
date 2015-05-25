package com.mishu.cgwy.jdo;

public class CustomerQueryRequest {
	private int page = 0;
	private int pageSize = 200;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}

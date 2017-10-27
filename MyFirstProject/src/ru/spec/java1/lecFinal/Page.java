package ru.spec.java1.lecFinal;

import java.util.List;

public class Page <T extends Number>{
	T example;
	List<T> list;
	int total;
	int current;
	int perPage;
	
	T example() {
		return example;
	}
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

}

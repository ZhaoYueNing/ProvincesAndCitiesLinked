package cn.zhaoyuening.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("city")
public class City {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City(String name) {
		this.name = name;
	}

	public City() {}
}

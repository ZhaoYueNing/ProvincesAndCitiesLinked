package cn.zhaoyuening.domain;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("province")
public class Province {
	private String name;
	private List<City> cities;
	
	public Province() {
		cities = new ArrayList<City>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	public void addCity(String name){
		City city = new City();
		city.setName(name);
		addCity(city);
	}
	
	public void addCity(City city){
		cities.add(city);
	}

	public Province(String name) {
		this();
		this.name = name;
	}
	
}

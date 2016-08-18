package cn.zhaoyuening.service;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import cn.zhaoyuening.domain.Province;

public class GetProvincesAndCitiesService {
	public static List<Province> getProvincesList(){
		Province hn = new Province("ºþÄÏ");
		hn.addCity("³¤É³");
		hn.addCity("ÏæÌ¶");
		hn.addCity("ÖêÖÞ");
		hn.addCity("ÓÀÖÝ");
		hn.addCity("ÔÀÑô");
		hn.addCity("³£µÂ");
		Province hb = new Province("ºþ±±");
		hb.addCity("Îäºº");
		hb.addCity("³à±Ú");
		hb.addCity("Îä²ý");
		List<Province> provinces = new ArrayList<Province>();
		provinces.add(hn);
		provinces.add(hb);
		return provinces;
	}
}

package cn.zhaoyuening.service;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import cn.zhaoyuening.domain.Province;

public class GetProvincesAndCitiesService {
	public static List<Province> getProvincesList(){
		Province hn = new Province("����");
		hn.addCity("��ɳ");
		hn.addCity("��̶");
		hn.addCity("����");
		hn.addCity("����");
		hn.addCity("����");
		hn.addCity("����");
		Province hb = new Province("����");
		hb.addCity("�人");
		hb.addCity("���");
		hb.addCity("���");
		List<Province> provinces = new ArrayList<Province>();
		provinces.add(hn);
		provinces.add(hb);
		return provinces;
	}
}

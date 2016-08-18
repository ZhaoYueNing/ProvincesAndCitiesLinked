package cn.zhaoyuening.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import cn.zhaoyuening.domain.Province;

public class TestDemo {
	@Test
	public void test() throws Exception {
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
		XStream xs = new XStream();
		xs.autodetectAnnotations(true);
		xs.alias("provinces", provinces.getClass());
		String xml = xs.toXML(provinces);
		System.out.println(xml);
	}
}

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
		XStream xs = new XStream();
		xs.autodetectAnnotations(true);
		xs.alias("provinces", provinces.getClass());
		String xml = xs.toXML(provinces);
		System.out.println(xml);
	}
}

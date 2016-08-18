package cn.zhaoyuening.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;

import cn.zhaoyuening.domain.Province;
import cn.zhaoyuening.service.GetProvincesAndCitiesService;

public class GetProvincesAndCitiesServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获取数据
		List<Province> provinces = GetProvincesAndCitiesService.getProvincesList();
		//转换为xml
		XStream xs = new XStream();
		xs.autodetectAnnotations(true);
		String xml = xs.toXML(provinces);
		//发送xml
		System.out.println(xml);
		out.write(xml);
		
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

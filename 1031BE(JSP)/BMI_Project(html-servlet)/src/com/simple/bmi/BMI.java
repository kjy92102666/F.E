package com.simple.bmi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bmi")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//post/get��� ����, servlet���ʿ� doPost/doGet()���� �Ѿ�´�. 
		//�� ������Ʈ������ ��ġ�� �Ѿ� ���⿡ utf-8 �����൵ ������ ���� Ÿ���� �������...
		//��� html ����
		System.out.println("GET���� ����");
		response.setCharacterEncoding("UTF-8");			//utf-8�� ����Ѵٰ� �˷��ִ� �Լ�
		response.setContentType("text/html; charset=UTF-8");	//text/html : htmlŸ���� �˷���
		
		PrintWriter out = response.getWriter();
		
		//���� ���� ����
		//I/O ���� ����(�Է�-ó��-���. �����̸� ���������� ������ �� �ִ� �̸����� �ۼ�.)
		double height = 0.0;//i
		int weight = 0;
		double bmi = 0.0;	//o
		String result = "";	
		
		String height_ = request.getParameter("height");
		String weight_ = request.getParameter("weight");
		
		if(height_ != null && !height_.equals("")) {
			height = (Double.parseDouble(height_))/100.0d;

		}
		if(weight_ != null && !weight_.equals("")) {
			weight = Integer.parseInt(weight_);

		}
		bmi = weight/(height*height);
		
		//BMI ���� ���ϱ�.
		if(bmi > 25) {
			result = "��";
		}else if(bmi >= 23) {
			result = "��ü��";
		}else if(bmi >= 18.5) {
			result = "����";
		}else{
			result = "��ü��";
		}
		
		//������� ���������� ����
		out.print("<p>Ű : " + height_ + "</p>");
		out.print("<p>������ : " + weight_ + "</p>");
		out.print("<p>BMI���� : " + String.format("%.2f", bmi) + "</p>");
		out.print("<p>��� : " + result + "</p>");
		//out.print("<p> bmi���� : "+bmi+"</p>");
		
		out.print("<hr>");
		
		out.print("<form method='get'>");
		out.print("���� : <input type=\"text\" value='"+height_+"'>cm<br><br>");
		out.print("ü�� : <input type='text' value='"+weight_+"'>kg<br>");
		out.print("bmi : <input type='text' readonly value='"+String.format("%.2f", bmi)+"'>kg<br>");
		out.print("</form>");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form action="bmi" method="post". post�� �����ڴٰ� �����߱⿡ �ʿ�!
		System.out.println("GET���� ����");
		response.setCharacterEncoding("UTF-8");//utf-8�� ����Ѵٰ� �˷��ִ� �Լ�
		response.setContentType("text/html; charset=UTF-8");
		//text/html : htmlŸ���� �˷���
		
		PrintWriter out = response.getWriter();
		
	}

}

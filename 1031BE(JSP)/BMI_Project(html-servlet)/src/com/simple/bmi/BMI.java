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
		//post/get방식 사용시, servlet안쪽에 doPost/doGet()으로 넘어온다. 
		//이 프로젝트에서는 수치만 넘어 오기에 utf-8 안해줘도 되지만 문서 타입은 적어줘야...
		//출력 html 설정
		System.out.println("GET으로 받음");
		response.setCharacterEncoding("UTF-8");			//utf-8을 사용한다고 알려주는 함수
		response.setContentType("text/html; charset=UTF-8");	//text/html : html타입을 알려줬
		
		PrintWriter out = response.getWriter();
		
		//내부 변수 선언
		//I/O 변수 설계(입력-처리-출력. 변수이름 직관적으로 이해할 수 있는 이름으로 작성.)
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
		
		//BMI 지수 구하기.
		if(bmi > 25) {
			result = "비만";
		}else if(bmi >= 23) {
			result = "과체중";
		}else if(bmi >= 18.5) {
			result = "정상";
		}else{
			result = "저체중";
		}
		
		//결과값을 웹브라우저에 전송
		out.print("<p>키 : " + height_ + "</p>");
		out.print("<p>몸무게 : " + weight_ + "</p>");
		out.print("<p>BMI지수 : " + String.format("%.2f", bmi) + "</p>");
		out.print("<p>결과 : " + result + "</p>");
		//out.print("<p> bmi지수 : "+bmi+"</p>");
		
		out.print("<hr>");
		
		out.print("<form method='get'>");
		out.print("신장 : <input type=\"text\" value='"+height_+"'>cm<br><br>");
		out.print("체중 : <input type='text' value='"+weight_+"'>kg<br>");
		out.print("bmi : <input type='text' readonly value='"+String.format("%.2f", bmi)+"'>kg<br>");
		out.print("</form>");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form action="bmi" method="post". post로 보내겠다고 선언했기에 필요!
		System.out.println("GET으로 받음");
		response.setCharacterEncoding("UTF-8");//utf-8을 사용한다고 알려주는 함수
		response.setContentType("text/html; charset=UTF-8");
		//text/html : html타입을 알려줬
		
		PrintWriter out = response.getWriter();
		
	}

}

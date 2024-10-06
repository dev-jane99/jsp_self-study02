package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.jasper.tagplugins.jstl.core.Out;

public class MyServlet extends HttpServlet {
   // serialVersionUID 직렬화 역직렬화
   private static final long serialVersionUID = 1L;
       
    public MyServlet() {
        super();
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      //   ContextPath (최상위 폴더 경로)
//      response.getWriter().append("최상위 폴더 경로: ").append(request.getContextPath());
      
   // 인코딩(한글깨짐 방지)
      request.setCharacterEncoding("UTF-8");
      response.setContentType("text/html; charset=utf-8");
      
      
      PrintWriter out = response.getWriter();
      out.print("<h1>hello, jsp!</h1>");
      
      
//      1번 실습
//      PrintWriter out = response.getWriter();
//      String name = request.getParameter("name");
//      String age = request.getParameter("age");
//      int realAge = Integer.parseInt(age) - 1;
//      
//      System.out.println(name);
//      System.out.println(realAge - 1);
//      
//      out.print("<h1>Hello, JSP!</h1>");
//      out.print("이름 :" + name + "<br />");
//      out.print("나이 :" + age + "<br />");
//      out.print("만 나이 :" + realAge);
//      out.close();
      
//      2번 실습
//      boolean payment = false;
//      String result = "";
//      
//      PrintWriter out = response.getWriter();
//      payment = Boolean.parseBoolean(request.getParameter("payment"));
//      result = payment ? "결제 성공" : "결제 실패";
//      out.print(result);
//      out.close();
      
//    3번 실습
//    String result = null;
//    String football, basketball, baseball = "";
//    ArrayList<String> hobbies = new ArrayList<String>();
//    
//    football = request.getParameter("football");
//    basketball = request.getParameter("basketball");
//    baseball = request.getParameter("baseball");
//    
//    if(football != null) {
//       hobbies.add(football);
//    }
//    
//    if(basketball != null) {
//       hobbies.add(농구);
//    }
//    
//    if(baseball != null) {
//       hobbies.add(야구);
//    }
//    
//    for(int i = 0; i < hobbies.size(); i++) {
//       result += i == hobbies.size() - 1 ? hobbies.get(i) : hobbies.get(i) + ", ";
//    }
//    
//    out.print("당신의 취미는 " + result.replace("null", "") + "입니다.");
//    out.close();
    
    }
 
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // post로 보내도 get으로 처리하게
    doGet(request, response);
 }

}


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--    <% 
      for(int i = 0; i < 10; i ++){
   %>
      <h1>안녕하세요!</h1>   
   <%
      }
   %>  --%>


   <!-- 
      1번 실습
      이름과 나이를 입력 받아서,
      나이와 만 나이를 서블릿에서 계산 후 화면에 응답해주는 페이지 제작
    -->
   <form id="intro-form" action="home" method="post">
      <input name="name" placeholder="이름을 입력하세요" />
      <p id="name-result"></p>
      <input name="age" placeholder="나이를 입력하세요" />
      <p id="age-result"></p>
      <button type="button" id="submit-button">전송</button>
   </form>


   <!-- 
      2번 실습
      화면 쪽에서 true, false 의 결제 여부를 입력 받아서 
      결제 여부가 true 라면 결제 성공!
      false 라면 결제 실패! 를 응답해주는 페이지 만들기!
    -->

   <form action="home" method="get">
      <input type="text" name="payment" />
      <p id="result"></p>
      <button type="button">결제</button>
   </form>

</body>
<script type="text/javascript">
   
  /*  1번 실습 */
   const form = document.getElementById("intro-form");
   const nameInput = document.querySelector("input[name='name']");
   const ageInput = document.querySelector("input[name='age']");
   const name = document.querySelector("#name-result");
   const age = document.querySelector("#age-result");
   const button = document.getElementById("submit-button");
   
   console.log(nameInput);
   console.log(ageInput);
   console.log(name);
   console.log(button);
   
   button.addEventListener("click", () => {
      if(!nameInput.value){
         name.innerText = "이름을 입력하세요!";
         name.style.color = "red";
         return;
      }
      
      name.innerText = "멋진 이름이네요!";
      name.style.color = "blue";

      if(!ageInput.value){
         age.innerText = "나이를 입력하세요!";
         age.style.color = "red";
         return;
      }
      age.innerText = "청춘이네요!";
      age.style.color = "blue";
      form.submit();
   }) 
   
   
   /* 2번 실습 */
   const form = document.querySelector("form");
   const p = document.querySelector("#result");
   const input = document.querySelector("input[name='payment']");
   const button = document.querySelector("button");
   
   console.log(form)
   console.log(p)
   console.log(input)
   console.log(button)
   
   button.addEventListener("click", () => {
      if(!input.value){
         p.innerText = "값을 입력하세요. ex)true"
         return;
      }
      
      if(!(input.value === "true" || input.value === "false")){
         p.innerText = "잘못 입력하셨습니다."
         return ;
      }
      
      form.submit()
   })
   
   
</script>
</html>
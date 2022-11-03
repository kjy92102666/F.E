inline요소:옆으로 콘텐츠가 적용, block 아래로 적용.

06_03. color, text, font...
text-align:justify. 가지런히 맞춤, 단어 잘림의 현상이 있다.
text-decoration:none;  링크에 밑줄이 있음을 제거.(밑줄 위치 선정가능.)

![[Pasted image 20221103093715.png]]
margin:20px 10px 30px 40px;.   //top,right,bottom,left
border:1px solid `#f00`;  //두께, (선)스타일, 색상   (border-bottom 도 가능.)
border-style:inset;     //top,left가 들어간느낌
  <p><span class="inset">inset</span></p>
border-style:outset;
  <p><span class="outset">outset</span></p>//bottom,right가 들어간느낌
box-sizing.html.  display: inline-block;
box-sizing-modify.html.  
box-shadow.html. 
box-shadow: 5px 5px;


06_04. 
 background-attachment-scroll.html  : 

06_05. 
 relative.html - 요소 자기 자신의 원래 위치(static일 때의 위치)를 기준으로 배치
  - 원래 위치를 기준으로 위쪽(top), 아래쪽(bottom), 왼쪽(left), 오른쪽(right)에서 얼마만큼 떨어질 지 결정
  - 위치를 이동하면서 다른 요소에 영향을 주지 않는다
 absolute.html - 가장 가까운 위치에 있는 조상 요소를 기준으로 배치한다.
  - 브라우저 기준으로 동작.(기준점이 상위태그) 비워진 공간을 채운다.
 float : 웹에서 이미지를 어떻게 띄워서 텍스트와 함께 배치할 것인가에 대한 속성 
  ( 적용대상들 전부 다 써줘야한다. )
 










``1``
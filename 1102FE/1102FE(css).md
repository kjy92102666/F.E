*모니터 해상도 : 72px=1인치*
saturation : 채도,순도. (색이 빛에 바래지는 정도)

#CSS(Cascading Style Sheets)
04_01.css.html
 ``<h1 style="color:blue">css basic</h1>
05_01.tag_selector.html.  태그 선택자(tag selector)=><p>
	id_selector.html. 구분자. 클래스(.) , id(#)
	attribute_selector_.html  :  [속성=속성값.]
	asterisk.html  :  모든 태그의 스타일을 정의하는것.(Reset CSS)
	
05_02.descendant_selector.html  :  div p{속성들}
 child_selector.html.  .box>p 1,3만 적용.
  ``<div class="box">``
	    <p>lorem 1</p>
	    <div>
	      <p>lorem 2</p>
	    </div>
	    <p>lorem 3</p>
	   </div>
 adjacent_sibling.html  h1+h2. 인접 형제 선택자
 general_sibling.html h1~h2. 일반 형제 선택자
 group_selector.html  p, #title, .red {} 그룹 선택자.
  css가 스타일링 할때는 내려오면서 순차적으로 하기에, 
  겹칠때 맨 마지막에 다시 칠한다고 생각하기.
05_03 before_after.html. 기준값 이전,이후
05_04 hover.html.  태그:hover{} 태그 위에 올라갔을때,

 input_pseudo.html   input:focus{} . 초점(focus)있을때 {}안에 값 실행.
 
 link-pseudo.html.   link, visited-클릭 한 적이 있는경우, hover, active-작동 중일 경우
 
 first&last-child.html.   : 다음에는 가상의 무언가가 나온다.

 nth-child.html.   
 p:nth-child(1){  color:red;  } //각각의 p태그중 첫번째요소에 red.

 nth-last-child.html. 
  p:nth-last-child(2){   color:red;   }  //p태그에 마지막부터 2번째 요소.
 
 nth-last-of-type.html.
  p:nth-last-of-type(1){  color:red;  }  //p태그의 마지막태그에서 부터 1번째요소
 checkbox_pseudo.html.  
  input:checked + label{   color:red;  }  체크하는순간 red로 감지
 disabled-기능자체를 못쓰게 만드는...

06_01.inherit.html.  상속.계층 구조에 따라서 이뤄진다.(==``cascading`)

specificity-1.html.  적용 우선순위와 개별성

06_02 폰트종류들...
 세리프.(없어도 상관없는 추가된획.)
 font-variant.html.   small-caps;//작은 글씨의 대문자
 letter-spacing.html.  자간 조절예제.


`1`
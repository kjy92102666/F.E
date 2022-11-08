06_05
 - z-index.html  :  수치가 높을수록 위로 올라온다.(단, 소수점은 X). -는 
    양수는 앞쪽으로 나오는 수치, 음수는 뒤로 들어가는 수치.
 float. 대상 요소를 공중에 띄운다.(뉴스 기사에 그림과 글이 어울려있는 형태.)
 clear float속성의 값 해제, 보통 clear : both사용...
- clear-solved.html 
- clear-solved-2.html
    padding:1rem(기준이되는 16px을 기준으로 root로적용하겠다~)
    margin:0 auto;  // 가운데 정렬을 하겠다~
    .container::after{   //container 위로 적용시키겠다~(after로만 적용된다.)
    content:"";   //꽉차게 높이를 차지한다~
    clear:both;   //clear:both; 까지 적용되어야 기능이 온전히 작동된다~
    }
- transition-timing-function.html   :   선형 그래프 예제
06_07
 - animation-basic.html
 - animation-direction.html  : reverse로 반복표현 가능.
 - animation-play-state.html  :  정해진 시간 내에 도형의 이동, 일시정지 예제

06_08 transform 중심을 가지고 다양하게 회전
 - transform-origin.html  :  왼쪽 위 모서리를 기준으로 회전
 - transform-rotate.html  :  도형의 중앙을 기준으로 회전
 - transform-scale.html  :  호버시, 도형의 크기 조절(배수기준으로...)
 - transform-skew.html   :  skew(한쪽이 고정된 상태에서 잡아당긴다는 느낌?)

06_09 font <i> == 이모티콘.
 @import url(링크).  로 링크를 걸어서 다운 받아서 쓴다.

1차원 레이아웃 설계 : 플렉스(유연하다, flex=띄운다). 2차원 레이아웃 설계 : 그리드...
07_01 flex. div는 기본적으로 블록요소(줄개념)
 - flex.html : 
 - justify-content.html :
     justify-content:flex-end; 선택된 박스 안에서 시작점, 끝지점부터 채워 나가는 속성.
 - flex-wrap.html  :  넘칠때 래핑을 한다~
 - flex-flow.html  :  값이 넘쳐도 래핑하지 않는다~
07_02 grid  격자무늬란 뜻으로, Grid Layout이라 함은 격자 모양의 표에 차일드를 배치
 -  grid-template.html.
     grid-template-... auto 주면 그 값에 맞는 꽉차는값이 적용된다.
 - 
 - 






`1`
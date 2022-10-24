※ w3c.. 에서 내용 볼 때 사용빈도가 많은 순으로 나열된 경우가 많다.

Cascading : 범위가 큰범위에서  작은 범위로 입혀지는 일종의 상속개념.

*많이 사용되는 순서
SELECTOR
 -  Simple selectors (select elements based on name, id, class)
 -   [Combinator selectors](https://www.w3schools.com/css/css_combinators.asp) (select elements based on a specific relationship between them)
  --관계형 선택자 : space(descendant: 자손,후예), >(~자식까지.), +, ~
 -   [Pseudo-class selectors](https://www.w3schools.com/css/css_pseudo_classes.asp) (select elements based on a certain state)
 -   [Pseudo-elements selectors](https://www.w3schools.com/css/css_pseudo_elements.asp) (select and style a part of an element)
 -   [Attribute selectors](https://www.w3schools.com/css/css_attribute_selectors.asp) (select elements based on an attribute or attribute value)

`css #은 id로, . 은 class로 설정해야한다. `
16px이 기본이다(기준.)

#jqurey [jQuery](https://jquery.com/) 오리지날 홈페이지. 
f12 개발자모드로 변동사항을 확인하기.
!!!<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
`구분하기.` 사용할 때 , 우클릭->다른이름으로 저장
  [Download the compressed, production jQuery 3.6.1](https://code.jquery.com/jquery-3.6.1.min.js)  ``

[Download the uncompressed, development jQuery 3.6.1](https://code.jquery.com/jquery-3.6.1.js)
-jquery

-   [Google CDN](https://developers.google.com/speed/libraries/devguide#jquery) ``

Jquery 형태 기억하기.
 $(document).ready(function(){}); 
 ()안에 css에서 범위 지정해주는 형식처럼 해주면 된다. (ex : div.p) 범위 중요!
-body가 랜더링이 끝나고 메모리에 올라온 후, 문서가 준비가 되면 function(){"내용"}; 내용작동
 function()은 일반함수가 아니라 콜백함수.(문서에 관련된거면 반드시 저 영역안에서 사용.)

Form Event
submit : Form 안에 값들을 내보낼때 ,focus <->blur(초점이 떠날때,)

[W3Schools Tryit Editor](https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_dblclick) `더블클릭시 사라지는 예제.`
태그 안에서도 영역 잡을때, <span>











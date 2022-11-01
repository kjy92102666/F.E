※ Table Generator - 테이블만들때 좋은 툴!
03_06Input

label.html
 input type =password, id값 주고 데이터은닉?
	텍스트까지 기능으로 영역 잡을때!
	<label>  
	      아이디
	      <input type="text">
	 </label>
input.html  :  html 여러가지 input기능들.
 <input type="hidden">
 <!--입력안해도 내부 값을 hidden을 숨겨서 값을 처리함.(사용자용x)-->
  <input type="range"><!-- 원하는 값을 슬라이드값으로~-->
maxlength.html : 최대크기 이상 값입력x
placeholder.html  :  placeholder 안내. 입력값 예시표기. 값 입력시 사라짐.
 <input type="tel" placeholder="xxx-xxxx-xxxx.전화번호를 입력해 주세요.">
readonly.html  :  값을 찍어놓고 입력을 받지않는 input_기능.
 <input type="text" readonly>

  <textarea readonly></textarea>

disabled.html : 비활성화되는 기능.
 readonly & disabled _ _<input type="text" disabled readonly value="1234">
 <button type="button" disabled>비활성</button>
checked.html  :  꾸며진 체크박스?
 <fieldset>
      <legend>좋아하는 과일</legend>
      <input type="checkbox" id="banana" name="banana" value="banana">
      <label for="banana">banana</label><br>
      
      <input type="checkbox" id="apple" name="apple" value="apple">
      <label for="apple">apple</label><br>
      
      <input type="checkbox" id="orange" name="orange" value="orange"  checked>
      <label for="orange">orange</label><br>
    </fieldset>
button.html  :  버튼안에 텍스트 위치 정렬?
    button{  margin-top:10px;;  }
    button img{  vertical-align:bottom;  }
 <button type="submit">
      <img src="facebook.png" alt="페이스북 버튼">
      페이스북에 등록하기
    </button>
select.html  :  select & option 태그만 사용
select&disabled.html  :  셀렉트 옵션에  품절표시할때 사용.
 <fieldset>
      <legend>사은품 선택</legend>
        <label for="gift">사은품</label>
        
        <select name="gift" id="gift">
          <option value="echobag">에코백</option>
          <option value="discount" disabled>10% 할인 쿠폰(품절)</option>                
        </select>
        <input type="submit" value="선택">

    </fieldset>

select&multiple.html  :  여러개 드래그 선택하는 옵션. 주의합시다.
     <fieldset>

      <legend>개인 정보 입력</legend>

        <label for="city">지역</label>

        <input name="text" size="5" maxsize="2">

        <select name="city" id="city" size="3" multiple>

          <option value="강북구">강북구</option>

          <option selected value="강남구">강남구</option>

          <option value="서초구">서초구</option>

          <option value="중원구">중원구</option>

          <option value="분당구">분당구</option>

        </select>

        <input type="submit" value="등록">

     </fieldset>
select&optgroup.html  :  한 목록 안에 1차,2차 그룹을 나누어 선택.
 <fieldset>

      <legend>개인 정보 입력</legend>

        <label for="city">지역</label>

        <select name="city" id="city">

          <optgroup label="서울시">

            <option value="강북구">강북구</option>

            <option value="강남구">강남구</option>

            <option value="서초구">서초구</option>

          </optgroup>

          <optgroup label="경기도 성남시">

            <option value="중원구">중원구</option>

            <option value="분당구">분당구</option>

          </optgroup>

        </select>

        <input type="submit" value="등록">

    </fieldset>
textarea.html  :  
 <fieldset>
    <legend>블로그 글쓰기</legend>
    <p>
      <label for="title">제목
        <input type="text" id="title" name="title">
      </label>
    </p>

    <p>
      <label for="desc">내용
        <textarea id="desc" name="desc" readonly></textarea>
      </label>
    </p>
  </fieldset>


03_07     .    //※ Table Generator - 테이블만들때 좋은 툴!
table.html  : tr,th,td colspan,rowspan. border-collapse : 숨김.
 <table>

    <tr>

      <th>번호</th>

      <th>상품명</th>

      <th>수량</th>

      <th>가격</th>

    </tr>

    <tr>

      <td>1</td>

      <td>콜라</td>

      <td>1개</td>

      <td>1,500원</td>

    </tr>

    <tr>

      <td>2</td>

      <td>사이다</td>

      <td>2개</td>

      <td rowspan="2">1,000원</td> <!-- 행 병합-->

    </tr>

    <tr>

      <td>3</td>

      <td>탄산수</td>

      <td>3개</td>

      <!-- 4행 4열은 3행 4열과 병합했으므로 생성하지 않습니다. -->

    </tr>

    <tr>

      <td>총 금액</td>

      <td colspan="3">6,500원</td> <!-- 열 병합-->

      <!-- 5행 2열부터 열 3개를 병합했으므로 나머지 열은 생성하지 않습니다. -->

    </tr>

  </table>
colgroup.html  :  테이블 전체의 크기를 조절
 <colgroup span="2" style="width:150px"></colgroup>
 <colgroup span="2" style="width:150px"></colgroup>

scope.html  :  

03_08   .  // mp4는 영상, mp3  (mp=엠팩?)
audio_source.html  :  wav,mp3,mp4... 파일들 재생 예제. control하지 않으면 나오지 않는다.
video.html  :  영상재생예제. autoplay는 현재 지원x.
audio.html  :  음악재생예제.
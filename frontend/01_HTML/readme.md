## HTML5 개요
### 1. HTML5 (Hyper Text Markup Language 5)
* HTML5는 웹에서 정보를 표현할 목적으로 만든 마크업 언어이다.
* 하이퍼텍스트란 웹 문서 내에서 링크를 클릭해 다른 문서나 사이트로 이동하는 기능을 말한다.
* 마크업 언어란 태그를 사용해 문서의 구조를 정의하는 언어이다.
### 2. HTML5 태그(Tag)
* 태그(Tag)는 < 와 >로 묶인 부분이다.
* 대부분의 태그는 시작 태그(<태그명>)와 종료 태그(</태그명>)가 한 쌍으로 이루어진다.
* 태그는 대/소문자를 구분하지 않지만 소문자를 사용하는 것을 권장한다.
  ``` html
  <h1>제목</h1>
  ```
* 태그에는 여러 기능을 추가하는 속성을 사용할 수 있다.
* 속성(Attribute)은 시작 태그에만 작성할 수 있고 속성 값은 " ", ' '를 사용하여 기술한다.
* 태그마다 사용할 수 있는 속성들이 다르기 때문에 태그와 속성을 함께 익혀야 한다.
  ``` html
  <p align="center">HTML/CSS</p>
  ```
### 3. HTML 문서의 기본 구조
* HTML 문서는 일반 문서와 달리 정해진 형식에 맞춰 내용을 입력해야 한다.
* 파일 확장자는 반드시 html 또는 htm으로 설정해야 한다.
  ```html
  <!DOCTYPE html> <!-- 문서 유형 -->
  <html lang="ko"> <!-- HTML 문서의 시작 -->
      <head>
          <!-- 문서의 각종 정보와 문서 자체에 대한 내용 -->
      </head>
      <body>
          <!-- 화면에 출력해서 보여주는 내용 -->
      </body>	
  </html> <!-- HTML 문서의 끝 -->
  ```
* HTML에서 주석은 `<!--  -->`안에 작성하는데 브라우저는 주석 부분을 해석하지 않고 넘어간다.
* HTML 문서 내에서 공백은 몇 개를 입력하든 한 개만 인식한다.
* 한 개 이상의 공백을 추가하기 위해서 특수기호 `&nbsp;`를 이용해야 한다.
## 글자 관련 태그
### 1. 제목 태그
* 제목을 입력할 때 사용하는 태그로 폰트의 크기가 태그마다 정해져 있다.
* Heading의 줄임말인 h와 제목 크기를 나타내는 숫자로 표현한다.
  ```html
  <h1>첫 번째로 큰 제목</h1>
  <h2>두 번째로 큰 제목</h2>
  <h3>세 번째로 큰 제목</h3>
  <h4>네 번째로 큰 제목</h4>
  <h5>다섯 번째로 큰 제목</h5>
  <h6>여섯 번째로 큰 제목</h6>
  ```
### 2. 단락을 구분하는 태그
* 텍스트 단락을 만들 때 사용하는 태그이다.
* Paragraph의 줄임말로 시작 태그와 종료 태그 사이의 문자들을 하나의 단락으로 인식한다.
  ```html   
  <p>텍스트 단락을 나타내는 태그이다.</p>
  ```
### 3. 줄바꿈 태그
* 브라우저에서 줄바꿈을 할 때 사용하는 태그이다.
* Break의 줄임말로 종료 태그가 없다.
  ```html
  <br>
  ```
### 4. 수평 줄 태그
* 브라우저에서 수평 줄을 삽입할 때 사용하는 태그이다.
* Horizontal의 줄임말로 종료 태그가 없다.
  ```html
  <hr>
  ```
### 5. 강조 태그
* 문장에서 문자를 강조하여 굵게 표시할 경우 사용에 사용한다.
* 시작 태그와 종료 태그 사이의 문자들을 굵게 표시한다.
  ```html
  <b>굵게 표시</b> <!-- bold의 줄임말 -->
  <strong>강조하여 굵게 표시</strong>
  ```
### 6. 기울임 태그
* 문자에 기울임을 주는 태그이다.
* 시작 태그와 종료 태그 사이의 문자들을 기울여 표시한다.
  ```html
  <i>기울임 표시</i> <!-- Itelic의 줄임말 -->
  <em>기울임 표시</em> <!-- Emphasized의 줄임말 -->
  ```
### 7. 밑줄 태그
* 문자에 밑줄을 긋는 태그이다.
* Underline의 줄임말로 시작 태그와 종료 태그 사이의 문자들에 밑줄을 긋는다.
  ```html
  <u>밑줄 태그</u>
  ```
### 8. 취소선 태그
* 문자에 취소선을 긋는 태그이다.
* Strikethrough의 줄임말로 시작 태그와 종료 태그 사이의 문자들에 취소선을 긋는다.
  ```html
  <s>취소선 태그</s>
  ```
## 목록 관련 태그
### 1. 순서 없는 목록 태그
* 순서 없는 목록을 만들 때 사용하는 태그이다.
* Unordered List의 줄임말로 시작 태그와 종료 태그 사이에 항목을 표시한다.
* 각 항목은 `<li>` 태그(List Item)를 사용한다. (종료 태그 생략 가능)
* 순서 없는 목록은 각 항목 앞에 원이나 사각형의 불릿(Bullet)이 붙는다.
  ``` html
  <ul>
	  <li>내용 1</li>
	  <li>내용 2</li>
	  <li>내용 3</li>
  </ul>
  ```
### 2. 순서 있는 목록 태그
* 순서 있는 목록을 만들 때 사용하는 태그이다.
* ordered list의 줄임말로 시작 태그와 종료 태그 사이에 항목을 표시한다.
* 각 항목은 `<li>` 태그(List Item)를 사용한다. (종료 태그 생략 가능)
* 속성 값에 따라 다른 형태로 항목을 표시할 수 있다.
  * type은 항목 앞에 표시되는 숫자의 종류를 변경할 수 있다.
    |속성 값|설명|
    |:--:|--|
    |1|숫자(기본값)|
    |a|알파벳 소문자|
    |A|알파벳 대문자|
    |i|로마숫자 소문자|
    |I|로마숫자 대문자|
  * start 속성으로 항목의 시작 번호를 변경할 수 있다. (기본값 1)
  * reversed 속성은 항목을 역순으로 표시한다.
  ```html
  <ol type="1|a|A|i|I" start="시작순서" reversed>
	  <li>내용 1</li>
	  <li>내용 2</li>
	  <li>내용 3</li>
  </ol>
  ```
## 표 관련 태그
### 1. 표(Table) 태그
* 표(Table)는 웹 문서에서 자료를 정리할 때 주로 사용하는 태그이다.
* 표는 행(row)과 열(column)로 이루어져 있고 행과 열이 만나는 영역을 셀(cell)이라고 한다.
#### 1.1 표 생성
* 표를 만드는 기본적인 태그에는 `<table>, <tr>, <th>, <td>`가 있다.
  * table 태그는 표를 생성해 주는 태그로 표의 시작과 끝을 나타낸다.
  * tr(Table Row) 태그는 표의 행을 나타내는 태그이다.
  * th(Table Header) 태그는 표의 제목 셀을 나타내는 태그이다. (가운데 정렬, 글자 굵게)
  * td(Table Data) 태그는 표의 일반 셀을 나타내는 태그이다.
  ```html
  <table>
    <tr>
        <th>제목</th>
        <th>제목</th>
    </tr>
    <tr>
        <td>내용</td>
        <td>내용</td>
    </tr>
    <tr>
        <td>내용</td>
        <td>내용</td>
    </tr>
  </table>
  ```
#### 1.2. 표 속성
* border 속성을 사용하여 표의 테두리 두께를 지정할 수 있다.
* border 속성은 table 태그에서 작성 가능한 속성이다.
  ```html
  <table border="두께"></table>
  ```
* colspan 속성을 사용해서 가로로 셀을 합칠 수 있다.
* rowspan 속성을 사용해서 세로로 셀을 합칠 수 있다.
* rowspan, colspan 속성은 셀을 합치는 속성으로 td 태그나 th 태그에서 작성 가능한 속성이다.
  ``` html
  <table>
    <tr>
      <td colspan="2">내용1</td>
    </tr>
    <tr>
      <td>내용2</td>
      <td>내용3</td>
    </tr>
  </table>
  ```
  ``` html
  <table>
    <tr>
      <td rowspan="2">내용1</td>
      <td>내용2</td>
    </tr>
    <tr>
      <td>내용3</td>
    </tr>
  </table>
  ```
### 2. 표 구조 태그
* 표의 구조를 정의하는 태그에는 `<thead>, <tbody>, <tfoot>`가 있다.
  * thead 태그는 표의 제목 영역에 해당하는 태그로 표에 하나만 존재해야 한다.
  * tbody 태그는 표의 본문 영역에 해당하는 태그로 표에 여러 개가 존재할 수 있다.
  * tfoot 태그는 표의 요약 영역에 해당하는 태그로 표에 하나만 존재해야 한다.
  ```html
  <table border="1">
    <thead>
      <!-- 표의 제목에 해당하는 영역 -->
    </thead>
    <tbody>
      <!-- 표의 본문에 해당하는 영역 -->
    </tbody>
    <tfoot>    
      <!-- 표의 요약에 해당하는 영역 -->
    </tfoot>
  </table>
  ```
## 폼(Form) 관련 태그
### 1. 웹 폼(Form)
* 폼은 웹 문서에서 자주 사용하는 기술로 사용자에게 의견이나 정보를 받기 위해 사용한다.
* 폼 관련 태그들은 웹 문서에서 사용자가 입력할 수 있는 양식을 제공하는 태그이다.
### 2. form 태그
* 폼을 만드는 태그로 시작 태그와 종료 태그 사이에 폼과 관련된 태그들을 넣는다.
* form 태그 내에서 사용자가 입력한 정보를 서버로 넘기면서 요청하는 역할을 한다.
  ```html
  <form action="" method="GET">
    ...
  </form>
  ```
* form 태그 속성
  |속성|설명|
  |--|--|
  |name|form 태그의 이름을 지정한다.|
  |method|데이터 전송 방식을 지정한다.<br>GET 방식은 데이터를 URL에 노출시켜서 서버에 전달한다.<br>POST 방식은 데이터를 URL에 노출시키지 않고 서버에 전달한다.|
  |action|데이터를 전달할 서버(페이지)를 지정한다.|
  |autocomplete|이전 입력 내용 출력하도록 지정한다. (default: on)|
### 3. label 태그
* 폼 요소에 레이블을 붙이기 위해 사용하는 태그이다.
  ```html
  <!-- 레이블 태그 안에 폼 요소를 넣는 방법 -->
  <label>아이디 : <input type="text"></label>

  <!-- 레이블 태그와 폼 요소를 따로 만들고 연결하는 방법 -->
  <label for="password">패스워드 : </label>
  <input type="password" id="password">
  ```
### 4. fieldset, legend 태그
* fieldset 태그는 폼 요소를 그룹으로 묶는 태그이다.
* legend 태그는 fieldset 태그로 묶은 폼 요소에 제목을 붙이는 태그이다.
  ```html
  <form>
    <fieldset>
      <legend>회원정보</legend>
            
      <label>아이디 : <input type="text"></label><br>
      <label>비밀번호 : <input type="password"></label><br>
    </fieldset>
  </form>
  ```
### 5. input 태그
* 사용자로부터 데이터를 입력 받기 위한 태그이다.
* type 속성에 따라 입력 받는 데이터가 결정된다. (텍스트, 날짜, 이미지, 버튼 등등)
* input 태그의 기본 속성
  |속성|설명|
  |--|--|
  |id|동일한 타입의 폼 요소를 구분하기 위해 사용한다.|
  |name|태그를 구별할 수 있도록 이름을 붙인다.<br>(submit 시 서버로 전송되는 값들을 구분하기 위한 키값으로 사용된다.)|
  |autofocus|요소에 마우스 커서를 표시한다.|
  |required|필수로 입력해야 되는 태그에 사용한다.|
  |readonly|읽기 전용으로 설정한다.|
  |placeholder|텍스트 입력에 도움이 되는 힌트를 표시한다.|
#### 5.1. hidden 타입
* 화면에는 보이지 않지만 서버로 데이터를 전송할 때 함께 전송되는 타입이다.
  ```html
  <input type="hidden" name="이름" value="값">
  ```
#### 5.2. text 타입
* 사용자로부터 한 줄의 텍스트를 입력받을 수 있는 타입이다.
  ```html
  <input type="text" name="이름">
  ```
* text 타입 속성
  |속성|설명|
  |--|--|
  |size|텍스트 필드의 길이를 지정한다.|
  |value|텍스트 필드에 표시될 내용을 지정한다. (생략 시 빈 텍스트 필드가 보임)|
  |maxlength|텍스트 필드에 입력할 수 있는 최대 문자 개수를 지정한다.|
#### 5.3. password 타입
* 사용자로부터 비밀번호를 입력받을 수 있는 타입이다.
* text 타입과 다르게 사용자가 입력하는 값이 표시되지 않고 '*' 또는 '●' 표시된다.
  ```html
  <input type="password" name="이름">
  ```
#### 5.4. search 타입
* 사용자로부터 검색 값을 입력받기 위한 타입이다.
* text 타입과 다르게 검색어 입력 시 'X'가 표시되고 검색어를 쉽게 지울 수 있다.
  ```html
  <input type="search" name="이름">
  ```
#### 5.5. url 타입
* 사용자로부터 URL을 입력받기 위한 타입이다.
* 입력받은 값이 URL 형식이 맞는지 자동으로 체크해 준다.
  ```html
  <input type="url" name="이름">
  ```
#### 5.6. email 타입
* 사용자로부터 email 주소를 입력받기 위한 타입이다. (공백 X, 영문자, 마침표, 슬래시)
* 입력받은 값이 email 주소 형식이 맞는지 자동으로 체크해 준다.
  ```html
  <input type="email" name="이름">
  ```
#### 5.7. tel 타입
* 사용자로부터 전화번호를 입력받기 위한 타입이다.
* 모바일 기기의 경우 가상 키보드 배열이 전화번호를 입력받을 수 있도록 바뀐다.
  ```html
  <input type="tel" name="이름">
  ```
#### 5.8. number 타입
* 사용자로부터 숫자를 입력받기 위한 타입이다.
* 브라우저에 따라서 스핀 박스가 표시되기도 한다. (스핀 박스: 입력창 오른쪽에 위/아래 화살표 버튼)
* number 타입 속성
  |속성|설명|
  |--|--|
  |min|입력할 수 있는 최소값|
  |max|입력할 수 있는 최대값|
  |step|증감되는 숫자의 간격을 지정한다. (기본값: 1)|
  |value|표시할 초기값|
  ```html
  <input type="number" name="이름">
  ```
#### 5.9. range 타입
* 사용자로부터 슬라이드바를 통해 숫자를 입력받기 위한 타입이다.
  ```html
  <input type="range" name="이름">
  ```
* range 타입 속성
  |속성|설명|
  |--|--|
  |min|입력할 수 있는 최소값 (기본값: 0)|
  |max|입력할 수 있는 최대값 (기본값: 100)|
  |step|증감되는 숫자의 간격을 지정한다. (기본값: 1)|
  |value|표시할 초기값|
#### 5.10. color 타입
* 사용자로부터 색상을 입력받기 위한 타입으로 색상표에서 원하는 색상을 선택할 수 있다.
* value 속성으로 초기 색상을 지정할 수 있다.
  ```html
  <input type="color" name="이름" value="#ffffff">
  ```
#### 5.11. file 타입
* 사용자로부터 파일을 첨부하려고 할 때 사용하는 타입이다.
* multiple 속성을 통해 파일을 다중으로 선택할 수 있다.
  ```html
  <input type="file" name="이름">
  ```
#### 5.12. radio 타입
* 여러 항목 중 한 가지만 선택할 수 있는 타입이다.
* 여러 개를 선언하여 하나의 용도로 사용할 경우 name 속성의 값이 같아야 한다.
* value 속성은 서버로 넘길 라디오 버튼의 값을 지정한다.
* checked 속성은 기본적으로 선택할 항목이 있다면 사용한다.
  ```html
  <input type="radio" name="gender" value="남자" checked>
  <input type="radio" name="gender" value="여자">
  ```
#### 5.13. checkbox 타입
* 여러 항목 중 여러 가지를 선택할 수 있는 타입이다.
* 여러 개를 선언하여 하나의 용도로 사용할 경우 name 속성의 값이 같아야 한다.
* value 속성은 서버로 넘길 체크박스의 값을 지정한다.
* checked 속성은 기본적으로 선택할 항목이 있다면 사용한다.
  ```html
  <input type="checkbox" name="food" value="한식" checked>
  <input type="checkbox" name="food" value="중식">
  <input type="checkbox" name="food" value="일식">
  ```
#### 5.14. date 타입
* 사용자로부터 년/월/일의 날짜 데이터를 입력받기 위한 타입이다.
  ```html
  <input type="date" name="이름" value="2022-05-20">
  ```
#### 5.15. month 타입
* 사용자로부터 년/월의 날짜 데이터를 입력받기 위한 타입이다.
  ```html
  <input type="month" name="이름" value="2022-05">
  ```
#### 5.16. week 타입
* 사용자로부터 주(Week)에 대한 데이터를 입력받기 위한 타입이다.
  ```html
  <input type="week" name="이름" value="2022-W10">
  ```
#### 5.17. time 타입
* 사용자로부터 시간(시/분/초) 정보를 입력받기 위한 타입이다.
  ```html
  <input type="time" name="이름" value="23:59">
  ```
#### 5.18. datetime-local 타입
* 사용자로부터 년/월/일/시/분/초에 대한 데이터를 입력받기 위한 타입이다.
  ```html
  <input type="datetime-local" name="이름" value="2022-05-20T23:59:59">
  ```
#### 5.19. button 타입
* 사용자가 클릭할 수 있는 버튼을 만드는 타입이다.
* value 속성을 사용해 버튼에 표시할 내용을 지정할 수 있다.
  ```html
  <input type="button" name="이름" value="확인">
  ```
#### 5.20. submit 타입
* form 태그 안에 작성된 모든 input 태그의 값을 서버로 전송하는 타입이다. (action 속성에 지정한 서버(페이지)에 전송)
* value 속성을 사용해 버튼에 표시할 내용을 지정할 수 있다.
  ```html
  <input type="submit" name="이름" value="전송">
  ```
#### 5.21. reset 타입
* form 태그 안에 작성된 모든 input 태그의 값을 초기화할 때 사용하는 타입이다.
* value 속성을 사용해 버튼에 표시할 내용을 지정할 수 있다.
  ```html
  <input type="reset" name="이름" value="취소">
  ```
### 6. 여러 값 표현 태그
* 사용자에게 여러 개의 데이터를 보여주고 사용자가 선택할 수 있도록 하는 태그이다.
#### 6.1. select 태그
* 드롭 다운을 이용해서 여러 개의 데이터 목록 중에 하나의 값을 선택하도록 하는 태그이다.
* option 태그를 사용해서 데이터 목록을 추가한다.
  ```html
  <label for="national">국적 : </label>

  <select name="national" id="national">
    <option value="ko">한국</option>
    <option value="ch">중국</option>
    <option value="jp">일본</option>
  </select>
  ```
* select 태그 속성
  |속성|설명|
  |--|--|
  |size|드롭 다운 목록의 개수를 지정한다. (기본값: 1)|
  |multiple|Ctrl 키를 누른 상태로 여러 개의 드롭 다운 목록을 선택할 수 있도록 한다.|
* option 태그 속성
  |속성|설명|
  |--|--|
  |value|옵션을 선택했을 때 서버로 전송된 값을 지정한다.|
  |selected|드롭 다운 목록 중에 기본적으로 선택되어 있는 옵션을 지정한다.|
#### 6.2. datalist 태그
* 텍스트 필드에서 데이터 목록 중에 하나의 값을 선택하도록 만들어주는 태그이다.
* option 태그를 사용해서 데이터 목록을 추가한다.
  ```html
  <label>취미 : <input type="text" name="hobby" list="hobbies"></label>
        
  <datalist id="hobbies">
    <option value="basketball">농구</option>
    <option value="football">축구</option>
    <option value="baseball">야구</option>
  </datalist>
  ```
### 7. 기타 폼 태그
#### 7.1. button 태그
* 사용자가 클릭할 수 있는 버튼을 만드는 태그이다.
* button 태그를 통해서도 폼을 전송하거나 리셋하기 위한 버튼을 삽입할 수 있다.
  ```html
  <!-- type 생략 시 submit으로 동작한다. -->
  <button>전송</button>
  <button type="submit">전송</button>
  <button type="reset">리셋</button>
  <button type="button">버튼</button>
  ```
#### 7.2.textarea 태그
* 여러 줄의 텍스트를 입력할 수 있는 태그이다.
  ```html
  <textarea name="이름"></textarea>
  ```

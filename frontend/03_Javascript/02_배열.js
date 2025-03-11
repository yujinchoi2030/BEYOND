window.onload = function() 
{
    // js 객체로 얻어옴
    // 1. 배열 선언 및 초기화
    let btn1 = document.getElementById('btn1');

    // btn1.onclick = function()
    // {
    //     alert('버튼 클릭');
    // }

    // 콜백함수라는딩?
    btn1.addEventListener('click', function()
    {
        let array1 = [];
        let array2 = new Array();
        let array3 = new Array(3);
        let array4 = new Array('빨강', '파랑', '초록', '노랑');
        let array5 = Array.of('빨강', '파랑', '초록', '노랑');
        let array6 = ['빨강', '파랑', '초록', '노랑'];
        
        let div1 = document.getElementById('div1');

        console.log(array1, array2, array3);
        console.log(array4, array5, array6);

        array1[0] = '사과';
        array1[1] = '포도';
        array1[2] = '딸기';

        console.log(array1);

        div1.innerHTML = '<h4>array1 출력</h4>';

        for (const value of array1)
        {
            div1.innerHTML += `${value} `;
        }

        array2[0] = '홍길동';
        array2[1] = 24;
        array2[2] = false;
        array2[3] = {};
        array2[4] = [1, 2, 3, 4];
        array2[5] = function () {};

        div1.innerHTML += '<h4>array2 출력</h4>';

        for (const value of array2)
        {
            div1.innerHTML += `value: ${value}, type: ${typeof(value)}<br>`;
        }

    });


    // 2. 배열의 메서드
    let btn2 = document.getElementById('btn2');

    btn2.addEventListener('click', function()
    {
        // 1) indexOf() - 해당 요소가 위치한 인덱스 반환
        let array = ['귤', '사과', '자몽', '망고', '복숭아'];

        div2.innerHTML = '<h4>indexOf()</h4>';
        div2.innerHTML += `array: [${array}]<br><br>`;
        div2.innerHTML += `indexOf('귤'): ${array.indexOf('귤')}<br>`;
        div2.innerHTML += `indexOf('복숭아'): ${array.indexOf('복숭아')}<br>`;
        div2.innerHTML += `indexOf('수박'): ${array.indexOf('수박')}<br>`;

        // 2) concat() - 문자열 합치기이기 때문에 원본 배열에는 영향을 미치지 않는다.
        let array1 = ['귤', '사과', '자몽', '망고', '복숭아'];
        let array2 = ['바나나', '수박', '오렌지', '딸기', '두리안'];

        div2.innerHTML += '<h4>concat()</h4>';
        div2.innerHTML += `array1: [${array1}]<br>`;
        div2.innerHTML += `array2: [${array2}]<br><br>`;
        div2.innerHTML += `array1.concat(array2) [${array1.concat(array2)}]<br>`;
        div2.innerHTML += `array2.concat(array1) [${array2.concat(array1)}]<br>`;

        // 3) sort() - 순서 정렬 때문에 원본 배열에도 영향을 미친다.
        let array3 = ['Apple', 'Cherry', 'apple', 'Banana'];
        let array4 = [10, 543, 30, 450, 123, 4885];

        div2.innerHTML += '<h4>sort()</h4>';
        div2.innerHTML += `array3: [${array3}]<br>`;
        div2.innerHTML += `array4: [${array4}]<br>`;
        div2.innerHTML += `array3.sort(): [${array3.sort()}]<br>`;
        div2.innerHTML += `array4.sort(): [${array4.sort()}]<br>`;

        // sort() 메서드에 함수를 매개값으로 전달해서 정렬 기준을 변경할 수 있다.
        // - 비교하는 값이 같으면 0을 반환한다.
        // - 첫 번째 매개값이 크면 양수를 반환한다.
        // - 두 번째 매개값이 작으면 음수를 반환한다.
        array4.sort(function (left, right) // array4.sort((left, right) => right - left);
        {
            //return left - right; // 오름차순 정렬
            return right - left; // 내림차순 정렬
        });

        div2.innerHTML += `array4: [${array4}]<br>`;

        // 4) reverse() - 원본 배열에도 영향을 미친다.
        let array5 = ['Apple', 'Cherry', 'apple', 'Banana'];

        div2.innerHTML += '<h4>reverse()</h4>';
        div2.innerHTML += `array5.reverse(): [${array5.reverse()}]<br>`;
        div2.innerHTML += `array5: [${array5}]<br>`;
        // reverse() 를 이용해 내림차순으로 정렬합니다.
        div2.innerHTML += `array5.sort().reverse(): [${array5.sort().reverse()}]<br>`;

        //5) push() - 배열의 뒤에 요소를 추가한다.
        let array6 = ['포도', '사과', '딸기', '수박'];

        div2.innerHTML += '<h4>push(), pop()</h4>';
        div2.innerHTML += `array6.push('바나나'): [${array6.push('바나나')}]<br>`;
        div2.innerHTML += `array6: [${array6}]<br>`;
        div2.innerHTML += `array6.push('망고'): [${array6.push('망고')}]<br>`;
        div2.innerHTML += `array6: [${array6}]<br><br>`;

        //5) pop() - 배열의 마지막 요소를 제거하고 제거한 요소를 반환한다.
        div2.innerHTML += `array6.pop(): [${array6.pop()}]<br>`;
        div2.innerHTML += `array6: [${array6}]<br>`;
        div2.innerHTML += `array6.pop(): [${array6.pop()}]<br>`;
        div2.innerHTML += `array6: [${array6}]<br><br>`;

        // 6) unshift() - 배열의 앞에 요소를 추가한다.
        let array7 = ['포도', '사과', '딸기', '수박'];

        div2.innerHTML += '<h4>unshift()</h4>';
        div2.innerHTML += `array7: [${array7}]<br>`;
        div2.innerHTML += `array7.unshift('바나나'): [${array7.unshift('바나나')}]<br>`;
        div2.innerHTML += `array7: [${array7}]<br>`;
        div2.innerHTML += `array7.unshift('망고'): [${array7.unshift('망고')}]<br>`;
        div2.innerHTML += `array7: [${array7}]<br><br>`;

        // 6) shift() - 배열의 첫 번째 요소를 제거하고 제거한 요소를 반환한다.
        div2.innerHTML += `array7.shift(): [${array7.shift()}]<br>`;
        div2.innerHTML += `array7: [${array7}]<br>`;

        // 7) slice() - 배열의 요소를 잘라낸 새로운 배열을 반환기에 원본 배열은 변경되지 않는다.
        let array8 = ['포도', '사과', '딸기', '수박', '복숭아', '바나나'];

        div2.innerHTML += '<h4>slice()</h4>';
        div2.innerHTML += `array8: [${array8}]<br>`;
        div2.innerHTML += `array8.slice(2): [${array8.slice(2)}]<br>`;
        // 4번 인덱스 포함이 아닌 이전까지의 값 반환 - 딸기, 수박
        div2.innerHTML += `array8.slice(2,4): [${array8.slice(2,4)}]<br><br>`;

        // 7) splice() - 배열의 특정 인덱스에 요소를 추가/삭제할 수 있다. (원본 배열에 영향 미침)
        div2.innerHTML += `array8: [${array8}]<br>`;
        div2.innerHTML += `array8.splice(2): [${array8.splice(2)}]<br>`; // '딸기', '수박', '복숭아', '바나나'
        div2.innerHTML += `array8: [${array8}]<br><br>`; // '포도', '사과'

        array8 = ['포도', '사과', '딸기', '수박', '복숭아', '바나나'];

        div2.innerHTML += `array8: [${array8}]<br>`;
        div2.innerHTML += `array8.splice(2,2): [${array8.splice(2,2)}]<br>`; // [딸기,수박]
        div2.innerHTML += `array8: [${array8}]<br><br>`;// [포도,사과,복숭아,바나나]

        array8 = ['포도', '사과', '딸기', '수박', '복숭아', '바나나'];

        div2.innerHTML += `array8: [${array8}]<br>`;
        div2.innerHTML += `array8.splice(2,2, '파인애플'): [${array8.splice(2,2, '파인애플')}]<br>`; // [딸기,수박]
        div2.innerHTML += `array8: [${array8}]<br><br>`; // [포도,사과,파인애플,복숭아,바나나]

        array8 = ['포도', '사과', '딸기', '수박', '복숭아', '바나나'];

        div2.innerHTML += `array8: [${array8}]<br>`;
        div2.innerHTML += `array8.splice(2,0, '파인애플', '키위'): [${array8.splice(2,0, '파인애플', '키위')}]<br>`; // []
        div2.innerHTML += `array8: [${array8}]<br>`; // [포도,사과,파인ㄷ애플,키위,딸기,수박,복숭아,바나나]

        // 8) toString() - 배열을 문자열로 반환한다.
        // 8) join() - 배열의 요소를 특정 구분자로 연결한 문자열로 변환 후 반환한다.
        let array9 = ['포도', '사과', '딸기', '수박'];

        div2.innerHTML += '<h4>toString()</h4>';
        div2.innerHTML += `array9: [${array9}]<br>`;
        div2.innerHTML += `array9.toString(): [${array9.toString()}]<br>`; // 포도,사과,딸기,수박
        div2.innerHTML += `array9.join(): [${array9.join()}]<br>`; // 포도,사과,딸기,수박
        div2.innerHTML += `array9.join('|'): [${array9.join('|')}]<br>`; // 포도|사과|딸기|수박

        // 9) forEach() - 배열의 요소를 한 번씩 순회하며 반복하는 메서드
        // -  반복문을 직접 작성하지 않고도 반복문 수행 가능
        let array10 =  ['포도', '사과', '딸기', '수박'];

        div2.innerHTML += '<h4>forEach()</h4>';
        // array10.forEach(function(value, index, arr){
        //     div2.innerHTML += `value: ${value}, index: ${index}<br>`
        // });

        // 람다식이 아니라 애로우함수 입니다.
        array10.forEach((value, index) => div2.innerHTML += `value: ${value}, index: ${index}<br>`);
    
        // 10) reduce() - 배열의 각 요소에 대해 콜백함수의 실행 값을 누적하여 하나의 결과값을 반환한다.
        // 초기값이 10
        // 첫 번째 계산: 10 * 3 = 30, 두 번째 계산: 30 * 5 = 150
        // 세 번째 계산: 150 * 7 = 1050, 네 번째 계산: 1050 * 9 = 9450
        let array11 =  [3, 5, 7, 9];

        div2.innerHTML += '<h4>reduce()</h4>';
        // let result = array11.reduce(function (left, right){
        //     return left * right;
        // }, 10);

        // 람다식이 아니라 애로우함수 입니다.
        let result = array11.reduce((left, right) => left * right, 10);

        div2.innerHTML +=  `result: ${result}<br>`;

        // 11) filter() - 배열에서 특정 조건을 만족하는 요소들로 새로운 배열을 생성한다. (원본 배열에 영향을 미치지 않음)
        let array12 =  [1, 2, 3, 4, 5, 6];

        div2.innerHTML += '<h4>filter()</h4>';
        // let newArray = array12.filter(function (value, index, arr){
        //     return value % 2 == 0;
        // });

        let newArray = array12.filter(value => value % 2 == 0);

        div2.innerHTML += `newArray: [${newArray}]<br>`; // 2,4,6
        div2.innerHTML += `array12: [${array12}]<br>`; // 1,2,3,4,5,6


    })
}
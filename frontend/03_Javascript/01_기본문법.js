// HTML 태그(요소)에 접근(아이디로 접근)
// document.getElementById('heading').style.color='green';

// 1. 변수
// 1) 변수 선언
// 전역 변수
var str1 = 'var 전역 변수';
let str2 = 'let 전역 변수';
const str3 = 'const 전역 변수';

// 자바스크립트에서 페이지가 모두 로드되면 실행될 함수를 구현할 때 사용한다.
window.onload = function() {
    // document.getElementById('heading').style.color='green';

    // 지역 변수
    var str4 = 'var 지역 변수';
    let str5 = 'let 지역 변수'
    const str6 = 'const 지역 변수';

    // 전역 변수명과 동일한 
    let str2 = 'let 지역 변수';

    console.log(str1);
    console.log(str2);
    console.log(str3);
    console.log(str4);
    console.log(str5);
    console.log(str6);

    console.log('-------------------------------------------------');

    // var, let, const 차이점
    // **var**는 이전 버전의 JavaScript에서 사용되었지만, 블록 스코프와 같은 개선된 기능이 필요하므로, 새로운 코드에서는 사용을 피하는 것이 좋습니다.
    // **let**은 값의 재할당이 필요하고, 블록 스코프를 사용해야 할 때 사용합니다.
    // **const**는 상수 값으로 사용하거나, 재할당이 필요 없는 값을 선언할 때 사용합니다.

    // 1) 중복 선언
    // - var 키워드로 선언된 변수는 중복 선언이 가능하다.

    var num1 = 10;
    console.log(num1);

    var num1 = 20;
    console.log(num1);

    // - let, const 키워드로 선언된 변수는 중복 선언이 불가능하다.
    let num2 = 10;
    console.log(num2);

    // let num2 = 20;
    // console.log(num2);

    // - const 키워드로 선언과 동시에 초기화를 해야하며, 값 재할당 불가
    // const num3 = 10;
    // num3 = 20;
    // console.log(num3);

    console.log('---------------------------------');
    // 2) 유효 범위(스코프)
    // - 함수에서 var 키워드로 선언된 변수는 함수 유효 범위를 갖는다.
    // - 함수에서 let, const 로 선언된 변수는 블록 유효 범위를 갖는다.
    if(true)
    {
        var num4 = 40;
        let num5 = 50;
        const num6 = 60;

        console.log(num4);
        console.log(num5);
        console.log(num6);
    }

    console.log(num4);
    // console.log(num5);
    // console.log(num6);

    console.log('---------------------------------');
    // 3) 호이스팅 동작 방식
    // - var 키워드로 선언한 변수는 변수 호이스팅으로 인해 undefined 가 출력된다.
    console.log(num7);
    var num7 = 70;
    console.log(num7);

    // - let,const 키워드로 선언한 변수는 변수 호이스팅이 발생하지 않는 것처럼 동작한다.
    // console.log(num8);
    // let num8 = 80;
    // console.log(num8);

    // console.log(num9);
    // const num9 = 90;
    // console.log(num9);

    console.log('---------------------------------');
    // 4) 전역 변수 동작 방식
    // - var 키워드로 선언한 전역 변수는 window 객체 내부에 포함된다.
    // - let, const 키워드로 선언한 전역 변수는 window 객체 내부에 포함되지 않는다.
    console.log(window.str1);
    console.log(window.str2);
    console.log(window.str3);
}

// 2) 자료형
function typeTest() {
    // 정수던 실수던 js 는 다 number 형
    let name = `홍길동`; // typeof: string
    let age = 24; // typeof: number
    let height = 178.5; // typeof: number
    let check = false; // typeof: boolean
    let hobbies = ['축구', '야구', '농구'];// typeof: object
    let user = {// == new object(); // typeof: object
        id: 'hong123'
        ,name: '홍길동'
        ,age: 24
        ,height: 178.5
        ,hobbies: ['축구', '야구', '농구']
        ,addFunc: function(x,y)
        {
            return x + y;
        }
    }; 

    //fuction
    let addFunc = function(x, y)
    {
        return x + y;
    };

    // console.log(addFunc);
    // console.log(typeof addFunc); // function
    // console.log(addFunc(10,20)); // 30
    // console.log(user.addFunc(50,100)); // 150

    let div1 = document.getElementById('div1');
    // innerText = Text 형식, innerHTML = HTML 에 넣기
    div1.innerHTML = '<h4>안녕하세요.</h4>';
    // div1.innerText = '<h4>안녕하세요.</h4>';
    // div1.innerHTML += 'name: ' + name + ', type: ' + typeof(name) + '<br>';
    
    // typeof 연산자는 값의 자료형을 확인하는 연산자이다.
    div1.innerHTML += `name: ${name}, type: ${typeof(name)}<br>`;
    div1.innerHTML += `age: ${age}, type: ${typeof(age)}<br>`;
    div1.innerHTML += `height: ${height}, type: ${typeof(height)}<br>`;
    div1.innerHTML += `check: ${check}, type: ${typeof(check)}<br>`;
    div1.innerHTML += `hobbies: ${hobbies}, type: ${typeof(hobbies)}<br>`;
    div1.innerHTML += `user: ${user}, type: ${typeof(user)}<br>`;
    div1.innerHTML += `addFunc: ${addFunc}, type: ${typeof(addFunc)}<br>`;
}

// 3) 형 변환
function castingTest() {
    let div2 = document.getElementById('div2');

    div2.innerHTML = '<h4>형 변환</h4>';

    // 1) 문자열과 숫자의 '+' 연산
    // js 에서 + 는 산술연산 or 문자열 연결
    // + 연산을 제외하고는 자동형변환으로 인해 숫자로 변경후 산술 계산
    div2.innerHTML += `7 + 7 = ${7 + 7}<br>`; // 7 + 7 = 14 (숫자)
    div2.innerHTML += `7 + '7' = ${7 + '7'}<br>`; // 7 + '7' = 77
    div2.innerHTML += `7 * '7' = ${7 * '7'}<br>`; // 7 * '7' = 49
    div2.innerHTML += `7 - '7' = ${7 - '7'}<br>`; // 7 - '7' = 0
    div2.innerHTML += `7 / '3' = ${7 / '3'}<br>`; // 7 / '3' = 2.3333333333333335
    div2.innerHTML += `7 / 'a' = ${7 / 'a'}<br><br>`; // 7 / 'a' = NaN

    // 2) 문자열 -> 숫자
    // Number() = 생성자 함수
    div2.innerHTML += `${Number('5')}, type: ${typeof(Number('5'))}<br>`
    div2.innerHTML += `${parseInt('5')}, type: ${typeof(parseInt('5'))}<br>`
    div2.innerHTML += `${parseInt('3.14')}, type: ${typeof(parseInt('3.14'))}<br><br>`

    // 3) 숫자 -> 문자
    div2.innerHTML += `${String(32)}, type: ${typeof(String(32))}<br>`;
    div2.innerHTML += `${32 + ''}, type: ${typeof(32 + '')}<br>`;
}

// 2. 연산자
function opTest() {
    let div3 = document.getElementById('div3');
    
    // == : 값!만 비교
    div3.innerHTML = '<h4>== 연산자 테스트</h4>';
    div3.innerHTML += `5 == 5 : ${5 == 5}<br>`; // true
    div3.innerHTML += `5 == '5' : ${5 == '5'}<br>`; // true

    div3.innerHTML = '<h4>=== 연산자 테스트</h4>';
    div3.innerHTML += `5 === 5 : ${5 === 5}<br>`; // true
    div3.innerHTML += `5 === '5' : ${5 === '5'}<br>`; // false

    div3.innerHTML = '<h4>!= 연산자 테스트</h4>';
    div3.innerHTML += `5 != 6 : ${5 != 6}<br>`; // true
    div3.innerHTML += `5 != '5' : ${5 != '5'}<br>`; // false

    div3.innerHTML = '<h4>!== 연산자 테스트</h4>';
    div3.innerHTML += `5 !== 6 : ${5 !== 6}<br>`; // true
    div3.innerHTML += `5 !== '5' : ${5 !== '5'}<br>`; // true

}

// 3. 제어문
function forTest() {
    let div4 = document.getElementById('div4');
    let array = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1];
    let user = {name: '홍길동', age: 24, height: 178.5}

    // for 구문
    // for (let i = 0; i < array.length; i++) {
    //     div4.innerHTML += `${array[i]} `;
    // }

    // for in 구문
    // - 배열의 경우 반복 변수(i)에 array의 index 값을 순서대로 담아서 반복한다.
    // for (const i in array) 
    // {
    //     div4.innerHTML += `${array[i]} `;
    // }

    // for of 구문
    // - 배열의 경우 value 변수에 array의 value 값을 순서대로 담아서 반복한다.
    for(const value of array)
    {
        div4.innerHTML += `${value} `;
    }

    div4.innerHTML += `<br><br>`;

    // for in 구문
    // 객체의 경우 반복 변수에 user의 속성명을 순서대로 담아서 반복한다.
    for(const key in user)
    {
        div4.innerHTML += `key: ${key}, type: ${typeof(key)}, value: ${user[key]}<br>`;
    }

    // for of 구문
    // 객체의 경우 for of 구문 사용 불가
    // Symmbol 이 있어야만 반복처리를 할수 있는데 객체는 없어서 반복 불가
    // for(const key in user)
    // {
    //     div4.innerHTML += `key: ${key}, type: ${typeof(key)}, value: ${user[key]}<br>`;
    // }

}
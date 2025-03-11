// 함수
// 1. 함수 선언
// 1) 함수
function funcTest() 
{
    document.getElementById('p1').innerHTML = '함수 호출';
}

// 2) 익명 함수
let btn1 = document.getElementById('btn1');

btn1.addEventListener('click', function() {
    document.getElementById('p2').innerHTML = '익명 함수 실행';
});

// 함수 선언과 동시에 즉시 실행되는 함수로 한 번만 호출되며 다시 호출할 수 없다.
(
    function(a, b)
    {
        document.getElementById('p2').innerHTML = `${a} + ${b} = ${a + b}`;
    }
)(30,70)

/*
    3) 화살표 함수
        3-1) 매개변수 처리
            - 매개변수 없을 때 : () => { ... }
            - 매개변수가 하나일 때 : x => { ... }
            - 매개변수가 두 개 이상일 때 : {x, y, ... } => { ... }
        3-2) 리턴 처리
            - 처리할 라인이 여러 개 라면 {}로 감싸서 처리해야 한다.
                (x, y) => {
                    // 실행 구문
                    return x + y;
                }
            - 처리할 라인이 하나라면 {}와 return 문을 생략할 수 있다.
                (x, y) => x + y;
        3-3) this 바인딩 방식
            - 일반적인 함수는 함수를 호출하는 객체가 this 가 된다.
            - 화살표 함수는 화살표 함수를 정의하는 영역의 this를 그대로 전달받는다.
*/
let btn2 = document.getElementById('btn2');

// btn2.onclick = () => {
//     alert('버튼 클릭');
// }
// btn2.onclick = () => alert('버튼 클릭');

// btn2.addEventListener('click', () => {
btn2.addEventListener('click', function() {
    console.log(this);

    // let inner = function() {
    //     console.log(this)();
    // };

    // 호출될 때 형태가 특정 객체의 메서드 형태가 아니므로 this에 전역 객체가 바인딩된다.
    // inner()
    // bind 메서드를 통해서 바깥쪽 함수의 this를 inner 함수의 this로 직접 연결할 수 있다.
    // inner.bind(this);

    let inner = () => {
        console.log(this);
    };

    // 화살표 함수가 정의하는 영역의 this를 그대로 전달받는다
    // 따라서 bind 메서드를 사용하지 않아도 된다.
    inner();

    document.getElementById('p3').innerHTML = '화살표 함수 실행';
});

// 2. 함수 호출
// 1) 매개변수
// function argTest(value){
// 매개변수 기본값을 지정하면 전달되는 매개값이 없을 경우 기본값으로 사용할 수 있다.
function argTest(value = '없음'){
    document.getElementById('p4').innerHTML = `매개값: ${value}`;
}

// 2) arguments 객체
// function sum(){
//     let result = 0;

//     for (const arg of arguments) {
//         result += arg;
//     }

//     document.getElementById('p5').innerHTML = `합계 : ${result}`;
//}

// 참고~~~~~~~~~~~`
// 가변 인자를 사용하는 방법
function sum(...numbers){
    let result = 0;

    for (const number of numbers) {
        result += number;
    }
    document.getElementById('p5').innerHTML = `합계 : ${result}`;
}

// 함수로 전달되는 값들 중에 가장 작은 값을 리턴 하시오
function min(...numbers) {
    let result = numbers[0];

    for (const number of numbers) {
        if (number < result) {
            result = number;
        }
    }

    return result;
}
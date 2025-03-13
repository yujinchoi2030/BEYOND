// 1. 이벤트 핸들러 등록
// 1) 인라인 방식
function eventTest(event){
    // 기본적으로 이벤트 객체를 받아올 수 없다.
    // 단, 함수를 호출하는 곳에서 전달해 주면 받아올 수 있다.
    console.log(event);
}

// 2) 프로퍼티 방식
let btn1 = document.getElementById('btn1');

btn1.onclick = (event) => {
    console.log(event);
    console.log(event.target);
    console.log(this);

    // 이벤트 핸들러 제거
    btn1.onclick = null;
}

// 3) 메서드 방식
let btn2 = document.getElementById('btn2');

btn2.addEventListener('click', function(event){
    console.log(event);
    console.log(event.target);
    console.log(this);
    console.log('--------------------------------');
});

btn2.addEventListener('click', handler);
// 함수 이름을 넘겨 함수 자체를 넘겨 호출한다.
btn2.addEventListener('click', eventTest);

// 이벤트 핸들러 제거
btn2.removeEventListener('click', handler);
btn2.removeEventListener('click', eventTest);

// 1. 태그별 기본 이벤트
// 1) 기본 이벤트 제거 1
function eventTest2(){
    if(!confirm('네이버로 이동하시겠습니까?'))
    {
        return false;
    };
}

// 2) 기본 이벤트 제거 2
let btnSubmit = document.getElementById('btnSubmit');

btnSubmit.onclick = (event) => {
    let password = document.getElementById('password');
    let confirmPassword = document.getElementById('confirmPassword');

    if(password.value !== confirmPassword.value)
    {
        alert('비밀번호가 일치하지 않습니다.');

        confirmPassword.value = '';
        confirmPassword.focus();

        // 메서드 방식에서는 아래와 같이 기본 동작을 제거해야 한다.
        event.preventDefault();
    }
};

// 3) 기본 이벤트 제거 3
let btnSubmit2 = document.getElementById('btnSubmit2');

btnSubmit2.onclick = (event) => {
    let userId = document.getElementById('userId').value;

    // 정규표현식 = regularExp........
    // 영문자, 숫자로만 총 5~12자리로 입력해주세요.
    let regExp = /^[a-zA-Z0-9]{5,12}$/;

    if(!regExp.test(userId))
    {
        alert('아이디를 정상적으로 입력해 주세요.');
        userId.value = '';
        userId.focus();
    }

    event.preventDefault();
};
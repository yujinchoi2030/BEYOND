window.onload = () => {
    // 1. window 객체
    // 1) window.open()
    let btn1 = document.getElementById('btn1');

    btn1.addEventListener('click', () => {
        // window.open('URL', '창이름', '설정')
        // window.open(); // 새창
        // window.open('https://www.naver.com/');
        window.open('https://www.naver.com/', 'naver');
        // 설정의 경우
        // window.open('https://www.naver.com/', 'naver', 'width=500, height=400');
    });

    // 2) window.setTimeout()
    let btn2 = document.getElementById('btn2');

    btn2.addEventListener('click', () => {
        let timeId = 0;
        let newWindow = window.open();

        newWindow.alert('이 페이지는 3초 후에 종료됩니다.');

        // 일정 시간 후에 콜백을 한 번 실행 (3초후에 동작)
        // window.setTimeout(function() { newWindow.close();}, 3000);
        timeId = window.setTimeout(() => newWindow.close(), 3000);

        // 타이머 ID를 clearTimeout()에 전달하면 해당 ID의 타이머를 취소할 수 있다.
        window.clearTimeout(timeId);

        // 3) window.setInterval()
        let btnStart = document.getElementById('btnStart');
        let btnStop = document.getElementById('btnStop');

        btnStart.addEventListener('click', () => {
            let p1 = document.getElementById('p1');

            // 일정 시간마다 콜백 함수를 반복 실행
            window.setInterval(() => {
                let now = new Date();

                p1.innerHTML = `${now.getHours()}:${now.getMinutes()}:${now.getSeconds()}`;
            }, 1000);
        });

        btnStop.addEventListener('click', () => {
            window.clearInterval(timerId);
        });
    });


};
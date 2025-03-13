window.onload = () => {
    // 1. 노드 조회
    // 1) id로 조회    
    let btn1 = document.getElementById('btn1');

    btn1.addEventListener('click', () => {
        let div1 = document.getElementById('div1');

        div1.style.backgroundColor = 'red';
        div1.style.color = 'white';
        div1.innerHTML = '색상이 변경되었습니다.';
    });

    // 2) 태그명으로 검색
    let btn2 = document.getElementById('btn2');

    btn2.addEventListener('click', () => {
        let red = 0;
        let green = 0;
        let blue = 0;

        let elements = document.getElementsByTagName('li');

        console.log(elements);

        for (const element of elements) {
            red = parseInt(Math.random() * 255) + 1;
            green = parseInt(Math.random() * 255) + 1;
            blue = parseInt(Math.random() * 255) + 1;

            element.style.backgroundColor = `rgb(${red}, ${green}, ${blue})`;
            element.style.color = 'white';
        }
    });

    // 3) name 으로 검색
    let btn3 = document.getElementById('btn3');

    btn3.addEventListener('click', () => {
        let checkedItems = '';
        let elements = document.getElementsByName('hobby');

        elements.forEach((element) =>{
            // console.log(element.value);
            // console.log(element.checked);

            if(element.checked){
                checkedItems += `${element.value}<br>`;
            }
        });

        document.getElementById('div2').innerHTML = checkedItems;
    });

    // 4) class 로 검색
    let btn4 = document.getElementById('btn4');

    btn4.addEventListener('click', () => {
        let elements = document.getElementsByClassName('area');

        console.log(elements);

        for (const element of elements) {
            element.style.backgroundColor = `orangered`;
        }
    });

    // 5) CSS 선택자로 검색
    let btn5 = document.getElementById('btn5');

    btn5.addEventListener('click', () => {
        let div2 = document.querySelector('#div2'); 
        let elements = document.querySelectorAll('.area'); 
    });

    console.log(div2);
    console.log(elements);
    
    // document.querySelectorAll('input:checked]')
    //         .forEach(element => {
    //              element.style.width = '20px';
    //              element.style.height = '20px';
    //          });

    document.querySelectorAll('input[type=checkbox]')
            .forEach(element => {
                if(element.checked)
                {
                    element.style.width = '20px';
                    element.style.height = '20px';
                }
                else
                {
                    element.style.width = '13px';
                    element.style.height = '13px';
                }
            });


    // 2. 노드 생성
    // 1) 텍스트 노드가 있는 요소 노드 생성
    let btn6 = document.getElementById('btn6');

    btn6.addEventListener('click', () => {
        // 요소 노드 생성
        let title = document.createElement('h5');
        console.log(title);

        // 텍스트 노드 생성
        let textNode = document.createTextNode('안녕하세요.');
        console.log(textNode);

        // 요소 노드 하위에 텍스트 노드를 추가
        title.appendChild(textNode);

        console.log(title);
        console.log(textNode);

        document.getElementById('div3').appendChild(title);
        document.getElementById('div3').innerHTML = '<h5>안녕하심까</h5>';
    });

    // 2) 텍스트 노드가 없는 요소 노드 생성
    let btn7 = document.getElementById('btn7');

    btn7.addEventListener('click', () => {
        // 요소 노드 생성
        let img = document.createElement('img');

        img.setAttribute('src', '../resources/images/포켓몬스터_삐삐.jpeg');
        img.setAttribute('width', '200px');
        img.setAttribute('height', '250px');

        console.log(img);

        document.getElementById('div4').appendChild(img);
    });

    // 3. 노드 삭제
    let btn8 = document.getElementById('btn8');

    btn8.addEventListener('click', () => {
        // 요소 노드 생성
        let div5 = document.getElementById('div5');

        // div5.remove();
        document.body.removeChild(div5);
    });
};
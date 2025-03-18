<template>
    <div>
        <h3>5. 이벤트 처리</h3>
        
        <h4>1) 이벤트 처리 방법</h4>

        <label for="price">금액 : </label>
        <input type="text" id="price" v-model.number="price">

        <br><br>

        <!-- 
        인라인 방식 
        <button v-on:click="balance += parseInt(price);">입금</button>
        <button v-on:click="balance -= parseInt(price);">출금</button>
        -->
        <!-- 이벤트 핸들러 방식 -->
        <button @click="deposit">입금</button>
        <button @click="withdraw">출금</button>

        <p>
            잔액은 <span v-text="balance"></span>원 입니다.
        </p>

        <h4>2) 기본 이벤트</h4>
        <!-- <a @contextmenu="(event) => event.preventDefault()" @click="confirmNaver" href="https://www.naver.com">네이버로</a> -->
        <a @contextmenu.prevent @click="confirmNaver" href="https://www.naver.com">네이버로</a>

        <h4>3) 이벤트 전파</h4>
        <!-- 
        <div id="outer" @click="outerClick">
            <div id="inner" @click="innerClick"></div>
        </div> 
        -->

        <div id="outer" @click="outerClick">
            <div id="inner" @click.stop="innerClick"></div>
        </div>

        <h4>4) 이벤트 수식어</h4>
        <h5>once</h5>

        <button @click.once="onceClick">버튼 클릭</button>

        <h5>enter</h5>

        <input type="text" v-model.trim="name" @keyup.enter="nameEnter">

        <h5>left, right</h5>

        <button @contextmenu.prevent
                @click.left="name = '홍길동';"
                @click.right="name = '이몽룡';"
                @click.ctrl.left="name = '임꺽정';">버튼 클릭</button>
    </div>
</template>

<script>
    export default {
        name: 'Events',
        data() {
            return {
                price: 0,
                balance: 0,
                name: ''
            }
        },
        methods: {
            deposit() {
                const price = parseInt(this.price);

                if (isNaN(price)) {
                    alert('값을 올바르게 입력해 주세요.');
                }
                else if (price <= 0) {
                    alert('0보다 큰 값을 입금해야 합니다.');
                } else {
                    this.balance += price;
                }
            },
            withdraw() {
                const price = parseInt(this.price);

                if (isNaN(price)) {
                    alert('값을 올바르게 입력해 주세요.');
                } else if (price <= 0) {
                    alert('0보다 큰 값을 입금해야 합니다.');
                } else if (price > this.balance) {
                    alert('잔액보다 많은 금액을 출금할 수 없습니다.');
                } else {
                    this.balance -= price;
                }
            },
            confirmNaver(event) {
                if (!confirm('정말로 이동하시겠습니까!?')) {
                    event.preventDefault();
                }
            },
            outerClick(event) {
                alert('outerClick() - 호출');
                // 이벤트가 발생한 원본 요소
                console.log(event.target);
                // 버블링에 의해 호출된 이벤트 핸들러를 보유한 요소
                console.log(event.currentTarget);
            },
            innerClick(event) {
                alert('innerClick() - 호출');
                console.log(event.target);
                console.log(event.currentTarget);
                // 상위 요소로 이벤트 전파를 막는 메소드이다.
                // event.stopPropagation();
            },
            onceClick() {
                alert('한 번만 실행된다.');
            },
            nameEnter(event) {
                // if (event.keyCode === 13) {
                alert(`이름은 ${this.name} 입니다.`);
                // }
            }
        },
    }
</script>
<style scoped>
    #outer {
        width: 200px;
        height: 200px;
        border: 2px solid;
        padding: 10px;
    }
    #inner {
        width: 100px;
        height: 100px;
        border: 2px solid;
        padding: 10px;
        background-color: yellowgreen;
    }
</style>
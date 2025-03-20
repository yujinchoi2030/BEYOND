<!-- reactive() 함수 알아보기~~ -->

<template>
    <div>
        <label for="num1">첫 번째 수 : </label>
        <!-- <input type="text" id="num1" v-model.number="num1"> -->
        <input type="text" id="num1" v-model.number="state.num1">

        <br><br>

        <label for="num2">두 번째 수 : </label>
        <!-- <input type="text" id="num2" v-model.number="num2"> -->
        <input type="text" id="num2" v-model.number="state.num2">

        <br><br>

        <button @click="add">계산하기</button>

        <p>
            <!-- 결과 : {{ result }} -->
            결과 : {{ state.result }}
        </p>
    </div>
</template>

<script>
import { reactive, ref } from 'vue';

export default {
    setup () {
        // 기본 타입의 데이터를 반응성을 가진 데이터로 생성할 때는 ref()를 사용한다.
        // const num1 = ref(10);
        // const num2 = ref(20);
        // const result = ref(30);

        // 객체 타입의 데이터를 반응성을 가진 데이터로 생성할 때는 reactive()를 사용한다.
        const state = reactive({num1 : 10, num2: 20, result: 30}); 

        const add = () => {
            // setup() 내부에서 ref() 로 지정한 데이터에 접근할 때는 value 속성을 사용해야한다.
            // result.value = num1.value + num2.value;
            state.result = state.num1 + state.num2;
        };

        // return {num1: num1, num2: num2, result: result}
        // 객체의 프로퍼티 값을 넘기는데 명이 같으니 생략 가능
        return {state, add}
    }
}
</script>
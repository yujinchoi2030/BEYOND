<!-- watch() 함수 알아보기~~ -->
<!-- 특정 값의 변경을 추적하고, 그 값이 변경될 때마다 특정 동작을 실행할 수 있습니다. -->

<template>
    <div>
        <label for="number">숫자 : </label>
        <!-- <input type="text" id="number" v-model.number="number"> -->
        <input type="text" id="number" v-model.number="state.number">

        <p>
            결과 : {{ state.result }}
        </p>
    </div>
</template>

<script>
import { reactive, ref, watch } from 'vue';

export default {
    setup () {
        // const number = ref(0);
        // const result = ref(0);
        const state = reactive({number: 0, result: 0});

        // 감시 대상이 반응성을 가진 데이터가 아니라서 에러 발생
        // watch(state.number, (newValue, oldValue) => {
        watch(() => state.number, (newValue, oldValue) => {
            console.log(`${oldValue} => ${newValue}`);

            state.result = newValue * newValue;
        });

        return {state}

        // watch(number, (newValue, oldValue) => {
        //     console.log(`${oldValue} => ${newValue}`);
            
        //     result.value = newValue * newValue;
        // });

        // return {number, result}
    }
}
</script>
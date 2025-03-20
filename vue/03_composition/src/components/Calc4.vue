<!-- watchEffect() 함수 알아보기~~~ -->

<template>
    <div>
        <label for="number">숫자 : </label>
        <!-- <input type="text" id="number" v-model.number="number"> -->
        <input type="text" id="number" v-model.number="state.number">

        <p>
            <!-- 결과 : {{ result }} -->
            결과 : {{ state.result }}
        </p>
    </div>
</template>

<script>
import { reactive, ref, watchEffect } from 'vue';

export default {
    setup () {
        // const number = ref(0);
        // const result = ref(0);
        const state = reactive({number: 0, result: 0})
        
        // vue3 에서 반응성 데이터를 추적하는 새로운 방법을 제공한다.
        watchEffect(() => {
            // result.value = number.value * 2;
            state.result = state.number * 2;
        });

        // return {number, result}
        return {state}
    }
}
</script>
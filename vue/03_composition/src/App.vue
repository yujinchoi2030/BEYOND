<template>
  <div>
    <h2>Composition API</h2>
    <h3>1. 반응성을 가진 상태 데이터 (reactive() 함수)</h3>
    <Calc1/>

    <h3>2. 계산된 속성 (computed() 함수)</h3>    
    <Calc2/>

    <h3>3. 관찰 속성 (watch() 함수)</h3>
    <Calc3/>

    <h3>4. 관찰 속성 (watchEffect() 함수)</h3>
    <Calc4/>

    <!-- &lt; : < , &gt; : > -->
    <h4>&lt;script setup&gt;사용하기</h4>
    <p>
      &lt;script setup&gt; 은 Composition API 를 사용할 수 있는 더 편리한 문법적 기능을 제공한다.
    </p>

    <p>
      number : {{ number }}
    </p>

    <button @click="sqrt">계산하기</button>
  </div>
</template>

<script setup>
// import 후 components 옵션으로 컴포넌트를 등록하지 않고 바로 사용할 수 있다.
import { ref } from 'vue';

import Calc1 from './components/Calc1.vue';
import Calc2 from './components/Calc2.vue';
import Calc3 from './components/Calc3.vue';
import Calc4 from './components/Calc4.vue';

// 최상위의 반응성을 가지는 데이터, 메서드, 계산된 속성은 직접 템플릿에서 사용할 수 있다.
const number = ref(10);
const sqrt = () => {
  number.value = number.value  * number.value;
};
</script>

<!-- 
<script>
import Calc1 from './components/Calc1.vue';
import Calc2 from './components/Calc2.vue';
import Calc3 from './components/Calc3.vue';
import Calc4 from './components/Calc4.vue';

export default {
  setup () {
    

    return {}
  },
  components: {
    Calc1,
    Calc2,
    Calc3,
    Calc4
  }
}
</script> 
-->
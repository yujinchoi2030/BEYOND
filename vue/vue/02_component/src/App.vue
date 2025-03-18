<template>
  <div>
    <h2>컴포넌트(Component)</h2>

    <h3>1. Props</h3>
    <ul>
      <!-- 속성을 전달하는 방법은 v-bind 디렉티브를 사용한다. -->
      <CheckboxItem v-for="student in students" :key="student.no"
        :no="student.no" :name="student.name" :checked="student.checked"/>
    </ul>
  </div>
</template>

<script>
  import CheckboxItem from './components/CheckboxItem.vue';

  export default {
    name: 'App',
    components: {
      CheckboxItem,
    },
    data() {
      return {
        students: [
          {no: 'S001', name: '홍길동', checked: true},
          {no: 'S002', name: '이몽룡', checked: false},
          {no: 'S003', name: '성춘향', checked: false},
          {no: 'S004', name: '김철수', checked: false},
          {no: 'S005', name: '김영희', checked: false}
        ]
      }
    },
  }
</script>

<style scoped>

</style>
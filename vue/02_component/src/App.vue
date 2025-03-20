<template>
  <div>
    <h2>컴포넌트(Component)</h2>

    <h3>1. Props</h3>
    <ul>
      <!-- 속성을 전달하는 방법은 v-bind 디렉티브를 사용한다. -->
      <!-- <CheckboxItem v-for="student in students" :key="student.no"
        :no="student.no" :name="student.name" :checked="student.checked"/> -->
      <CheckboxItem v-for="student in students" :key="student.no" :student="student"
          @item-change="itemChange"/>
    </ul>

    <h3>2. 이벤트 발신</h3>

    <InputName @name-change="(event) => this.parentName = event.name"/>

    <p>
      이벤트 수신 : {{ parentName }}
    </p>

    <h3>3. 슬롯(Slot)</h3>
    <p>
        부모 컴포넌트에서 자식 컴포넌트로 템플릿 정보를 전달하는 방법을 제공한다.
    </p>

    <SlotTest/>

    <h3>4. 동적 컴포넌트(Dynamic Component)</h3>
    <p>
        동일한 위치에 여러 컴포넌트를 표한할 수 있는 방법을 제공한다.
    </p>

    <DynamicTest/>

  </div>
</template>

<script>
  import Student from './Student';
  import CheckboxItem from './components/CheckboxItem.vue';
  import InputName from './components/InputName.vue';
  import SlotTest from './components/SlotTest.vue';
  import DynamicTest from './components/DynamicTest.vue';

  export default {
    name: 'App',
    components: {
      CheckboxItem,
      InputName,
      SlotTest,
      DynamicTest
    },
    data() 
    {
      return {
        students: [
          // {no: 'S001', name: '홍길동', checked: true},
          // {no: 'S002', name: '이몽룡', checked: false},
          // {no: 'S003', name: '성춘향', checked: false},
          // {no: 'S004', name: '김철수', checked: false},
          // {no: 'S005', name: '김영희', checked: false}
          // {no: 300, name: '성춘향', checked: false},
          // {no: 'S004', name: '김', checked: false},
          // {no: 'S005', name: '김영희'}
          new Student('S001', '홍길동', true),
          new Student('S002', '이몽룡', false),
          new Student('S003', '성춘향', false),
          new Student('S004', '김철수', false),
          new Student('S005', '김영희', false)
        ],
        parentName: ''
      }
    },
    methods: 
    {
      itemChange(data) 
      {
        const student = this.students.find((s) => s.no === data.no);

        student.checked = data.checked;
      }
    },
  }
</script>

<style>
  @import url('https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200');

  .material-symbols-outlined {
    font-size: 12px;
  }
</style>
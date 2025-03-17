<template>
    <div>
        <h3>2. 조건 디렉티브</h3>
        <h4>1) v-show, v-if</h4>

        <label for="price">가격 : </label>
        <input type="text" id="price" v-model.number="price">

        <br>

        <span v-if="price < 0">가격을 음수로 입력할 수 없습니다.</span>
    
        <h4>2) v-if, v-else-if, v-else</h4>

        <label for="score">점수 : </label>
        <input type="number" id="score" v-model.number="score">

        <!-- <template> 요소는 렌더링에 포함되지 않지만 요소들은 그룹을 묶어주기 위한 용도로 사용된다. -->
        <template v-if="score > 0">
            점수에 해당하는 등급은
            <span v-if="score >= 90">A</span>
            <span v-else-if="score >= 80">B</span>
            <span v-else-if="score >= 70">C</span>
            <span v-else-if="score >= 60">D</span>
            <span v-else>F</span>
            입니다.
        </template>

        <h4>1) v-for (학생 목록 출력)</h4>
        <table border="1">
            <tr>
                <th>학번</th>
                <th>이름</th>
                <th>수학 점수</th>
                <th>영어 점수</th>
            </tr>
            <!-- 
                가상 DOM v-for로 랜더링한 배열 데이터의 순서가 변경되면 DOM 요소를 이동시키지 않고, DOM 요소를 다시 그린다.
                DOM 요소를 추적하여 DOM 요소의 위치를 변경하려면 Key 속성을 추가하면 된다.
                key 속성에는 인덱스 번호를 부여하지 않고 반드시 고유한 변경되지 않는 값을 부여해야 한다.
            -->
            <!-- <tr v-for="student in students"> -->
            <tr v-for="(student, index) in students" :key="student.no">
                <td v-text="index"></td>
                <td v-text="student.no"></td>
                <td v-text="student.name"></td>
                <td v-text="student.math"></td>
                <td>{{ student.eng }}</td>
            </tr>
        </table>

        <h4>2) v-for (회원 정보 출력)</h4>
        <table border="1">
            <tr>
                <th>속성명</th>
                <th>속성값</th>
            </tr>

            <tr v-for="(value, key) in user" :key="key">
                <td v-text="key"></td>
                <td v-text="value"></td>
            </tr>
        </table>

    </div>
</template>

<script>
    export default {
        name: 'Directive2',
        data() {
            return {
                price: 0,
                score: 0,
                students: [
                    {no: 'S001', name: '홍길동', math:70, eng:80},
                    {no: 'S002', name: '이몽룡', math:80, eng:90},
                    {no: 'S003', name: '성춘향', math:90, eng:100},
                    {no: 'S004', name: '김철수', math:100, eng:90},
                    {no: 'S005', name: '김영희', math:90, eng:80},
                ],
                user: {
                    no: 1,
                    id: 'hong123',
                    name: '홍길동',
                    age: 24,
                    email: 'hong123@naver.com'
                }
            }
        },
    }
</script>

<style scoped>

</style>
<template>
    <div>
        <!-- <h3>{{ title }}</h3> -->
        <!-- <h3 v-text="title"></h3> -->
        <h3 v-html="title"></h3>
        <!-- <img width="300px" v-bind:src="imgPath"> -->
        <img width="300px" :src="imgPath">

        <br><br>

        <form onsubmit="return false;">
            <label for="userName">이름: </label>
            <!-- <input type="text" id="userName" :value="name"> -->
            <!-- <input type="text" id="userName" v-model="name"> -->
            <!-- <input type="text" id="userName" v-model.lazy="name"> -->
            <!-- <input type="text" id="userName" v-model.trim="name"> -->
            <input type="text" id="userName" v-model.lazy.trim="name">
            
            <br><br>

            <label for="userAge">나이: </label>
            <input type="text" id="userAge" v-model.number="age">

            <br><br>

            <label><input type="radio" name="gender" value="남자" v-model="gender">남자</label>
            <label><input type="radio" name="gender" value="여자" v-model="gender">여자</label>

            <br><br>

            <label><input type="checkbox" name="hobby" value="음악" v-model="hobbies">음악</label>
            <label><input type="checkbox" name="hobby" value="운동" v-model="hobbies">운동</label>
            <label><input type="checkbox" name="hobby" value="독서" v-model="hobbies">독서</label>
            <label><input type="checkbox" name="hobby" value="영화" v-model="hobbies">영화</label>

            <br><br>

            <label>
                <!-- <input type="checkbox" v-model="agree"> 위 내용에 동의합니다. -->
                <input type="checkbox" v-model="agree" true-value="Y" false-value="N"> 위 내용에 동의합니다.
            </label>
        </form>
    </div>
</template>

<script>
    export default {
        name: 'Directive1',
        data() {
            return {
                title: '<i>1. 기본 디렉티브</i>',
                imgPath: 'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAxOTEyMzFfOTkg%2FMDAxNTc3NzgxMDA0MTU4.VdHm00K8eQZZs7ujTeXLVApSetUHBFQ7GbnGNcTv_aMg.Q4kodKZ6SbUveesi2_axbjk07PD-0CoXwF2usbhkifUg.JPEG.qjatn8180%2Fshiny-charmander-byaqua-png-clipart.jpg&type=sc960_832',
                name: '홍길동',
                age: 24,
                gender: '남자',
                hobbies: [],
                agree: ''
            }
        },
    }
</script>

<style scoped>

</style>
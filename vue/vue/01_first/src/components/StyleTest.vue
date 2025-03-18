<template>
    <div>
        <h3>6. 스타일 적용</h3>
        
        <h4>1) 인라인 스타일</h4>
        <!-- <div v-bind:style="{backgroundColor: 'orange', width: '200px', height: '200px'}"> -->
        <div :style="divStyle"
            @mouseover="overEvent"
            @mouseout="outEvent">
        </div>

        <h4>2) CSS 클래스 바인딩</h4>

        <label>
            <input type="checkbox" v-model="btnStyle.buttonBackgroundColor">배경색 적용
        </label>

        <br>
        
        <button class="buttonTextColor" :class="btnStyle">버튼 클릭</button>

    </div>
</template>

<script>
    export default {
        name: 'StyleTest',
        data() {
            return {
                divStyle: {
                    backgroundColor: 'orangered', 
                    width: '200px', 
                    height: '200px',
                },
                // btnStyle: 'buttonBackgroundColor'
                btnStyle: {
                    buttonBackgroundColor: false
                }
            }
        },
        methods: {
            overEvent() {
                this.divStyle.backgroundColor = 'blue';
            },
            outEvent() {
                this.divStyle.backgroundColor = 'green';
            }
        },
    }
</script>

<style scoped>
    .buttonTextColor {
        color: blueviolet
    }
    .buttonBackgroundColor {
        background-color: deepskyblue;
    }
</style>
<template>
    <div>
        <label for="userName">이름: </label>
        <input type="text" id="userName" v-model="name">
        <button @click="$emit('name-change', { name })">이벤트 발신</button>
    </div>
</template>

<script>
    export default {
        name: 'InputName',
        // 이벤트의 유효성 체크
        // emits : ['name-change']
        emits : {
            'name-change': (event) => {
                return typeof(event.name) !== 'string' ? false :
                    event.name.length >= 2 ? true : false;
            }
        },
        data() {
            return {
                name: ''
            }
        },
    }
</script>

<style land="scss" scoped>

</style>
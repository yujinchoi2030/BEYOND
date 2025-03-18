<template>
    <li>
        <label>
            <input type="checkbox" :checked="checked"> {{ no }} - {{ name }}
        </label>
    </li>
</template>

<script>
    export default {
        name: 'CheckboxItem',
        // props 옵션으로 전달받을 속성을 정의한다.
        props: ['no', 'name', 'checked'],
    }
</script>
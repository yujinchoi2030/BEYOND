<template>
    <div>
        <!-- 
        <label>
            <input type="checkbox" :value="id" :checked="checked"
                @change="$emit('item-change', {id, checked: $event.target.checked})">

            slot 컴포넌트 추가
            <slot></slot> 사에에는 부모 컴포넌트로부터 전달받는 템플릿이 없을 때 보여줄 UI 작성
            <slot>레이블 없음</slot>
        </label>
        -->
        <label>
            <slot name="icon"></slot>

            <input type="checkbox" :value="id" :checked="checked"
                @change="$emit('item-change', {id, checked: $event.target.checked})">

            <!-- slot 컴포넌트 추가 -->
            <!-- <slot></slot> 사에에는 부모 컴포넌트로부터 전달받는 템플릿이 없을 때 보여줄 UI 작성-->
            <slot name="label">레이블 없음</slot>
        </label>
    </div>
</template>

<script>
    export default {
        name: 'SlotItem',
        props: ['id', 'checked'],
        emit: ['item-change']
    }
</script>

<style lang="scss" scoped>

</style>
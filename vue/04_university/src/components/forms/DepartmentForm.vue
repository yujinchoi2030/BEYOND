<template>
    <!-- 버튼을 누를 경우, "submitClick" 핸들러가 작동 -->
    <form @submit.prevent="submitClick">
        <div class="mb-3">
            <!-- 학과 이름을 입력 받는 텍스트 필드 -->
            <label for="name" class="form-label">학과 이름</label>
            <input type="text" class="form-control" id="name" v-model.trim="formData.name" required>
        </div>
        <div class="mb-3">
            <label for="category" class="form-label">계열</label>
            <input type="text" class="form-control" id="category" v-model.trim="formData.category" required>
        </div>
        <div class="mb-3">
            <label for="openYn" class="form-label">개설 여부</label>
            <select class="form-select" id="openYn" v-model="formData.openYn">
                <option value="Y">예(Y)</option>
                <option value="N">아니오(N)</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="capacity" class="form-label">정원</label>
            <input type="number" class="form-control" id="capacity" v-model.number="formData.capacity">
        </div>
        <button type="submit" class="btn btn-primary" v-text="submitButtonText"></button>
    </form>
</template>


<script setup>
    import { reactive, toRaw, watch } from 'vue';

    const formData = reactive({
        // 안에 내용은 생략이 가능함당
        name: '',
        category: '',
        openYn: '',
        capacity: 0
    });

    // 부모 컴포넌트로부터 전달되는 속성
    // submit 버튼이 눌릴 경우 -> 부모한테 전달
    const props = defineProps({
        submitButtonText: String,
        initFormData: Object
    });

    // 부모에게 이벤트 발신하도록 만들 예정
    const emit = defineEmits(['form-submit']);
    const submitClick = () => {
        emit('form-submit', toRaw(formData))
        // 그냥 formData를 보내면 proxy 데이터가 전달됨 -> 원본 데이터를 보내기 위해 위와 같이 바꿔줘야 함
    };

    watch(
        props.initFormData,
        (newFormData) => {
            // formData의 속성만 newFormData의 속성의 값으로 변경한다.
            Object.assign(formData, newFormData);
        },
        {immediate: true} // watch가 등록될 때 즉시 한 번 실행된다.
    );
</script>
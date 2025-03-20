<template>
    <li>
        <label>
            <!-- <input type="checkbox" :checked="checked"> {{ no }} - {{ name }} -->
            <input type="checkbox" :checked="student.checked"
                @change="$emit('item-change', { no: student.no, checked: $event.target.checked})"> {{ student.no }} - {{ student.name }}
        </label>
    </li>
</template>

<script>
    import Student from '@/Student';

    export default {
        name: 'CheckboxItem',
        // props 옵션으로 전달받을 속성을 정의한다.
        // props: ['no', 'name', 'checked'],
        // 속성의 유효성 체크
        // props: {
        //     no: {},
        //     name: {
        //         validator(value){
        //             // name 이 문자열이면서 2글자 이상인지 체크 (validation)
        //             return typeof(value) !== 'string' ? false :
        //                 value.length >= 2 ? true : false;
        //         }
        //     },
        //     checked: {
        //         type: Boolean,
        //         required: false,
        //         default: false
        //     }
        // }
        props: {
            student : Student
        },        
        created() 
        {
            // 자식 컴포넌트에서 전달받은 props 에 등록된 속성을 변경하려고 하면 에러남
            // this.checked = true;
            // 객체로 전달받으면 객체의 내부 속성을 변경할 수 있지만 변경하지 않도록 해야한다.
            // this.student.checked = true;
        },
    }
</script>
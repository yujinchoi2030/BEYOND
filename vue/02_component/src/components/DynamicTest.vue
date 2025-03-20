<template>
    <div>
        <ul>
            <li v-for="tab in tabs" :key="tab.id">
                <a v-text="tab.label" @click="changeTab(tab.id);"></a>
            </li>
        </ul>
        <!-- is 속성의 값으로 어떤 컴포넌트를 해당 위치에 나타낼지 결정한다. -->
        <component :is="currentTab"></component>
    </div>
</template>

<script>
import DynamicTab1 from './DynamicTab1.vue';
import DynamicTab2 from './DynamicTab2.vue';

    export default {
        name: 'DynamicTest',
        components: {
            DynamicTab1,
            DynamicTab2
        },
        data() {
            return {
                currentTab: 'DynamicTab1',
                tabs: [
                    {id: 'DynamicTab1', label: 'Tab1'},
                    {id: 'DynamicTab2', label: 'Tab2'},
                ]
            }
        },
        methods: {
            changeTab(id) {
                this.currentTab = id;
            }
        }
    }
</script>

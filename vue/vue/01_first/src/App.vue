<template>
  <div>
    <h2>base Vue.js</h2>

    <!-- <Directive/> -->
    <Options/>

  </div>
</template>

<script>
  // import Directive1 from './components/Directive1.vue';
  import Directive from './components/Directive2.vue';
  import Options from './components/Options.vue';

  export default {
    name: 'App',
    components: {
      Directive,
      Options
    },
  }
</script>

<style scoped>

</style>
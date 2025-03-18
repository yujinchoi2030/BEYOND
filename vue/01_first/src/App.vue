<template>
  <div>
    <h2>Vue.js 기초</h2>

    <!-- <Directive/> -->
    <!-- <Options /> -->
    <!-- <Events/> -->
    <StyleTest/>

  </div>
</template>

<script>
  // import Directive from './components/Directive1.vue';
  import Directive from './components/Directive2.vue';
  import Options from './components/Options.vue';
  import Events from './components/Events.vue';
  import StyleTest from './components/StyleTest.vue';

  export default {
    name: 'App',
    components: {
      Directive, // Directive: Directive
      Options,
      Events,
      StyleTest
    },
  }
</script>

<style scoped>

</style>
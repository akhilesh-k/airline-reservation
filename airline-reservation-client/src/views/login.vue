<template>
<div>
  <navbar/>
 <div class="container">
   <h1>Login to continue</h1>
   <ol>
      <input type="text" placeholder="username" name="username" class="a" required>
      <input type="text" placeholder="password" name="password" class="a" required>
      <button type="submit" class="b" name="login">Login</button>
   </ol>
 </div>
 </div>
</template>

<script>
import navbar from '../components/navbar.vue'
export default {
  name: 'login',
  components: {
    navbar: navbar
  }
}
</script>

<style>
.body {
 margin:0;
}
.container {
  height: 100vh;
  width: 100vw;
  margin: 5px solid black;
  margin-left: auto;
  margin-top: 20px;
  margin-right:auto;
  background-color: antiquewhite;
  display: flex;
  flex-direction: column;
  justify-content: center;

}
.a {
  width:30vw;
  height:5vh;
  margin: 5px;
  align-items: center;
}
.b {
  width:5vw;
  height:5vh;
  margin: 5px;
  align-items: center;

}
h1{
  text-align: center;
  color: rgb(51, 50, 50);
}
</style>

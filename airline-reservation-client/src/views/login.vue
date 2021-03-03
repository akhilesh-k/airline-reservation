<template>
<div>
  <navbar/>
 <div class="container">
   <h1>Login to continue</h1>
   <ol>
      <input type="text" placeholder="username" name="userName" class="a" required>
      <input type="password" placeholder="password" name="password" class="a" required>
      <button type="submit" class="b" name="login" @click="logIn">Login</button>
   </ol>
 </div>
 </div>
</template>

<script>
import navbar from '../components/navbar.vue'
import axios from 'axios'
export default {
  name: 'login',
  data () {
    return {
      userName: '',
      password: ''
    }
  },
  components: {
    navbar: navbar
  },
  methods:
  {
    logIn () {
      const body = {
        userName: this.userName,
        password: this.password
      }
      axios.post('http://localhost:8082/login', body)
        .then(response => {
          console.log(response)
          this.$router.push('/')
        }).catch(response => console.log(response))
      this.userName = ''
      this.password = ''
    }
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

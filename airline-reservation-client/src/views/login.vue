<template>
<div>
  <navbar/>
 <div class="container">
   <h1>Login to continue</h1>
   <ol>
      <input type="text" placeholder="username" name="userName" class="a" required v-model="userName">
      <input type="password" placeholder="password" name="password" class="a" required v-model="password">
      <button type="submit" class="b" name="login" @click="logIn">Login</button>
   </ol>
 </div>
 </div>
</template>

<script>
import navbar from '../components/navbar.vue'
import axios from 'axios'
import { mapGetters, mapActions } from 'vuex'
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
    ...mapActions(['setLoginAction', 'setUserDataAction']),
    logIn () {
      const body = {
        userName: this.userName,
        password: this.password
      }
      axios.post('http://localhost:8082/login', body)
        .then(response => {
          console.log(response)
          if (response.data.code === 'SUCCESS') {
            this.setLoginAction('true')
            this.setUserDataAction(this.userName)
            this.$router.push('/')
          } else {
            alert('Password not matched')
          }
        }).catch(response => console.log(response))
    }
  },
  computed: {
    ...mapGetters(['getlogin', 'getUserData'])
  }
}
</script>

<style>
.body {
 margin:0;
}
.container{
  height: 100vh;
  width: 100vw;
  margin: 5px solid black;
  margin-left: auto;
  margin-top: 20px;
  margin-right:auto;
  display: flex;
  flex-direction: column;
  justify-content: center;
  color: #7868e6;

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
.container h1{
  text-align: center;
  color: #7868e6;
}
</style>

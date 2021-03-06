<template>
<div>
  <navbar/>
 <div class="container">
   <h1>Login to Continue</h1>
   <ol>
      <input type="text" placeholder="username" name="userName" class="a" required v-model="userName">
      <input type="password" placeholder="password" name="password" class="a" required v-model="password">
      <button type="submit" class="b" name="login" @click="logIn" >Login</button>
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
    validate () {
      if (this.userName === null) {
        alert('name should not be null')
        return 0
      } else if (this.password === null) {
        alert('password never be null')
        return 0
      } else {
        return 1
      }
    },
    logIn () {
      const body = {
        userName: this.userName,
        password: this.password
      }
      if (this.validate() === 1) {
        axios.post('http://10.177.68.80:9000/login-service/login', body)
          .then(response => {
            console.log(response)
            if (response.data.code === 'SUCCESS') {
              this.setLoginAction('true')
              localStorage.setItem('username', this.userName)
              localStorage.setItem('isLogin', 'true')
              this.$router.push('/home')
            } else {
              alert('Password not matched')
            }
          }).catch(response => console.log(response))
      }
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
  margin-left: auto;
  margin-top: 20px;
  margin-right:auto;
  display: flex;
  flex-direction: column;
  justify-content: center;
  color: #7868e6;
  align-items: center;
  justify-content: center;

}
.a {
  width:30vw;
  height:5vh;
  margin: 10px;
  align-items: center;
}
.b {
  width:50px;
  height:20px;

}
.container h1{
  text-align: center;
  color: #7868e6;
}
</style>

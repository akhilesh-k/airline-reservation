<template>
<div><navbar/>
<div class="wrapper">
 <div class="container">
   <div>
     <h1>Register to book the ticket.</h1>
      <input type="text" v-model="name" placeholder="Name" name="name" class="a" required>
      <input type="text" v-model="userName" placeholder="User name" name="userName" class="a" required>
      <input type="text" v-model="password" placeholder="Password" name="password" class="a" required>
      <input type="text" v-model="email" placeholder="Email" name="email" class="a" required>
      <input type="text" v-model="mobileNumber" placeholder="Mobile Number" name="mobileNumber" class="a" required>
      <button @click="clicked" type="submit" class="b" name="register">Register Now</button>
   </div>
 </div>
</div>
</div>
</template>
<script>
import navbar from '../components/navbar.vue'
import axios from 'axios'
export default {
  name: 'register',
  data () {
    return {
      name: '',
      username: '',
      password: '',
      email: '',
      mobileNumber: ''
    }
  },
  methods: {
    clicked () {
      const body = {
        userName: this.userName,
        email: this.email,
        name: this.name,
        mobileNumber: this.mobileNumber,
        password: this.password
      }
      axios.post('http://localhost:8082/register', body)
        .then(response => {
          console.log(response)
        })
    }
  },
  components: {
    navbar: navbar
  }
}
</script>

<style>
.body {
 margin:0;
}
.wrapper{
  display: flex;
  flex-direction: column;
}
.container {
  height: 80vh;
  width: 50vw;
  background-color: #edeef7;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 10px;

}
.title-container{
  height: 15vh;
  width: 50vw;
  background-color: #edeef7;
  display: flex;
  margin-top:20px;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
.a {
  width:30vw;
  height:5vh;
  margin: 30px;
  display: flex;
  border-radius: 8px;
  border: grey;
}
.b {
  width:30vw;
  height:5vh;
  margin: 30px;
  display: flex;
  border: grey;
  border-radius: 6px;
  background-color: #7868e6;
  align-items: center;
  color: white;
}

h1{
  text-align: center;
  color: rgb(51, 50, 50);
  padding-bottom: 20px;
}
::placeholder{
  padding: 10px;
}
</style>

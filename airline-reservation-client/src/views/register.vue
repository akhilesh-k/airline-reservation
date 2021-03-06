<template>
<div><navbar/>
<div class="wrapper">
 <div class="container">
 <h1>Register to book the ticket.</h1>
 <input type="text" v-model="name" placeholder="Name" name="name" class="a" required>
 <input type="text" v-model="userName" placeholder="User name" name="userName" class="a" required>
 <input type="password" v-model="password" placeholder="Password" name="password" class="a" required>
 <input type="password" v-model="confirmPassword" placeholder="confirmPassword" name="confirmPassword" class="a" required>
 <input type="email" v-model="email" placeholder="Email" name="email" class="a" required>
 <input type="text" pattern="[0-9]{10}" v-model="mobileNumber" placeholder="Mobile Number" name="mobileNumber" class="a" required>
 <button type="submit" class="b" name="register" @click="clicked">Register Now</button>
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
      userName: '',
      password: '',
      email: '',
      mobileNumber: '',
      confirmPassword: ''
    }
  },
  methods: {
    validate () {
      var regname = /^[a-zA-Z]+ [a-zA-Z]+$/
      var regUser = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}/
      var regpassword = /^(?=.*[\d])(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*])[\w!@#$%^&*]{8,}$/
      var regemail = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/
      var regmobile = /^\d{10}$/
      var name = this.name
      var userName = this.userName
      var password = this.password
      var confirmPassword = this.confirmPassword
      var email = this.email
      var mobileNumber = this.mobileNumber
      if (regname.test(name) === false) {
        alert('Write a FirstName and Last Name Seperated with space')
      } else if (regUser.test(userName) === false) {
        alert('Must contain at least one  number and one uppercase and lowercase letter, and at least 8 or more characters')
      } else if (regpassword.test(password) === false) {
        alert('Password must have atleast 8 characters, 1 lowercase,1 Capital Letter,1 number and 1 special character')
      } else if (password !== confirmPassword) {
        alert('Password donot Match')
      } else if (regemail.test(email) === false) {
        alert('Write Valid Email ex ramukaka@gmail.com')
      } else if (regmobile.test(mobileNumber) === false) {
        alert('Mobile numbers must have 10 digits')
      }
    },
    clicked () {
      const body = {
        userName: this.userName,
        email: this.email,
        name: this.name,
        mobileNumber: this.mobileNumber,
        password: this.password
      }
      this.validate()
      axios.post('http://10.177.68.80:9000/login-service/register', body)
        .then(response => {
          console.log(response)
          this.$router.push('/')
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
  width: 40vw;
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
  margin: 5px;
  display: flex;
  border-radius: 8px;
  border: grey;
}
.b {
  width:30vw;
  height:5vh;
  margin: 20px;
  display: flex;
  border: grey;
  border-radius: 6px;
  background-color: #7868e6;
  align-items: center;
  color: white;
    align-items: center;
    justify-content: center;
}

h1{
  display : block;
  text-align: center;
  color: rgb(51, 50, 50);
  padding-bottom: 20px;
}
::placeholder{
  padding: 10px;
}
</style>

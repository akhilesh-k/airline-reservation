<template>
<div class ="cont">
 <navabar1/>
  <h1>Enter the passenger details</h1>
<div class="drum">

  <form>
  <input type="text" id="passenger-name"  v-model="name" class="z" name="passenger-name" placeholder="Passenger-name"><br>
  <input type="UserName" id="userName" name="UserName" v-model="userName" class="z" placeholder="UserName"><br>
  <input type="tel" id="phone" name="phone" v-model="mobileNumber" class="z" placeholder="phone-number"><br>
  <button type="submit" @click="clic">submit</button>
</form>
</div>
</div>
</template>

<script>
import axios from 'axios'
import navabar1 from '@/components/navabar1.vue'
export default {
  data () {
    return {
      name: '',
      userName: '',
      mobileNumber: '',
      detail: JSON.parse(localStorage.getItem('item'))
    }
  },
  components: {
    navabar1: navabar1
  },
  methods: {
    validate () {
      var regmobile = /^\d{10}$/
      var regUser = localStorage.getItem('username')
      var UserName = this.userName
      var mobileNumber = this.mobileNumber
      if (this.name === null) {
        alert('name should not be null')
        return 0
      } else if (regUser !== UserName) {
        alert('User not Registered. Enter correct User')
        return 0
      } else if (regmobile.test(mobileNumber) === false) {
        alert('Mobile numbers must have 10 digits')
        return 0
      } else {
        return 1
      }
    },
    clic () {
      const body = {
        date: this.detail.flightId.date,
        userName: this.userName,
        flightName: this.detail.flightId.fid,
        mobileNumber: this.mobileNumber,
        name: this.name,
        price: this.detail.price
      }
      const book = {
        f_id: this.detail.flightId.fid,
        date: this.detail.flightId.date
      }

      if (this.validate() === 1) {
        axios.post('http://10.177.68.80:9000/booking-details/history', body)
          .then(response => {
            console.log(response)
          })
        axios.post('http://10.177.68.80:9000/booking-service/checkout', book)
          .then(response => console.log(response)).catch(response => console.log(response))
        this.$router.push('/')
      }
    }
  }
}
</script>

<style scoped>
.cont {
}
.drum {
    display: flex;
    align-items: center;
    justify-content: center;
    background-color: #edeef7;
    width: 500px;
    height: 50vh;
    margin-left:auto;
    margin-right:auto;
    margin-top: 100px;
    border-radius: 8px;

}
.z{
    margin:20px;
    height: 40px;
    width: 200px;
}
h1{
  padding-top: 40px;
  color: #7868e6;
}
</style>

<template>
<div><navbar/>
<div class="flex-container">
 <div class="container">
 <h1>Your flight ticket just a click away</h1>
 <input type="text" v-model="cardnumber" placeholder="Card Number" name="cardnumber" class="a" required>
 <input type="text" v-model="name" placeholder="Name" name="name" class="a" required>
 <input type="password" v-model="cvv" placeholder="cvv" name="cvv" class="a" required>
 <div class="btn">
 <button type="submit" class="btn" name="save" @click="clicked">Pay</button>
 </div>
 </div>
</div>
</div>
</template>
<script>
import navbar from '../components/navbar.vue'

export default {
  components: {
    navbar: navbar
  },
  methods: {
    clicked () {
      this.$router.push('/confirmation')
    }
  }
}
</script>
<style>
.body {
 margin:0;
}
.flex-container{
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
input[type=text] {
  background-color: #ffffff;
  padding: 12px 20px;
  border-radius: 8px;
}

input[type=password] {
  background-color: #ffffff;
  padding: 12px 20px;
  border-radius: 8px;
}
.btn {
  width:12vw;
  height:8vh;
  margin: 20px;
  display: flex;
  border-radius: 6px;
  background-color: #7868e6;
  align-items: center;
  color: white;
  text-align: center;
}

.h1{
  display : block;
  text-align: center;
  color: rgb(51, 50, 50);
}
::placeholder{
  padding: 10px;
}
/* Responsive layout - makes a one column-layout instead of two-column layout */
@media (max-width: 1200px) {
  .flex-container {
    flex-direction: column;
  }
}
</style>

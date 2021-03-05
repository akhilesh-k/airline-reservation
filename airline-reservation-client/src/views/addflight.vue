<template>
<div><navbar/>
<div class="wrapper">
 <div class="container">
 <h1>Add Flight</h1>
 <input type="text" v-model="flightNo" placeholder="Flight No" name="flightNo" class="a" required>
 <input type="text" v-model="airline" placeholder="Airline" name="airline" class="a" required>
 <input type="text" v-model="source" placeholder="Source" name="source" class="a" required>
 <input type="text" v-model="destination" placeholder="Destination" name="destination" class="a" required>
 <input type="text" v-model="price" placeholder="Price" name="price" class="a" required>
 <button type="submit" class="b" name="save" @click="clicked">Save</button>
 </div>
</div>
</div>
</template>
<script>
import navbar from '../components/navbar.vue'
import axios from 'axios'
export default {
  name: 'addflight',
  data () {
    return {
      flightNo: '',
      airline: '',
      source: '',
      destination: '',
      time: '',
      date: '',
      price: ''
    }
  },
  methods: {
    clicked () {
      const body = {
        flightNo: this.flightNo,
        airline: this.airline,
        source: this.source,
        destination: this.destination,
        price: this.price
      }
      axios.post('localhost:9090/addflight', body)
        .then(response => {
          console.log(response)
        })
      this.flightNo = ''
      this.airline = ''
      this.source = ''
      this.destination = ''
      this.price = ''
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
 border: 1px;

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
 text-align: center;
 color: white;
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

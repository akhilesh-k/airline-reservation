<template>
<div><navbar/><div class="flex-container">
 <div class="container">
 <h1>Add Flights</h1>
 <input type="text" v-model="f_id" placeholder="Flight No" name="f_id" class="a" required>
 <input type="text" v-model="airline" placeholder="Airline" name="airline" class="a" required>
 <h3>Departure Time</h3>
 <input type="time" v-model="departure" placeholder="Departure Time" name="departure" class="a" required>
  <h3>Arrival Time</h3>
 <input type="time" v-model="arrival" placeholder="Arrival Time" name="arrival" class="a" required>
 <input type="text" v-model="destination" placeholder="Destination" name="destination" class="a" required>
  <input type="text" v-model="source" placeholder="source" name="source" class="a" required>
  <input type="date" v-model="date" placeholder="Date" name="date" class="a" required>
 <input type="number" v-model="price" placeholder="Price" name="price" class="a" required>
 <div class="btn">
 <button type="submit" class="btn" name="save" @click="clicked">Save</button>
 </div>
 </div>
 </div>
</div>
</template>
<script>
import navbar from '../components/navbar.vue'
import axios from 'axios'
export default {
  name: 'addflights',
  data () {
    return {
      date: '',
      f_id: '',
      airline: '',
      arrival: '',
      departure: '',
      destination: '',
      price: '',
      source: ''
    }
  },
  methods: {
    clicked () {
      const body = {
        date: this.date,
        f_id: this.f_id,
        airline: this.airline,
        arrival: this.arrival,
        departure: this.departure,
        destination: this.destination,
        price: this.price,
        source: this.source
      }
      axios.post('localhost:8080/flights', body)
        .then(response => {
          console.log(response)
        })
      this.date = ''
      this.f_id = ''
      this.airline = ''
      this.arrival = ''
      this.departureTime = ''
      this.destination = ''
      this.price = ''
      this.source = ''
    }
  },
  components: {
    navbar: navbar
  }
}
</script>
<style>
.flex-container{
  height: 150vh;
  display: flex;
  flex-direction: column;
}
.container {
  height: 150vh;
  width: 40vw;
  background-color: #edeef7;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 10px;

}
.a {
  width:30vw;
  height:10vh;
  margin: 5px;
  display: flex;
  border-radius: 8px;
  border: grey;
}
.btn {
  width:30vw;
  height:10vh;
  margin: 5px;
  display: flex;
  border-radius: 8px;
  border: grey;
}

h1{
  display : block;
  text-align: center;
  color: rgb(51, 50, 50);
  line-height: normal;
  display: flex;
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

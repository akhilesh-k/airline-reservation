<template>
  <div >
    <navabar1/>
    <div class="wrapper">
      <h1>Book the cheapest Flight Ticket</h1>
      <div class="card">
        <div class="part1">
          <select for="Source" class="a" v-model="selected">
            <option value="Source" selected > Source</option>
            <option v-for="city in cities" :key="city.id">{{city}}</option>
          </select>
          <div>
            <div class="r">
              <input type="radio" name="trip" value="single" v-bind="tripType"/>
              <label for="single">OneWay</label>
            </div>
            <div class="r">
              <input type="radio" name="trip" value="round" v-bind="tripType"/>
              <label for="round">RoundTrip</label>
            </div>
          </div>
        </div>
        <div class="part2">
          <select for="Destination" class="a" v-model="selected1">
            <option value="Destination" selected>Destination</option>
            <option v-for="city in cities" :key="city.id">{{city}}</option>
          </select>
          <select for="flightclass" class="a" v-bind="flightclass">
            <option value="Class" selected>Class</option>
            <option value="Buisness">Buisness</option>
            <option value="Economy">Economy</option>
          </select>
        </div>
        <div class="input-container">
          <input type="date" name="date" placeholder="Date" class="a" style="padding:0px" v-bind="date" @click="setDate()" required/>
          <button class="a" @click="searched">Search</button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import navabar1 from '@/components/navabar1.vue'
export default {
  name: 'Home',
  data: function () {
    return {
      cities: [
        'delhi',
        'bombay',
        'chennai',
        'bangalore',
        'kolkata',
        'hyderabad'
      ],
      selected: '',
      selected1: '',
      date: new Date(),
      flightclass: '',
      tripType: ''
    }
  },
  components: {
    navabar1: navabar1
  },
  methods: {
    setDate () {
      var today = new Date().toISOString().split('T')[0]
      document.getElementsByName('date')[0].setAttribute('min', today)
    },
    validate () {
      if (this.selected === 'source') {
        alert('Select Source')
      } else if (this.selected1 === 'destination') {
        alert('Select Destination')
      } else if (this.selected1 === this.selected) {
        alert('Source and Destination Cannot be Same')
      }
    },
    searched () {
      var FlightSearch = {
        date: this.date,
        source: this.selected,
        destination: this.selected1
      }
      const axiosConfig = {
        headers: {
          'Content-Type': 'application/json;charset=UTF-8',
          'Access-Control-Allow-Origin': '*'
        }
      }
      this.validate()
      axios.post('http://10.177.68.80:9000/booking-service/search', FlightSearch, axiosConfig)
        .then(response => {
          console.log(response.data)
          localStorage.setItem('FlightSearch', JSON.stringify(response.data))
          this.$router.push('/search')
        }).catch(e => console.log(e))
    }
  }
}
</script>

<style scoped>
.card {
  text-align: center;
  padding: 20px;
  margin: 50px auto;
  max-width: 800px;
  background-color: #edeef7;
  display: flex;
  justify-content: center;
  color: white;
}
h1 {
  margin-top: 100px;
  font-family: Roboto;
  font-style: normal;
  font-weight: 700;
  font-size: 48px;
  line-height: 56px;
  color: #7868e6;
  text-align: center;
}
.a {
  width: 200px;
  height: 5vh;
  margin: 30px;
  border-radius: 2px;
  background: #7868e6;
  text-align: center;
  padding: 0px 8px;
  border: grey;
  color: #e5e5e5;
  font-family: Roboto;
}
.r {
  display: flex;
  margin: 10px 30px;
  color: #000000;
  justify-content: space-between;
  max-width: 60px;
  align-items: center;
}
.input-container input {
    border: none;
    box-sizing: border-box;
    outline: 0;
    padding: .75rem;
    position: relative;
}
input[type="date"]::-webkit-calendar-picker-indicator {
    background: transparent;
    bottom: 0;
    color: transparent;
    cursor: pointer;
    height: auto;
    left: 0;
    position: absolute;
    right: 0;
    top: 0;
    width: auto;
}
a{
  color: white;
  font-weight: 700;
  text-decoration:none;
}
.wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  width: auto;
}
</style>

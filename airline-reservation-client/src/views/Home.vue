<template>
  <div class="wrapper">
    <navbar />
    <div>
      <h1>Book the cheapest Flight Ticket</h1>
      <div class="card">
        <div class="part1">
          <select for="Source" class="a">
            <option value="Source" selected>Source</option>
            <option v-for="city in cities" :key="city.id">{{city}}</option>
          </select>
          <div>
            <div class="r">
              <input type="radio" name="trip" value="single" />
              <label for="single">Single</label>
            </div>
            <div class="r">
              <input type="radio" name="trip" value="round" />
              <label for="round">Round</label>
            </div>
          </div>
        </div>
        <div class="part2">
          <select for="Destination" class="a">
            <option value="Destination" selected>Destination</option>
            <option v-for="city in cities" :key="city.id">{{city}}</option>
          </select>
          <select for="flightClass" class="a">
            <option value="Class" selected>Class</option>
            <option value="Buisness">Buisness</option>
            <option value="Economy">Economy</option>
          </select>
        </div>
        <div class="input-container">
          <input type="date" name="date" placeholder="Date" class="a" style="padding:0px" />
          <button class="a"><router-link to="/search">Book</router-link></button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import navbar from '@/components/navbar.vue'
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
      ]
    }
  },
  components: {
    navbar: navbar
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
</style>

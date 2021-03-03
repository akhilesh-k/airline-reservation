<template>
<div class="wrapper">
 <navbar />
 <div>
 <h1 >Book The Sabse Sasta Flight Ticket</h1>
 <div class="card">
 <div class="part1">
 <select for="Source" class="a">
 <option value="Source" selected>Source</option>
 <option v-for="city in cities" :key="city.id">{{city}}</option>
 </select>
 <select for="Destination" class="a">
 <option value="Destination" selected>Destination</option>
 <option v-for="city in cities" :key="city.id">{{city}}</option>
 </select>
 <input type="date" name="date" placeholder="Date" class="a">
 </div>
 <div class="part2">
 <div class="part3">
 <input type="radio" name="trip" value="single">
 <label for="single">Single</label>
 <input type="radio" name="trip" value="round">
 <label for="round">Round</label>
 </div>
 <select for="flightClass" class="a">
 <option value="Class" selected>Class</option>
 <option value="Buisness">Buisness</option>
 <option value="Economy">Economy</option>
 </select>
 <button class="a">Book</button>
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
      cities: ['Delhi', 'Mumbai', 'Chennai', 'Bengaluru', 'Kolkata', 'Hyderabad']
    }
  },
  components: {
    navbar: navbar
  }
}
</script>

<style scoped>
.card
{
 text-align: center;
 height: 40vh;
 width: 70vw;
 margin: 5px solid black;
 margin-left: auto;
 margin-top: 100px;
 margin-right:auto;
 background-color: #E5E5E5;
}
h1
{
 font-family: Roboto;
 font-style: normal;
 font-weight: 700;
 font-size: 48px;
 line-height: 56px;
 color: #7868E6;
 text-align: center;
}
.a{
 width:10vw;
 height:5vh;
 margin: 30px;
 border-radius: 8px;
 background: #7868E6;
 border: grey;
 color:#E5E5E5;
 font-family: Roboto;
}
.part
{
 display: inline;
}
.part2
{
 display: inline;
}
.part3
{
 display: block;
}
</style>

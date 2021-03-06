<template>
  <div>
    <navabar1 />
    <div class="pay">
      <div class="card">
        <div class="heading">Payment Successful. Ticket Booked</div>
        <div class="content-line">
          <div class="personal-info">
            <div class="name">{{passenger}}</div>
            <div class="name">{{mobile}}</div>
            <div class="name"></div>
          </div>
          <div class="Details">
            <div class="airline-name">{{item.airline}}</div>
            <div class="from-where">{{item.source }}-->{{item.destination}}</div>
            <div class="timings">{{item.flightId.date}}</div>
            <div class="timings">{{item.arrival}} - {{item.departure}}</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import navabar1 from '@/components/navabar1.vue'

export default {
  data () {
    return {
      item: JSON.parse(localStorage.getItem('item')),
      passenger: localStorage.getItem('Passenger'),
      mobile: localStorage.getItem('Mobile')
    }
  },
  components: {
    navabar1: navabar1
  }
}
</script>

<style scoped>
.pay {
  padding: 50px;
}
.heading {
  font-size: 42px;
  color: #7868e6;
  text-align: center;
  font-weight: bold;
  margin-bottom: 150px;
}
.card {
  background: #edeef7;
  /* max-width:800px; */
  margin: 50px auto;
  padding: 30px;
}

.content-line {
  display: flex;
  justify-content: space-around;
  /* align-items: center; */
  margin-bottom: 40px;
}

.from-where {
  font-weight: bold;
  font-size: 42px;
  color: #7868e6;
}

.timings {
  font-size: 20px;
  line-height: 28px;
  color: #454545;
}

.airline-name {
  font-size: 30px;
  line-height: 40px;
  font-weight: bold;
  color: #000000;
}
.name {
  font-weight: bold;
  font-size: 24px;
  line-height: 40px;
  color: #000000;
}
.pay-amount {
  font-weight: bold;
  font-size: 30px;
  line-height: 35px;
  color: #000000;
}

button {
  margin: 0px;
  width: 152px;
  height: 56px;
  margin-top: 26px;
  font-size: 24px;
  line-height: 28px;
  color: #ffffff;
}
</style>

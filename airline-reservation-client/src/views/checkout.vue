<template>
  <div>
    <navabar1 />
    <div class="pay">
      <div class="heading">Pay now to book the ticket</div>
      <div class="card">
        <div class="content-line">
          <div class="Details">
            <div class="from-where">{{person.source}} --> {{person.destination}}</div>
            <div class="timings">{{person.departure}}<br>{{person.arrival}}<br>{{person.duration}}<br>{{person.flightId.date}}</div>
          </div>
          <div class="airline-name">{{person.airline}}</div>
        </div>
        <div class="content-line">
          <div class="personal-info">
            <div class="name">{{ person.email}}</div>
          </div>
          <div class="pay-button">
            <div class="pay-amount">{{ person.price }}</div>
            <button @click="paynow">Pay Now</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import navabar1 from '@/components/navabar1.vue'

export default {
  components: {
    navabar1: navabar1
  },
  data () {
    return {
      person: JSON.parse(localStorage.getItem('item'))
    }
  },
  methods: {
    paynow () {
      this.$router.push('/details')
    }
  }
}
</script>

<style scoped>
.pay {
  padding: 50px;
}
.heading {
  font-size: 48px;
  color: #7868e6;
  font-weight: bold;
}
.card {
  background: #edeef7;
  /* max-width:800px; */
  margin: 80px auto;
  padding: 50px;
}

.content-line {
  display: flex;
  justify-content: space-between;
  /* align-items: center; */
  margin-bottom: 40px;
}

.from-where {
  font-weight: bold;
  font-size: 48px;
  color: #7868e6;
}

.timings {
  font-size: 24px;
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

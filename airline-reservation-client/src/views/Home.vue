<template>
<div >
<navbar />
<div class="wrapper">
    <h1>Book Cheapest Flights to anywhere!</h1>
    <bookingcard class="booking-card"/>
</div>
</div>
</template>

<script>
import navbar from '@/components/navbar.vue'
import bookingcard from '@/components/bookingcard.vue'
export default {
  name: 'Home',
  components: {
    navbar: navbar,
    bookingcard: bookingcard
  }
}
</script>

<style>
.wrapper{
  display: flex;
  flex-direction: column;
  align-items: center;
}
h1{
  margin-top: 50px;
  color:#7868e6
}
.booking-card{
  align-items: center;
  margin: 10px;
  padding: 30px;
}
</style>

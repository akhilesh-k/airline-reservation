<template>
<div class="navigation">
  <p ><router-link to="/">FlightBooking</router-link></p>
 <ul>
 <li class="active"><router-link to="/login">Login</router-link></li>
 <li class="active"><router-link to="/register">Register</router-link></li>
 </ul>
</div>
</template>

<script>
export default {
  name: 'navbar'
}
</script>

<style scoped>
.navigation {
  background-color: #7868e6;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0px 10px;
}ul {
 list-style-type: none;
 margin: 0;
 padding: 0;
 overflow: hidden;
 background-color:#7868e6;
}
p a{
  color: white;
  font-weight: 700;
  text-decoration:none;
}
li {
 float: right;
}

li a {
 display: block;
 color: white;
 text-align: center;
 padding: 14px 16px;
 text-decoration:none;
}

li a:hover {
 background-color: #111;
}
</style>

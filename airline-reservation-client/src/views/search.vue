<template>
  <div class="container-search">
    <div class="box">
      <div v-for="i in info" :key="i.id">
          <div class="flight">
            <strong>{{i.source }}</strong>
            <strong>{{i.destination }}</strong>
            <strong>{{i.price }}</strong>
            <strong>{{i.airline }}</strong>
          </div>
      </div>
    </div>
   </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'search',
  data () {
    return {
      info: ''
    }
  },
  mounted () {
    axios
      .get('http://10.177.68.80:8080/delhi/bombay')
      .then((response) => {
        console.log(response)
        this.info = response.data
      })
  }
}
</script>

<style>
body{
  background-color: white;
}
.container-search{
  margin: 0px;
  padding: 20px;
  display:flex;
  flex-direction: column;
}
.box{
  margin:30px;
  height: 150px;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  align-items: center;
}
.flight{
  background-color: cadetblue;
}

</style>

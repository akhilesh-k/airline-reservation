<template>
  <div>
    <navabar1 />
    <div class="Page-content">
      <div class="details">
        <table>
          <tr>
            <th>Name</th>
            <th>UserName</th>
            <th>FlightName</th>
            <th>Date</th>
            <th>Price</th>
            <th>MobileNumber</th>
          </tr>
          <tr v-for="i in info" :key="i.id">
            <td>{{ i.name }}</td>
            <td>{{ i.userName }}</td>
            <td>{{ i.flightName}}</td>
            <td>{{ i.date }}</td>
            <td>{{ i.price }}</td>
            <td>{{ i.mobileNumber }}</td>
          </tr>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import navabar1 from '@/components/navabar1.vue'
export default {
  name: 'history',
  data () {
    return {
      info: {}
    }
  },
  components: {
    navabar1: navabar1
  },
  mounted: {
    load () {
      var x = localStorage.getItem('username')
      axios.get('http://10.177.68.80:9000/booking-details/getHistory/' + x).then((response) => {
        this.info = response.data
        console.log(response)
      }).catch((response) => {
        console.log(response)
      })
    }
  }
}
</script>

<style>.Page-content {
 padding: 30px;
}

.headline {
 font-size: 28px;
 margin-bottom: 5px;
}

.subtext {
 font-size: 24px;
 margin-bottom: 10px;
}

table {
 font-family: arial, sans-serif;
 border-collapse: collapse;
 width: 100%;
 margin-top: 40px;
 padding: 0px 20px;
}

td,
th {
 /* border: 1px solid #dddddd; */
 text-align: left;
 padding: 8px;
}

th {
 background: #7868e6;
 color: #ffffff;
}

tr:nth-child(odd) {
 background-color: #edeef7;
}

button {
 margin-left: 20px;
 background: #7868e6;
 color: #ffffff;
 width: 80px;
 height: 30px;
 border: none;
 outline: none;
 cursor: pointer;
}
</style>

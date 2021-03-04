<template>
  <div>
    <navbar />
    <div class="Page-content">
      <div class="headline">{{getSourceAndDestination.source}} to {{getSourceAndDestination.destination}}</div>
      <div class="subtext">{{getSourceAndDestination.date}}</div>
      <div class="details">
        <table>
          <tr>
            <th>Airline</th>
            <th>Flight Number</th>
            <th>Source</th>
            <th>Destination</th>
            <th>Departure</th>
            <th>Arival</th>
            <th>Duration</th>
            <th>Price</th>
          </tr>
          <tr v-for="i in info" :key="i.id">
            <td>{{ i.airline }}</td>
            <td>{{ i.fid }}</td>
            <td>{{ i.source }}</td>
            <td>{{ i.destination }}</td>
            <td>{{ i.departure }}</td>
            <td>{{ i.arrival }}</td>
            <td>{{ i.duration }}</td>
            <td>
              {{ i.price }}
              <button>Book</button>
            </td>
          </tr>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import navbar from '@/components/navbar.vue'
export default {
  name: 'search',
  data () {
    return {
      info: ''
    }
  },
  mounted () {
    axios
      .get('http://10.177.68.80:8080/search/{source}/{destination}')
      .then((response) => {
        console.log(response)
        this.info = response.data
      })
  },
  components: {
    navbar
  },
  computed: {
    getSourceAndDestination () {
      return this.info.length ? this.info[0] : { source: '', destination: '', date: '' }
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

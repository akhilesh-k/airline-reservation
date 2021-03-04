  <div>
    <navbar />
    <div class="Page-content">
      <div class="headline">{{getSourceAndDestination.source}} to {{getSourceAndDestination.destination}}</div>
      <div class="subtext">{{date}}</div>
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
            <td>{{i.airline}}</td>
            <td>{{i.fid}}</td>
            <td>{{i.source}}</td>
            <td>{{i.destination}}</td>
            <td>{{i.departure}}</td>
            <td>{{i.arrival}}</td>
            <td>{{i.duration}}</td>
            <td>{{i.price}}
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
      .get('http://10.177.68.80:8080/delhi/bombay')
      .then((response) => {
        console.log(response)
        this.info = response.data
      })
  },
  components: {
    navbar
<<<<<<< HEAD
>>>>>>> 478587e847d3b2fe400ba69c270f809bf728d8ca
=======
  },
  computed: {
    getSourceAndDestination () {
      return this.info.length ? this.info[0] : { source: '', destination: '' }
    }
>>>>>>> b9a6cdfc2d6f44f5e78e38a6decde0028c8301e7
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

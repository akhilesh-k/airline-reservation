<template>
  <div>
    <navbar />
    <div class="Page-content">
      <h1>Book Ticket List</h1>
      <div class="details">
        <table>
          <tr>
            <th>Airline</th>
            <th>Flight Number</th>
            <th>User Name</th>
            <th>Mobile No</th>
            <th>Email id</th>
            <th>Price</th>
          </tr>
          <tr v-for="i in info" v-bind:key="i.id">
            <td>{{ i.airline }}</td>
            <td>{{ i.fid }}</td>
            <td>{{ i.userName }}</td>
            <td>{{ i.mobileNumber }}</td>
            <td>{{ i.email }}</td>
            <td>
              {{ i.price }}
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
  name: 'bookreport',
  data () {
    return {
      info: ''
    }
  },
  mounted () {
    axios
      .get('http://10.177.68.80:8080/book')
      .then((response) => {
        console.log(response)
        this.info = response.data
      })
  },
  components: {
    navbar
  }
}
</script>
<style>
.Page-content {
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
 border: 1px solid;
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
h1{
  display : block;
  text-align: center;
  color: rgb(51, 50, 50);
  padding-bottom: 20px;
}
::placeholder{
  padding: 10px;
}
</style>

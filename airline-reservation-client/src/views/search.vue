  <div>
    <navbar />
    <div class="Page-content">
      <div class="headline">Location 1 to Location 2</div>
      <div class="subtext">Day, Day Month Year</div>
      <div class="details">
        <table>
          <tr>
            <th>Airline</th>
            <th>Flight Number</th>
            <th>Departure</th>
            <th>Arival</th>
            <th>Duration</th>
            <th>Time</th>
          </tr>
          <tr>
            <td>Aitline 1</td>
            <td>FN001</td>
            <td>11:30 AM</td>
            <td>01:54 PM</td>
            <td>2H 15M</td>
            <td>
              699
              <button>Book</button>
            </td>
          </tr>
          <tr>
            <td>Aitline 1</td>
            <td>FN001</td>
            <td>11:30 AM</td>
            <td>01:54 PM</td>
            <td>2H 15M</td>
            <td>
              699
              <button>Book</button>
            </td>
          </tr>
          <tr>
            <td>Aitline 1</td>
            <td>FN001</td>
            <td>11:30 AM</td>
            <td>01:54 PM</td>
            <td>2H 15M</td>
            <td>
              699
              <button>Book</button>
            </td>
          </tr>
          <tr>
            <td>Aitline 1</td>
            <td>FN001</td>
            <td>11:30 AM</td>
            <td>01:54 PM</td>
            <td>2H 15M</td>
            <td>
              699
              <button>Book</button>
            </td>
          </tr>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
import navbar from '@/components/navbar.vue'
export default {
  components: {
    navbar
>>>>>>> 478587e847d3b2fe400ba69c270f809bf728d8ca
  }
}
</script>

<style>
<<<<<<< HEAD
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

=======
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
>>>>>>> 478587e847d3b2fe400ba69c270f809bf728d8ca
</style>

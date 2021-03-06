import Vue from 'vue'
import VueRouter from 'vue-router'
import login from '@/views/login.vue'
import register from '@/views/register.vue'
import Home from '@/views/Home.vue'
import search from '@/views/search.vue'
import checkout from '@/views/checkout.vue'
import confirmation from '@/views/confirmation.vue'
import addflights from '@/views/addflights.vue'
import bookreport from '@/views/bookreport.vue'
import payment from '@/views/payment.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/login',
    name: 'login',
    component: login
  },
  {
    path: '/register',
    name: 'register',
    component: register
  },
  {
    path: '/search',
    name: 'search',
    component: search
  },
  {
    path: '/checkout',
    name: 'checkout',
    component: checkout
  },
  {
    path: '/confirmation',
    name: 'confirmation',
    component: confirmation
  },
  {
    path: '/bookreport',
    name: 'bookreport',
    component: bookreport
  },
  {
    path: '/addflights',
    name: 'addflights',
    component: addflights
  },
  {
    path: '/payment',
    name: 'payment',
    component: payment
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router

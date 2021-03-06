import Vue from 'vue'
import VueRouter from 'vue-router'
import login from '@/views/login.vue'
import register from '@/views/register.vue'
import Home from '@/views/Home.vue'
import search from '@/views/search.vue'
import checkout from '@/views/checkout.vue'
import confirmation from '@/views/confirmation.vue'
import adminLogin from '@/views/adminLogin.vue'
import details from '@/views/details.vue'
import history from '@/views/history.vue'
import payment from '@/views/payment.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'login',
    component: login
  },
  {
    path: '/home',
    name: 'home',
    component: Home
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
    path: '/confirmation',
    name: 'confirmation',
    component: confirmation
  },
  {
    path: '/adminLogin',
    name: 'adminLogin',
    component: adminLogin

  },
  {
    path: '/checkout',
    name: 'checkout',
    component: checkout
  },
  {
    path: '/details',
    name: 'details',
    component: details
  },
  {
    path: '/history',
    name: 'history',
    component: history
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

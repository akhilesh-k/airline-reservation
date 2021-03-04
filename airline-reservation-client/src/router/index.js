import Vue from 'vue'
import VueRouter from 'vue-router'
import login from '@/views/login.vue'
import register from '@/views/register.vue'
import Home from '@/views/Home.vue'
import search from '@/views/search.vue'
<<<<<<< HEAD
=======
import checkout from '@/views/checkout.vue'
import confirmation from '@/views/confirmation.vue'
>>>>>>> 478587e847d3b2fe400ba69c270f809bf728d8ca

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
<<<<<<< HEAD
=======
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
>>>>>>> 478587e847d3b2fe400ba69c270f809bf728d8ca
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router

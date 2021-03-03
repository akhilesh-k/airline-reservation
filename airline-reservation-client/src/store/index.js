import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    isLogin: false,
    userData: ''
  },
  getters: {
    getlogin (state) {
      return state.isLogin
    },
    getUserData (state) {
      return state.userData
    }
  },
  mutations: {
    setlogin (state, value) {
      state.isLogin = value
    },
    setUserData (state, value) {
      state.userData = value
    }
  },
  actions: {
    setLoginAction ({ commit }, value) {
      commit('setlogin', value)
    },
    setUserDataAction ({ commit }, value) {
      commit('setUserdata', value)
    }
  },
  modules: {
  }
})

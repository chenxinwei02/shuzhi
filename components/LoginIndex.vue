<template>
    <div class="login-container">
      <h2>登录</h2>
      <form @submit.prevent="login">
        <div>
          <label for="username">用户名:</label>
          <input type="text" id="username" v-model="username" required>
        </div>
        <div>
          <label for="password">密码:</label>
          <input type="password" id="password" v-model="password" required>
        </div>
        <button type="submit">登录</button>
      </form>
      <p v-if="error">{{ error }}</p>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        username: '',
        password: '',
        error: ''
      };
    },
    methods: {
      async login() {
        try {
          const response = await fetch('http://localhost:8095/api/login', {
            method: 'POST',
            headers: {
              'Content-Type': 'application/json'
            },
            body: JSON.stringify({
              username: this.username,
              password: this.password
            })
          });
          if (!response.ok) {
            throw new Error('登录失败');
          }
          const data = await response.json();
          console.log('登录成功', data);
        } catch (error) {
          this.error = error.message;
        }
      }
    }
  };
  </script>
  
  <style scoped>
  .login-container {
    max-width: 300px;
    margin: auto;
    padding: 2rem;
    border: 1px solid #ccc;
    border-radius: 8px;
  }
  </style>
  
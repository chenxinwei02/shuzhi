<!-- src/components/BookBorrowing.vue -->
<template>
    <div>
      <h2>借阅管理</h2>
      <div>
        <label>借阅人</label>
        <input v-model="search.borrower" placeholder="借阅人" />
        <label>借书名称</label>
        <input v-model="search.bookName" placeholder="借书名称" />
        <button @click="searchBooks">查询</button>
        <button @click="resetSearch">重置</button>
      </div>
      <table>
        <thead>
          <tr>
            <th>图书名称</th>
            <th>作者</th>
            <th>状态</th>
            <th>借阅人</th>
            <th>借阅时间</th>
            <th>归还时间</th>
            <th>操作</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="book in books" :key="book.id">
            <td>{{ book.title }}</td>
            <td>{{ book.author }}</td>
            <td>{{ book.status }}</td>
            <td>{{ book.borrower }}</td>
            <td>{{ book.borrowDate }}</td>
            <td>{{ book.returnDate }}</td>
            <td>
              <button v-if="book.status === '可借阅'" @click="borrowBook(book.id)">借阅</button>
              <button v-else @click="returnBook(book.id)">归还</button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </template>
  
  <script>
  import axios from 'axios';
  
  export default {
    data() {
      return {
        books: [],
        search: {
          borrower: '',
          bookName: ''
        }
      };
    },
    methods: {
      fetchBooks() {
        axios.get('http://localhost:8095/api/books').then(response => {
          this.books = response.data;
        });
      },
      searchBooks() {
        axios.get('http://localhost:8095/api/books/search', { params: this.search }).then(response => {
          this.books = response.data;
        });
      },
      resetSearch() {
        this.search = { borrower: '', bookName: '' };
        this.fetchBooks();
      },
      borrowBook(bookId) {
        let borrowerName = prompt("请输入借阅人姓名:");
        axios.post('http://localhost:8095/api/books/borrow', {
          id: bookId,
          borrower: borrowerName,
          status: '已借出'
        }).then(() => {
          this.fetchBooks();
          this
        });
      },
      returnBook(bookId) {
        axios.post(`http://localhost:8095/api/books/return/${bookId}`).then(() => {
          this.fetchBooks();
        });
      }
    },
    mounted() {
      this.fetchBooks();
    }
  };
  </script>
  
  <style>
  /* 添加样式 */
  div {
    margin: 20px;
  }
  label {
    margin-right: 10px;
  }
  input {
    margin-right: 20px;
  }
  button {
    margin-right: 10px;
  }
  table {
    width: 100%;
    border-collapse: collapse;
  }
  th, td {
    border: 1px solid #ddd;
    padding: 8px;
  }
  th {
    background-color: #f2f2f2;
  } 
  </style>
  
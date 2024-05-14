import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Header from './components/Header';
import UserList from './components/UserList';
import './App.css';

function App() {
  const [showUsers, setShowUsers] = useState(false);
  const [users, setUsers] = useState([]);
  const [name, setNome] = useState('');
  const [email, setEmail] = useState('');

  useEffect(() => {
    const fetchUsers = async () => {
      try {
        const response = await axios.get('http://localhost:8081/users');
        setUsers(response.data);
      } catch (error) {
        console.error('Erro ao buscar usuários:', error);
      }
    };

    if (showUsers) {
      fetchUsers();
    }
  }, [showUsers]);

  const handleSubmit = async (event) => {
    event.preventDefault();

    try {
      const response = await axios.post('http://localhost:8081/users', {
        name,
        email
      });
      console.log('Resposta da API:', response.data);
      setShowUsers();
    } catch (error) {
      console.error('Erro ao enviar requisição:', error);
    }
  };

  const handleShowUsers = () => {
    setShowUsers(true);
  };

  return (
    <div>
    <div className="header">
      <Header onClick={handleShowUsers} />
    </div>
    <div className="container">
      <div className="form">
        <h1>Sign up</h1>
        <form onSubmit={handleSubmit}>
          <label>
            Nome:
            <input
              type="text"
              value={name}
              onChange={(event) => setNome(event.target.value)}
            />
          </label>
          <label>
            Email:
            <input
              type="email"
              value={email}
              onChange={(event) => setEmail(event.target.value)}
            />
          </label>
          <button type="submit">Enviar</button>
        </form>
      </div>
        {showUsers && <UserList users={users} />}
      </div>
    </div>
  );
}

export default App;

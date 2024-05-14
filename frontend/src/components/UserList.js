import React from 'react';
import './userList.css';

function UserList({ users }) {
  return (
    <div className='user-list'>
      <h2>Usuários Cadastrados</h2>
      <ul>
        {users.map(user => (
          <li key={user.id}>
            <strong>Nome:</strong> {user.name}, <strong>Email:</strong> {user.email}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default UserList;

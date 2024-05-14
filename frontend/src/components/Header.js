import React from 'react';
import "../App.css"

function Header({ onClick }) {
  return (
    <>
    <h1>T1 - Computação Distribuída</h1>
    <button className="button" onClick={onClick}>Mostrar Usuários Cadastrados</button>
    </>
  );
}

export default Header;

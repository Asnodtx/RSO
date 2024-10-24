import React, { useEffect, useState } from "react";
import "../App.css";
import axios from "axios";

const UsuarioList = () => {
  const [usuarios, setUsuarios] = useState([]);

  const fetchUsuarios = async () => {
    try {
      const response = await axios.get("http://localhost:8080/usuario");
      setUsuarios(response.data);
    } catch (error) {
      console.error(error);
    }
  };

  useEffect(() => {
    fetchUsuarios();
  }, []);

  return (
    <div className="user-list">
      <h2>Lista de Usuarios</h2>
      <ul>
        {usuarios.map((usuario) => (
          <li key={usuario.id}>
            {usuario.name} - {usuario.job} - Salario: {usuario.salary} -
            Comisión: {usuario.commision} - Prioridad: {usuario.prioridad}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default UsuarioList;

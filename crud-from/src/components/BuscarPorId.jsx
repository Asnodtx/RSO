import React, { useState } from "react";
import axios from "axios";

const BuscarPorId = () => {
  const [id, setId] = useState("");
  const [usuario, setUsuario] = useState(null);
  const [error, setError] = useState("");

  const buscarUsuario = async () => {
    try {
      const response = await axios.get(`http://localhost:8081/usuario/${id}`);
      setUsuario(response.data);
      setError("");
    } catch (err) {
      setError("Usuario no encontrado");
      setUsuario(null);
    }
  };

  return (
    <div>
      <h2>Buscar Usuario por ID</h2>
      <input
        type="number"
        placeholder="Ingrese ID"
        value={id}
        onChange={(e) => setId(e.target.value)}
      />
      <button onClick={buscarUsuario}>Buscar</button>
      {usuario && (
        <div>
          <h3>Usuario Encontrado:</h3>
          <p>ID: {usuario.id}</p>
          <p>Nombre: {usuario.name}</p>
          <p>Trabajo: {usuario.job}</p>
          <p>Salario: {usuario.salary}</p>
          <p>Comisión: {usuario.commision}</p>
          <p>Prioridad: {usuario.prioridad}</p>
        </div>
      )}
      {error && <p>{error}</p>}
    </div>
  );
};

export default BuscarPorId;

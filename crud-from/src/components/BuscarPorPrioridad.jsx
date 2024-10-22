import React, { useState } from "react";
import axios from "axios";

const BuscarPorPrioridad = () => {
  const [prioridad, setPrioridad] = useState("");
  const [usuarios, setUsuarios] = useState([]);
  const [error, setError] = useState("");

  const buscarPorPrioridad = async () => {
    try {
      const response = await axios.get(
        `http://localhost:8081/usuario/query?prioridad=${prioridad}`,
      );
      setUsuarios(response.data);
      setError("");
    } catch (err) {
      setError("Error al buscar usuarios");
      setUsuarios([]);
    }
  };

  return (
    <div>
      <h2>Buscar Usuarios por Prioridad</h2>
      <input
        type="number"
        placeholder="Ingrese Prioridad"
        value={prioridad}
        onChange={(e) => setPrioridad(e.target.value)}
      />
      <button onClick={buscarPorPrioridad}>Buscar</button>
      {usuarios.length > 0 ? (
        <div>
          <h3>Usuarios Encontrados:</h3>
          <ul>
            {usuarios.map((usuario) => (
              <li key={usuario.id}>
                ID: {usuario.id}, Nombre: {usuario.name}, Trabajo: {usuario.job}
              </li>
            ))}
          </ul>
        </div>
      ) : (
        <p>No se encontraron usuarios</p>
      )}
      {error && <p>{error}</p>}
    </div>
  );
};

export default BuscarPorPrioridad;

import React from "react";
import "./Sidebar.css";
import { Link } from "react-router-dom";

const Sidebar = () => {
  return (
    <div className="sidebar">
      <h2>NAVIGATION</h2>
      <ul>
        <li>
          <Link to="/" className="active">
            <i className="fas fa-plus"></i> Crear Usuario
          </Link>
        </li>
        <li>
          <Link to="/lista-usuarios">
            <i className="fas fa-users"></i> Ver Lista de Usuarios
          </Link>
        </li>
        <li>
          <Link to="/buscar-por-id">
            <i className="fas fa-search"></i> Buscar por ID
          </Link>
        </li>
        <li>
          <Link to="/buscar-por-prioridad">
            <i className="fas fa-filter"></i> Buscar por Prioridad
          </Link>
        </li>
      </ul>
    </div>
  );
};

export default Sidebar;

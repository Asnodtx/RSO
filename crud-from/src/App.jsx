// src/App.jsx
import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import UsuarioForm from "./components/UsuarioForm";
import UsuarioList from "./components/UsuarioList";
import BuscarPorId from "./components/BuscarPorId";
import BuscarPorPrioridad from "./components/BuscarPorPrioridad";
import Sidebar from "./components/Sidebar";
import "./App.css";

const App = () => {
  return (
    <Router>
      <div className="App" style={{ display: "flex" }}>
        <Sidebar />
        <div style={{ marginLeft: "250px", padding: "20px" }}>
          <h1>Gestión de Usuarios</h1>
          <Routes>
            <Route path="/" element={<UsuarioForm />} />
            <Route path="/lista-usuarios" element={<UsuarioList />} />
            <Route path="/buscar-por-id" element={<BuscarPorId />} />
            <Route
              path="/buscar-por-prioridad"
              element={<BuscarPorPrioridad />}
            />
          </Routes>
        </div>
      </div>
    </Router>
  );
};

export default App;

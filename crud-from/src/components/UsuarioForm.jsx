import React, { useState } from "react";
import axios from "axios";

const UsuarioForm = () => {
  const [usuario, setUsuario] = useState({
    name: "",
    job: "",
    salary: "",
    commision: "",
    prioridad: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setUsuario({
      ...usuario,
      [name]: value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post("http://localhost:8081/usuario", usuario);
      alert("Usuario creado exitosamente");
      setUsuario({
        name: "",
        job: "",
        salary: "",
        commision: "",
        prioridad: "",
      });
    } catch (error) {
      console.error(error);
      alert("Error al crear el usuario");
    }
  };

	async function serverData() {
    try {
      let r = await fetch("http://localhost:8081/ejemplos");
      let j = await r.json();
      return j;
    } catch (error) {
      console.log("ERROR ---", error);
    }
  }


  return (
    <form onSubmit={handleSubmit} className="usuario-form">
      <h2>Crear Usuario</h2>
	  <button
		type='button'
		onClick={async () => {
			const datos = await serverData()
			console.log(datos)
		}}
	  >
	  	{"pedir datos"}
	  </button>

      <label>
        Nombre:
        <input
          type="text"
          name="name"
          value={usuario.name}
          onChange={handleChange}
          required
        />
      </label>
      <label>
        Trabajo:
        <input
          type="text"
          name="job"
          value={usuario.job}
          onChange={handleChange}
          required
        />
      </label>
      <label>
        Salario:
        <input
          type="number"
          name="salary"
          value={usuario.salary}
          onChange={handleChange}
          required
        />
      </label>
      <label>
        Comisión:
        <input
          type="number"
          name="commision"
          value={usuario.commision}
          onChange={handleChange}
          required
        />
      </label>
      <label>
        Prioridad:
        <input
          type="number"
          name="prioridad"
          value={usuario.prioridad}
          onChange={handleChange}
          required
        />
      </label>
      <button type="submit">Crear Usuario</button>
    </form>
  );
};

export default UsuarioForm;

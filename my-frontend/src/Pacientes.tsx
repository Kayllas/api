import React, { useEffect, useState } from "react";
import { fetchPacientes } from "./api";

const Pacientes = () => {
  const [pacientes, setPacientes] = useState<any[]>([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadPacientes = async () => {
      try {
        const data = await fetchPacientes(0, 10); // Página 0, tamanho 10
        setPacientes(data.content); // Ajuste conforme a estrutura de dados que a API retorna
        setLoading(false);
      } catch (error) {
        console.error("Erro ao carregar pacientes:", error);
        setLoading(false);
      }
    };

    loadPacientes();
  }, []);

  if (loading) {
    return <div>Carregando pacientes...</div>;
  }

  return (
    <div>
      <h1>Lista de Pacientes</h1>
      <ul>
        {pacientes.map((paciente) => (
          <li key={paciente.id}>{paciente.nome}</li> // Ajuste o campo conforme sua estrutura
        ))}
      </ul>
    </div>
  );
};

export default Pacientes;

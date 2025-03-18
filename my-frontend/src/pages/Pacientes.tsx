import React, { useEffect, useState } from "react";
import { fetchPacientes } from "../services/api";

interface Paciente {
  id: number;
  nome: string;
  email: string;
  cpf: string;
}

const Pacientes = () => {
  const [pacientes, setPacientes] = useState<Paciente[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<Error | null>(null);

  useEffect(() => {
    const loadPacientes = async () => {
      try {
        const data = await fetchPacientes(0, 10);
        setPacientes(data.content);
      } catch (error) {
        setError(error as Error);
        console.error("Erro ao carregar pacientes:", error);
      } finally {
        setLoading(false);
      }
    };

    loadPacientes();
  }, []);

  if (loading) {
    return <div>Carregando pacientes...</div>;
  }

  if (error) {
    return <div>Erro ao carregar pacientes: {error.message}</div>;
  }

  if (pacientes.length === 0) {
    return <div>Não há pacientes disponíveis.</div>;
  }

  return (
    <div>
      <h1>Lista de Pacientes</h1>
      <ul>
        {pacientes.map((paciente) => (
          <li key={paciente.id}>
            <strong>{paciente.nome}</strong><br />
            Email: {paciente.email}<br />
            CPF: {paciente.cpf}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Pacientes;

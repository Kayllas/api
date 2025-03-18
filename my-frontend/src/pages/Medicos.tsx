import React, { useEffect, useState } from "react";
import { fetchMedicos } from "../services/api";

interface Medico {
  id: number;
  nome: string;
  email: string;
  crm: string;
  especialidade: string;
}

const Medicos = () => {
  const [medicos, setMedicos] = useState<Medico[]>([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState<Error | null>(null);

  useEffect(() => {
    const loadMedicos = async () => {
      try {
        const data = await fetchMedicos(0, 10);
        setMedicos(data.content);
      } catch (error) {
        setError(error as Error);
        console.error("Erro ao carregar médicos:", error);
      } finally {
        setLoading(false);
      }
    };

    loadMedicos();
  }, []);

  if (loading) {
    return <div>Carregando médicos...</div>;
  }

  if (error) {
    return <div>Erro ao carregar médicos: {error.message}</div>;
  }

  if (medicos.length === 0) {
    return <div>Não há médicos disponíveis.</div>;
  }

  return (
    <div>
      <h1>Lista de Médicos</h1>
      <ul>
        {medicos.map((medico) => (
          <li key={medico.id}>
            <strong>{medico.nome}</strong><br />
            Especialidade: {medico.especialidade}<br />
            CRM: {medico.crm}<br />
            Email: {medico.email}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default Medicos;

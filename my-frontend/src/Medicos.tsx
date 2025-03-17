import React, { useEffect, useState } from "react";
import { fetchMedicos } from "./api";

const Medicos = () => {
  const [medicos, setMedicos] = useState<any[]>([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadMedicos = async () => {
      try {
        const data = await fetchMedicos(0, 10); // Página 0, tamanho 10
        setMedicos(data.content); // Ajuste conforme a estrutura de dados que a API retorna
        setLoading(false);
      } catch (error) {
        console.error("Erro ao carregar médicos:", error);
        setLoading(false);
      }
    };

    loadMedicos();
  }, []);

  if (loading) {
    return <div>Carregando médicos...</div>;
  }

  return (
    <div>
      <h1>Lista de Médicos</h1>
      <ul>
        {medicos.map((medico) => (
          <li key={medico.id}>{medico.nome}</li> // Ajuste o campo conforme sua estrutura
        ))}
      </ul>
    </div>
  );
};

export default Medicos;

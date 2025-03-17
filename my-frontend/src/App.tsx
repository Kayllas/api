import React, { useState } from "react";
import Medicos from "./Medicos";
import Pacientes from "./Pacientes";

const App = () => {
  const [view, setView] = useState<"medicos" | "pacientes">("pacientes");
  const [isTransitioning, setIsTransitioning] = useState(false);

  const handleToggleView = () => {
    // Se já estiver em transição, não faça nada
    if (isTransitioning) return;

    // Inicia a transição
    setIsTransitioning(true);

    // Simula um delay de 1 segundo (1000 ms) antes de alternar a página
    setTimeout(() => {
      setView(view === "medicos" ? "pacientes" : "medicos");
      setIsTransitioning(false); // Permite a troca novamente
    }, 1000); // Ajuste o tempo conforme necessário (em milissegundos)
  };

  return (
    <div>
      <h1>Bem-vindo ao Sistema</h1>
      <button onClick={handleToggleView} disabled={isTransitioning}>
        {isTransitioning ? "Aguarde..." : view === "medicos" ? "Ver Pacientes" : "Ver Médicos"}
      </button>

      {view === "medicos" ? <Medicos /> : <Pacientes />}
    </div>
  );
};

export default App;

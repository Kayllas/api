import React from "react";
import { useNavigate, useLocation } from "react-router-dom";
import RouterConfig from "./router/router";

const App = () => {
  const navigate = useNavigate();
  const location = useLocation();

  const goHome = () => {
    navigate("/");
  };

  return (
    <div>
      {location.pathname !== "/" && (
        <button onClick={goHome}>Voltar para Home</button>
      )}
      <RouterConfig />
    </div>
  );
};

export default App;

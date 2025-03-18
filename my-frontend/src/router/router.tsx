import React from "react";
import { Route, Routes } from "react-router-dom";
import Pacientes from "../pages/Pacientes";
import Medicos from "../pages/Medicos";
import Home from "../pages/Home"; 

const RouterConfig = () => {
  return (
    <Routes>
       <Route path="/" element={<Home />} />

      <Route path="/medicos" element={<Medicos />} />

      <Route path="/pacientes" element={<Pacientes />} />
    </Routes>
  );
};

export default RouterConfig;

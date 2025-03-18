import React from "react";
import { Link } from "react-router-dom";
import "../styles/Home.css";
import logoHome from "../logo_home.png";

const Home = () => {
  return (
    <div className="home-container">

      <img src="/logo_home.png" alt="Logo" className="home-logo" />

      <h1 className="home-title01">Med.care</h1>
      <h2 className="home-title02">Bem-vindo ao Sistema de Marcação de Consultas</h2>
      <p className="home-subtitle">Cuidando da sua saúde com excelência e dedicação.</p>


      <div className="home-info">
        <p>Nosso objetivo é fornecer serviços de qualidade, sempre priorizando o bem-estar dos pacientes.</p>
      </div>

      <div className="home-buttons">
        {/* <Link to="/medicos">
          <button className="home-button">Ver Médicos</button>
        </Link>

        <Link to="/pacientes">
          <button className="home-button">Ver Pacientes</button>
        </Link> */}
      </div>


    </div>
  );
};

export default Home;

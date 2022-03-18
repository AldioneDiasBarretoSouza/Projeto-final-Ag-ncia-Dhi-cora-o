import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from "pages/Home";
import Navbar from "components/Navbar";
import Cadastro from 'pages/Cadastro';
import Promocao from 'pages/Promocao';
import Destino from 'pages/Destino';
import Contato from 'pages/Contato';


ReactDOM.render(
  <React.StrictMode>
    
    <Router>
        <Navbar />
        <Routes>
            <Route path="/" element={<Home />}exact>

            </Route>

            <Route path="/Cadastro" element={<Cadastro />}>

            </Route>

            <Route path="/Contato" element={<Contato />}>

            </Route>

            < Route path="/Promocao" element={<Promocao />}>

            </Route>

            <Route path="/Destino" element={<Destino />}>

            </Route>

        </Routes>

    </Router>

    
  </React.StrictMode>,
  document.getElementById('root')
);

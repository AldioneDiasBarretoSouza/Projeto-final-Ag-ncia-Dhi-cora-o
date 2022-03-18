import "./styles.css";
import 'bootstrap/js/src/collapse.js';
import { Link } from "react-router-dom";
import { NavLink } from "react-router-dom";

const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-md navbar-dark bg-primary main-nav">
      <div className="container-fluid">
        <Link to="/" className="nav-logo-text">
          <h4>DHI CORAÇÃO</h4>
        </Link>
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#DHICORACAO-navbar"
          aria-controls="DHICORACAO-navbar"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse" id="DHICORACAO-navbar">
          <ul className="navbar-nav offset-md-2 main-menu">
            <li>
              <NavLink to="/" activeClassName="active" exact>
                HOME
              </NavLink>
            </li>
            <li>
              <NavLink to="/Cadastro" activeClassName="active">
                CADASTRO
              </NavLink>
            </li>
            <li>
              <NavLink to="/Contato" activeClassName="active">
                CONTATO
              </NavLink>
            </li>
            <li>
              <NavLink to="/Promocao" activeClassName="active">
                PROMOÇÃO
              </NavLink>
            </li>
            <li>
              <NavLink to="/Destino" activeClassName="active">
                DESTINO
              </NavLink>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;

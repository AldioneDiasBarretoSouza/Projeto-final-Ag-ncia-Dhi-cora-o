import "./styles.css";
import ButtonIcon from "components/Navbar/ButtonIcon";
import { Link } from "react-router-dom";

const Home = () => {
  return (


    <div className="container-fluid mt-5">
      <div className="alinhamento">
        <div className="w-50">
          <div className="row">
            <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
              <div class="carousel-indicators">
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
              </div>
              <div class="carousel-inner">
                <div class="carousel-item active">
                  <img src="https://cdn.pixabay.com/photo/2017/12/15/13/51/polynesia-3021072_960_720.jpg" class="d-block w-100" alt="..." />
                </div>
                <div class="carousel-item">
                  <img src="https://cdn.pixabay.com/photo/2016/12/11/12/02/mountains-1899264_960_720.jpg" class="d-block w-100" alt="..." />
                </div>
                <div class="carousel-item">
                  <img src="https://cdn.pixabay.com/photo/2017/12/16/22/22/bora-bora-3023437_960_720.jpg" class="d-block w-100" alt="..." />
                </div>
              </div>
              <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
              </button>
              <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
              </button>
            </div>
          </div>
        </div>

        <div className="col-12 col-md-5">
          <h1>CONHEÇA A MELHOR AGÊNCIA DE VIAGENS</h1>
          <div className="container">
            <div className="row">
              <div className="col-8 col-md-12">
                <p className="mt-4">
                  Ajudaremos você encontrar os mais lindos lugares para melhor
                  curtir suas ferias, desse modo,será um momento especial para
                  você e para nós em vermos a sua alegria. DHI CORAÇÃO, presente
                  em seus melhores momentos.
                </p>
              </div>
            </div>
          </div>
          <Link to="/Destino">
            <ButtonIcon />
          </Link>
        </div>
      </div>
    </div>


  );
};

export default Home;

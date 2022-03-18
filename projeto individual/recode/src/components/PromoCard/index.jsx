import './styles.css';
import Botao from 'components/BotãoAdquira/botao';


const PromoCard = ({ foto, nome, preco,precoAnterior }) => {
    return (
        <div className=" Destino-card">
            <div className="card-top-container">
                <img className="imgCard" src={foto} alt="nome do produto" />
            </div>
            <div className="card-bottom-container">
                <h6>{nome}</h6>
                <div className="product-price-container">
                    <p>
                        <strong>De:</strong> <s>{precoAnterior}</s><br></br>
                        <strong>Por:</strong> {preco}
                    </p>
                    
                </div>
                < Botao/>
            </div>
        </div>

    );
}
export default PromoCard;
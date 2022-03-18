import './styles.css';
import'../DestinoCard';
import React from 'react';
import Botao from '../BotãoAdquira/botao'

const DestinoCard = ({ foto, nome, preco }) => {
    return (
<>
       
            <div className=" Destino-card">
                <div className="card-top-container">
                    <img className="imgCard" src={foto} alt="nome do produto" />
                </div>
                <div className="card-bottom-container">
                    <h6>{nome}</h6>
                    <div className="product-price-container">
                        <span>R$</span>
                        <h3>{preco}</h3>
                    </div>
                    <Botao/>
                   
                </div>
            </div>
            </>

    );
}
export default DestinoCard;
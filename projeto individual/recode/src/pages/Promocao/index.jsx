

import "./styles.css";
import PromoCard from "components/PromoCard";

const Promocao = ()=>{
    return(
        <div className="">
        <div className="img-w w-50">
            <img className="w-100" src="https://cdn.pixabay.com/photo/2016/01/30/08/25/woman-1169324_960_720.jpgg" alt="" />
        </div>
        
        <div className=" container my-4 base-card">
        <div className="row">
        <div className="col-sm-6 col-lg-4 col-xl-3">
        <PromoCard foto={"https://cdn.pixabay.com/photo/2016/08/01/16/24/nature-1561474_960_720.jpg"}
        nome={'Ceara'}
        preco={'900'}
        precoAnterior={'1.200'}
        ></PromoCard>
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
        <PromoCard foto={"https://cdn.pixabay.com/photo/2014/08/15/11/29/beach-418742_960_720.jpg"}
        nome={'Natal'}
        preco={'900'}
        precoAnterior={'1.500'}
        ></PromoCard>
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
        <PromoCard foto={"https://cdn.pixabay.com/photo/2017/01/08/19/30/rio-de-janeiro-1963744_960_720.jpg"}
        nome={'Ipanema'}
        preco={'900'}
        precoAnterior={'1.200'}
        ></PromoCard>
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
        <PromoCard foto={"https://cdn.pixabay.com/photo/2021/09/13/03/19/ocean-6620000_960_720.jpg"}
        nome={'Maresias'}
        preco={'1.000'}
        precoAnterior={'1.300'}
        ></PromoCard>
        </div>
        </div>
    </div>
    </div>
    
        
    );
}
export default  Promocao;
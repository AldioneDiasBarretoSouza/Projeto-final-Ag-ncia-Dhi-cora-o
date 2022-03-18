
import DestinoCard from "components/DestinoCard";

const Destino = () => {
    return (


        <div className=" container my-4 base-card">
            <div className="row">
                <div className="col-sm-6 col-lg-4 col-xl-3">
                    <DestinoCard foto={"https://cdn.pixabay.com/photo/2016/08/01/16/24/nature-1561474_960_720.jpg"}
                        nome={'Ceara'}
                        preco={'1.200'}
                    ></DestinoCard>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3">
                    <DestinoCard foto={"https://cdn.pixabay.com/photo/2014/08/15/11/29/beach-418742_960_720.jpg"}
                        nome={'Natal'}
                        preco={'1.500'}
                    ></DestinoCard>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3">
                    <DestinoCard foto={"https://cdn.pixabay.com/photo/2017/01/08/19/30/rio-de-janeiro-1963744_960_720.jpg"}
                        nome={'Ipanema'}
                        preco={'1.700'}
                    ></DestinoCard>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3">
                    <DestinoCard foto={"https://cdn.pixabay.com/photo/2021/09/13/03/19/ocean-6620000_960_720.jpg"}
                        nome={'Maresias'}
                        preco={'1.000'}
                    ></DestinoCard>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3">
                    <DestinoCard foto={"https://cdn.pixabay.com/photo/2017/01/20/00/30/maldives-1993704_960_720.jpg"}
                        nome={'Praia de Genipabual'}
                        preco={'1.500'}
                    ></DestinoCard>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3">
                    <DestinoCard foto={"https://cdn.pixabay.com/photo/2015/03/09/18/34/beach-666122_960_720.jpg"}
                        nome={'Porto de Galinhas'}
                        preco={'1.700'}
                    ></DestinoCard>
                </div>

                <div className="col-sm-6 col-lg-4 col-xl-3">
                    <DestinoCard foto={"https://cdn.pixabay.com/photo/2013/02/21/19/06/drink-84533_960_720.jpg"}
                        nome={'Maceió'}
                        preco={'1.000'}
                    ></DestinoCard>
                </div>
                <div className="col-sm-6 col-lg-4 col-xl-3">
                    <DestinoCard foto={"https://cdn.pixabay.com/photo/2016/03/04/19/36/beach-1236581_960_720.jpg"}
                        nome={'Fernando de Noranha'}
                        preco={'1.000'}
                    ></DestinoCard>
                </div>
            </div>
        </div>


    );
}
export default Destino;
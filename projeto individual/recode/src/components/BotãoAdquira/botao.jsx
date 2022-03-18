


const Botao = () => {
    return (
        <>

            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                Adquira já
            </button>


            <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="staticBackdropLabel">Enviar email</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <h4>Envie o seu email e receba todas informções da sua compra obtida.</h4>
                        <div class="modal-body">
                            <div class="mb-3">     <label for="exampleInputPassword1" class="form-label">Email</label>
                                <input type="email" class="form-control" />
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Fechar</button>
                            <button type="button" class="btn btn-primary">Enviar</button>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}
export default Botao;


const Rotas = () => {

    <>
        <button type="button" clasName="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
            Adquira já
        </button><div clasName="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div clasName="modal-dialog">
                <div clasName="modal-content">
                    <div clasName="modal-header">
                        <h5 clasName="modal-title" id="exampleModalLabel">Cadastrar</h5>
                        <button type="button" clasName="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div clasName="modal-body">
                      


                    </div>
                    <div clasName="modal-footer">
                        <button type="button" clasName="btn btn-secondary" data-bs-dismiss="modal">Fechar</button>
                        <button type="button" clasName="btn btn-primary">Salvar Alterações</button>
                    </div>
                </div>
            </div>
        </div>
    </>
}
export default Rotas;


<form clasName="row g-3 needs-validation" novalidate>
<div clasName="col-md-4">
    <label for="validationCustom01" clasName="form-label">Nome:</label>
    <input type="text" clasName="form-control" id="validationCustom01" value="Mark" required />
    <div clasName="valid-feedback">
        OK!
    </div>
</div>
<div clasName="col-md-4">
    <label for="validationCustom02" clasName="form-label">Sobrenome</label>
    <input type="text" clasName="form-control" id="validationCustom02" value="Otto" required />
    <div clasName="valid-feedback">
        Ok!
    </div>
</div>
<div clasName="col-md-4">
    <label for="validationCustomUsername" clasName="form-label">Nome de usuário</label>
    <div clasName="input-group has-validation">
        <span clasName="input-group-text" id="inputGroupPrepend">@</span>
        <input type="text" clasName="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required />
        <div clasName="invalid-feedback">
            Por favor escolha um nome de usário.
        </div>
    </div>
</div>
<div clasName="col-md-6">
    <label for="validationCustom03" clasName="form-label">Cidade</label>
    <input type="text" clasName="form-control" id="validationCustom03" required />
    <div clasName="invalid-feedback">
        Por favor escolha uma cidade válida.
    </div>
</div>
<div clasName="col-md-3">
    <label for="validationCustom05" clasName="form-label">Estado</label>
    <input type="text" clasName="form-control" id="validationCustom05" required />
    <div clasName="invalid-feedback">
        Por favor escolha um Estado válido.
    </div>
</div>
<div clasName="col-md-3">
    <label for="validationCustom05" clasName="form-label">Cep</label>
    <input type="text" clasName="form-control" id="validationCustom05" required />
    <div clasName="invalid-feedback">
        Por favor escolha um cep válido.
    </div>
</div>
<div clasName="col-12">
    <div clasName="form-check">
        <input clasName="form-check-input" type="checkbox" value="" id="invalidCheck" required />
        <label clasName="form-check-label" for="invalidCheck">
            Aceitar termos e condições
        </label>
        <div clasName="invalid-feedback">
            Você deve concordar antaes de continuar.
        </div>
    </div>
</div>
<div clasName="col-12">
    <button clasName="btn btn-primary" type="submit">Envia</button>
</div>
</form>
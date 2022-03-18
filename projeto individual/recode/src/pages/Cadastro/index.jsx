import "./styles.css";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import PessoaAxios from "./../../Services/PessoaClass"
function Cadastro() {


    const [nome, setNome] = useState("");
    const [sobrenome, setSobrenome] = useState("");
    const [idade, setIdade] = useState("");
    const [email, setEmail] = useState("");
    const [telefone, setTelefone] = useState("");
    const [cpf, setCpf] = useState("");
    const [senha, setSenha] = useState("");
    const { id } = useParams();
    const navigate = useNavigate();

    const criarOuEditarCliente = (e) => {
        e.preventDefault();

        const cliente = { nome, sobrenome, idade, email, telefone, cpf, senha };

        if (id) {
            PessoaAxios.putCliente(id, cliente).then((response) => {
                navigate("/Cadastro");
            });
        } else {
            PessoaAxios.postPessoa(cliente).then((response) => {
                navigate("/Cadastro");
            }).catch(err =>console.log(err));
        }
    };

    useEffect(() => {
        function getClienteById() {
            if (id) {
                PessoaAxios.getClienteById(id)
                    .then((response) => {
                        setNome(response.data.nome);
                        setSobrenome(response.data.sobrenome);
                        setIdade(response.data.idade);
                        setEmail(response.data.email);
                        setTelefone(response.data.telefone);
                        setCpf(response.data.cpf);
                        setSenha(response.data.senha);
                    })
                    .catch((error) => {
                        console.log(error);
                    });
            }
        }

        getClienteById();
    }, [id]);

    return (
        <div className="form-bg">
            <form className="alinha">
                <fieldset>
                    <legend>
                        <h2 className="text-center mt-3">
                            {id ? "Editar" : "Crie sua conta"}
                        </h2>
                        <hr />
                    </legend>
                    <div className=" d-flex flex-wrap m-4 row">
                        <div>
                            <label htmlFor="cliente" className="m-2">
                                NOME:
                            </label>
                            <hr />
                            <input
                                type="text"
                                id="name"
                                className="form-control"
                                placeholder="Digite seu nome"

                                value={nome}
                                onChange={(e) => setNome(e.target.value)}
                            />
                        </div>

                        <div>
                            <label htmlFor="cliente" className="m-2">
                                SOBRENOME:
                            </label>
                            <hr />
                            <input
                                type="text"
                                id="name"
                                className="form-control"
                                placeholder="Digite seu nome"

                                value={sobrenome}
                                onChange={(e) => setSobrenome(e.target.value)}
                            />
                        </div>

                        <div>
                            <label htmlFor="cliente" className="m-2">
                                Idade:
                            </label>
                            <hr />
                            <input
                                type="number"
                                id="name"
                                className="form-control"
                                placeholder="Digite seu nome"

                                value={idade}
                                onChange={(e) => setIdade(e.target.value)}
                            />
                        </div>

                        <div>
                            <label htmlFor="cliente" className="m-2">
                                E-mail:
                            </label>
                            <hr />
                            <input
                                type="email"
                                id="email"
                                className="form-control"
                                placeholder="Digite seu email"
                                value={email}
                                onChange={(e) => setEmail(e.target.value)}
                            />
                        </div>

                        <div>
                            <label htmlFor="cliente" className="m-2">
                                Telefone:
                            </label>
                            <hr />
                            <input
                                type="text"
                                id="telefone"
                                className="form-control"
                                placeholder="Digite seu telefone"
                                value={telefone}
                                onChange={(e) => setTelefone(e.target.value)}
                            />
                        </div>



                        <div>
                            <label htmlFor="cliente" className="m-2">
                                CPF:
                            </label>
                            <hr />
                            <input
                                type="text"
                                id="cpf"
                                className="form-control"
                                placeholder="Digite seu CPF"
                                value={cpf}
                                onChange={(e) => setCpf(e.target.value)}
                            />
                        </div>

                        <div>
                            <label htmlFor="cliente" className="m-2">
                                SENHA:
                            </label>
                            <hr />

                            <input
                                type="text"
                                id="password"
                                className="form-control"
                                placeholder="Digite sua senha"
                                value={senha}
                                onChange={(e) => setSenha(e.target.value)}
                            />
                        </div>
                    </div>

                    <button
                        type="submit"
                        className="btn btn-primary m-4"
                        onClick={(e) => criarOuEditarCliente(e)}
                    >
                        Finalizar
                    </button>
                </fieldset>
            </form>
        </div>
    );


}
export default Cadastro;



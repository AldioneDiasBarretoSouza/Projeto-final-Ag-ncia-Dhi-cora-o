import axios from "axios";

const pessoaApi = "http://localhost:8080/pessoas"
class pessoaAxios {
    getPessoa() { return axios.get(pessoaApi) }
    getPessoabyid(id) {
        return axios.get(pessoaApi + "/" + id)
    }
    postPessoa(pessoa) {
        return axios.post(pessoaApi, pessoa)
    }
    putPessoa(pessoa, id) {
        return axios.put(pessoaApi + "/" + id, pessoa)
    }
    deletePessoa(id) {
        return axios.delete(pessoaApi + "/" + id)
    }

}
export default new pessoaAxios;
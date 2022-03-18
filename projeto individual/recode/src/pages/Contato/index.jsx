import './styles.css';
const Contato = () => {
  return (
    <div className="alinhamento">
      <div className="img-w w-50 mt-4">
        <img className="w-100" src="https://cdn.pixabay.com/photo/2018/04/27/09/11/network-3354116_960_720.jpg" alt="" />
      </div>
      <div className="formulario w-50">
        <div className="mb-3 ">
          <label for="exampleFormControlInput1" className="form-label">Email</label>
          <input type="email" className="form-control" id="exampleFormControlInput1" placeholder="name@example.com" />
        </div>
        <div className="mb-3">
          <label for="exampleFormControlTextarea1" className="form-label">Texto</label>
          <textarea className="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
        </div>
        <button type="submit" className="btn btn-primary">Enviar</button>
      </div>
    </div>
  );
}
export default Contato;

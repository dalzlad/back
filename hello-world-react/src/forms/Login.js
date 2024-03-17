import React, {useState} from 'react';

const LoginForm = () => {
    const [formData, setFormData] = useState({
        login: '',
        password: ''
    });

    const handleChange = (e) => {
        const { name, value} = e.target;
        setFormData({
            ...formData,
            [name]: value
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log('Cliente Registrado Exitosamente', formData)
    }
    


return (
    <form>
        <center>
        <div class="login">
            <div class="rowLogin">
                <div class="label">
                    Usuario:
                </div>
                <div class="objetoForm">
                <input  type="text"
                        name="documento"
                        value={FormData.usuario}
                        onChange={handleChange}
                />
                </div>
                <br/>
            </div>
            <div class="label" >
                Contraseña:
            </div>
            <div class="objetoForm">
            <input  type="text"
                    name="contrasena"
                    value={FormData.contrasena}
                    onChange={handleChange}
            />
            </div>
            <br/>
            <button type="submit">Enviar</button>
        </div>
        </center>
    </form>
)

}

export default LoginForm
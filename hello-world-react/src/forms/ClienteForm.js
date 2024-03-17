import React, {useState} from 'react';

const ClienteForm = () =>{
    const [formData, setFormData] = useState({
        documento:'',
        nombres:'',
        apellidos:'',
        email:''
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
    <form >
        <label>
            Documento:
            <input
                type="text"
                name="documento"
                value={FormData.documento}
                onChange={handleChange}
            />
        </label>
        <br/>
        <label>
            Nombres:
            <input 
                type="text"
                name="nombres"
                value={FormData.nombres}
                onChange={handleChange}
            />
        </label>
        <br/>
        <label>
            Apellidos:
            <input
                type="text"
                name="apellidos"
                value={FormData.apellidos}
                onChange={handleChange}
            />
        </label>
        <br/>
        <label>
            Email:
            <input 
                type="email"
                name="email"
                value={FormData.email}
                onChange={handleChange}
            />
        </label>
        <br/>
        <button type="submit">Registrar</button>
    </form>
)
    
}

export default ClienteForm
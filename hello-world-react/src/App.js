import React from 'react';
import './App.css'
import ContactForm from './ContactForm';
import ClienteForm from './forms/ClienteForm';
import ListaDatos from './forms/ListarClientes';
import LoginForm from './forms/Login';
/*
<ContactForm />
      <ClienteForm />
*/


function App() {
  /*return (

      <div>
      <h1>Hello, World 2024!</h1>
      <h1>Contact Form</h1>
      
      <ListaDatos />
      </div>
 
  );*/
  //return LoginForm()
  return ListaDatos()
}

export default App;                      

/*
Crear hola mundo en react:
1. npx create-react-app hello-world-react
2. cd hello-world-react
3. Edit App.js: 
import React from 'react';

function App() {
  return (
    <div>
      <h1>Hello, World!</h1>
    </div>
  );
}

export default App;

4. npm start


*/
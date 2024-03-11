import 'package:flutter/material.dart';
import 'package:list_menu/screens/menu_screen.dart';

class LoginScreen extends StatefulWidget {
  const LoginScreen({super.key});

  @override
  State<LoginScreen> createState() => _LoginScreenState();
}

class _LoginScreenState extends State<LoginScreen> {
  final GlobalKey<FormState> _formLogin = GlobalKey<FormState>();
  String  nombreUsuario = '';
  String password = '';
  
  void acceder(String nombreUsuario, String password){
    print(nombreUsuario);
    print(password);
    //Validar con Mapa o array()
    if(nombreUsuario == "sena" && password == "1234"){
       final route = MaterialPageRoute( 
       builder: (context) => const MenuScreen() );
       Navigator.push(context, route);
    }
    else{
      //Implementar el Dialog alert
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Login'),
      ),
      body: Padding(padding: 
      const EdgeInsets.symmetric(vertical: 20, horizontal: 80),
      child: Form(
        key:_formLogin,
        child: Column(
          children: [
            TextFormField(
              decoration: const InputDecoration(
                prefixIcon: Icon(Icons.person,
                color: Color.fromARGB(255, 66, 144, 69)),
                hintText: "Nombre de usuario",
                border: OutlineInputBorder(borderRadius: BorderRadius.all(Radius.circular(10))),
                labelText: 'Nombre Usuario',
                labelStyle: TextStyle(color: Color.fromARGB(255, 28, 55, 35), fontSize: 20, fontFamily:AutofillHints.username)
              ),
              validator: (value) {
                  if (value == null || value.isEmpty ) {
                    return 'Por favor ingrese su usuario';
                  }
                  return null;
                },
                onSaved: (value) {//Asignar el valor del campo a la variable nombreUsuario
                  nombreUsuario= value!;
                },
            
            ),
            const SizedBox(height: 30,),
            TextFormField(
              obscureText: true,
              decoration: const InputDecoration(
                prefixIcon: Icon(Icons.password_outlined,
                color: Color.fromARGB(255, 66, 144, 69)),
                suffixIcon: Icon(Icons.password_rounded),
                hintText: "Contraseña",
                border: OutlineInputBorder(borderRadius: BorderRadius.all(Radius.circular(10))),
                labelText: 'Contraseña',
                labelStyle: TextStyle(color: Color.fromARGB(255, 28, 55, 35), fontSize: 20, fontFamily:AutofillHints.username)
              ),
              validator: (value) {
                  if (value == null || value.isEmpty ) {
                    return 'Por favor ingrese su contraseña';
                  }
                  return null;
                },
                onSaved: (value) {//Asignar el valor del campo a la variable nombreUsuario
                  password= value!;
                },
            ),
            const SizedBox(height: 20,),
            ElevatedButton.icon(
              style: ElevatedButton.styleFrom(backgroundColor: Colors.green),
              onPressed: () {
                  //Realizar validaciones
                  if (_formLogin.currentState!.validate()) {
                    _formLogin.currentState!.save();
                    acceder(nombreUsuario, password);
                  }
              },
            icon: const Icon(Icons.login_rounded), label: const Text("Acdeder"))
          ],
        ),
      ),
      ),
    );
  }
}

/*
Crear un proyecto en fluter con el nombre de su proyecto formativo
Seleccione de su proyecto formativo una tabla maestra diferente al login
y diseñelo en flutter para registrar
Cargar el avance a git a las 09:00 a.m.

*/
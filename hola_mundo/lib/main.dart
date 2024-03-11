import 'package:flutter/material.dart';
import 'package:hola_mundo/home_screen.dart';

void main(){
  runApp(const HelloWorld());
}

class HelloWorld extends StatelessWidget {
  const HelloWorld({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false, //Ocultar banner
      //home:Center(child: Text('Hola Mundo',style:TextStyle(color: Colors.teal, fontSize: 25)))
      home:HomeScreen()
    );
  }
}
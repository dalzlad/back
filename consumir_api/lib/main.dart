import 'package:flutter/material.dart';

import 'screens/listar_departamentos.dart';

void main(){
  runApp(const Main());
}

class Main extends StatefulWidget {
  const Main({super.key});

  @override
  State<Main> createState() => _MainState();
}

class _MainState extends State<Main> {
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      home: ListarDepartamentos(),
    );
  }
}
import 'package:flutter/material.dart';
import 'package:list_menu/screens/menu_screen.dart';

void main(){
  runApp(const MainApp()); //Ejecutar la principal
}

class MainApp extends StatefulWidget {
  const MainApp({super.key});

  @override
  State<MainApp> createState() => _MainAppState();
}

class _MainAppState extends State<MainApp> {
  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      debugShowCheckedModeBanner: false,
      //home: Text('Mi App', style:TextStyle(color:Colors.red))
      home: MenuScreen(),
    );
  }
}
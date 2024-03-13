import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

//https://www.datos.gov.co/resource/vcjz-niiq.json
//Ordernar código: shif+al+f
class Departamento {
  // ignore: non_constant_identifier_names
  final String codigo_departamento;
  // ignore: non_constant_identifier_names
  final String nombre_departamento;

  Departamento(
      // ignore: non_constant_identifier_names
      {required this.codigo_departamento, required this.nombre_departamento});

  factory Departamento.fromJson(Map<String, dynamic> json) {
    return Departamento(
        codigo_departamento: json['codigo_departamento'],
        nombre_departamento: json['nombre_departamento']);
  }
}

//Incorporar Future para traer los datos de la api
Future<List<Departamento>> fetchPosts() async {
 final response = await http.get(Uri.parse('https://www.datos.gov.co/resource/vcjz-niiq.json'));

  if (response.statusCode == 200) {
    List<dynamic> data = json.decode(response.body);
    return data.map((json) => Departamento.fromJson(json)).toList();
  } else {
    throw Exception('Fallo la carga de los departamentos');
  }
}


class ListarDepartamentos extends StatefulWidget {
  const ListarDepartamentos({super.key});

  @override
  State<ListarDepartamentos> createState() => _ListarDepartamentosState();
}

class _ListarDepartamentosState extends State<ListarDepartamentos> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Listado de Departamentos')
      ),
      body: FutureBuilder(
        future:fetchPosts(),
        builder: (context, snapshot) {
        if (snapshot.connectionState == ConnectionState.waiting) { //Verificar si hay espera
          return const CircularProgressIndicator(); //Retorna un circulo de progreso
        } 
        else if (snapshot.hasError) {
          return Text('Error: ${snapshot.error}');
        }
        else{
         List<Departamento> departamentos = snapshot.data as List<Departamento>;
            return ListView.builder(
            itemCount: departamentos.length,
            itemBuilder: (context, index) {
              return ListTile(
                title: Text(departamentos[index].codigo_departamento),
                subtitle: Text(departamentos[index].nombre_departamento),
              );
            },
          );
        }
        }
      )
    );
  }
}

/*DE la API: 
https://www.datos.gov.co/resource/9vha-vh9n.json?departamento=ANTIOQUIA
Listar los hurtos de MEDELLÍN con ARMA DE FUEGO



*/

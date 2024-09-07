package com.vehiculo.factory;

//Producto
interface Vehiculo {
 void conducir();
}

//Producto Concreto 1
class Coche implements Vehiculo {
 @Override
 public void conducir() {
     System.out.println("Conduciendo un coche.");
 }
}

//Producto Concreto 2
class Motocicleta implements Vehiculo {
 @Override
 public void conducir() {
     System.out.println("Conduciendo una motocicleta.");
 }
}

//Creador
abstract class VehiculoFactory {
 public abstract Vehiculo crearVehiculo();
 
 public void manejarVehiculo() {
     Vehiculo vehiculo = crearVehiculo();
     vehiculo.conducir();
 }
}

//Creador Concreto 1
class CocheFactory extends VehiculoFactory {
 @Override
 public Vehiculo crearVehiculo() {
     return new Coche();
 }
}

//Creador Concreto 2
class MotocicletaFactory extends VehiculoFactory {
 @Override
 public Vehiculo crearVehiculo() {
     return new Motocicleta();
 }
}


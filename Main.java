package com.vehiculo.factory;

public class Main {
public static void main(String[] args) {
   VehiculoFactory cocheFactory = new CocheFactory();
   VehiculoFactory motocicletaFactory = new MotocicletaFactory();
   
   cocheFactory.manejarVehiculo(); // Salida: Conduciendo un coche.
   motocicletaFactory.manejarVehiculo(); // Salida: Conduciendo una motocicleta.
}
}

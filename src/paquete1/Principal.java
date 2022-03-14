package paquete1;

import java.util.Scanner;

public class Principal {
    
    public static int indiceCocheMBarato(Vehiculo coches[]) {
        float precio;
        int indice = 0;
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);
        
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;
        
        System.out.print("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entry.nextInt();
        
//        CREADO UN ARRAY PARA ALMACENAR LOS OBJETOS QUE SON VEHICULOS
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for (int i = 0; i < coches.length; i++) {
            System.out.println("DIGITE LAS CARACTERISTICAS DEL COCHE " + (i + 1));
            entry.nextLine();
            System.out.print("CUAL ES LA MARCA: ");
            marca = entry.nextLine();
            System.out.print("CUAL ES EL MODELO: ");
            modelo = entry.nextLine();
            System.out.print("CUAL ES EL PRECIO: ");
            precio = entry.nextFloat();
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        
        indiceBarato = indiceCocheMBarato(coches);
        
        System.out.println("\nEl coche mas barato es:");
        System.out.println(coches[indiceBarato].mostrarDatos());
        
        
    }
    
}

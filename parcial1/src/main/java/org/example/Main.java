package org.example;

import org.example.Services.Recepcion;

public class Main {
    static void main() {
        try{
            Recepcion r = new Recepcion("C:\\Users\\tomas\\Documents\\parcial\\arcilixix\\parcial1\\src\\main\\java\\org\\example\\Resources\\entradaPacientes.txt");
            r.obtenerPacientes();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}

package Profesores;

public class ProfesorTitular extends Profesor {

    @Override
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
}
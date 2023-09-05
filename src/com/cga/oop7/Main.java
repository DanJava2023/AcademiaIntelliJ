package com.cga.oop7;

public class Main {
    public static void main(String[] args) {

//        Hospital hospital = new Hospital("Vall d'Hebron", "Barcelona", 1956, 500);
//        Empleado empleado = new Empleado(hospital.getNombreHospital(), hospital.getCiudadHospital(), hospital.getInauguracion(), hospital.getCapacidad(), "Pepe","Garcia",35);
//        Empleado empleado2 = new Empleado(hospital.getNombreHospital(), hospital.getCiudadHospital(), hospital.getInauguracion(), hospital.getCapacidad(), "Maria","Gonzalez",42);
//        pSanitario psanitario = new pSanitario(hospital.getNombreHospital(), hospital.getCiudadHospital(), hospital.getInauguracion(), hospital.getCapacidad(), empleado.getNombreEmpleado(), empleado.getApellidoEmpleado(), empleado.getEdad(), "Dermatología", "2B");
//        pSanitario psanitario2 = new pSanitario(hospital.getNombreHospital(), hospital.getCiudadHospital(), hospital.getInauguracion(), hospital.getCapacidad(), empleado2.getNombreEmpleado(), empleado2.getApellidoEmpleado(), empleado2.getEdad(), "Endocrinología", "15C");
//        Medico medico = new Medico(hospital.getNombreHospital(), hospital.getCiudadHospital(), hospital.getInauguracion(), hospital.getCapacidad(), empleado.getNombreEmpleado(), empleado.getApellidoEmpleado(), empleado.getEdad(), psanitario.getSeccion(), psanitario.getArea(), "Pedagogía",8, 23);
//        Enfermero enfermera = new Enfermero(hospital.getNombreHospital(), hospital.getCiudadHospital(), hospital.getInauguracion(), hospital.getCapacidad(), empleado2.getNombreEmpleado(), empleado2.getApellidoEmpleado(), empleado2.getEdad(), psanitario2.getSeccion(), psanitario2.getArea(), "Tercera edad", "Oficial de primera");
//
//        System.out.println(medico);
//        System.out.println();
//        System.out.println(enfermera);

        Hospital hospital = new Hospital("Vall d'Hebron", "Barcelona", 1956, 500);
        Empleado empleado = new Empleado(hospital.getNombreHospital(), hospital.getCiudadHospital(), hospital.getInauguracion(), hospital.getCapacidad(), "Pepe", "Garcia", 35);
        pSanitario psanitario = new pSanitario(hospital, empleado, "Dermatología", "2B");

        System.out.println(psanitario);

    }
}

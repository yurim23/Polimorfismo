package com.Yud.polimorfismo.models;

import java.util.ArrayList;
import com.Yud.polimorfismo.models.UP;
import com.Yud.polimorfismo.models.Tecnologico;
import com.Yud.polimorfismo.models.Unach;

public class Estudiante {
    private UP estudiantesBase1 = new UP();
    private Tecnologico estudiantesBase2 = new Tecnologico();
    private Unach estudiantesBase3 = new Unach();

    public boolean addStudent(Etudiante newStudent) {
        boolean bandera;
        if (estudiantesBase1.save(newStudent) && estudiantesBase2.save(newStudent) &&  estudiantesBase3.save(newStudent)){
            System.out.println("Registro exitoso");
            bandera=true;
        }
        else {
            bandera=false;
            System.out.println("Error al registrar el registro");
        }
    return bandera;
    }
    public boolean updataStudent(Etudiante editedStudent){
        boolean bandera=false;
        if (estudiantesBase1.upDate(editedStudent) && estudiantesBase2.upDate(editedStudent)&&estudiantesBase3.upDate(editedStudent)){
            bandera=true;
        }
        return bandera;
    }
    public ArrayList<Etudiante> getStudentBase1(){
        return estudiantesBase1.getStudent();
    }
    public ArrayList<Etudiante> getStudentBase2(){return estudiantesBase2.getStudent();}
    public ArrayList<Etudiante> getStudentBase3(){return estudiantesBase3.getStudent();}
}

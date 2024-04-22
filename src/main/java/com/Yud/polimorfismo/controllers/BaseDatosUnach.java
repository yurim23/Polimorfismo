package com.Yud.polimorfismo.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.Yud.polimorfismo.App;
import com.Yud.polimorfismo.models.Etudiante;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class BaseDatosUnach {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn matriculaColumn;

    @FXML
    private TableColumn nombreColumn;

    @FXML
    private TableView<Etudiante> studentsTable;

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        App.getStageView().close();
    }
    private ObservableList<Etudiante> students;
    @FXML
    void initialize() {
        students = FXCollections.observableArrayList();
        ArrayList<Etudiante> estudiantes;
        estudiantes = App.getBases().getStudentBase3();
        this.matriculaColumn.setCellValueFactory(new PropertyValueFactory("matricula"));
        this.nombreColumn.setCellValueFactory(new PropertyValueFactory("nombre"));
        for (int i = 0; i < estudiantes.size(); i++) {
            students.add(estudiantes.get(i));
        }
        studentsTable.setItems(students);
    }


}

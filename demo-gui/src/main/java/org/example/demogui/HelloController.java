package org.example.demogui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import org.example.demogui.lista.AList;

import java.util.Optional;

public class HelloController {
    private AList<String> stringAList = new AList<>(10);
    private TextInputDialog dialogo;
    @FXML private ListView<String> lista = new ListView<>();

    public Optional<String> crearDialogo() {
        dialogo = new TextInputDialog();
        dialogo.setTitle("Ingresar un dato");
        dialogo.setContentText("Escriba una cadena:");
        return dialogo.showAndWait();
    }

    public void refrescarListView() {
        //lista = new ListView<>();
        ObservableList<String> observableList = FXCollections.observableArrayList();
        // rellenar el observable list con AList
        stringAList.moveToStart();
        while(!stringAList.isAtEnd()) {
            observableList.add(stringAList.getValue());
            stringAList.next();
        }

        lista.setItems(observableList);
        lista.refresh();
    }


    @FXML
    private Label welcomeText;

    @FXML
    public void appendClick() {
        var resultado = crearDialogo();
        if (resultado.isPresent()) {
            System.out.println(resultado.get());
            stringAList.append(resultado.get());
            refrescarListView();
        }

    }

    @FXML
    public void insertClick(){
        var resultado = crearDialogo();
        if (resultado.isPresent()) {
            stringAList.insert(resultado.get());
        }
        refrescarListView();
    }

    public void removeClick(){
        stringAList.remove();
        refrescarListView();
    }

    public void clearClick() {
        stringAList.clear();
        refrescarListView();
    }

}
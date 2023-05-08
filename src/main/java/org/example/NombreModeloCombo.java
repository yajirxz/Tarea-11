package org.example;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class NombreModeloCombo implements ComboBoxModel {
    ArrayList<String> datos;
    String selected;

    public NombreModeloCombo() {
        datos = new ArrayList<>();
    }

    public NombreModeloCombo(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (String) o;

    }

    @Override
    public Object getSelectedItem() {
        return null;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return datos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    public void AgregarNombre (String nom){
        datos.add(nom);
    }
}
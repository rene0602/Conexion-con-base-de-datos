/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdejercicio1.modeltabla;
import bdejercicio1.modelo.Persona;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class ModelTablaPersona extends AbstractTableModel {

    DefaultTableModel modeloTabla = new DefaultTableModel();

    public String datos[] = {"idPersona", "Cédula", "Nombre", "Apellido", "Dirección", "Correo", "Teléfono"};

    public ArrayList<Persona> listaPersonas;

    public ModelTablaPersona(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public int getRowCount() {
        return listaPersonas.size();
    }

    @Override
    public int getColumnCount() {
        return datos.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Persona persona = listaPersonas.get(i);

        switch (i1) {
            case 0:
                return persona.getIdPersona();
            case 1:
                return persona.getCedula();
            case 2:
                return persona.getNombre();
            case 3:
                return persona.getApellido();
            case 4:
                return persona.getDireccion();
            case 5:
                return persona.getCorreo();
            case 6:
                return persona.getTelefono();
        }
        return new String();
    }

    @Override
    public String getColumnName(int i) {
        return datos[i];
    }

}

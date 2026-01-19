/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author dieberalv
 */
public class Cliente implements Serializable {
    private String nombre;
    private String apellidos;
    private Date fechaAlta;
    private String provincia;

    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }

    // Getters  
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public Date getFechaAlta() { return fechaAlta; }
    public String getProvincia() { return provincia; }

    
    // Método para volcar datos a la JTable 
    public String[] toArrayString() {
        // Definición del formato de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return new String[]{ nombre, apellidos, sdf.format(fechaAlta), provincia };
        
        
    }
}
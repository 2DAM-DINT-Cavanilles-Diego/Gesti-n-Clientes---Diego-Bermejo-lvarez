/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;

/**
 *
 * @author dieberalv
 */
public class Cliente {
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

    // Getters (puedes generarlos con Alt+Insert) 
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public Date getFechaAlta() { return fechaAlta; }
    public String getProvincia() { return provincia; }

    // Método fundamental para volcar datos a la JTable 
    public String[] toArrayString() {
        return new String[]{ nombre, apellidos, fechaAlta.toString(), provincia };
    }
}
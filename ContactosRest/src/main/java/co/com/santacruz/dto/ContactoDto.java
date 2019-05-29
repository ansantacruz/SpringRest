/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.santacruz.dto;

/**
 *
 * @author asantacb
 */
public class ContactoDto {

    Long id;
    String nombre;
    String apellido;
    String telegonoMovil;
    String correoElectronico;

    public ContactoDto() {
    }

    public ContactoDto(
            Long id,
            String nombre,
            String apellido,
            String telegonoMovil,
            String correoElectronico
    ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telegonoMovil = telegonoMovil;
        this.correoElectronico = correoElectronico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelegonoMovil() {
        return telegonoMovil;
    }

    public void setTelegonoMovil(String telegonoMovil) {
        this.telegonoMovil = telegonoMovil;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}

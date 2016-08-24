package escritorDT;

import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SALA-1
 */
public class poemaDT {
    private int idPoema;
    private int idPoeta;
    private String titulo;
    private String tipo;
    private Date fecha;
    private String nacionalidad;

    /**
     * @return the idPoema
     */
    public int getIdPoema() {
        return idPoema;
    }

    /**
     * @param idPoema the idPoema to set
     */
    public void setIdPoema(int idPoema) {
        this.idPoema = idPoema;
    }

    /**
     * @return the idPoeta
     */
    public int getIdPoeta() {
        return idPoeta;
    }

    /**
     * @param idPoeta the idPoeta to set
     */
    public void setIdPoeta(int idPoeta) {
        this.idPoeta = idPoeta;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}

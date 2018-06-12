package model.pojos;

import java.sql.Date;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class Periodo {
    private Date fechaInicio;
    private Date fechaFin;
    /**
    *Constructor por default del objeto.
    */
    public Periodo() {
    }
    
    /**
    *Constructor del objeto con todos sus atributos.
    * @param fechaInicio Corresponde a la fecha de inicio del periodo.
    * @param fechaFin Corresponde a la fecha de fin dle periodo.
    */
    public Periodo(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
    *Retorna la fecha de inicio del periodo.
    * @return fechaInicio
    */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
    *Establece la fecha de inicio del periodo.
    * @param fechaInicio Corresponde a la fecha de inicio del periodo.
    */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
    *Retorna la fecha de fin del periodo.
    * @return fechaFin
    */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
    *Establece la fecha de fin del periodo.
    * @param fechaFin Corresponde a la fecha de fin del periodo
    */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}

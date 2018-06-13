package model.pojos;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class Participante {
    private Integer idPlanDeTrabajo;
    private Integer idMaestro;
    
    /**
    *Constructor por default del objeto.
    */
    public Participante() {
    }

    /**
    * Constructor del objeto con todos sus atributos.
    * @param idDocumento Corresponde al identificador del documento
    * @param idMaestro Corresponde al identificador del maestro que esta asociado.
    */
    public Participante(Integer idMaestro ,Integer idPlanDeTrabajo) {
        this.idMaestro = idMaestro;
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }
    
    /**
    *Retorna el identificador del documento.
    * @return idDocumento
    */
    public Integer getIdPlanDeTrabajo() {
        return idPlanDeTrabajo;
    }

    /**
    *Establece el identificador del documento al que se hace referencia.
    * @param idDocumento Corresponde al identificador del documento.
    */
    public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }

    /**
    *Retorna el identificador del maestro.
    * @return idMaestro
    */
    public Integer getIdMaestro() {
        return idMaestro;
    }

    /**
    *Establece el identificador del maestro.
    * @param idMaestro Corresponde al identificador del maestro
    */
    public void setIdMaestro(Integer idMaestro) {
        this.idMaestro = idMaestro;
    }
    
    
}

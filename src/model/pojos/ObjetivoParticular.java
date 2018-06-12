package model.pojos;

/**
 *
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.1
 */
public class ObjetivoParticular {
    private Integer idObjetivoParticular;
    private String objetivo;
    private String metas;
    private Integer idPlanDeTrabajo;
    
    /**
    * Constructor por defecto del objeto.
    */
    public ObjetivoParticular() {
    }
    
    /**
    *Constructor de la clase con todos sus atributos.
    * @param idObjetivoParticular identificador del objeto
    * @param objetivo el objetivo unico de la clase 
    * @param metas las metas que se esperan alcanzar con el objetivo
    * @param idPlanDeTrabajo identificador del plan de trabajo al que pertenece 
    * el objetivoParticular.
    */
    public ObjetivoParticular(Integer idObjetivoParticular, String objetivo, String metas, Integer idPlanDeTrabajo) {
        this.idObjetivoParticular = idObjetivoParticular;
        this.objetivo = objetivo;
        this.metas = metas;
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }

    /**
    *Retorna el identificador del objeto.
    * @return idObjetivoParticular
    */
    public Integer getIdObjetivoParticular() {
        return idObjetivoParticular;
    }

    /**
    *Establece el identificador del objeto.
    * @param idObjetivoParticular
    */
    public void setIdObjetivoParticular(Integer idObjetivoParticular) {
        this.idObjetivoParticular = idObjetivoParticular;
    }

    /**
    *Retorna el texto del objetivo del objetivo general.
    * @return objetivo
    */
    public String getObjetivo() {
        return objetivo;
    }

    /**
    *Establece el texto del objetivo del objetivo general.
    * @param objetivo
    */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
    *Retorna el texto de las metas del objetivo general.
    * @return metas
    */
    public String getMetas() {
        return metas;
    }

    /**
    * Establece el texto de las metas del objetivo general.
    * @param metas
    */
    public void setMetas(String metas) {
        this.metas = metas;
    }

    /**
    * Retorna el identificador del plan de trabajo al que pertenece el objetivo general.
    * @return idPlanDeTrabajo
    */
    public Integer getIdPlanDeTrabajo() {
        return idPlanDeTrabajo;
    }

    /**
    * Establece el identificador del plan de trabajo al que pertenece el objetivo general.
    * @param idPlanDeTrabajo
    */
    public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }
    
    
}

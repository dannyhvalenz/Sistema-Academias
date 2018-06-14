
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextArea;
import controller.dialog.ActividadDialogController;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.dao.AcademiaDAO;
import model.dao.PlanDeTrabajoDAO;
import model.pojos.Academia;
import model.pojos.Actividad;
import model.pojos.EEPlanTrabajo;
import model.pojos.Evaluacion;
import model.pojos.ExperienciaEducativa;
import model.pojos.Maestro;
import model.pojos.ObjetivoParticular;
import model.pojos.Participante;
import model.pojos.PlanDeTrabajo;
import model.pojos.Tema;
import model.pojos.UsuarioAcademico;

/**
 * @author Daniela Hernandez
 * @since Jun 05, 2018
 * @version 1.7
 */

public class PlanDeTrabajoController implements Initializable {

    @FXML
    private StackPane rootPane;

    @FXML
    private JFXListView<AnchorPane> listParticipantes;

    @FXML
    private AnchorPane panelTopBar;

    @FXML
    private JFXButton btnHamburger;

    @FXML
    private JFXButton btnEnviar;

    @FXML
    private JFXButton btnGuardar;

    @FXML
    private JFXButton btnMenosActividades;

    @FXML
    private JFXButton btnMasActividades;

    @FXML
    private JFXTextArea txtObjetivoParticular;

    @FXML
    private JFXTextArea txtMeta;

    @FXML
    private TableView<Actividad> tableActividad;

    @FXML
    private TableColumn<Actividad, String> actividadActividad;

    @FXML
    private TableColumn<Actividad, String> actividadFechas;

    @FXML
    private TableColumn<Actividad, String> actividadFormaOperar;

    @FXML
    private JFXTabPane tabPanelEE;

    @FXML
    private JFXTextArea txtObjetivoGeneral;

    private List<Maestro> participantes;

    private ObservableList<Actividad> listaActividades;

    private int posicionTablaActividad;

    private PlanDeTrabajo plandetrabajo;
    
   // private ObjetivoParticular objetivoParticular;

    private List<Evaluacion> evaluacionesEE;

    private List<EEPlanTrabajo> listaEE;

    private Integer idCoordinador;

    private Integer idAcademia = 1;

    private List<Maestro> asistentes = new ArrayList<Maestro>();
    
    private UsuarioAcademico user;
    
    private boolean existe = false;

    
    public void iniciarDatosUsuario(UsuarioAcademico user, Integer idCoordinador, Integer idAcademia){
        this.idCoordinador = idCoordinador;
        this.idAcademia = idAcademia;
        this.user = user;
        plandetrabajo = new PlanDeTrabajo();
        PlanDeTrabajoDAO plan = new PlanDeTrabajoDAO();
        cargarParticipantes();
        if(plan.obteneridPlanTrabajo() != null ){
            existe = true;
            mensaje("Existe plan de trabajo", "Hay un plan de trabajo guardado en la Base de Datos");
            System.out.println("----------------------------Plan de Trabajo----------------------------");
            //PLANDETRABAJO
            Integer idPlanDeTrabajo = plan.obteneridPlanTrabajo();
            System.out.println("ID del Plan de Trabajo existente: " + idPlanDeTrabajo);
            plandetrabajo = plan.obtenerPlanDeTrabajoEspecifico(idPlanDeTrabajo);
            txtObjetivoGeneral.setText(plandetrabajo.getObjetivoGeneral());
            //OBJETIVOPARTICULAR
            System.out.println("----------------------------Objetivo particular----------------------------");
            ObjetivoParticular objetivoParticular = new ObjetivoParticular();
            //Integer idObjetivoParticular = plan.obteneridObjetivoParticular();
            objetivoParticular = plan.obtenerObjetivoParticularEspecifico(idPlanDeTrabajo);
            //System.out.println("Metas: " + objetivoParticular.getMetas());
            txtObjetivoParticular.setText(objetivoParticular.getObjetivo());
            txtMeta.setText(objetivoParticular.getMetas());
            Integer idObjetivoParticular = plan.obteneridObjetivoParticular();
            //ACTIVIDADES
            System.out.println("ID Objetivo Particular: " + idObjetivoParticular);
            List<Actividad> actividades = plan.obtenerActividades(idObjetivoParticular);
            for(Actividad act : actividades){
                System.out.println("ID Actividad: " + act.getIdActividad());
//                listaActividades.add(act);
            }
//            inicializarTablaActividad();
            
            //EEPLANDETRABAJO
            System.out.println("----------------------------EEPlanDeTrabajo----------------------------");
            List<EEPlanTrabajo> experiencias = plan.obtenerEEPlanDeTrabajo(idPlanDeTrabajo);
            for(EEPlanTrabajo ee : experiencias){
                Integer IdEEPlanTrabajo = ee.getIdEEPlanTrabajo();
                System.out.println("ID EEPlanDeTrabajo: " + IdEEPlanTrabajo);
                //RECUPERAR TEMA
                Tema tema = plan.obtenerTemaDeEEPlanTrabajo(IdEEPlanTrabajo);
                System.out.println("ID Tema: " + tema.getIdTema());
                //RECUPERAR EVALUACION
                List<Evaluacion> evaluaciones = plan.obtenerEvaluaciones(IdEEPlanTrabajo);
                for(Evaluacion eval : evaluaciones){
                    System.out.println("ID Evaluacion: " + eval.getIdEvaluacion());
                }
            }  
            //PARTICIPANTES
            System.out.println("----------------------------Participantes----------------------------");
            List<Maestro> maestros = plan.obtenerParticipantes(idPlanDeTrabajo);
            for(Maestro participante : maestros){
                System.out.println("ID Maestro participante: " + participante.getIdUsuarioAcademico());
//                //ObservableList<AnchorPane>
            }
////            ObservableList<AnchorPane> listaParticipantes = listParticipantes.getItems();
//            int contador = 0;
//            for (AnchorPane part : listaParticipantes) {
//                for (Node node : part.getChildren()) {
//                    if ("Participa".equals(node.getAccessibleText())) {
//                        if (((JFXCheckBox) node).isSelected()) {
//                            asistentes.add(participantes.get(contador));
//                            System.out.println("Participo: " + participantes.get(contador).getNombre());
//                        }
//                    }
//                }
//                contador++;
//            }
//            if (!asistentes.isEmpty()) {
//                for(Maestro participante : asistentes){
//                    plan.guardarParticipante(new Participante(participante.getIdUsuarioAcademico(), plan.obteneridPlanTrabajo()));
//                    System.out.println("Participante guardado");
//                }
//            }else{
//               mensaje("Error","Error en la conexion con la base de datos");
//            }
        }else{
            //plandetrabajo.setIdPlanDetrabajo(1);
            //System.out.println("ID del Nuevo Plan de Trabajo: " + plandetrabajo.getIdPlanDetrabajo());
            plandetrabajo.setFormato("plantrabajo");
            LocalDate localDate = LocalDate.now();
            Date fechaHoy = Date.valueOf(localDate);
            plandetrabajo.setFechaAprobacion(fechaHoy);
            plandetrabajo.setProgramaEducativo("Ingenieria de software");
            
            inicializarTablaActividad();
            AcademiaDAO academia = new AcademiaDAO();
            List<ExperienciaEducativa> nombresEE = academia.obtenerExperienciasEducativas(this.idAcademia);
            System.out.println("ID de la Academia: " + this.idAcademia);
            //String[] nombres = { "Programacion", "Principios de construccion", "Principos de Diseño"};
            for (ExperienciaEducativa ee : nombresEE) {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/view/FormaDeEvaluacion.fxml"));
                try {
                    loader.load();
                } catch (IOException ex) {
                    Logger.getLogger(PlanDeTrabajoController.class.getName()).log(Level.SEVERE, null, ex);
                }
                EvaluacionController display = loader.getController();
                StackPane p = loader.getRoot();
                Tab tab = new Tab(ee.getNombre());
                tab.setContent(p);
                tabPanelEE.getTabs().add(tab);
            }
        }
        
    }

    private final ListChangeListener<Actividad> selectorTablaActividades = 
          new ListChangeListener<Actividad>(){
              @Override 
              public void onChanged(ListChangeListener.Change<?extends Actividad>c){
                  ponerActividadSeleccionada();
              }
          };

    public Actividad getTablaActividadSeleccionada() {
        if (tableActividad != null) {
            List<Actividad> tabla = tableActividad.getSelectionModel().getSelectedItems();
            if (tabla.size() == 1) {
                final Actividad competicionSeleccionada = tabla.get(0);
                return competicionSeleccionada;
            }
        }
        return null;
    }

    private void ponerActividadSeleccionada() {
        final Actividad act = getTablaActividadSeleccionada();
        posicionTablaActividad = listaActividades.indexOf(act);
        if (act != null) {
        }
    }
  
    public void cargarParticipantes() {
        listParticipantes.getItems().clear();
        try {
            AcademiaDAO acad = new AcademiaDAO();
            participantes = acad.obtenerMaestros(idAcademia);
        } catch (Exception e) {
            mensaje("Error", "Error en la conexión a la Base de Datos");
        }
        for (Maestro maestro : participantes) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/AsistenteAReunion.fxml"));
            try {
                loader.load();
            } catch (IOException ex) {
                Logger.getLogger(PlanDeTrabajoController.class.getName()).log(Level.SEVERE, null, ex);
            }
            AsistenteAReunionController display = loader.getController();
            AnchorPane panel = loader.getRoot();
            display.llenarDatosAsistente(maestro.getNombre() + " " + maestro.getApellidos());
            listParticipantes.getItems().add(panel);
        }
    }
  
    private void inicializarTablaActividad() {
        actividadActividad.setCellValueFactory(new PropertyValueFactory<Actividad, String>("accion"));
        actividadFechas.setCellValueFactory(new PropertyValueFactory<Actividad, String>("fecha"));
        actividadFormaOperar.setCellValueFactory(new PropertyValueFactory<Actividad, String>("formaDeOperar"));
        listaActividades = FXCollections.observableArrayList();
        tableActividad.setItems(listaActividades);
    }

    private void obtenerEELlenadas() {
        ObservableList<Tab> tabs = tabPanelEE.getTabs();
        PlanDeTrabajoDAO plan = new PlanDeTrabajoDAO();
        for (Tab t : tabs) {
            evaluacionesEE = new ArrayList<>();
            EEPlanTrabajo ee = new EEPlanTrabajo();
            ee.setNombre(t.getText());
            //ee.setIdEEPlanTrabajo(plan.obteneridEEPlanTrabajo()+1);
            ee.setIdPlanDeTrabajo(plan.obteneridPlanTrabajo());
            
            Tema tema = new Tema();
            
            System.out.println("Guardar EEPLANDETRABAJO");
            StackPane contenido = (StackPane) t.getContent();
            AnchorPane contenedor = (AnchorPane) contenido.getChildren().get(0);
            for (Node node : contenedor.getChildren()) {
                if (node.getAccessibleText() != null) {
                    switch (node.getAccessibleText()) {
                        case "Tablita":
                            ((TableView)node).getItems().forEach(evaluacion -> {
                                evaluacionesEE.add((Evaluacion)evaluacion);
                            });
                            break;
                        case "Primer Parcial":
                            tema.setPrimerParcial(((JFXTextArea)node).getText());
                            System.out.println("Guardar primer parcial");
                            System.out.println("Primer parcial: " + ((JFXTextArea)node).getText());
                            break;
                        case "Segundo Parcial":
                            tema.setSegundoParcial(((JFXTextArea)node).getText());
                            System.out.println("Guardar segundo parcial");
                            System.out.println("Segundo parcial: " + ((JFXTextArea)node).getText());
                            break;
                        case "Posterior":
                            tema.setResto(((JFXTextArea)node).getText());
                            System.out.println("Guardar resto examenes");
                            System.out.println("Resto examenes: " + ((JFXTextArea)node).getText());
                            break;
                        case "Herramientas":
                            ee.setHerramientas(((JFXTextArea)node).getText());
                            System.out.println("Guardar herramientas");
                            System.out.println("Herramientas: " + ((JFXTextArea)node).getText());
                    }
                }
            }
            if(!plan.guardarEEPlanTrabajo(ee)){
                mensaje("Error","Error en la conexion con la base de datos");
            }
            Integer idEEPlanTrabajo = plan.obteneridEEPlanTrabajo();
            tema.setIdEEPlanDeTrabajo(idEEPlanTrabajo);
            
            evaluacionesEE.forEach(evaluacion -> {
                evaluacion.setIdEEPlanTrabajo(idEEPlanTrabajo);
                    if(!plan.guardarEvaluacion(evaluacion)) {
                        mensaje("Error","Error en la conexion con la base de datos");
                    }
            });
            
            if(!plan.guardarTema(tema)) {
                mensaje("Error","Error en la conexion con la base de datos");
            }
        }
    }

    @FXML
    void clickEnviar(ActionEvent event) {
        //obtenerEELlenadas();
    }

    @FXML
    void clickGuardar(ActionEvent event) {
        PlanDeTrabajoDAO plan = new PlanDeTrabajoDAO();
        if(existe == true){
            System.out.println("Actualizando plan de trabajo");
            System.out.println("ID del Plan de Trabajo: " + plandetrabajo.getIdPlanDetrabajo());
            //PLAN DE TRABAJO
            plandetrabajo.setFormato("plantrabajo");
            LocalDate localDate = LocalDate.now();
            Date fechaHoy = Date.valueOf(localDate);
            plandetrabajo.setFechaAprobacion(fechaHoy);
            plandetrabajo.setProgramaEducativo("Ingenieria de software");
            plandetrabajo.setObjetivoGeneral(txtObjetivoGeneral.getText());
            plan.actualizarPlanDeTrabajoEspecifico(plandetrabajo);
            System.out.println("Plan de Trabajo actualizado");
            //OBJETIVO PARTICULAR
            ObjetivoParticular objParticular = new ObjetivoParticular();
            objParticular.setIdObjetivoParticular(plan.obteneridObjetivoParticular());
            objParticular.setIdPlanDeTrabajo(plan.obteneridPlanTrabajo());
            objParticular.setMetas(txtMeta.getText());
            objParticular.setObjetivo(txtObjetivoParticular.getText());
            plan.actualizarObjetivoParticularEspecifico(objParticular);
            System.out.println("Objetivo particular actualizado");
            //ACTIVIDADES
            //listaActividades.forEach(actividad ->{
                //if(!plan.guardarActividad(actividad)) {
                    //mensaje("Error","Error en la conexion con la base de datos");
                //}
            //});
            
            
            //EEPLANDETRABAJO//TEMAS//EVALUACION
            
            //PARTICIPANTES
            
            mensaje("Guardado","Se ha guardado el progreso del Plan de Trabajo existente");
        }else{
            System.out.println("Guardando nuevo plan de trabajo");
            System.out.println("ID del Plan de Trabajo: " + plandetrabajo.getIdPlanDetrabajo());
            plandetrabajo.setObjetivoGeneral(txtObjetivoGeneral.getText());
            plan.guardarPlanDeTrabajo(plandetrabajo);
            System.out.println("Plan de trabajo guardado");
            //OBJETIVO PARTICULAR
            ObjetivoParticular objParticular = new ObjetivoParticular();
            //objParticular.setIdObjetivoParticular(plan.obteneridObjetivoParticular()+1);
            objParticular.setIdPlanDeTrabajo(plan.obteneridPlanTrabajo());
            objParticular.setMetas(txtMeta.getText());
            objParticular.setObjetivo(txtObjetivoParticular.getText());
            plan.guardarObjetivoParticular(objParticular);
            System.out.println("Objetivo particular guardado");
            //EEPLANDETRABAJO//TEMAS//EVALUACION
            obtenerEELlenadas();
            System.out.println("EEPlanDeTrabajo guardado");
            System.out.println("Tema guardado");
            System.out.println("Evaluacion guardado");
            //ACTIVIDADES
            listaActividades.forEach(actividad ->{
                actividad.setIdObjetivoParticular(plan.obteneridObjetivoParticular());
                if(!plan.guardarActividad(actividad)) {
                    mensaje("Error","Error en la conexion con la base de datos");
                }
            });
            //PARTICIPANTES
            ObservableList<AnchorPane> listaParticipantes = listParticipantes.getItems();
            int contador = 0;
            for (AnchorPane part : listaParticipantes) {
                for (Node node : part.getChildren()) {
                    if ("Participa".equals(node.getAccessibleText())) {
                        if (((JFXCheckBox) node).isSelected()) {
                            asistentes.add(participantes.get(contador));
                            System.out.println("Participo: " + participantes.get(contador).getNombre());
                        }
                    }
                }
                contador++;
            }
            if (!asistentes.isEmpty()) {
                for(Maestro participante : asistentes){
                    plan.guardarParticipante(new Participante(participante.getIdUsuarioAcademico(), plan.obteneridPlanTrabajo()));
                    System.out.println("Participante guardado");
                }
            }else{
               mensaje("Error","Error en la conexion con la base de datos");
            }
            mensaje("Guardado","Se ha guardado el progreso del nuevo Plan de Trabajo");
        }
    }
    
    @FXML
    void clickMasActividad(ActionEvent event) {
        JFXDialogLayout content = new JFXDialogLayout();
        content.setHeading(new Text("Actividades"));
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Dialog/ActividadDialog.fxml"));
        try {
            loader.load();
        } catch (IOException ex) {
            Logger.getLogger(PlanDeTrabajoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        ActividadDialogController display = loader.getController();
        AnchorPane p = loader.getRoot();
        content.setBody(p);
        JFXDialog dialog = new JFXDialog(rootPane, content, JFXDialog.DialogTransition.CENTER);
        JFXButton aceptar = new JFXButton("ACEPTAR");
        aceptar.setOnAction((ActionEvent e) -> {
            Actividad act = display.crearActividad();
            listaActividades.add(act);
            dialog.close();
        });
        content.setActions(aceptar);
        dialog.show();
    }

    @FXML
    void clickMenosActividad(ActionEvent event) {
        if (listaActividades.size() > 0) {
            listaActividades.remove(listaActividades.size() - 1);
        }
    }

    @FXML
    public void clickHamburger(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Dashboard.fxml"));
        try {
            loader.load();
        } catch (IOException ex) {
            Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        DashboardController display = loader.getController();
        display.cargarUsuario(this.user);
        StackPane vistaCursos = loader.getRoot();
        Scene newScene = new Scene(vistaCursos);
        Stage curStage = (Stage) rootPane.getScene().getWindow();
        curStage.setScene(newScene);
        curStage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {}
  
    /**
     * Inicialización y muestra de un JFXDialog al centro de la pantalla, mandando
     * una advertencia a alguna operación
     * 
     * @param head Título del dialog
     * @param body Texto principal del dialog
     */
    public void mensaje(String head, String body) {
        JFXDialogLayout content = new JFXDialogLayout();
        content.setHeading(new Text(head));
        content.setBody(new Text(body));
        JFXDialog dialog = new JFXDialog(rootPane, content, JFXDialog.DialogTransition.CENTER);
        JFXButton aceptar = new JFXButton("ACEPTAR");
        aceptar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                dialog.close();
            }
        });
        content.setActions(aceptar);
        dialog.show();
    }
}
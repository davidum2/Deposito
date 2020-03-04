
package com.mx.ciberCQ.web;

import com.mx.ciberQC.domain.Material;
import com.mx.ciberQC.domain.Reporte;
import com.mx.servicio.MaterialService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.event.RowEditEvent;

@Named("resguardo")
@RequestScoped
public class MaterialBeans {
    
    
    
    Logger log = LogManager.getRootLogger();
    
    private int id;
    
    @Inject
    private MaterialService materialService;
    private Material materialseleccionado;
    private List<Material> lsitaMaterial;
    private Reporte reporte;
    private List<Reporte> matParaReporte;
    
    public MaterialBeans(){
        log.debug("se inicializo");
    }
    
    @PostConstruct
    public void inicializar(){
        materialseleccionado = new Material();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Reporte> getMatParaReporte() {
        return matParaReporte;
    }

    public void setMatParaReporte(List<Reporte> matParaReporte) {
        this.matParaReporte = matParaReporte;
    }

    public Reporte getReporte() {
        return reporte;
    }

    public void setReporte(Reporte reporte) {
        this.reporte = reporte;
    }

    public MaterialService getMaterialService() {
        return materialService;
    }

    public void setMaterialService(MaterialService materialService) {
        this.materialService = materialService;
    }

    public Material getMaterialseleccionado() {
        return materialseleccionado;
    }

    public void setMaterialseleccionado(Material materialseleccionado) {
        this.materialseleccionado = materialseleccionado;
    }

    public List<Material> getLsitaMaterial() {
        return lsitaMaterial;
    }

    public void setLsitaMaterial(List<Material> lsitaMaterial) {
        this.lsitaMaterial = lsitaMaterial;
    }
    
    public void encontrar(){
        lsitaMaterial=(List<Material>) materialService.encontrarPorId2(id);
    }
    
    public void reporte(){
        reporte.getMaterial();
        
    }
    
    
}

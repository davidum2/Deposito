/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ciberQC.domain;

/**
 *
 * @author Edgar David
 */
public class Reporte {
    
private Material material;
private Descripcion descripcion;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Reporte{" + "material=" + material + ", descripcion=" + descripcion + '}';
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }
    
    private Reporte(){
        
    }
    
    private Reporte(Material material, Descripcion descripcion){
        this.descripcion = descripcion;
        this.material = material;
    }
    
    
    
    
    
}

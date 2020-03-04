/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ciberQC.domain;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Edgar David
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Descripcion.findAll", query = "SELECT d FROM Descripcion d"),
    @NamedQuery(name = "Descripcion.findById", query = "SELECT d FROM Descripcion d WHERE d.descripcionPK.id = :id"),
    @NamedQuery(name = "Descripcion.findByDescripcioncol", query = "SELECT d FROM Descripcion d WHERE d.descripcioncol = :descripcioncol"),
    @NamedQuery(name = "Descripcion.findByMaterialId", query = "SELECT d FROM Descripcion d WHERE d.descripcionPK.materialId = :materialId")})
public class Descripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DescripcionPK descripcionPK;
    @Size(max = 200)
    private String descripcioncol;
    @JoinColumn(name = "material_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Material material;

    public Descripcion() {
    }

    public Descripcion(DescripcionPK descripcionPK) {
        this.descripcionPK = descripcionPK;
    }

    public Descripcion(int id, int materialId) {
        this.descripcionPK = new DescripcionPK(id, materialId);
    }

    public DescripcionPK getDescripcionPK() {
        return descripcionPK;
    }

    public void setDescripcionPK(DescripcionPK descripcionPK) {
        this.descripcionPK = descripcionPK;
    }

    public String getDescripcioncol() {
        return descripcioncol;
    }

    public void setDescripcioncol(String descripcioncol) {
        this.descripcioncol = descripcioncol;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (descripcionPK != null ? descripcionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Descripcion)) {
            return false;
        }
        Descripcion other = (Descripcion) object;
        if ((this.descripcionPK == null && other.descripcionPK != null) || (this.descripcionPK != null && !this.descripcionPK.equals(other.descripcionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mx.ciberQC.domain.Descripcion[ descripcionPK=" + descripcionPK + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ciberQC.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Edgar David
 */
@Embeddable
public class DescripcionPK implements Serializable {

    @Basic(optional = false)
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "material_id")
    private int materialId;

    public DescripcionPK() {
    }

    public DescripcionPK(int id, int materialId) {
        this.id = id;
        this.materialId = materialId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) materialId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DescripcionPK)) {
            return false;
        }
        DescripcionPK other = (DescripcionPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.materialId != other.materialId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mx.ciberQC.domain.DescripcionPK[ id=" + id + ", materialId=" + materialId + " ]";
    }
    
}

package com.mx.datos;

import com.mx.ciberQC.domain.Material;

public interface MaterialDao {
    
    public Material findMaterialById(Material material);
    public Material findMaterial2ById(int id);
    
}

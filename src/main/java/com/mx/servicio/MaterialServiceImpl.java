/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.servicio;

import com.mx.ciberQC.domain.Material;
import com.mx.datos.MaterialDao;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Edgar David
 */
@Stateless
public class MaterialServiceImpl implements MaterialService{

    @Inject
    private MaterialDao materialDao;

  
    @Override
    public Material encontrarPorId2(int id) {
        return materialDao.findMaterial2ById(id);
    }
    
}

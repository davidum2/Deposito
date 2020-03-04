/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.servicio;

import com.mx.ciberQC.domain.Descripcion;
import com.mx.datos.DescripcionDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Edgar David
 */
@Stateless
public class DescripcionServiceImpl implements DescripcionService {

    @Inject
    private DescripcionDao descripcionDao;

    @Override
    public List<Descripcion> encontrarPorId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

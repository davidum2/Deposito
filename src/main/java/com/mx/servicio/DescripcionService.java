/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.servicio;

import com.mx.ciberQC.domain.Descripcion;
import java.util.List;

/**
 *
 * @author Edgar David
 */
public interface DescripcionService {
    public List<Descripcion> encontrarPorId();
}

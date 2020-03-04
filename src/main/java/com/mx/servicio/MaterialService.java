package com.mx.servicio;

import com.mx.ciberQC.domain.Material;
import javax.ejb.Local;

@Local
public interface MaterialService {
    public Material encontrarPorId2(int id);
}

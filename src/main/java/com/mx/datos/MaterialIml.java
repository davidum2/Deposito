package com.mx.datos;

import com.mx.ciberQC.domain.Material;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class MaterialIml implements MaterialDao{

    @PersistenceContext(unitName="resguardo")
    EntityManager em;
    
     @Override
    public Material findMaterialById(Material material) {
        return em.find(Material.class, material.getId());
    }
     @Override
    public Material findMaterial2ById(int id) {
        Query query = em.createQuery("SELECT m FROM Material m WHERE m.id = :id");
        query.setParameter("id", id);
        return (Material) query.getSingleResult();
    }

    
}

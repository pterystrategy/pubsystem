/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.dao;

import br.com.fsp.pubsystmcia.model.Mesa;
import java.io.Serializable;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author prodrigues
 */
public class MesaDao extends AbstractDao<Mesa> implements Serializable {

    @Override
    public Mesa create(Mesa entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.flush();
        em.getTransaction().commit();
        em.refresh(entity);

        return entity;
    }

    @Override
    public boolean delete(Mesa entity) {
        em.getTransaction().begin();
        Mesa funcionario;
        funcionario = em.getReference(Mesa.class, entity.getCodigo());

        if (entity.equals(funcionario)) {
            em.remove(funcionario);
            em.getTransaction().commit();
            return true;
        } else {
        }
        return false;
    }

    @Override
    public Mesa update(Mesa entity) {
        em.getTransaction().begin();
        Mesa merge = this.getEntityManager().merge(entity);
        em.getTransaction().commit();
        return merge;
    }

    @Override
    public Mesa findById(int id) {
        return this.findById((long) id);
    }

    @Override
    public Mesa findById(long id) {
        Mesa item;
        item = em.find(Mesa.class, id);
        return item;
    }

    @Override
    public List<Mesa> find(Mesa entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mesa> findAll() {
        CriteriaQuery cq;
        cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Mesa.class));
        return em.createQuery(cq).getResultList();
    }
}

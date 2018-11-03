/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.dao;

import br.com.fsp.pubsystmcia.model.Categoria;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author prorodrigues
 */
public class CategoriaDao extends AbstractDao<Categoria> {

    @Override
    public Categoria create(Categoria entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.flush();
        em.getTransaction().commit();
        em.refresh(entity);
        return entity;
    }

    @Override
    public boolean delete(Categoria entity) {
        em.getTransaction().begin();
        Categoria reference = em.getReference(Categoria.class, entity.getCodigo());
        if (entity.equals(reference)) {
            em.remove(reference);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public Categoria update(Categoria entity) {
        em.getTransaction().begin();
        Categoria merge = this.getEntityManager().merge(entity);
        em.getTransaction().commit();
        return merge;
    }

    @Override
    public Categoria findById(int id) {
        return this.findById((long) id);
    }

    @Override
    public Categoria findById(long id) {
        return em.find(Categoria.class, id);
    }

    @Override
    public List<Categoria> find(Categoria entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categoria> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Categoria.class));
        return em.createQuery(cq).getResultList();
    }

}

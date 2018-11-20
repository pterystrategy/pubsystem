/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.dao;

import br.com.fsp.pubsystmcia.model.Fornecedor;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author prorodrigues
 */
public class FornecedorDao extends AbstractDao<Fornecedor> {

    @Override
    public Fornecedor create(Fornecedor entity) {
        em.getTransaction().begin();
        em.persist(entity);
        //em.flush();
        em.getTransaction().commit();
        em.refresh(entity);
        return entity;
    }

    @Override
    public boolean delete(Fornecedor entity) {
        em.getTransaction().begin();
        Fornecedor reference = em.getReference(Fornecedor.class, entity.getCodigo());
        if (entity.equals(reference)) {
            em.remove(reference);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public Fornecedor update(Fornecedor entity) {
        em.getTransaction().begin();
        Fornecedor merge = this.getEntityManager().merge(entity);
        em.getTransaction().commit();
        return merge;
    }

    @Override
    public Fornecedor findById(int id) {
        return this.findById((long) id);
    }

    @Override
    public Fornecedor findById(long id) {
        return em.find(Fornecedor.class, id);
    }

    @Override
    public List<Fornecedor> find(Fornecedor entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fornecedor> findAll() {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Fornecedor.class));
        return em.createQuery(cq).getResultList();
    }

}

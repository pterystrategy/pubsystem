/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.dao;

import br.com.fsp.pubsystmcia.model.Mesa;
import br.com.fsp.pubsystmcia.model.Produto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author prodrigues
 */
public class ProdutoDao extends AbstractDao<Produto> implements Serializable {

    @Override
    public Produto update(Produto entity) {
        em.getTransaction().begin();
        Produto merge = this.getEntityManager().merge(entity);
        em.getTransaction().commit();
        return merge;
    }

    @Override
    public Produto findById(int id) {
        return this.findById((long) id);
    }

    @Override
    public Produto findById(long id) {
        Produto item;
        item = em.find(Produto.class, id);
        return item;
    }

    @Override
    public List<Produto> find(Produto entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produto> findAll() {
        CriteriaQuery cq;
        cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Produto.class));
        return em.createQuery(cq).getResultList();
    }

    @Override
    public Produto create(Produto entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.flush();
        em.getTransaction().commit();
        em.refresh(entity);

        return entity;
    }

    @Override
    public boolean delete(Produto entity) {
        em.getTransaction().begin();
        Produto reference;
        reference = em.getReference(Produto.class, entity.getCodigo());

        if (entity.equals(reference)) {
            em.remove(reference);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }
}

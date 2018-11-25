/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.dao;

import br.com.fsp.pubsystmcia.model.Compra;
import br.com.fsp.pubsystmcia.model.Fornecedor;
import java.io.Serializable;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Frederico
 */
public class CompraDao extends AbstractDao<Compra> implements Serializable  {
 
    @Override
    public Compra update(Compra entity) {
        em.getTransaction().begin();
        Compra merge = this.getEntityManager().merge(entity);
        em.getTransaction().commit();
        return merge;
    }

    @Override
    public Compra findById(int id) {
        return this.findById((long) id);
    }

    @Override
    public Compra findById(long id) {
        Compra item;
        item = em.find(Compra.class, id);
        return item;
    }

    @Override
    public List<Compra> find(Compra entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compra> findAll() {
        CriteriaQuery cq;
        cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Compra.class));
        return em.createQuery(cq).getResultList();
    }

    @Override
    public Compra create(Compra entity) {
        em.getTransaction().begin();
        FornecedorDao daoFornecedor = new FornecedorDao();
        Fornecedor f = daoFornecedor.findById(entity.getFornecedor().getCodigo());
        entity.setFornecedor(f);
        em.persist(entity);
        em.flush();
        em.getTransaction().commit();
        em.refresh(entity);

        return entity;
    }

    @Override
    public boolean delete(Compra entity) {
        em.getTransaction().begin();
        Compra reference;
        reference = em.getReference(Compra.class, entity.getCodigo());

        if (entity.equals(reference)) {
            em.remove(reference);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }
}

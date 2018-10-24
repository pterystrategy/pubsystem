/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fsp.pubsystmcia.dao;

import br.com.fsp.pubsystmcia.model.Funcionario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author prodrigues
 */
public class FuncionarioDao extends AbstractDao<Funcionario> implements Serializable {

    @Override
    public Funcionario create(Funcionario entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.flush();
        em.getTransaction().commit();
        em.refresh(entity);

        return entity;
    }

    @Override
    public Funcionario update(Funcionario t) {
        em.getTransaction().begin();
        Funcionario merge = this.getEntityManager().merge(t);
        em.getTransaction().commit();
        return merge;
    }

    @Override
    public Funcionario findById(long id) {
        Funcionario item;
        item = em.find(Funcionario.class, id);
        return item;
    }

    @Override
    public Funcionario findById(int id) {
        return this.findById((long) id);
    }

    @Override
    public boolean delete(Funcionario t) {
        em.getTransaction().begin();
        Funcionario funcionario;
        funcionario = em.getReference(Funcionario.class, t.getCodigo());

        if (t.equals(funcionario)) {
            em.remove(funcionario);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public List<Funcionario> find(Funcionario t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Funcionario> findAll() {
        CriteriaQuery cq;
        cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Funcionario.class));
        return em.createQuery(cq).getResultList();
    }
}

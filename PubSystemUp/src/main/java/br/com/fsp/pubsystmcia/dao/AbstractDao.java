package br.com.fsp.pubsystmcia.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

public abstract class AbstractDao<T> implements IDAO<T> {

    @PersistenceUnit
    protected EntityManagerFactory factory;
    protected EntityManager em;

    public AbstractDao() {
        factory = Persistence.createEntityManagerFactory("PubSystemPU");
        em = this.createEntityManager();
    }

    public EntityManager getEntityManager() {
        if (em == null) {
            em = this.createEntityManager();
        }
        return em;
    }

    private EntityManager createEntityManager() {
        return factory.createEntityManager();
    }

    public void closeEntityManager(EntityManager manager) {
        if (manager.isOpen()) {
            manager.close();
        }
    }

}

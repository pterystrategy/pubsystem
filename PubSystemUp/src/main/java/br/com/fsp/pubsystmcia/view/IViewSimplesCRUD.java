package br.com.fsp.pubsystmcia.view;

import java.util.List;

public interface IViewSimplesCRUD<T> {

    public T criar();

    public void mostrar(T type);

    public T editar(T salvar);

    public boolean excluir(T deletar);

    public void listar(List<T> listas);

    public void read(T Type);

    public T getScreenObject();

    public void preencherTela(T preencha);

    public void limpaTela();

}

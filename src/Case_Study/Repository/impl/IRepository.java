package Case_Study.Repository.impl;

import java.util.List;

public interface IRepository<E> {
    void add(E e);
    void display();
    void edit();
    List<E> getAll();
}

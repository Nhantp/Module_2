package Case_Study.Repository.impl;

import java.util.List;

public interface IRepository<E> {
    void add();
    void display();
    void edit();
    List<E> getAll();
}

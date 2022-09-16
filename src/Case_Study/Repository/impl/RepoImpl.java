package Case_Study.Repository.impl;

import java.util.ArrayList;
import java.util.List;

public class RepoImpl implements IRepository {
    static List<Object> list= new ArrayList<>();
    @Override
    public void add(Object o) {
       list.add(o);
    }

    @Override
    public void display() {

    }

    @Override
    public void edit() {

    }

    @Override
    public List<Object> getAll() {
        return list;
    }
}

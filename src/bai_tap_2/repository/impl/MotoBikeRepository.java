package bai_tap_2.repository.impl;

import bai_tap_2.model.MotoBike;
import bai_tap_2.repository.IMotoBikeRepository;
import java.util.ArrayList;
import java.util.List;

public class MotoBikeRepository implements IMotoBikeRepository {
    private static final List<MotoBike>motoBikeList=new ArrayList<>();
    static {
        motoBikeList.add(new MotoBike("342","honda","2022","nhan",120));
        motoBikeList.add(new MotoBike("343","honda","2022","nhan",120));
        motoBikeList.add(new MotoBike("344","honda","2022","nhan",120));
        motoBikeList.add(new MotoBike("345","honda","2022","nhan",120));
        motoBikeList.add(new MotoBike("346","honda","2022","nhan",120));
    }

    @Override
    public void addMotoBike(MotoBike motoBike) {
        motoBikeList.add(motoBike);
    }

    @Override
    public List<MotoBike> getAll() {
        return motoBikeList;
    }
}

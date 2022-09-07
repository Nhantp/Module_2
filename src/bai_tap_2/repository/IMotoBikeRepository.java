package bai_tap_2.repository;

import bai_tap_2.model.MotoBike;

import java.util.List;

public interface IMotoBikeRepository {
    void addMotoBike(MotoBike motoBike);

    List<MotoBike> getAll();
}

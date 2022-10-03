package Case_Study.Repository;

import Case_Study.models.Booking;
import Case_Study.models.Contract;

import java.util.Queue;

public interface IContractRepository {
    String FILE_NAME="D:\\Codegym\\A05\\Module_2\\src\\Case_Study\\Data\\contract.dat";
    void add(Contract contract);
    Queue<Contract>findAll();
}

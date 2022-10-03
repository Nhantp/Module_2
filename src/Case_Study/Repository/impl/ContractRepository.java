package Case_Study.Repository.impl;

import Case_Study.Repository.IContractRepository;
import Case_Study.models.Booking;
import Case_Study.models.Contract;
import Case_Study.util.ReadAndWriteContract;

import java.util.Queue;

public class ContractRepository implements IContractRepository {
    ReadAndWriteContract readAndWriteContract=new ReadAndWriteContract();
    Queue<Contract>contractQueue=readAndWriteContract.readContract(FILE_NAME);
    @Override
    public void add(Contract contract) {
    contractQueue.add(contract);
    readAndWriteContract.writeContract(contractQueue,FILE_NAME);
    }

    @Override
    public Queue<Contract> findAll() {
        return contractQueue;
    }
}

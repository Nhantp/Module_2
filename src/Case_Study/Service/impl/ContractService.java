package Case_Study.Service.impl;

import Case_Study.Repository.IContractRepository;
import Case_Study.Repository.impl.ContractRepository;
import Case_Study.Service.IContractService;
import Case_Study.models.Contract;

import java.util.Queue;
import java.util.Scanner;

public class ContractService implements IContractService {
    IContractRepository iContractRepository=new ContractRepository();

    @Override
    public void add() {
        Contract contract=this.infoContracts();
        iContractRepository.add(contract);
    }

    @Override
    public void display() {
        Queue<Contract>contractQueue=iContractRepository.findAll();
        for (Contract contract:contractQueue){
            System.out.println(contract);
        }
    }
    public Contract infoContracts(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so hop dong: ");
        String someContracts=scanner.nextLine();
        System.out.println("Nhap vao ma booking: ");
        String idBooking=scanner.nextLine();
        System.out.println("Nhap vao so tien coc truoc: ");
        double advanceDeposit=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao tong tien thanh toan: ");
        double totalPayment=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao ma khach hang: ");
        String idCustomer=scanner.nextLine();

        return new Contract(someContracts,idBooking,advanceDeposit,totalPayment,idCustomer);
    }
}

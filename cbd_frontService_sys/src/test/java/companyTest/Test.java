package companyTest;
import com.cbd.companyFront.CompanyMain;
import com.cbd.companyFront.dto.*;
import com.cbd.companyFront.service.ICompanyService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CompanyMain.class)
public class Test {

    @Autowired
    private ICompanyService service;


    @org.junit.Test
    public void findAllContract(){//查看所有合同
        List<ContractDto> list = service.findAllContractDto(1,5);

        for (ContractDto contractDto : list) {
            System.out.println(contractDto.toString());
        }

    }



    @org.junit.Test
    public void findLeaseCar(){//查看已租赁车位
        List<LeaseCarDto> list = service.findLeaseCar(1,1,6);

        for (LeaseCarDto leaseCarDto : list) {
            System.out.println(leaseCarDto.toString());
        }
    }


    @org.junit.Test
    public void findCBDFreeCar(){//查看CBD空闲车位
        List<CBDFreeCar> list = service.findCBDFreeCar(2,1,5);

        for (CBDFreeCar cbdFreeCar : list) {
            System.out.println(cbdFreeCar.toString());
        }
    }


    @org.junit.Test
    public void findBil(){//查询账单
        List<BillDto> list = service.findAllBill(null, null, 1, 1);

        for (BillDto billDto : list) {
            System.out.println(billDto.toString());
        }
    }

    @org.junit.Test
    public void findBillAll(){
        List<AllBillDto> list = service.findBillAll();

    }


    @org.junit.Test
    public void findCompanyByID(){//按id查看企业信息
        CompanyInfoDto company = service.findCompanyByID(1);

        System.out.println(company.toString());
    }



    @org.junit.Test//修改企业信息
    public void updateCompanyInfo(){//修改企业信息
        int i = service.updateCompanyInfo(1, "张三2", "1232", "张三2", "666");

        System.out.println(i+"/");
    }






}

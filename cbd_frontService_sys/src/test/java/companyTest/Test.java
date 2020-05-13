package companyTest;
import com.cbd.companyFront.CompanyMain;
import com.cbd.companyFront.dto.CBDFreeCar;
import com.cbd.companyFront.dto.CompanyInfoDto;
import com.cbd.companyFront.dto.ContractDto;
import com.cbd.companyFront.dto.LeaseCarDto;
import com.cbd.companyFront.service.ICompanyService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CompanyMain.class)
public class Test {

    @Autowired
    private ICompanyService service;


    @org.junit.Test
    public void findAllContract(){//查看所有合同
        List<ContractDto> list = service.findAllContractDto();

        for (ContractDto contractDto : list) {
            System.out.println(contractDto.toString());
        }

    }



    @org.junit.Test
    public void findLeaseCar(){//查看已租赁车位
        List<LeaseCarDto> list = service.findLeaseCar(4);

        for (LeaseCarDto leaseCarDto : list) {
            System.out.println(leaseCarDto.toString());
        }
    }


    @org.junit.Test
    public void findCBDFreeCar(){//查看CBD空闲车位
        List<CBDFreeCar> list = service.findCBDFreeCar(0);

        for (CBDFreeCar cbdFreeCar : list) {
            System.out.println(cbdFreeCar.toString());
        }
    }


    @org.junit.Test
    public void findCompanyByID(){//按id查看企业信息
        CompanyInfoDto company = service.findCompanyByID(1);

        System.out.println(company.toString());
    }



    @org.junit.Test
    public void updateCompanyInfo(){
        service.updateCompanyInfo(1, "张三2", "1232", "张三2", "666");
    }



}

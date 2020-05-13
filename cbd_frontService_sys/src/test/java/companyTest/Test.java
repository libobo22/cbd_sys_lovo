package companyTest;
import com.cbd.companyFront.CompanyMain;
import com.cbd.companyFront.dto.ContractDto;
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
    public void findAll(){//查看所有合同
        List<ContractDto> list = service.findAllContractDto();

        for (ContractDto contractDto : list) {
            System.out.println(contractDto.toString());
        }

    }




}

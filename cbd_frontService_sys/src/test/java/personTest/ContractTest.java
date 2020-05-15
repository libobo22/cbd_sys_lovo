package personTest;

import com.cbd.personFront.PersonFrontMain;
import com.cbd.personFront.bean.PersonalContractBean;
import com.cbd.personFront.service.IPersonalContractService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 个人合同测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonFrontMain.class)
public class ContractTest {

    @Autowired
    IPersonalContractService service;

    @Test
    public void findByPersonalContract(){
        List<PersonalContractBean> list = service.findByPersonalContract("51024354634",1,3);
        System.out.println(list);
    }

    @Test
    public void findByContractInfo(){
        System.out.println(service.findByContractInfo(1));
    }


}

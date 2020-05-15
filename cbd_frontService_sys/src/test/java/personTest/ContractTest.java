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

    @Test
   public void findByHistory(){
        System.out.println(service.findByHistory("5123456789876543567890",1,3));
    }

    @Test
    public void updateStatus(){
        service.updateStatus(1,1,"审核员");
    }

    @Test
    public void addContract(){
        PersonalContractBean bean = new PersonalContractBean(15,"9999888",0,0,0,999.88f,null,"张三","1399999","510999333","李四","152000000","510***000");
        service.addContract(bean);
    }


}

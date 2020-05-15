package personTest;

import com.cbd.personFront.PersonFrontMain;
import com.cbd.personFront.bean.ComplainBean;
import com.cbd.personFront.bean.PersonalContractBean;
import com.cbd.personFront.dao.IComplainDao;
import com.cbd.personFront.service.IComplainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonFrontMain.class)
public class ComplainTest {

    @Autowired
    IComplainService complainService;

    @Test
    public void addComplain(){
        ComplainBean complainBean = new ComplainBean(15,"出售信息车位",1,"王麻子","139000000","510***000",
                "翠花","138999999","51099999**33");
        complainService.addComplain(complainBean);
    }


    @Test
    public void findByContract(){
        List<PersonalContractBean> list = complainService.findByContract("510****555",1,3);
        System.out.println(list);
    }


}

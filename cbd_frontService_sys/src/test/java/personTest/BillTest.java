package personTest;

import com.cbd.personFront.PersonFrontMain;
import com.cbd.personFront.bean.BillBean;
import com.cbd.personFront.service.IBillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonFrontMain.class)
public class BillTest {

    @Autowired
    IBillService billService;

    @Test
    public void findByBill(){
        System.out.println(billService.findByBill("510",1,3));
    }

    @Test
    public void addBill(){
        BillBean billBean = new BillBean(999.98f,8887.21f,"备注","6666");
        billService.addBill(billBean);
    }


}

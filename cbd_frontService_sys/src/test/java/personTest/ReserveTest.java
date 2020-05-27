package personTest;

import com.cbd.personFront.PersonFrontMain;
import com.cbd.personFront.bean.ReserveBean;
import com.cbd.personFront.service.IReserveService;
import com.cbd.personFront.service.impl.ReserveServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonFrontMain.class)
public class ReserveTest {

    @Autowired
    IReserveService service;

    @Test
    public void addReserve(){
        ReserveBean bean = new ReserveBean(15,"买",0,"张三","13988888","510****999","李四","155566622","510*****66666");
        service.addReserve(bean);
    }

    @Test
  public void findByReserve(){
        System.out.println(service.findByReserve("510*****66666",1,3));
    }

    @Test
    public void findByBeReserve(){
        System.out.println(service.findByBeReserve("510****999",1,3));
    }


    @Test
    public void updateState(){
        service.updateState("1",7);
    }

}

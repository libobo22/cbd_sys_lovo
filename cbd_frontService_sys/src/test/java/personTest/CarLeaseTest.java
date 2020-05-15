package personTest;

import com.cbd.personFront.PersonFrontMain;
import com.cbd.personFront.bean.CarLeaseBean;
import com.cbd.personFront.service.ICarLeaseService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 租凭车位测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonFrontMain.class)
public class CarLeaseTest {

    @Autowired
    ICarLeaseService carLeaseService;

    @Test
    public void findByDateLease(){
        System.out.println(carLeaseService.findByDateLease("2020-05-13","2021-03-01",1,3));
    }

    @Test
   public void findByBuyCar(){
        System.out.println(carLeaseService.findByBuyCar("茶店子","98982",1,3));
   }

   @Test
   public void addLeaseCar(){
       CarLeaseBean carLeaseBean = new CarLeaseBean("2022-08-20 13:17:02",999.33f,1,12,8,"510*******7778877");
       carLeaseService.addLeaseCar(carLeaseBean);
   }


}

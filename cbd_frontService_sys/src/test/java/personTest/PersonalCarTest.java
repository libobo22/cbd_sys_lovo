package personTest;

import com.cbd.personFront.PersonFrontMain;
import com.cbd.personFront.bean.PersonalCarBean;
import com.cbd.personFront.service.IPersonalCarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 个人车位测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersonFrontMain.class)
public class PersonalCarTest {
    @Autowired
    IPersonalCarService personalCarService ;

    @Test
    public void add(){
        PersonalCarBean personalCarBean = new PersonalCarBean("车位产权证编号","车位地址","车位编号","产权证复印件","车位主人真实名字","电话号","身份证号");
        personalCarService.addPersonalCar(personalCarBean);
    }

    @Test
    public void findByCar(){
        List<PersonalCarBean> list = personalCarService.findByCar("519****309",1,3);
        System.out.println(list);
    }

    @Test
    public void updateCar(){
        personalCarService.updateCar(11,"张飞","1932112942","519****309");
    }



}

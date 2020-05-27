package com.cbd.service.impl;


import com.cbd.dao.IBusinessDao;
import com.cbd.dao.ILoginLogDao;
import com.cbd.dao.IUserDao;
import com.cbd.entity.LoginLog;
import com.cbd.entity.UserLogin;
import com.cbd.service.ILoginLogService;
import com.cbd.util.IPUtil;
import com.cbd.util.Pagination;
import org.springframework.stereotype.Service;
import net.ipip.ipdb.CityInfo;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;


@Service
public class LoginLogServiceImpl implements ILoginLogService {

    @Resource
    private ILoginLogDao loginLogDao;

    @Override
    public List<UserLogin> findIdByUserName(String username) {

        return loginLogDao.findIdByUserName(username);
    }

    @Resource
    private IUserDao userDao;
    //    @Resource
//    private IManagerDao managerDao;
    @Resource
    private IBusinessDao businessDao;

    @Override
    public boolean addLoginLog(LoginLog loginLog) {
        String ipAddr = loginLog.getIpAddr();
        String str = "";
        CityInfo info = IPUtil.getAddr(ipAddr);
        //国家名
        String countryName = info.getCountryName();
        //省名
        String regionName = info.getRegionName();
        //城市名
        String cityName = info.getCityName();
        if (regionName.equals(cityName)) {
            str = countryName + regionName;
        } else {
            str = countryName + regionName + cityName;
        }
        loginLog.setAddress(str);
        return loginLogDao.addLoginLog(loginLog) > 0;
    }


    @Override
    public Pagination<LoginLog> findLoginLog(Timestamp startDate, Timestamp endDate, int pageNo, int pageSize) {
        int startIndex = (pageNo - 1) * pageSize;
        List<LoginLog> loginLogList = loginLogDao.findLoginLog(startDate, endDate, startIndex, pageSize);
        int totalCount = loginLogDao.getTotalCount(startDate, endDate);
        Pagination<LoginLog> pagination = new Pagination<>();
        pagination.setCurrentPage(pageNo);
        pagination.setTotalCount(totalCount);
        pagination.setData(loginLogList);
        return pagination;
    }

    @Override
    public Pagination<LoginLog> findLoginLogByUserLoginId(int userId, Timestamp startDate, Timestamp endDate, int pageNo, int pageSize) {
        int startIndex = (pageNo - 1) * pageSize;
        List<LoginLog> loginLogList = loginLogDao.findLoginLogByUserLoginId(userId, startDate, endDate, startIndex, pageSize);
        int totalCountByUserId = loginLogDao.getTotalCountByUserId(userId, startDate, endDate);
        Pagination<LoginLog> pagination = new Pagination<>();
        pagination.setCurrentPage(pageNo);
        pagination.setTotalCount(totalCountByUserId);
        pagination.setData(loginLogList);
        return pagination;
    }

    @Override
    public String findRealName(int id) {
        String userRealName = userDao.findById(id).getRealName();
//        String managerRealName = managerDao.findById(id).getRealName();
        String businessName = businessDao.getById(id).getName();

        if (userRealName != null) {
            return userRealName;
        }
//        if (managerRealName != null) {
//            return managerRealName;
//        }
        if (businessName != null) {
            return businessName;
        }
        return "";
    }
}

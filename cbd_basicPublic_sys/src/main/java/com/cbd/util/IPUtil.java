package com.cbd.util;

import lombok.extern.slf4j.Slf4j;
import net.ipip.ipdb.City;
import net.ipip.ipdb.CityInfo;
import net.ipip.ipdb.IPFormatException;
import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

@Slf4j
public class IPUtil {

    private static final CityInfo EMPTY_CITY_INFO = new CityInfo(new String[]{});

    public static CityInfo getAddr(String ipAddr) {
        CityInfo info = EMPTY_CITY_INFO;
        try {
            ClassPathResource classPathResource = new ClassPathResource("ipdb/ipipfree.ipdb");
            InputStream inputStream = classPathResource.getInputStream();

            City db = new City(inputStream);
            info = db.findInfo(ipAddr, "CN");
        } catch (IPFormatException ipFormatException) {
            log.info("输入的IP地址格式错误");
            return EMPTY_CITY_INFO;
        } catch (Exception e) {
            e.printStackTrace();
            return EMPTY_CITY_INFO;
        }
        return info;
    }
}

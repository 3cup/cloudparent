package person.liwy.webservice.controller;



import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import person.liwy.common.json.JacksonUtil;
import person.liwy.webservice.dto.Person;

@RestController
public class WebController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    @ApiOperation(value ="查询用户信息")
    @ApiImplicitParam(name = "user", value = "单个用户信息", dataType = "User")
    private String fetchUserInfo(){

        Person person = new Person();
        person.name = "张三";
        person.date = new Date();
        person.localDateTime = LocalDateTime.now();
        person.age = 100;
        person.money = BigDecimal.valueOf(500.21);
        person.man = true;
        person.trait = Lists.newArrayList(ImmutableList.of("淡然", "温和"));
        person.cards = Maps.newHashMap();
        person.cards.put("身份证", "4a6d456as");
        person.cards.put("建行卡", "649874545");
        return JacksonUtil.to(person);

    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    private String saveUserInfo(@RequestBody Person person){

        return "";

    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    private String updateUserInfo(@RequestBody Person person){

        return "";

    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE)
    private String deleteUserInfo(){

        return "";

    }
}

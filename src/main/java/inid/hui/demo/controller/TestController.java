package inid.hui.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2020/12/21 10:22
 * Description:
 *
 * @author: hui
 * @history Date        Author		Desc<br/>
 * @since JDK 1.8<br/>Copyright (c) 2016, 广州南天电脑系统有限公司 All Rights Reserved.
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}

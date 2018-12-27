package spring.mvc.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Code Ch3 Example - VariableTest、CrossOriginTest
 *
 * @Path Variable 註解 和 @Matrix Variable 註解的使⽤
 * @CrossOrigin 註解 的使⽤
 */
@Controller
@RequestMapping(value="/variable")
public class VariableController {
    @GetMapping(value="home")
    public String home() {
        System.out.println("register GET方法被調用...");
        // 跳轉到註冊頁面
        return "page/variablePage";
    }

    // 測試@PathVariable註解
    // 該方法映射的請求為/VariableTest/pathVariableTest/1
    @GetMapping(value = "/pathVariableTest/{userId}")
    public void pathVariableTest(
            @PathVariable Integer userId) {
        System.out.println("通過 @PathVariable 獲得數據： userId=" + userId);
    }

    // 測試@MatrixVariable註解
    // 該方法映射的請求為/VariableTest/matrixVariableTest/1;name=jack;age=23
    @GetMapping(value = "/matrixVariableTest/{userId}")
    public void matrixVariableTest(
            @PathVariable Integer userId,
            @MatrixVariable(value = "name", pathVar = "userId") String name,
            @MatrixVariable(value = "age", pathVar = "userId") Integer age) {
        System.out.println("通過@PathVariable獲得數據： userId=" + userId);
        System.out.println("通過@MatrixVariable獲得數據： name=" + name + " age=" + age);
    }
    // 測試@MatrixVariable註解的複雜例子
    // 該方法映射的請求為//VariableTest/productTest/computer;brand=apple,acer;low=2000;height=10000
    @GetMapping(value="/productTest/{goods}")
    public void productTest(
            @PathVariable String goods,
            @MatrixVariable(value="brand",pathVar="goods") List<String> brand,
            @MatrixVariable(value="low",pathVar="goods") Integer low,
            @MatrixVariable(value="height",pathVar="goods") Integer height){
        System.out.println("通過@PathVariable獲得數據： goods=" + goods);
        System.out.println("通過@MatrixVariable獲得數據：brand="  + brand);
        System.out.println("通過@MatrixVariable獲得數據： low="  + low + " height="+ height);
    }

}
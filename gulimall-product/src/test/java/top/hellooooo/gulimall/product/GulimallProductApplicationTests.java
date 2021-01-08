package top.hellooooo.gulimall.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.hellooooo.gulimall.product.entity.BrandEntity;
import top.hellooooo.gulimall.product.service.BrandService;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Q
 * @Date 26/12/2020 11:04
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    @Test
    public void testSort() {
        class Hello {
            int age;
            Hello(int age){
                this.age = age;
            }

            @Override
            public String toString() {
                return "Hello{" +
                        "age=" + age +
                        '}';
            }
        }

        List<Hello> hellos = Arrays.asList(new Hello(1), new Hello(3), new Hello(4), new Hello(5), new Hello(6));
        hellos.stream().forEach(System.out::print);
        System.out.println();

        hellos.stream().sorted((hello1, hello2) -> - hello1.age + hello2.age).forEach(System.out::print);
    }

}

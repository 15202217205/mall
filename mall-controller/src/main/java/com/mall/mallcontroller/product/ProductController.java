package com.mall.mallcontroller.product;

import com.alibaba.fastjson.JSON;
import com.mall.mallcommonservice.product.ProductService;
import com.mall.mallcommonservice.product.model.ProductListReq;
import com.mall.mallcommonservice.product.model.ProductListRes;
import com.mall.mallcommonservice.user.UserService;
import com.mall.mallcommonservice.user.model.LoginReq;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gggcgba 【wechat:13031016567】
 * 2020/11/18 0018
 **/
@RestController
public class ProductController {

    @Reference(version = "1.0.0")
    private ProductService productService;

    @RequestMapping("/queryProductList")
    public String queryProductList(ProductListReq req){
        ProductListRes res = productService.queryProductList(req);
        return JSON.toJSONString(res);
    }
}

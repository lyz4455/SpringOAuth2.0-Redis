package com.lyman.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyz4455 on 2020/4/2.
 */
@RestController
@PreAuthorize("hasRole('ROLE_USER')")
public class TestController {

    @GetMapping("/product/{id}")
//    @PreAuthorize("hasRole('ROLE_USER')")
    public String getProduct(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id : " + id;
    }

    @GetMapping("/order/{id}")
//    @PreAuthorize("hasRole('ROLE_USER')")
    public String getOrder(@PathVariable String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id : " + id;
    }


}

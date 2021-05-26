package com.dk.controller;

import com.dk.pojo.Dept;
import com.dk.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author wujunjin
 * @Date 2021/5/25 13:55
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 得到具体的微服务信息
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }

    @GetMapping("/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    /**
     *获取微服务信息
     * @return
     */
    @GetMapping("/dept/discovery")
    public Object discovery() {
        //获取微服务列表清单
        List<String> services = discoveryClient.getServices();
        System.out.println("services :" +  services);

        //得到具体的微服务信息，通过id
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");

        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "\t" + instance.getPort() + "\t"
             + instance.getUri() + "\t" + instance.getServiceId());
        }
        return this.discoveryClient;
    }
}

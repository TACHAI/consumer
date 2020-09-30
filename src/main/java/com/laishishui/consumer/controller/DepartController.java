package com.laishishui.consumer.controller;

import com.laishishui.consumer.po.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Create by tachai on 2020-09-29 20:44
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
@RestController
@RequestMapping("/consumer/depart")
public class DepartController {

    @Autowired
    private RestTemplate restTemplate;
    private static final String SERVICE_PROVIDER="http://localhost:8081";

    @PostMapping("/save")
    public boolean saveHandle(Depart depart){
        String url = SERVICE_PROVIDER+"/provider/depart/save";
        return restTemplate.postForObject(url,depart,Boolean.class);
    }


    @DeleteMapping("/del/{id}")
    public void removeHandle(@PathVariable("id")int id){
        String url=SERVICE_PROVIDER+"/provider/depart/del"+id;
        restTemplate.delete(url);
    }


    @PutMapping("/update")
    public void modifyHandle(Depart depart){
        String url=SERVICE_PROVIDER+"/provider/depart/update";
        restTemplate.put(url,depart);
    }


    @GetMapping("/get/{id}")
    public Depart getDepartHandle(@PathVariable("id")int id){
        String url=SERVICE_PROVIDER+"/provider/depart/get/"+id;
        return restTemplate.getForObject(url,Depart.class);
    }

    @GetMapping("/list")
    public List<Depart> listAllDepartsHandle(){
        String url = SERVICE_PROVIDER+"/provider/depart/list/";
        return restTemplate.getForObject(url,List.class);
    }
}

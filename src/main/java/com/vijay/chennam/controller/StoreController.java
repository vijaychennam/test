package com.vijay.chennam.controller;

import com.vijay.chennam.model.Store;
import com.vijay.chennam.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store/api/v1")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping("/saveStore")
    @ResponseStatus(HttpStatus.CREATED)
    public Store saveSore(@RequestBody Store store) {

        return storeService.saveStore(store);
    }

}

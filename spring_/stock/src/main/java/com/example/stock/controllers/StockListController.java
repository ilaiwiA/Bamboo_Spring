package com.example.stock.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.stock.models.Stocks.StockList;

@RestController
public class StockListController {

    Map<String, StockList> test;

    @CrossOrigin
    @PostMapping("/api/stocks")
    public void setStocks (@RequestBody Map<String, StockList> stock){
        test = stock;
    }

    @CrossOrigin
    @GetMapping("/api/stocks")
    public Map<String, StockList> getStocks (){
        System.out.print("CALLED\n");
        return test;
    }
}

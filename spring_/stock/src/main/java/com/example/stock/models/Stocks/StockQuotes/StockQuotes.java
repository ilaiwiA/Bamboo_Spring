package com.example.stock.models.Stocks.StockQuotes;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/*
 * Controller for stock candles -> used for hisotrical stock quotes not live
 * Fields designed for TDAmeritrade
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class StockQuotes {

    @JsonProperty("candles")
    public ArrayList<Candles> candles;

}

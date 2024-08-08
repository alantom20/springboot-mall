package com.chenhao.springbootmall.dto;


import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public class CreateOrderRequest {

    @NotEmpty
    List<BuyItem> buyItemList;

    public List<BuyItem> getBuyItemList() {
        return buyItemList;
    }

    public void setBuyItemsList(List<BuyItem> buyItemList) {
        this.buyItemList = buyItemList;
    }
}

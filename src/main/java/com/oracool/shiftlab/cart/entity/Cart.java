package com.oracool.shiftlab.cart.entity;


import static java.lang.Math.min;

public class Cart {

    private String[] cartList = {"apples", "pens", "1 kg of sugar"};
    private int[] price = {10, 20, 30};
    private int[] count = new int[3];
    private int[] totalSum = new int[3];

    public String totalPrice() {
        int sum = 0;
        for(int i: totalSum) {
            sum += i;
        }
        return Integer.toString(sum);
    }

    public String addCount(String s, int n) {
        for (int i = 0; i < cartList.length; i++) {
            if(s.equals(cartList[i])) {
                count[i] += n;
                totalSum[i] += price[i]*n;
                return "items added";
            }
        }
        return "position not found";
    }

    public String removeCount(String s, int n) {
        for (int i = 0; i < cartList.length; i++) {
            if(s.equals(cartList[i])) {
                count[i] -= min(n, count[i]);
                totalSum[i] -= price[i]*min(n, count[i]);
                return "items removed";
            }
        }
        return "position not found";
    }

    public String[] getCartList() {
        return cartList;
    }

    public String getCartList(int a) {
        return cartList[a];
    }

    public int getPrice(int a) {
        return price[a];
    }

    public int[] getCount() {
        return count;
    }

    public void setCount(int[] count) {
        this.count = count;
    }

    public int[] getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int[] totalSum) {
        this.totalSum = totalSum;
    }

    public Cart() {
        for(int i = 0; i < cartList.length; i++) {
            this.count[i] = 0;
            this.totalSum[i] = 0;
        }
    }
}

package day03;

import java.util.List;

public class Stock {
    List<Double> stockList;

    public Stock(List<Double> stockList){
        this.stockList = stockList;
    }

    public double maxProfit(){
        if(stockList==null || stockList.size()<=1){
            return 0;
        }
        double prev = stockList.get(0);
        double sum = 0.0;
        for(double item : stockList){
            if(item-prev>0){
                sum += item-prev;
            }
            prev = item;
        }
        return sum;
    }
}

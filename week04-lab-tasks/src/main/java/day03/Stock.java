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
        double max=0.0;
        for(int i=0; i<stockList.size(); i++){
            for(int j=i+1; j<stockList.size(); j++){
                if(stockList.get(j)- stockList.get(i)>max){
                    max = stockList.get(j)- stockList.get(i);
                }
            }
        }
        return max;
    }
}

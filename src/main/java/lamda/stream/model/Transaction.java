package lamda.stream.model;

import lombok.Data;

/**
 * Created on 2021/3/7.11:22 下午
 *
 * @author 又土
 * @Description 类文件说明
 * @Version 1.0
 */
@Data
public class Transaction {
    //交易员
    private Trader trader;
    //交易日期
    private int year;
    //交易金额
    private int value;

    public Transaction() {
    }

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}

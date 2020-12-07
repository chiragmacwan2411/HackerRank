package com.ThomsonReutersTest;

public class Question3 {
    public static void main(String[] args) {
        RegularShift regularShift = new RegularShift();
        System.out.println(regularShift.calculate(10.0,8.0));

        NightShift nightShift = new NightShift();
        System.out.println(nightShift.calculate(10.0,8.0));
    }

    public Double calculate (Double amount, Double hours) {
        return amount * hours;
    }
}
class RegularShift extends Question3{
    @Override
    public Double calculate(Double amount, Double hours) {
        return super.calculate(amount, hours);
    }
}
class NightShift extends Question3{
    @Override
    public Double calculate(Double amount, Double hours) {
        return super.calculate((amount + (amount/2)), hours);
    }
}
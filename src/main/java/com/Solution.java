package com;

public class Solution {

    public static double getFunction(Double x) {
        return x * x - 2;
    }

    public static double minDifficulty() {
        double left = 0.0;
        double right = 2.0;
        double mid = 1.0;
        while (right -left > 1.0e-10) {
            double leftValue = getFunction(left);
            double rightValue = getFunction(right);
            double middleValue = getFunction(mid);
            if (leftValue * middleValue < 0) {
                right = mid;
                mid = (left + right) / 2;
            } else if (middleValue * rightValue < 0) {
                left = mid;
                mid = (left + right) / 2;
            } else if (leftValue == 0) {
                return left;
            } else if (middleValue == 0) {
                return mid;
            } else if (rightValue == 0) {
                return right;
            }

        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(minDifficulty());
        System.out.println(Math.sqrt(2));
    }

}

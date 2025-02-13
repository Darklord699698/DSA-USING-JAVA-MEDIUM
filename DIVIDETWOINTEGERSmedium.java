class DIVIDETWOINTEGERSmedium {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }

        boolean isNegative=(dividend<0)^(divisor<0);

        long longDividend=Math.abs((long) dividend);
        long longDivisor=Math.abs((long) divisor);

        int result=0;
        while(longDividend>=longDivisor){
            long tempDivisor=longDivisor,multiple=1;
            
            while(longDividend>=(tempDivisor<<1)){
                tempDivisor <<=1;
                multiple <<=1;
            }
            longDividend -=tempDivisor;
            result +=multiple;
        }
        return isNegative ? -result : result;
    }
}
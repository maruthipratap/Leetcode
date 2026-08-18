class Solution {
    public int findNthDigit(int n) {
        long num = n;
        if(num<=9)return (int)num;
        if(num<=189){
            long q=(num-10)/2;
            long r=(num-10)%2;
            String s= String.valueOf(10+q);
            return s.charAt((int)r)-'0';
        }
        if(num<=2889){
            long q=(num-190)/3;
            long r=(num-190)%3;
            String s= String.valueOf(100+q);
            return s.charAt((int)r)-'0';
        }
        if(num<=38889){
            long q=(num-2890)/4;
            long r=(num-2890)%4;
            String s= String.valueOf(1000+q);
            return s.charAt((int)r)-'0';
        }
        if(num<=488889){
            long q=(num-38890)/5;
            long r=(num-38890)%5;
            String s= String.valueOf(10000+q);
            return s.charAt((int)r)-'0';
        }
        if(num<=5888889){
            long q=(num-488890)/6;
            long r=(num-488890)%6;
            String s= String.valueOf(100000+q);
            return s.charAt((int)r)-'0';
        }
        if(num<=68888889){
            long q=(num-5888890)/7;
            long r=(num-5888890)%7;
            String s= String.valueOf(1000000+q);
            return s.charAt((int)r)-'0';
        }
        if(num<=788888889){
            long q=(num-68888890)/8;
            long r=(num-68888890)%8;
            String s= String.valueOf(10000000+q);
            return s.charAt((int)r)-'0';
        }
        if(num<=8888888889L){
            long q=(num-788888890)/9;
            long r=(num-788888890)%9;
            String s= String.valueOf(100000000+q);
            return s.charAt((int)r)-'0';
        }
        long q=(num-8888888890L)/10;
        long r=(num-8888888890L)%10;
        String s= String.valueOf(1000000000+q);
        return s.charAt((int)r)-'0';
    }
}

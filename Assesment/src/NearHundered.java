class NearHundred {
    public static void main(String[] args) {
        NearHundred obj = new NearHundred();
        System.out.println(obj.nearHundred(93));
        System.out.println(obj.nearHundred(90));
        System.out.println(obj.nearHundred(89));
    }

    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);
    }
}
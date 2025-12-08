class Main {
    public static void main(String[] args) {
        int n = 5;
        printSeq(n);
    }
    public static void printSeq(int n){
        if(n == 0){
            return;
        }
        printSeq(n - 1);
        System.out.print(n + " ");
    }
}
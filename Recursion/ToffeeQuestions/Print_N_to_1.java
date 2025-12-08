class Main {
    public static void main(String[] args) {
        int n = 5;
        printSeq(n);
    }
    public static void printSeq(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");  
        printSeq(n - 1);
    }
}
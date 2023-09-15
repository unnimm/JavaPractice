package chapter7;

public class BookArray {
    public static void main(String[] args){
        //Book 인스턴스 주소 값을 담을 공간 5개를 생성하는 문장이다.
        Book[] library = new Book[5];

        for(int i =0; i < library.length;i++){
            System.out.println(library[i]);
        }
    }
}

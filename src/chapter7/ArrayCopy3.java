package chapter7;

//깊은 복사
public class ArrayCopy3 {
    public static void main(String[] args){
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산백", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤서");
        bookArray1[2] = new Book("인생을 어떻게 살 것인가", "유시민");

        //디폴트 생성자로 bookArray2 인스턴스 생성
        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();

        //bookArray2에 깊은 복사
        for (int i = 0; i<bookArray2.length; i++){
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        //bookArray2 값 출력
        for (int i = 0; i< bookArray2.length; i++){
            bookArray2[i].showBookInfo();
        }

        //bookArray1의 0번 인스턴스 값 변경
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("=========bookArray1===========");
        for (int i = 0; i< bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        System.out.println("=========bookArray2===========");
        for (int i = 0; i< bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
    }
}

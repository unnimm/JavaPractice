package chapter7;

public class CharArray {
    public static void main(String[]args){
        char[] alphabets = new char[26];
        char ch = 'A';

        //alphabets이라는 배열에 알파벳 추가하기
        for(int i = 0; i<alphabets.length;i++,ch++){
            alphabets[i] = ch;
        }

        //알파벳과 아스키코드를 동시에 출력하기
        for(int i =0;i<alphabets.length;i++){
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }
    }
}

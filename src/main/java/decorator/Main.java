package decorator;

import lombok.val;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static class container {
        long value1;
        String value2;
        //Constructor
        container(long value1, String value2) {
            this.value1 = value1;
            this.value2 = value2;
        }
    }
    static ArrayList<container> arr=new ArrayList<container>();
    private static long time = 0L;


    public static boolean check_in_arr(String request){
        for(container cont: arr){
            if(cont.value2.equals(request)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String current_line = sc.nextLine();
        while(!Objects.equals(current_line, "break")){
            if(check_in_arr(current_line)){
                for(container cont: arr){
                    if(cont.value2.equals(current_line)) {
                        System.out.println(cont.value2);
                        break;
                    }
                }
            } else{
                Document document = new SmartDocument(current_line);
                String parsed_doc = TimedDocument(document);
                CashedDocument(parsed_doc);
                System.out.println("Time is equal to " + time);

            }
            current_line = sc.nextLine();
        }
    }

    public static String TimedDocument(Document document) throws IOException {
        long start = System.currentTimeMillis();
        String result_doc = document.parse();
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        time = timeElapsed;
        return result_doc;
    }

    public static void CashedDocument(String document){
        System.out.println(document);
        arr.add(new container(time, document));
    }
}

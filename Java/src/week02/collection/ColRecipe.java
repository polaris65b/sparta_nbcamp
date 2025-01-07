package week02.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColRecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type : List/Set/Map");
        String type = sc.next();
        sc.nextLine();
        System.out.print("Title : ");
        String title = sc.nextLine();

        int i = 1;
        if(type.equals("List")){
            Queue<String> listRecipe = new LinkedList<>();
            String input = "";

            while(true){
                input = sc.nextLine();
                if(input.equals("끝")){
                    break;
                }
                listRecipe.add(input);
            }
            System.out.println("[List로 저장된 " + title +"]");
            while (!listRecipe.isEmpty()){
                System.out.print(i++ + ". ");
                System.out.println(listRecipe.poll());
            }
        } else if (type.equals("Set")) {
            System.out.println("hi");
        } else if (type.equals("Map")) {
            System.out.println("hi");
        }
    }
}
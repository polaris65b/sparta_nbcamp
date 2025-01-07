package week02.collection;

import java.util.*;

public class ColRecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type : List/Set/Map");
        String type = sc.next();
        sc.nextLine(); // sc.next()를 사용 후 nextLine()으로 버퍼 정리
        
        System.out.print("Title : ");
        String title = sc.nextLine();
        
        // 레시피 순서 인덱스 선언 & 초기화
        int i = 1;

        // List 선택시
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
                System.out.println(i++ + ". " + listRecipe.poll());
            }
        }
        // Set 선택시
        else if (type.equals("Set")) {
            Set<String> setRecipe = new HashSet<>();
            String input = "";

            while(true){
                input = sc.nextLine();
                if(input.equals("끝")){
                    break;
                }
                setRecipe.add(input);
            }
            System.out.println("[Set으로 저장된 " + title + "]");
            for(String order : setRecipe){
                System.out.println(i++ + ". " + order);
            }

        }
        // Map 선택시
        else if (type.equals("Map")) {
            Map<String, Integer> mapRecipe = new LinkedHashMap<>();
            String input = "";

            while(true){
                input = sc.nextLine();
                if(input.equals("끝"))
                    break;
                mapRecipe.put(input, i++);
            }
            i = 1; // 인덱스 초기화
            System.out.println("[Map으로 저장된 "+title+"]");
            for(String oder : mapRecipe.keySet()){
                int index = mapRecipe.get(oder);
                System.out.println(index + ". " + oder);
            }
        }
    }
}
// Map을 사용하는 이유 : Key, value를 사용하기 위함
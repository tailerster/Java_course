package Ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> added = new HashSet<>();
        String inp;
        int[] arr = new int[64];
        String[] litters = {"а", "е", "ё", "и", "о", "у", "э", "ю", "я", "ы"};
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        inp = scan.nextLine();
        Queue<String> toAdd = new ArrayDeque<>(Arrays.asList(inp.split(" ")));
        Queue<String> toComp = new ArrayDeque<>(Arrays.asList());
        Queue<String> toOther = new ArrayDeque<>(Arrays.asList());
        Queue<String> buffer = new ArrayDeque<>(Arrays.asList());
        inp = new String();
        while (!toAdd.isEmpty()) {
            inp = toAdd.poll();
            for (int j = 0; j < inp.length(); j++) {
                for (int k = 0; k < litters.length; k++) {
                    if (inp.toLowerCase().substring(j, j + 1).equals(litters[k])) {
                        if (arr[counter] == 0) {
                            toComp.add(inp.replaceFirst(inp.substring(j, j + 1), inp.substring(j, j + 1).toUpperCase()) + " ");
                        }
                        arr[counter]++;
                    }
                }
            }
            if (arr[counter] == 0) {
                toOther.add(inp + " ");
            }
            counter++;
        }

        int weight;
        int max, max_count = 0;
        weight = toComp.size() + toOther.size();
        while (0 < toComp.size()) {

            max = 1;
            for (int i = 0; i < weight; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                    max_count = i;
                }
            }
            arr[max_count] = 0;
            for (int i = 0; i < weight; i++) {
                if (arr[i] != 0 && i != max_count) {
                    toComp.add(toComp.poll());
                }
                if (i == max_count) {
                    buffer.add(toComp.poll());
                }
            }
            System.out.print(buffer.poll());
        }

        while (!toOther.isEmpty())
            System.out.print(toOther.poll());

    }
}
//афыа ывыфвавв счфчяса фывыа выфва цаф ф ввввв ассссc вф ыыыыы ф
//ЛРОПАор ола ароваР АолР АаР ОЛАОР аолр аол аролАро лАро Ар А АААОЛДроАЛДА  ораААОр ОАЛР АРл оР РЛОДА
//ммммм м м мм ае ммм муеа мммм мм м о ммммыа м
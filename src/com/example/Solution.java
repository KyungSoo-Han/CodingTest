package com.example;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int eventsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> events = IntStream.range(0, eventsCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Long> result = getNetProfit(events);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

        /*
         * Complete the 'getNetProfit' function below.
         *
         * The function is expected to return a LONG_INTEGER_ARRAY.
         * The function accepts STRING_ARRAY events as parameter.
         */

        public static List<Long> getNetProfit(List<String> events) {
            // Write your code here
            List<Item> items = new ArrayList<>();
            for (String event : events) {
                String[] s = event.split(" ");
                Item item;
                item = getItem(items, s);
                if(item == null){
                    item = new Item();
                    item.name = s[1];
                    item.qty = Integer.parseInt(s[2]);
                }

                for (String string : events) {
                    String[] strArr = string.split(" ");

                    if(string.contains("QUERY")){
                        //returnValues.add(e);
                    }else if(string.contains("BUY")){
                        item.qty += Integer.parseInt(strArr[2]);
                    }else if(string.contains("SELL")){
                        item.qty -= Integer.parseInt(strArr[2]);
                    }
                    else{
                        item.value = item.qty * Long.parseLong(strArr[2]);
                    }
                }

            }
            return null;
        }

    private static Item getItem(List<Item> items, String[] s) {
        Item item = null;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equals(s[1])) {
                item = items.get(i);
            }

        }
        return item;
    }

    static class Item{
            String name;
            int qty;

            Long value;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getQty() {
                return qty;
            }

            public void setQty(int qty) {
                this.qty = qty;
            }

            public Long getValue() {
                return value;
            }

            public void setValue(Long value) {
                this.value = value;
            }
        }
}

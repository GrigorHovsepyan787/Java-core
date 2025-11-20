package homework.fileAnalyzer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {

    static public Map<String, Integer> wordMap(String path) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        try (FileReader reader = new FileReader(path)) {

            int i;
            StringBuilder temp = new StringBuilder();
            while ((i = reader.read()) != -1) {
                if ((char) i == ' ') {
                    if (!map.containsKey(temp.toString().toLowerCase()) && !temp.isEmpty()) {
                        map.put(temp.toString(), 1);
                    } else if (map.containsKey(temp.toString().toLowerCase()) && !temp.isEmpty()) {
                        map.replace(temp.toString(), map.get(temp.toString().toLowerCase()) + 1);
                    }
                    temp.setLength(0);
                } else if ((char) i != 0) {
                    temp.append((char) i);
                }
            }
            if (!map.containsKey(temp.toString().toLowerCase()) && !temp.isEmpty()) {
                map.put(temp.toString(), 1);
            } else if (map.containsKey(temp.toString().toLowerCase()) && !temp.isEmpty()) {
                map.replace(temp.toString(), map.get(temp.toString().toLowerCase()) + 1);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Cannot find the file");
        }
        return map;
    }

    public static int totalWordCount(String path) throws IOException {
        int count = 0;
        Map<String, Integer> map = wordMap(path);
        for (Integer value : map.values()) {
            count += value;
        }
        return count;
    }

    public static int uniqueWordCount(String path) throws IOException {
        int count = 0;
        Map<String, Integer> map = wordMap(path);
        for (String s : map.keySet()) {
            if(map.get(s) == 1){
                count++;
            }
        }
        return count;
    }

    public static Map<Integer, String> topFrequentWords(String path, int n) throws IOException {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Map<String, Integer> map = wordMap(path);
        for (String s : map.keySet()) {
            treeMap.put(map.get(s), s);
        }
        for (int i = 0; i < treeMap.size()-n; i++) {
            treeMap.remove(treeMap.firstKey());
        }
        return treeMap.reversed();
    }

    public static int countWordOccurrences(String path, String word) throws IOException {
        int count = 0;
        Map<String, Integer> map = wordMap(path);
        for (String s : map.keySet()) {
            if(s.equals(word.toLowerCase())){
                count += map.get(s);
            }
        }
        return count;
    }

}

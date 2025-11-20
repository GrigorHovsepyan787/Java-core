package homework.fileAnalyzer;

import java.io.IOException;

public class FileAnalyzerDemo {
    public static void main(String[] args) throws IOException {
        String path = "File path";
        System.out.println(FileAnalyzer.wordMap(path));
        System.out.println(FileAnalyzer.totalWordCount(path));
        System.out.println(FileAnalyzer.topFrequentWords(path, 5));
        System.out.println(FileAnalyzer.countWordOccurrences(path, "Book"));
        System.out.println(FileAnalyzer.uniqueWordCount(path));
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        filterExample();
        mapExample();
        sortedExample();
        collectExample();
        reduceExample();
        flatMapExample();
    }

    // 1. filter - 过滤元素
    public static void filterExample() {
        System.out.println("=== Filter示例 ===");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");
        
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("C"))
                .collect(Collectors.toList());
        
        System.out.println("以A或C开头的名字: " + filtered);
    }

    // 2. map - 转换元素
    public static void mapExample() {
        System.out.println("\n=== Map示例 ===");
        List<String> names = Arrays.asList("alice", "bob", "charlie");
        
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
        System.out.println("转换为大写: " + upperCaseNames);
        
        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        
        System.out.println("名字长度: " + lengths);
    }

    // 3. sorted - 排序
    public static void sortedExample() {
        System.out.println("\n=== Sorted示例 ===");
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7);
        
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println("自然排序: " + sorted);
        
        List<Integer> reverseSorted = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        System.out.println("降序排序: " + reverseSorted);
    }

    // 4. collect - 收集结果
    public static void collectExample() {
        System.out.println("\n=== Collect示例 ===");
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        Set<String> nameSet = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toSet());
        
        System.out.println("长度大于3的名字集合: " + nameSet);
        
        String joined = names.stream()
                .collect(Collectors.joining(", "));
        
        System.out.println("连接字符串: " + joined);
        
        Map<String, Integer> nameLengthMap = names.stream()
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));
        
        System.out.println("名字长度映射: " + nameLengthMap);
    }

    // 5. reduce - 归约操作
    public static void reduceExample() {
        System.out.println("\n=== Reduce示例 ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a + b);
        
        System.out.println("求和: " + sum.orElse(0));
        
        Integer product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        
        System.out.println("求积: " + product);
        
        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);
        
        System.out.println("最大值: " + max.orElse(0));
    }

    // 6. flatMap - 扁平化
    public static void flatMapExample() {
        System.out.println("\n=== FlatMap示例 ===");
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "grape"),
                Arrays.asList("watermelon", "pear")
        );
        
        List<String> flattened = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        
        System.out.println("扁平化列表: " + flattened);
        
        String sentence = "Hello World Java Stream";
        List<String> words = Arrays.stream(sentence.split(" "))
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .map(String::toLowerCase)
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println("去重并排序的字符: " + words);
    }
}

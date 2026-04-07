import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class LambdaDemo {
    public static void main(String[] args) {
        noParameterExample();
        singleParameterExample();
        multipleParametersExample();
        withCodeBlockExample();
        functionalInterfaceExample();
        closureExample();
    }

    // 1. 无参数的Lambda表达式
    public static void noParameterExample() {
        System.out.println("=== 无参数Lambda ===");
        
        Runnable runnable = () -> System.out.println("Hello from Lambda!");
        runnable.run();
        
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }

    // 2. 单个参数的Lambda表达式
    public static void singleParameterExample() {
        System.out.println("\n=== 单参数Lambda ===");
        
        Consumer<String> consumer = (s) -> System.out.println("Received: " + s);
        consumer.accept("Hello");
        
        Consumer<String> consumer2 = s -> System.out.println("Received: " + s);
        consumer2.accept("World");
        
        Function<String, Integer> function = s -> s.length();
        System.out.println("Length: " + function.apply("Lambda"));
    }

    // 3. 多个参数的Lambda表达式
    public static void multipleParametersExample() {
        System.out.println("\n=== 多参数Lambda ===");
        
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("5 + 3 = " + add.apply(5, 3));
        
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println("4 * 7 = " + multiply.apply(4, 7));
        
        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        numbers.sort(comparator);
        System.out.println("排序后: " + numbers);
    }

    // 4. 带代码块的Lambda表达式
    public static void withCodeBlockExample() {
        System.out.println("\n=== 代码块Lambda ===");
        
        Consumer<List<String>> listPrinter = (list) -> {
            System.out.println("列表内容:");
            for (String item : list) {
                System.out.println("  - " + item);
            }
            System.out.println("共 " + list.size() + " 个元素");
        };
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        listPrinter.accept(names);
        
        Function<Integer, String> gradeCalculator = (score) -> {
            if (score >= 90) {
                return "A";
            } else if (score >= 80) {
                return "B";
            } else if (score >= 70) {
                return "C";
            } else if (score >= 60) {
                return "D";
            } else {
                return "F";
            }
        };
        
        System.out.println("分数85的等级: " + gradeCalculator.apply(85));
    }

    // 5. 函数式接口中的Lambda
    public static void functionalInterfaceExample() {
        System.out.println("\n=== 函数式接口Lambda ===");
        
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("10是偶数吗? " + isEven.test(10));
        System.out.println("7是偶数吗? " + isEven.test(7));
        
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println("5的平方: " + square.apply(5));
        
        BinaryOperator<String> concat = (s1, s2) -> s1 + " " + s2;
        System.out.println("连接字符串: " + concat.apply("Hello", "World"));
        
        List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry");
        words.stream()
                .filter(w -> w.startsWith("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    // 6. Lambda闭包示例
    public static void closureExample() {
        System.out.println("\n=== Lambda闭包 ===");
        
        String prefix = "Hello";
        Function<String, String> greeter = name -> prefix + ", " + name + "!";
        System.out.println(greeter.apply("Alice"));
        System.out.println(greeter.apply("Bob"));
        
        int multiplier = 10;
        IntUnaryOperator operation = n -> n * multiplier;
        System.out.println("5 * 10 = " + operation.applyAsInt(5));
        System.out.println("8 * 10 = " + operation.applyAsInt(8));
    }
}

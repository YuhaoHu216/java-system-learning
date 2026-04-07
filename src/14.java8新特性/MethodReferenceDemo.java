import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        staticMethodReference();
        instanceMethodReference();
        constructorReference();
        arbitraryObjectMethodReference();
    }

    // 1. 静态方法引用 - ClassName::staticMethod
    public static void staticMethodReference() {
        System.out.println("=== 静态方法引用 ===");
        
        Function<Double, Double> sqrt = Math::sqrt;
        System.out.println("Math::sqrt(16) = " + sqrt.apply(16.0));
        
        Function<Integer, String> toBinary = Integer::toBinaryString;
        System.out.println("Integer::toBinaryString(10) = " + toBinary.apply(10));
        
        BiFunction<String, String, Integer> compare = String::compareToIgnoreCase;
        System.out.println("String::compareToIgnoreCase(\"ABC\", \"abc\") = " + 
                compare.apply("ABC", "abc"));
    }

    // 2. 实例方法引用 - object::instanceMethod
    public static void instanceMethodReference() {
        System.out.println("\n=== 实例方法引用 ===");
        
        String prefix = "Hello";
        Supplier<String> supplier = prefix::toUpperCase;
        System.out.println("prefix::toUpperCase() = " + supplier.get());
        
        Consumer<String> printer = System.out::println;
        System.out.print("System.out::println: ");
        printer.accept("Hello Method Reference!");
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::print);
        System.out.println();
    }

    // 3. 构造方法引用 - ClassName::new
    public static void constructorReference() {
        System.out.println("\n=== 构造方法引用 ===");
        
        Supplier<StringBuilder> sbSupplier = StringBuilder::new;
        StringBuilder sb = sbSupplier.get();
        sb.append("Hello");
        System.out.println("StringBuilder::new: " + sb.toString());
        
        Function<String, Thread> threadFactory = Thread::new;
        Thread thread = threadFactory.apply("MyThread");
        System.out.println("Thread::new 创建线程: " + thread.getName());
        
        Function<Integer, int[]> arrayFactory = int[]::new;
        int[] array = arrayFactory.apply(5);
        System.out.println("int[]::new 创建数组长度: " + array.length);
    }

    // 4. 任意对象的实例方法引用 - ClassName::instanceMethod
    public static void arbitraryObjectMethodReference() {
        System.out.println("\n=== 任意对象的实例方法引用 ===");
        
        List<String> names = Arrays.asList("alice", "BOB", "Charlie", "david");
        
        names.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
        
        names.stream()
                .sorted(String::compareToIgnoreCase)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
        
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        numbers.stream()
                .sorted(Integer::compare)
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}

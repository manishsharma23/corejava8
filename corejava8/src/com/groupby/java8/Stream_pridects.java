package com.groupby.java8;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_pridects {
	public static void main(String[] args) {
		predicateWithInteger();
		System.out.println("==================================================");
		predicateWithDateType();
	}

	@SuppressWarnings("unchecked")
	public static void predicateWithDateType() {
		Stream<Object> streamString = Stream.of(1, "2", 3, 4, 5.88d, 6, 7.90f, 8, 9, 0, "Manish");
		Predicate<? super Object> isString = i -> i instanceof String == true;
		Predicate<? super Object> isFloat = i -> i instanceof Float == true;
		Predicate<? super Object> isInteger = i -> i instanceof Integer == true;
		Predicate<? super Object> isDouble = i -> i instanceof Double == true;
		List stringList = new LinkedList<String>();
		List floatList = new LinkedList<Float>();
		List integerList = new LinkedList<Integer>();
		List doubleList = new LinkedList<Double>();
		Consumer<Object> strm = classifyDataType(isString, stringList::add)
				.andThen(classifyDataType(isFloat, floatList::add)).andThen(classify(isInteger, integerList::add))
				.andThen(classify(isDouble, doubleList::add));
		streamString.forEach(strm);
		System.out.println("String type ::>> " + stringList);
		System.out.println("Float type ::>> " + floatList);
		System.out.println("Integer type ::>> " + integerList);
		System.out.println("Doule data type ::>>" + doubleList);
	}

	public static void predicateWithInteger() {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		Set<Integer> set1 = new LinkedHashSet<>();
		Set<Integer> set2 = new LinkedHashSet<>();
		Set<Integer> set3 = new LinkedHashSet<>();
		// Here's the composed consumer, made of inner consumers
		Consumer<Integer> multiClassifier = classify(n -> n % 2 == 0, set1::add)
				.andThen(classify(n -> n % 3 == 0, set2::add)).andThen(classify(n -> n % 5 == 0, set3::add));
		// Here the stream is consumed by the composed consumer
		stream.forEach(multiClassifier);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}

	public static <T> Consumer<T> classify(Predicate<T> predicate, Consumer<T> action) {
		return elem -> Stream.of(elem).filter(predicate).findAny().ifPresent(action);
	}

	public static <T> Consumer<T> classifyDataType(Predicate<Object> predicate, Consumer<Object> action) {
		return elem -> Stream.of(elem).filter(predicate).findAny().ifPresent(action);
	}
}
```yaml
title: JDK8 跟闰年有关的问题
author: samin
date: 2021-06-10
```

# 背景

Java8 提供了非常便利的时间类

# 题目

用 `LocalDate` 声明 2020年2月29 的时间实例，加一年和减一年的时间分别是哪天，会报错吗 ？

# 参考答案

```java
LocalDate date=LocalDate.of(2020,2,29);
// 2021-02-28
System.out.println(date.plus(1,ChronoUnit.YEARS));
// 2019-02-28
System.out.println(date.minus(1,ChronoUnit.YEARS));
```
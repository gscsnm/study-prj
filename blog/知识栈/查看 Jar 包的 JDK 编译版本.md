```yaml
title: 查看 Jar 包的 JDK 编译版本 
author: samin
date: 2021-08-12
```

# 背景

项目引入 Jar 包，用 IDEA 编译报错 “类文件具有错误的版本 xx.0，应为 xx.0”

这是因为项目和引用的 Jar 包编译 JDK 版本不一致所导致

Java major版本号列表

| Java 版本 | major version |
|---|---|
| Java 1.2 | 46 |
| Java 1.3 | 47 |
| Java 1.4 | 48 |
| Java 5 | 49 |
| Java 6 | 50 |
| Java 7 | 51 |
| Java 8 | 52 |
| Java 9 | 53 |
| Java 10 | 54 |
| Java 11 | 55 |

# 查看 Jar 包 JDK 编译版本方法

1. 解压 Jar 包

2. 使用 javap 工具查看类信息

- Linux: javap -v Myclass.class | grep "major"

- Windows: javap -v Myclass.class | findstr "major"
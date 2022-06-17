/**
 * 1.在 JDK 9 之前，Java 程序会依赖整个 Java 库。这意味着即使最简单的程序也带有大量从未使用过的库代码。
 * 如果你使用了组件 A，那么 Java 语言没有提供任何支持来告诉编译器，组件 A 依赖了哪些组件。如果没有这些信息，编译器唯一能做的就是将整个 Java 库包含在内。
 * 2.还有一个更重要的问题。尽管包访问似乎提供了有效的隐藏，使类不能在该包外使用，但还是可以使用反射来规避它。
 * 多年来，一些 Java 程序员一直在访问部分底层的 Java 库组件，而这些组件从未打算要被外部直接使用。这些程序员的代码与隐藏的组件耦合了起来。
 * 这意味着 Java 库设计者无法在不破坏用户代码的情况下修改这些组件，这极大地阻碍了 Java 库的改进。
 * <p>
 * JDK 9 最终引入了模块（module），它解决了上述两个问题。
 * Java 库设计者现在可以将代码清晰地划分为模块，这些模块以编程的方式指定它们所依赖的每个模块，并定义导出哪些组件以及哪些组件完全不可用。
 * <p>
 * JDK 9 的 Jigsaw 项目将 JDK 库拆分为一百多个平台模块。现在，当使用库组件时，你仅会获得该组件的模块及其依赖项，不会有不使用的模块。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/25 22:57
 */
package jdk9;
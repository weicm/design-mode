# 概念
- 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可以将对象恢复到原先保存的状态。

# 使用场景
- 备忘录模式比较适用于功能比较复杂的，但需要维护或记录属性历史的类，或者需要保存的属性只是众多属性中的一小部分的场景

# 优点
- 解耦合，把要保存的状态封装在了 Memento 中，如果对保存状态的行为进行修改，不至于影响客户端代码
- 方便有状态操作的状态恢复和保存
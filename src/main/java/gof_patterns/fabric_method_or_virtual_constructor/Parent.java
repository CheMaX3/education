package gof_patterns.fabric_method_or_virtual_constructor;
/*
Решает проблему выбора какой из подклассов инстанциировать в RunTime.
 */
public class Parent {
    int childId = 1;
    public Parent createParent(int childId) {
        if (childId == 1) {
            return new Child1();
        } else {
            return new Child2();
        }
    }
}

package graphite.impl.module.combat;

import graphite.api.module.Module;
import graphite.api.module.util.Category;
import graphite.api.module.util.ModuleInfo;
import graphite.api.property.impl.DoubleProperty;
import graphite.api.property.impl.Representation;

@ModuleInfo(name = "TestModule2", category = Category.Combat)
public class TestModule2 extends Module {
    private final DoubleProperty double_prop1 = new DoubleProperty("Slider Test 1", 150, 1.0, 450, 1);
    private final DoubleProperty double_prop2 = new DoubleProperty("Slider Test 2", 180, 5.0, 360, 5, Representation.DEGREES);
    private final DoubleProperty double_prop3 = new DoubleProperty("Slider Test 3", 50, 1.0, 100, 1, Representation.PERCENTAGE);

    public TestModule2() {
        this.register(
                double_prop1, double_prop2, double_prop3
        );
    }
}

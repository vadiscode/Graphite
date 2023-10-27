package graphite.impl.module.combat;

import graphite.api.module.Module;
import graphite.api.module.util.Category;
import graphite.api.module.util.ModuleInfo;
import graphite.api.property.impl.*;

import java.awt.*;
import java.util.Arrays;

@ModuleInfo(name = "TestModule1", category = Category.Combat)
public class TestModule1 extends Module {
    private final MultiSelectionEnumProperty<TEST1> multiSelectionEnum_prop1 = new MultiSelectionEnumProperty<>("Multi Select Test 1", Arrays.asList(TEST1.ELEMENT1, TEST1.ELEMENT2), TEST1.values());
    private final MultiSelectionEnumProperty<TEST2> multiSelectionEnum_prop2 = new MultiSelectionEnumProperty<>("Multi Select Test 2", Arrays.asList(TEST2.ELEMENT1, TEST2.ELEMENT2, TEST2.ELEMENT3, TEST2.ELEMENT4), TEST2.values());
    private final EnumProperty<TEST3> enum_prop1 = new EnumProperty<>("Enum Test 1", TEST3.ELEMENT1);
    private final BooleanProperty boolean_prop1 = new BooleanProperty("Bool Test 1", true);
    private final BooleanProperty boolean_prop2 = new BooleanProperty("Bool Test 2", false);
    private final ColourProperty colour_prop1 = new ColourProperty("Colour Test 1", new Color(108, 224, 0).getRGB());

    public TestModule1() {
        this.register(
                multiSelectionEnum_prop1, multiSelectionEnum_prop2,
                enum_prop1,
                boolean_prop1, boolean_prop2,
                colour_prop1
        );
    }

    private enum TEST1 {
        ELEMENT1("Element 1"),
        ELEMENT2("Element 2"),
        ELEMENT3("Element 3"),
        ELEMENT4("Element 4"),
        ELEMENT5("Element 5");

        private final String name;

        TEST1(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    private enum TEST2 {
        ELEMENT1("Element 1"),
        ELEMENT2("Element 2"),
        ELEMENT3("Element 3"),
        ELEMENT4("Element 4");

        private final String name;

        TEST2(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    private enum TEST3 {
        ELEMENT1("Element 1"),
        ELEMENT2("Element 2");

        private final String name;

        TEST3(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}

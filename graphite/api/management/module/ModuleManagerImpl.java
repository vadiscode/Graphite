package graphite.api.management.module;

import graphite.api.event.Listen;
import graphite.api.module.Module;
import graphite.impl.Graphite;
import graphite.impl.event.game.KeyPressEvent;
import graphite.impl.module.combat.TestModule1;
import graphite.impl.module.combat.TestModule2;
import graphite.impl.module.combat.TestModule3;
import graphite.impl.module.combat.TestModule4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ModuleManagerImpl implements ModuleManager {
    private final List<Module> registered = new ArrayList<>();

    public ModuleManagerImpl() {
        this.register(new TestModule1());
        this.register(new TestModule2());
        this.register(new TestModule3());
        this.register(new TestModule4());


        // subscribing mod man for keypress event //
        Graphite.INSTANCE.getEventBus().subscribe(this);
    }

    @Listen
    public void onKeyPress(KeyPressEvent event) {
        this.getModules().forEach(m -> {
            if (m.getKey() == event.getKeyPressed())
                m.toggle();
        });
    }

    @Override
    public <T extends Module> void register(T module) {
        this.registered.add(module);
    }

    @Override
    public Collection<Module> getModules() {
        return this.registered;
    }
}

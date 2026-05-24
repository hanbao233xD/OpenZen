package sh1t.ze.manager;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import sh1t.ze.ClientBase;
import sh1t.ze.ZenClient;
import sh1t.ze.event.impl.KeyEvent;
import sh1t.ze.exception.ModuleNotFoundException;
import sh1t.ze.modules.Category;
import sh1t.ze.modules.Module;
import sh1t.ze.modules.impl.combat.AntiBots;
import sh1t.ze.modules.impl.combat.AntiFireball;
import sh1t.ze.modules.impl.combat.AntiKB;
import sh1t.ze.modules.impl.combat.AutoOffHand;
import sh1t.ze.modules.impl.combat.AutoSoup;
import sh1t.ze.modules.impl.combat.AutoThrow;
import sh1t.ze.modules.impl.combat.Backtrack;
import sh1t.ze.modules.impl.combat.Critical;
import sh1t.ze.modules.impl.combat.CrystalAura;
import sh1t.ze.modules.impl.combat.KillAura;
import sh1t.ze.modules.impl.exploit.Disabler;
import sh1t.ze.modules.impl.exploit.FastPlace;
import sh1t.ze.modules.impl.misc.AimAssist;
import sh1t.ze.modules.impl.misc.AutoClicker;
import sh1t.ze.modules.impl.misc.AutoRod;
import sh1t.ze.modules.impl.misc.SafeWalk;
import sh1t.ze.modules.impl.movement.CollisionSpeed;
import sh1t.ze.modules.impl.movement.NoSlow;
import sh1t.ze.modules.impl.movement.FastWeb;
import sh1t.ze.modules.impl.movement.FireballBlink;
import sh1t.ze.modules.impl.movement.Fly;
import sh1t.ze.modules.impl.movement.GuiMove;
import sh1t.ze.modules.impl.movement.HighJump;
import sh1t.ze.modules.impl.movement.NoDelay;
import sh1t.ze.modules.impl.movement.NoPush;
import sh1t.ze.modules.impl.movement.Scaffold;
import sh1t.ze.modules.impl.movement.Sprint;
import sh1t.ze.modules.impl.movement.TargetStrafe;
import sh1t.ze.modules.impl.player.AntiTNT;
import sh1t.ze.modules.impl.player.AntiVoid;
import sh1t.ze.modules.impl.player.AntiWeb;
import sh1t.ze.modules.impl.player.AutoMLG;
import sh1t.ze.modules.impl.player.AutoWebPlace;
import sh1t.ze.modules.impl.player.ChestStealer;
import sh1t.ze.modules.impl.player.GhostHand;
import sh1t.ze.modules.impl.player.Helper;
import sh1t.ze.modules.impl.player.InventoryManager;
import sh1t.ze.modules.impl.player.MidPearl;
import sh1t.ze.modules.impl.player.NoFall;
import sh1t.ze.modules.impl.player.Stuck;
import sh1t.ze.modules.impl.render.AspectRatio;
import sh1t.ze.modules.impl.render.ChestESP;
import sh1t.ze.modules.impl.render.ClickGuiModule;
import sh1t.ze.modules.impl.render.Compass;
import sh1t.ze.modules.impl.render.DamageGlow;
import sh1t.ze.modules.impl.render.ESP;
import sh1t.ze.modules.impl.render.FullBright;
import sh1t.ze.modules.impl.render.Interface;
import sh1t.ze.modules.impl.render.ItemTags;
import sh1t.ze.modules.impl.render.NameProtect;
import sh1t.ze.modules.impl.render.NameTags;
import sh1t.ze.modules.impl.render.NoHurtCam;
import sh1t.ze.modules.impl.render.OldHitting;
import sh1t.ze.modules.impl.render.Projectiles;
import sh1t.ze.modules.impl.render.Watermark;
import sh1t.ze.modules.impl.render.XRay;
import sh1t.ze.modules.impl.world.AntiStaff;
import sh1t.ze.modules.impl.world.AutoPlay;
import sh1t.ze.modules.impl.world.AutoTools;
import sh1t.ze.modules.impl.world.Debugger;
import sh1t.ze.modules.impl.world.Teams;
import sh1t.ze.modules.impl.world.WebUI;
import sh1t.ze.event.EventTarget;

public class ModuleManager extends ClientBase {
    private final Map<String, Module> moduleMap = new ConcurrentHashMap<>();

    public ModuleManager() {
        ZenClient.getInstance().getEventBus().register(this);
    }

    public void initModules() {
        this.register(new AntiBots());
        this.register(new AntiFireball());
        this.register(new AntiKB());
        this.register(new AutoOffHand());
        this.register(new AutoSoup());
        this.register(new AutoThrow());
        this.register(new Backtrack());
        this.register(new Critical());
        this.register(new CrystalAura());
        this.register(new KillAura());

        this.register(new Disabler());
        this.register(new FastPlace());

        this.register(new AimAssist());
        this.register(new AutoClicker());
        this.register(new AutoRod());
        this.register(new SafeWalk());

        this.register(new CollisionSpeed());
        this.register(new NoSlow());
        this.register(new FastWeb());
        this.register(new FireballBlink());
        this.register(new Fly());
        this.register(new GuiMove());
        this.register(new HighJump());
        this.register(new NoDelay());
        this.register(new NoPush());
        this.register(new Scaffold());
        this.register(new Sprint());
        this.register(new TargetStrafe());

        this.register(new AntiTNT());
        this.register(new AntiVoid());
        this.register(new AntiWeb());
        this.register(new AutoMLG());
        this.register(new AutoWebPlace());
        this.register(new ChestStealer());
        this.register(new GhostHand());
        this.register(new Helper());
        this.register(new InventoryManager());
        this.register(new MidPearl());
        this.register(new NoFall());
        this.register(new Stuck());

        this.register(new AspectRatio());
        this.register(new ChestESP());
        this.register(new ClickGuiModule());
        this.register(new Compass());
        this.register(new DamageGlow());
        this.register(new ESP());
        this.register(new FullBright());
        this.register(new Interface());
        this.register(new ItemTags());
        this.register(new NameProtect());
        this.register(new NameTags());
        this.register(new NoHurtCam());
        this.register(new OldHitting());
        this.register(new Projectiles());
        this.register(new Watermark());
        this.register(new XRay());

        this.register(new AntiStaff());
        this.register(new AutoPlay());
        this.register(new AutoTools());
        this.register(new Debugger());
        this.register(new Teams());
        this.register(new WebUI());
    }

    public void register(Module module) {
        this.moduleMap.put(module.getClass().getSimpleName(), module);
        module.registerSettings();
    }

    public Module getModule(String string) {
        Module module = null;
        for (Module module2 : this.moduleMap.values()) {
            if (!StringUtils.replace(module2.getName(), " ", "").equalsIgnoreCase(string)) continue;
            module = module2;
        }
        if (module == null) {
            throw new ModuleNotFoundException();
        }
        return module;
    }

    public <T extends Module> T getModule(Class<T> clazz) {
        Module module = clazz.cast(this.moduleMap.get(clazz.getSimpleName()));
        if (module == null) {
            throw new ModuleNotFoundException();
        }
        return (T) module;
    }

    public List<Module> getModules() {
        return this.moduleMap.values().stream().toList();
    }

    public List<Module> getModulesByCategory(Category category) {
        return this.moduleMap.values().stream()
                .filter(module -> module.getCategory().equals(category))
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());
    }

    @EventTarget
    public void onKey(KeyEvent event) {
        if (mc.screen == null) {
            for (Module module : this.moduleMap.values()) {
                if (module.getKey() != 0 && module.getKey() == event.getKeyCode() && event.isPressed()) {
                    module.toggle();
                }
            }
        }
    }
}

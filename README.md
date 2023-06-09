<div align="center">
    <img src="https://raw.githubusercontent.com/micartey/Cardinal-Anticheat/master/images/banner.png" />
</div>

<br />

<div align="center">
    <img
        src="https://img.shields.io/badge/Written%20in-java-%23EF4041?style=for-the-badge"
        height="30"
    />
    <a href="https://discord.gg/fxTn7v8">
        <img 
            src="https://img.shields.io/discord/647922123192533022?color=212121&label=Discord&logo=discord&logoColor=212121&style=for-the-badge"
            height="30"
        />
    </a>
    <a href="https://cardinalanticheat.github.io/addon-api/docs" target="_blank">
        <img
            src="https://img.shields.io/badge/javadoc-reference-5272B4.svg?style=for-the-badge"
            height="30"
        />
    </a>
</div>

## Addons

To get started, add this repository to your dependencies using [Jitpack.io](https://jitpack.io/#cardinalanticheat/addon-api/master-SNAPSHOT).
Make sure to **NOT** export the source into your addon but use *compileOnly* for gradle and *provided* for maven.

1. After adding the addon api as a dependency, start by implementing `Addon`.
 
```java
import me.clientastisch.extension.Extension;
import me.clientastisch.extension.impl.Addon;

public class Core implements Addon {

    @Override
    public void onEnable() throws Exception {

    }

    @Override
    public void onDisable() throws Exception {

    }
}
```

2. Unlike spigot, a file called `addon.json` must be created like following:

```json
{
  "name": "MyAwesomeAddon",
  "author": "Me",
  "main": "my.path.to.Core",
  "version": "v1.0"
}
```

3. Export your addon to `plugins//CAC//addons`
4. Reload your server or use `/cac addon load <addon>` and you're done!

### Events

As you already know, you have to implement `Listener` in a class you want to use BukkitEvents. In case you also want to use the build-in [**events**](https://cardinalanticheat.github.io/addon-api/docs/me/clientastisch/events/event/Event.html) of the Cardinal-Anticheat you have to implement `EventListener`. That's because Cardinal-Anticheat has an entire different event-system. It's possible to use BukkitEvents and CardinalEvents in the same class by implementing both classes.

```java
import me.clientastisch.extension.impl.event.EventListener;
import me.clientastisch.events.EventManager;

public class MyWonderfulEvent implements EventListener {

}
```

The next difference is the `@EventHandler` which isn't used for CardinalEvents. Cardinal-Anticheat uses the annotation `@EventManager.Target` above methods:

```java
@Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(ElementType.METHOD)
public static @interface Target {

    boolean isSmart() default true;

    boolean isSync() default false;

    int sleep() default 0;
}
```

As you may have already noticed, there're some additional options which you don't have with the BukkitEvents.
First things first, if `isSmart` is enabled methods which have already throwen an expcetion won't be invoked anymore. `isSync` invokes the method either asynchronous or synchronous to the event call. In case `isSync = false` you have the possibility to call the method in a delay by changing `delay`.

```java
@EventManager.Target(isSync = true)
public void onFlag(CheckFireEvent event) {
    event.cancelled();
}
```

Keep in mind, that asynchronous events **cannot** be `cancelled`. Therefore set `isSync` to `true`.

### Commands

To handle commands you have to implement `Command`

```java
public interface Command {

    boolean execute(CommandSender sender, String command, String[] arguments, String raw);

}
```

In case your command matches `return true`



### Register events and commands

You can register events and commands by accessing `Extension`.

```java
import me.clientastisch.extension.Extension;
import me.clientastisch.extension.impl.Addon;

public class Core implements Addon {

    @Override
    public void onEnable() throws Exception {
        Extension.registerListener(this, new MyWonderfulEvent());
        Extension.registerCommand(this, new MyWonderfulCommand());
    }

    @Override
    public void onDisable() throws Exception {

    }
}
```

## Dialects

A dialect is used to abstract the database handling by loading the dialect in form of an addon. Creating your own dialect secures the data usage and guarantees the protection of sensitive data, since Cardinal has neither access to the connection nor to any credentials which are typically required. In addition, this gives you the opportunity to migrate to any form of database you desire.

### Creating a dialect

Creating a dialect requires the implementation of `PunishDialect` and/or `ViolationDialect`. Both of the interfaces are generating required methods for their usage.

### Register a dialect

Registering a dialect is similar to any other event or command you're trying to register. Therefore you need to get the static reference of `Extension` and call the method `registerDialect` with the required arguments.

```java
import me.clientastisch.extension.Extension;
import me.clientastisch.extension.impl.Addon;

public class Core implements Addon {

    @Override
    public void onEnable() throws Exception {
        Extension.registerDialect(this, new Punishment());
        Extension.registerDialect(this, new Violation());
    }

    @Override
    public void onDisable() throws Exception {

    }
}
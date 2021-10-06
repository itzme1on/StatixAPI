package org.statix.bukkit.protocollib.entity;

public enum FakeEntityScope {

    /**
     * Существо с данной видимостью будет
     * виден всем игрокам в сети, и даже новым,
     * таким образом его не нужно будет спавнить
     * вручную, создавая новые объекты
     */
    PUBLIC,

    /**
     * Существо с прототипной видимостью
     * необходимо спавнить вручную, самостоятельно
     * он устанавливаться никому не будет :(
     */
    PRIVATE,

    ;
}

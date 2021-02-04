package com.ex.test;


import java.util.EnumSet;
import java.util.Set;

public abstract class Member {
    public enum Weapon { SWORD, WAND, SHIELD, BOW, GUN}
    final Set<Weapon> weapons;

    public int b;

    protected void some(){};

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Weapon> weapons = EnumSet.noneOf(Weapon.class);
        public T addWeapon(Weapon weapon) {
            weapons.add(weapon);
            return self();
        }
        abstract Member build();

        protected abstract T self();
    }

    Member(Builder<?> builder) {
        weapons = builder.weapons.clone();
    }
}

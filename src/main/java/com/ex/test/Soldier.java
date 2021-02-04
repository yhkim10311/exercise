package com.ex.test;

public class Soldier extends Member{
    public enum Rank {GENERAL, SERGEANT, COLONEL, LIEUTENANT}
    private final Rank rank;

    public static class Builder extends Member.Builder<Builder> {
        private final Rank rank;

        public Builder(Rank rank){
            this.rank = rank;
        }

        @Override
        public Member build() {
            return new Soldier(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Soldier(Builder builder){
        super(builder);
        rank = builder.rank;
    }

    @Override
    protected void some(){
        
    }
}

package Pizzaria;

public class Calzone extends Pizza{
    private final boolean sauceInclude;
    public static class Builder extends Pizza.Builder<Builder>{
        private  boolean sauceInside = false;
        public Builder sauceInside(){
            sauceInside = true;
            return this;
        }
        @Override public Calzone build(){
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
    private Calzone(Builder builder){
        super(builder);
        sauceInclude = builder.sauceInside;
    }
}

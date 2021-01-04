package _37UseEnumMapInsteadOfOrdinalIndexing;

public class Plant {
    enum LifeCycle {ANNUAL,PERENNIAL,BIENNIAL};
    public final String name;
    public final LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return  name ;
    }
}

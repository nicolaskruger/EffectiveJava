package _37UseEnumMapInsteadOfOrdinalIndexing;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class main37 {
    public static void ex01(){
        List<Plant> garden = Arrays.asList(new Plant("orquidea", Plant.LifeCycle.ANNUAL),
                new Plant("coqueiro",Plant.LifeCycle.BIENNIAL));
        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle =
                new EnumMap<Plant.LifeCycle, Set<Plant>>(Plant.LifeCycle.class);
        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());
        for (Plant p : garden)
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        System.out.println(plantsByLifeCycle);
    }
    public static void ex02(){
//        List<Plant> garden = Arrays.asList(new Plant("orquidea", Plant.LifeCycle.ANNUAL),
//                new Plant("coqueiro",Plant.LifeCycle.BIENNIAL));

        Plant[] garden = new Plant[]{
                new Plant("orquidea", Plant.LifeCycle.ANNUAL),
                new Plant("coqueiro",Plant.LifeCycle.BIENNIAL)
        };
        System.out.println(Arrays.stream(garden)
                .collect(groupingBy(p -> p.lifeCycle,
                        ()->new EnumMap<>(Plant.LifeCycle.class),toSet())));
    }
    public static void main(String[] args) {
        ex02();
    }
}

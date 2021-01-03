package _35UseInstanceFiedsInstedOfOrdinals;

public enum Ensemble {
    SOLO(1),DUET(2),TRIO(3),QUATET(4),QUINTET(5),
    SEZTET(6),SEPTET(7),OCTET(8),DOUBLE_QUARTET(8),
    NONET(9),DEXTET(10),TRIPLE_QUARTET(12);
    private final int numberOfMusicians;
    Ensemble(int size){this.numberOfMusicians = size;}
    public int getNumberOfMusicians(){return numberOfMusicians;}
}

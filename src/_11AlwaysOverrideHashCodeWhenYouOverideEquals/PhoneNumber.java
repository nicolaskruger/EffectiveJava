package _11AlwaysOverrideHashCodeWhenYouOverideEquals;

import java.util.*;
import java.util.Comparator;

import static java.util.Comparator.comparingInt;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber>{
    private final short areaCode,prefix,lineNum;
    public PhoneNumber(int areaCode,int prefix,int lineNum){
     this.areaCode = rangeCheck(areaCode,999,"area code");
     this.prefix = rangeCheck(prefix,999,"prefix");
     this.lineNum = rangeCheck(lineNum,9999,"line num");
    }
    private static short rangeCheck(int val, int max, String arg){
        if(val<0||val>max)
            throw new IllegalArgumentException(arg + ": "+val);
        return (short) val;
    }
    @Override public boolean equals(Object o){
        if(o==this)
            return true;
        if(!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix
                && pn.areaCode ==areaCode;
    }
    private int hashCode;
    @Override public int hashCode(){
        int result = hashCode;
        if(result ==0){
            result = Short.hashCode(areaCode);
            result = 31*result + Short.hashCode(prefix);
            result = 31*result + Short.hashCode(lineNum);
            hashCode = result;
        }
        return result;
    }

    /**
     * Returns the string representation of this phone number.
     * The string consists of twelve characters whose format is
     * "XXX-YYY-ZZZZ", where XXX is the area code, YYY is the
     * prefix, and ZZZZ is the line number. Each of the capital
     * letters represents a single decimal digit.
     *
     * If any of the three parts of this phone number is too small
     * to fill up its field, the field is padded with leading zeros.
     * For example, if the value of the line number is 123, the last
     * four characters of the string representation will be "0123".
     * @return
     */
    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d",
                areaCode,prefix,lineNum);
    }
    @Override
    public PhoneNumber clone(){
        try {
            return  (PhoneNumber) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    private static final Comparable<PhoneNumber> COMPARABLE =
            (Comparable<PhoneNumber>) comparingInt((PhoneNumber pn)->pn.areaCode)
                .thenComparingInt(pn->pn.prefix)
                .thenComparingInt(pn->pn.lineNum);


    @Override
    public int compareTo(PhoneNumber pn) {
        return COMPARABLE.compareTo(pn);
//        int result = Short.compare(areaCode, pn.areaCode);
//        if (result == 0) {
//            result = Short.compare(prefix, pn.prefix);
//            if (result == 0)
//                result = Short.compare(lineNum, pn.lineNum);
//        }
//        return result;
    }
}
